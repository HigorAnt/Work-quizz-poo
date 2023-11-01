import java.util.Scanner;
import java.util.Random;;
public class AppJogo {
    public static void main(String args[]) {
        String nome;
        int atual=0, valor, pont=0;
        char letra;
  
        Perguntas pergunta = new Perguntas();
        Jogador jogador = new Jogador();
        Random aleatorio = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá jogador, qual o seu nome?");
        nome = scanner.nextLine();
        jogador.setNome(nome);
        System.out.printf("Ótimo %s, vamos começar\n", jogador.getNome());

        while (atual<4) {
            valor = aleatorio.nextInt(5);
            pergunta.setValor(valor);
            System.out.printf("%s", pergunta.toString());            
            letra = scanner.next().charAt(0);
            pergunta.verificacao(letra);
            pont = pergunta.getPontuacao();   
            jogador.setPontuacao(pont);         
            atual++;
        }
        System.out.printf("%s", jogador.toString());        
        scanner.close();
    }
}
