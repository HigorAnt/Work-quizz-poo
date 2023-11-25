class Aleatorio {
    private int[] questoes = new int[6];
    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void atribuicao(int i) {
        questoes[i] = getNumero();
    }

    public boolean verificacao(int i) {
        boolean retorno = true;
        if(i!=0) {
            for(int a=0; a<=i; a++) {
                for(int b=0; b<=i; b++) {
                    if(questoes[a]==questoes[b] && a!=b) {
                        retorno = false;
                    }
                }
            }
        }
        return retorno;
    }

    public int getNumeroQuestao(int i) {
        return questoes[i];
    }
    
    public void imprimir() {
        for(int i=0; i<6; i++) {
            System.out.println(questoes[i]);
        }
    }
}
