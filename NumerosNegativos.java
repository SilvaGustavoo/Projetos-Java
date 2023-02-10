// Gustavo Santos Silva
// 25/01/2023

import java.util.Scanner;

public class NumerosNegativos {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[3];

        System.out.print("Digite o primeiro numero: ");
        numeros[0] = leitor.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        numeros[1] = leitor.nextInt();
        
        System.out.print("Digite o terceiro numero: ");
        numeros[2] = leitor.nextInt();
        

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] < 0) {
                System.out.print(numeros[i] + " ");
            }
        }

    }
}
