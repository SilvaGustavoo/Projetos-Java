// Autor: Gustavo Santos Silva
// Data: 18/01/2022

import java.util.Scanner;

public class IdadeEPeso {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = leitor.nextInt();
        System.out.print("Digite seu peso: ");
        double peso = leitor.nextDouble();
        int situacao = 0;

        if (idade < 20) {
            if (peso <=60) {
                situacao = 9;
            } else if (peso > 60 && peso <= 90) {
                situacao = 8;
            } else {
                situacao = 7;
            }
        } else if (idade >= 20 && idade <= 50) {
            if (peso <=60) {
                situacao = 6;
            } else if (peso > 60 && peso <= 90) {
                situacao = 5;
            } else {
                situacao = 4;
            }
        } else {
            if (peso <=60) {
                situacao = 3;
            } else if (peso > 60 && peso <= 90) {
                situacao = 2;
            } else {
                situacao = 1;
            }
        }

        System.out.println("A sua situação esta com um valor igual a " + situacao);
        
    }
}
