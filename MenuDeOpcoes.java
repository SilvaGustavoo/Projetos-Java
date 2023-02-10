// Autor: Gustavo Santos Silva
// Data: 1820/01/2022

import java.util.Scanner;

public class MenuDeOpcoes {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        boolean laco = false;


        do {
            System.out.println("Menu de opções: \n1 – Imposto, \n2 – Novo Salário, \n3 – Classificação, \n4 – Finalizar o programa, \n5 – Finalizar o programa.");

            System.out.print("Digite a opção desejada: ");
            int opcao = leitor.nextInt();

            System.out.print("Digite o salário do funcionario: ");
            double salario = leitor.nextDouble();
            double resultado = 0;

            switch (opcao) {
                case 1 : 
                    if (salario < 500) {
                        resultado = salario *0.05;
                    } else if (salario >= 500 && salario < 850) {
                        resultado = salario*0.1;
                    } else {
                        resultado = salario*0.15;
                    }

                    System.out.println("O valor do imposto é R$ " + resultado + " e o salario atual vai ser R$ " + (salario - resultado));
                    break;
                case 2:
                    if(salario > 1500) {
                        resultado = 250;
                    } else if (salario >= 750 && salario <= 1500) {
                        resultado = 50;
                    } else if (salario >= 450 && salario < 750) {
                        resultado = 75;
                    }else {
                        resultado = 100;
                    }
                    salario = salario + resultado;
                    System.out.println("O novo salário é R$ " + salario);

                    break;
                case 3:
                    if (salario <= 700) {
                        System.out.println("Classificado como Mal renumerado.");
                    } else {
                        System.out.println("Classificado como Bem renumerado.");
                    }
                    break;
                case 4,5:
                    System.out.println("Fim do Programa;");
                    break;

                default:
                    System.out.println("Opção digitada é invalida!!");
                    break;
            }

            System.out.println("Deseja realizar uma nova pesquisa? [S/N]");
            leitor.nextLine();
            String continuar = leitor.nextLine().toUpperCase();
            String.valueOf(continuar);

            if(continuar.equals("S")) { 
                laco = true;
            } else {
                laco = false;
            }
            
        } while (laco);
    }
}
