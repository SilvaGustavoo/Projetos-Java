import java.util.Scanner;

import java.util.Scanner;

public class AumentoSalarial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Double salario;
        Double x = 0.015;

        System.out.print("Qual o salário: ");
        salario = leitor.nextDouble();

        for(int ano = 2000; ano <= 2017 ; ano++) {
            System.out.println("No ano de " + ano + " seu salario foi de  R$ " + salario);
  
            if (ano == 2001) {
                x = x * 2;
            }
            salario = salario + salario * x;
            
        }
    }
}