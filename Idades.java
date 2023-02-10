// Autor: Gustavo Santos Silva
// Data: 18/01/2022

import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
           
        Scanner leitor = new Scanner(System.in);
        int idade = 1;
        double media = 0;
        int contador = -1;
        System.out.println("Esse programa faz o calculo da média de idades digitadas, para sair do programa basta digitar o valor da idade igual a 0");

        do {

            System.out.print("Digite a idade: ");
            idade = leitor.nextInt();
            media = media + idade;
            if(idade < 0) { idade = 0; }
            contador++;

        } while (idade > 0);

        System.out.println("A media de idade é igual a " + (media/contador) );


    }
}
