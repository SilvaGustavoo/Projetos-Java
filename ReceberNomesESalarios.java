// Autor: Gustavo Santos Silva
// Data: 20/01/2022

import java.text.DecimalFormat;
import java.util.Scanner;

public class ReceberNomesESalarios {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite o salario de Carlos: ");
        double carlos = leitor.nextDouble();
        double joao = carlos/3;
        int x = 0;

        while(carlos > joao) {
            carlos = carlos*1.02;
            joao = joao*1.05;
            x++;

        }



        System.out.println("Salario de carlos é R$ " + df.format(carlos) + " e de João R$"+  df.format(joao) + " em " + x + " meses");

    }
}
