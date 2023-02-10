public class Elevador {
    
    private int capacidade;
    private int qtdAndar;
    private int atualAndar = 0;
    private int numPessoas;

    public Elevador(int capacidade, int qtdAndar) {
        this.capacidade = capacidade;
        this.qtdAndar = qtdAndar;
    }

    public void entrarPessoa(int numPessoas) {
        if((this.numPessoas + numPessoas) <= capacidade) {
            this.numPessoas = this.numPessoas + numPessoas;
        } else {
            System.out.println("CAPACIDADE ULTRAPASSADA!! É possivel apenas mais " + (capacidade - this.numPessoas) + " pessoas");
        }
    }

    public void sairPessoa(int numPessoas) {
        if(this.numPessoas > numPessoas) {
            this.numPessoas = this.numPessoas - numPessoas;
        } else {
            System.out.println("Numero de pessoas informados é maior que a quantidade de pessoas existentes no elevador");
        }
    }

    public void subirElevador() {
        if (this.atualAndar < this.qtdAndar) {
            this.atualAndar++;
        } else {
            System.out.println("Já esta no ultimo andar");
        }
    }

    public void descerElevador() {
        if(this.atualAndar > 0) {
            this.atualAndar--;
        } else {
            System.out.println("Você ja está no terreo");
        }
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQtdAndar() {
        return qtdAndar;
    }

    public void setQtdAndar(int qtdAndar) {
        this.qtdAndar = qtdAndar;
    }

    public int getAtualAndar() {
        return atualAndar;
    }

    public void setAtualAndar(int atualAndar) {
        this.atualAndar = atualAndar;
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    

}
