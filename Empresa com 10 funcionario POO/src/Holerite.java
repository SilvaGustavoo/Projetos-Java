public class Holerite extends Funcionario {
    
    private double salMinimo = 450.00;
    private double salHora;
    private Funcionario funcionario;


    public Holerite(Funcionario funcionario) {
        this.funcionario = funcionario;
    } 

    public double getValorHora() {
        String turno = funcionario.getTurno();
        if (funcionario.getCargo().equals("G")) {
            if(turno.equals("N")) {
                salHora = 0.18*salMinimo;
            } else {
                salHora = 0.15*salMinimo;
            }
        } else {
            if(turno.equals("N")) {
                salHora = 0.13*salMinimo;
            } else {
                salHora = 0.1*salMinimo;
            }
        }

        return this.salHora;
    }



    public double getSalarioInicial() {
        double salInicial = funcionario.getHrTrabalhada()*getValorHora();
        return salInicial;
    }

    public double getAuxAlimentacao() {
        double auxAlimentacao = 0;
        double salInicial = getSalarioInicial();

        if(salInicial <= 300) {
            auxAlimentacao = salInicial*0.2;
        } else if(salInicial > 300 && salInicial <= 600) {
            auxAlimentacao = salInicial*0.15;
        } else {
            auxAlimentacao = salInicial*0.05;
        }

        return auxAlimentacao;
    }

    public double getSalarioFinal() {
        return getAuxAlimentacao() + getSalarioInicial();
    }



   @Override
    public String toString() {
        return "Holerite de " + funcionario.toString() + 
        "\nSalario minimo: R$ " + salMinimo + 
        "\nValor por hora: R$ " + getValorHora() + 
        "\nSalario inicial: R$ " + getSalarioInicial() + 
        "\nAuxilio alimentação: R$ " + getAuxAlimentacao() + 
        "\nSalario final: R$ " + getSalarioFinal() + "\n\n";
    } 

    

}
