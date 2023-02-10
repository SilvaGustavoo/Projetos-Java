// Autor: Gustavo Santos Silva
// Data: 17/01/2022

import java.util.Scanner;

public class EmpresaCom10Funcionarios {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numFuncionario = 0;
        boolean laco1 = true;
        double salMinimo = 450;
        double salInicial = 0;
        double salHora = 0;
        String turno = "";
        String categoria = "";

        while (numFuncionario <= 10) {

            System.out.print("Digite o código do funcionario: ");
            int codFuncionario = leitor.nextInt();

            System.out.print("Digite o número de horas trabalhadas: ");
            double hrTrabalhada = leitor.nextDouble();


            while (laco1) {
                System.out.println("Turnos\nM – matutino; \nV – vespertino; \nN – noturno;");
                System.out.print("Digite o turno do funcionario: ");
                leitor.nextLine();
                turno = leitor.nextLine().toUpperCase();
                String.valueOf(turno);

                if(!turno.equals("M") && !turno.equals("V") && !turno.equals("N")) {
                    continue;
                }

                break;
            }


            while (laco1) {
                System.out.println("Categoria \nO – operário; \nG – gerente");
                System.out.print("Digite a categoria do funcionario: ");
                categoria = leitor.nextLine().toUpperCase();

                if(!categoria.equals("O") && !categoria.equals("G")) {
                    continue;
                }

                break;
            } 

            if (categoria.equals("G")) {
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

            salInicial = hrTrabalhada*salHora;
            double auxAlimentacao = 0;

            if(salInicial <= 300) {
                auxAlimentacao = salInicial*0.2;
            } else if(salInicial > 300 && salInicial <= 600) {
                auxAlimentacao = salInicial*0.15;
            } else {
                auxAlimentacao = salInicial*0.05;
            }

            System.out.println();
            System.out.println("Código do funcionário: " + codFuncionario);
            System.out.println("Horas trabalhadas: " + hrTrabalhada);
            System.out.println("Salario por hora: R$ " + salHora);
            System.out.println("Salario inicial: R$ " + salInicial);
            System.out.println("Auxilio alimentação: R$ " + auxAlimentacao);
            System.out.println("Salario final: R$ " + (salInicial + auxAlimentacao));

            System.out.println("Deseja continuar? [S/N] ");
            if(leitor.nextLine().toUpperCase().equals("S")) {
                numFuncionario++;
                continue;
            }

            break;
        }


        
    }
}
