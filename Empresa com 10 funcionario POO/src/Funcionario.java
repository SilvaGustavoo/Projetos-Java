import java.util.Scanner;

public class Funcionario {
    
    
    private int id;
    private int hrTrabalhada;
    private String turno;
    private String cargo;


    public void coletarDados() {
        boolean laco1 = true;
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o código do funcionario: ");
        this.id = leitor.nextInt();

        System.out.print("Digite o número de horas trabalhadas: ");
        this.hrTrabalhada = leitor.nextInt();


        while (laco1) {
            System.out.println("Turnos\nM – matutino; \nV – vespertino; \nN – noturno;");
            System.out.print("Digite o turno do funcionario: ");
            leitor.nextLine(); // Buffer de teclado
            this.turno = leitor.nextLine().toUpperCase(); 
            String.valueOf(turno);

            if(!this.turno.equals("M") && !this.turno.equals("V") && !this.turno.equals("N")) {
                continue;
            }

            break;
        }


        while (laco1) {
            System.out.println("Categoria \nO – operário; \nG – gerente");
            System.out.print("Digite a categoria do funcionario: ");
            this.cargo = leitor.nextLine().toUpperCase();

            if(!this.cargo.equals("O") && !this.cargo.equals("G")) {
                continue;
            }

            System.out.println();
            break;
        } 

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHrTrabalhada() {
        return hrTrabalhada;
    }

    public void setHrTrabalhada(int hrTrabalhada) {
        this.hrTrabalhada = hrTrabalhada;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }



    public String toString() {
        return "Funcionario [id=" + id + ", hrTrabalhada=" + hrTrabalhada + ", turno=" + turno + ", cargo=" + cargo + "]";
    }
    
}
