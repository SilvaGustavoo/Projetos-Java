// Gustavo Santos Silva
// 25/01/2023

import java.util.Scanner;

public class NumeroMultiploDe3 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("O programa através de sua tecnologia avançada, descobrirá para você consumidor, se um numero é ou não pe multiplo de 3");

        System.out.println();
        System.out.print("Digite um número: ");
        int x = leitor.nextInt();

        extracted(x);
    }

    private static void extracted(int x) {
        if (x % 3 == 0) {
            System.out.println("É multiplo de 3");
        } else {
            System.out.println("Não é multiplo de 3");
        }
    }
}
