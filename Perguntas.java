public class Perguntas {
    private int valor, pont;
    private String[] perguntas = {"Qual o primeiro mês do ano?\n A) Janeiro\n B) Fevereiro\n C) Março\n D) Abril\n",
    "Qual o segundo mês do ano?\n A) Janeiro\n B) Fevereiro\n C) Março\n D) Abril\n", 
    "Qual o terceiro mês do ano?\n A) Janeiro\n B) Fevereiro\n C) Março\n D) Abril\n", 
    "Qual o quarto mês do ano?\n A) Janeiro\n B) Fevereiro\n C) Março\n D) Abril\n", 
    "Qual o quinto mês do ano?\n A) Maio\n B) Fevereiro\n C) Março\n D) Abril\n", 
    "Qual o sexto mês do ano?\n A) junho\n B) Fevereiro\n C) Março\n D) Abril\n"};
    private char[] respotas = {'A', 'B', 'C', 'D', 'A', 'A'};   
    
    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void verificacao(char letra) {
        char opcao = respotas[getValor()];
        if(opcao==letra) {
            System.out.println("Acertou");
            pont++;
        } else {
            System.out.println("Errou");
        }
    }    

    public int getPontuacao() {
        return pont;
    }

    @Override
    public String toString() {
        return "" + System.out.printf("%s", perguntas[getValor()]);
    }
}
