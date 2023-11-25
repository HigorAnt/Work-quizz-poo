import java.util.Random;
import java.util.Scanner;

public class AppJogo {
    public static void main(String args[]) {

        Perguntas pergunta = new Perguntas();
        Aleatorio aleatorio = new Aleatorio();
        Jogador jogador = new Jogador();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String nome;
        char resposta;
        int number;

        pergunta.setPerguntas();

        for(int i=0; i<6; i++) {
            if(i==0) {
                number = random.nextInt(10);
                aleatorio.setNumero(number);
                aleatorio.atribuicao(i);
            } else {
                do {
                    number = random.nextInt(10);
                    aleatorio.setNumero(number);
                    aleatorio.atribuicao(i);
                } while(aleatorio.verificacao(i)==false);
            }
        }

        System.out.println("Qual o seu nome, jogador(a)?");
        nome = scanner.nextLine();
        jogador.setNome(nome);
        System.out.printf("Bem %s, o jogo inicia com 10 pontos. A cada erro você perde 5 pontos, e a cada acerto ganha 10 pontos, ok?\n", jogador.getNome());
        System.out.println("Então vamos lá!");

        jogador.setAcertos(10);
        
        for(int i=0; i<6; i++) {
            if(jogador.validacao()==true) {
                pergunta.setNumero(aleatorio.getNumeroQuestao(i));
                pergunta.getPergunta();
                resposta = scanner.next().charAt(0);
                pergunta.setResposta(resposta);
                jogador.atribuicao(pergunta.verificacao());
            } else {
                break;
            }
        }

        System.out.println(jogador.toString());        
        scanner.close();
    }
}
