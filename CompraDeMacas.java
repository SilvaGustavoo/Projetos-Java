// Autor: Gustavo Santos Silva
// Data: 23/01/2023

import java.util.Scanner;

public class CompraDeMacas {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o numero de maçãs compradas: ");
        int macas = leitor.nextInt();

        if(macas < 12) {
            System.out.println("O total ficou R$ " + macas*0.3);
        } else {
            System.out.println("O total ficou R$ " + macas*0.25);
        }
    }
}
