class Jogador {
    private String nome;
    private int pontos;
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setAcertos(int pontos) {
        this.pontos += pontos;
    }

    public void setErros(int pontos) {
        this.pontos -= pontos;
    }

    public int pontuacaoAtual() {
        return pontos;
    }

    public void atribuicao(boolean resultado) {
        if(resultado==true) {
            setAcertos(10);
        } else {
            setErros(5);
        }
    }

    public boolean validacao() {
        boolean validacao=true;
        if(pontuacaoAtual()==0) {
            validacao = false;
        }
        return validacao;
    }

    @Override
    public String toString() {
        return getNome() + ", a Sua pontuação foi de " + pontuacaoAtual() + " pontos, parabéns!";
    }
}
