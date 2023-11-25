import java.util.ArrayList;
class Perguntas {
    private ArrayList<String> perguntasQuizz = new ArrayList<>(10);
    private char[] respostasQuizz = new char[10];
    private int numero;
    private char resposta;

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setResposta(char resposta) {
        this.resposta = resposta;
    }

    public char getResposta() {
        return resposta;
    }

    public void setPerguntas() {
        perguntasQuizz.add(0,"ABC");
        perguntasQuizz.add(1,"DEF");
        perguntasQuizz.add(2,"GHI");
        perguntasQuizz.add(3,"JKL");
        perguntasQuizz.add(4,"MNO");
        perguntasQuizz.add(5,"PQR");
        perguntasQuizz.add(6,"STU");
        perguntasQuizz.add(7,"VWX");
        perguntasQuizz.add(8,"YZ1");
        perguntasQuizz.add(9,"234");
    }

    public void getPergunta() {
        System.out.println(perguntasQuizz.get(getNumero()));
    }

    public void setRespostas() {
        respostasQuizz[0] = 'a';
        respostasQuizz[1] = 'b';
        respostasQuizz[2] = 'c';
        respostasQuizz[3] = 'd';
        respostasQuizz[4] = 'a';
        respostasQuizz[5] = 'b';
        respostasQuizz[6] = 'c';
        respostasQuizz[7] = 'd';
        respostasQuizz[8] = 'a';
        respostasQuizz[9] = 'b';
    }

    public char getRespostas() {
        return respostasQuizz[getNumero()];
    }
    
    public boolean verificacao() {
        boolean retorno;
        if(getResposta()==getRespostas()) {
            System.out.println("Parabéns, você acertou!");
            retorno = true;
        } else {
            System.out.println("Você errou!");
            retorno = false;
        }
        return retorno;
    }
}
