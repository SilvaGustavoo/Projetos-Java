// Autor: Gustavo Santos Silva
// Data: 20/01/2022

import java.util.Scanner;

public class SalarioBruto {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o salario bruto: ");
        double salario = leitor.nextDouble();


        if (salario <= 350) {
            salario = salario + 100;
        }else if (salario > 350 && salario <= 600) {
            salario = salario + 75;
        } else if (salario > 600 && salario <= 900) {
            salario = salario + 50;
        } else {
            salario = salario + 35;
        }

        System.out.println("O seu salario final sera de: " + salario*0.93);
    }
}
