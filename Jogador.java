class Jogador{
    private String nome;
    private int pontuacao;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    } 

    public int getPontuacao() {
        return pontuacao;
    }

    public String toString() {
        return getNome() + ", a sua pontuação é de\\n" + getPontuacao();
    } 
}