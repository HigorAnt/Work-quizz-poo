import java.util.ArrayList;
class Perguntas {
    private ArrayList<String> perguntasQuizz = new ArrayList<>(15);
    private char[] respostasQuizz = {'d','c','d','d','a','b','b','c','a','b','b','b','b','b',' '};
    private int numero;
    private char resposta;

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setRespostaUsuario(char resposta) {
        this.resposta = resposta;
    }

    public char getRespostaUsuario() {
        return resposta;
    }

    public void setPerguntas() {
        perguntasQuizz.add(0,"Quem foi o primeiro presidente dos Estados Unidos?\na) John Adams\nb) Thomas Jefferson\nc) Benjamin Franklin\nd) George Washington");
        perguntasQuizz.add(1,"Qual guerra foi apelidada de \"A Grande Guerra\"?\na) Guerra Civil Americana\nb) Guerra do Vietnã\nc) Primeira Guerra Mundial\nd) Guerra Fria");
        perguntasQuizz.add(2,"Qual imperador romano liderou a construção do Coliseu?\na) Nero\nb) Júlio César\nc) Augusto\nd) Vespasiano");
        perguntasQuizz.add(3,"Quem foi o líder da Revolução Russa de 1917?\na) Leon Trotsky\nb) Vladimir Putin\nc) Josef Stalin\nd) Vladimir Lenin");
        perguntasQuizz.add(4,"Qual tratado encerrou oficialmente a Primeira Guerra Mundial?\na) Tratado de Versalhes\nb) Tratado de Tordesilhas\nc) Tratado de Viena\nd) Tratado de Roma");
        perguntasQuizz.add(5,"Qual é o maior oceano do mundo?\na) Oceano Atlântico\nb) Oceano Pacífico\nc) Oceano Índico\nd) Mar Mediterrâneo");
        perguntasQuizz.add(6,"Qual é o rio mais longo do mundo?\na) Rio Nilo\nb) Rio Amazonas\nc) Rio Mississippi\nd) Rio Yangtzé");
        perguntasQuizz.add(7,"Qual é o país mais populoso do mundo?\na) Estados Unidos\nb) Rússia\nc) China\nd) Índia");
        perguntasQuizz.add(8,"Qual é o ponto mais alto da Terra?\na) Monte Everest\nb) Monte Kilimanjaro\nc) Montanha K2\nd) Montanha Denali");
        perguntasQuizz.add(9,"Qual país é conhecido como \"Terra do Sol Nascente\"?\na) Espanha\nb) Japão\nc) Austrália\nd) Itália");
        perguntasQuizz.add(10, "Qual é a soma dos ângulos internos de um triângulo?\na) 90 graus\nb) 180 graus\nc) 270 graus\nd) 360 graus");
        perguntasQuizz.add(11, "Qual é a raiz quadrada de 144?\na) 10\nb) 12\nc) 14\nd) 16");
        perguntasQuizz.add(12, "Se um carro viaja a uma velocidade constante de 60 km/h, quantas horas ele levará para percorrer 180 km?\na) 2 horas\nb) 3 horas\nc) 4 horas\nd) 5 horas");
        perguntasQuizz.add(13, "Qual é o resultado de 7 x 8 - 3 ÷ 3?\na) 20\nb) 23\nc) 28\nd) 31");
        perguntasQuizz.add(14, "Se um retângulo tem comprimento 10 cm e largura 5 cm, qual é a sua área?\na) 15 cm²\nb) 30 cm² (Resposta Certa)\nc) 50 cm²\nd) 100 cm²");
    }

    public void getPergunta() {
        System.out.println(perguntasQuizz.get(getNumero()));
    }

    public char getRespostas() {
        return respostasQuizz[getNumero()];
    }

    public boolean verificacao() {
        boolean retorno = true;
        if(getRespostaUsuario()==getRespostas()) {
            System.out.println("Parabéns, você acertou!");
        } else {
            System.out.println("Você errou!");
            retorno = false;
        }
        return retorno;
    }
}
