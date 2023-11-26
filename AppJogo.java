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
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.printf("Bem %s, o jogo inicia com 10 pontos. A cada erro você perde 5 pontos, e a cada acerto ganha 10 pontos, ok?\n", jogador.getNome());
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println("Então vamos lá!");
        System.out.println();

        jogador.setAcertos(10);
        
        for(int i=0; i<6; i++) {
            if(jogador.validacao()==true) {
                pergunta.setNumero(aleatorio.getNumeroQuestao(i));
                pergunta.getPergunta();
                System.out.println("\nQual a sua resposta?");
                resposta = scanner.next().charAt(0);
                pergunta.setRespostaUsuario(resposta);
                System.out.println();
                System.out.println("---------------------------------------------------------------------------------------------------------------");
                jogador.atribuicao(pergunta.verificacao());
                System.out.println("---------------------------------------------------------------------------------------------------------------");
                System.out.println();
            } else {
                break;
            }
        }

        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println(jogador.toString()); 
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        scanner.close();
    }
}
