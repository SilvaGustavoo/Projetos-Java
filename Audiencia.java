// Autor: Gustavo Santos Silva
// Data: 17/01/2022

import java.util.Arrays;
import java.util.Scanner;

public class Audiencia {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int canal = 4;
        int[] audiencia = new int[4];
        int[] numCanais = {4, 5, 7, 12};
        double total = 0;

        

        do {

            System.out.print("Qual canal estava sendo assistido (4, 5, 7, 12): ");
            canal = leitor.nextInt();
            if(canal <= 0) {break;} 
            
            if(canal != 4 ) {}

            System.out.print("Digite o numero de pessoas que estavam assistindo: ");
            int pessoas = leitor.nextInt();


            int x = Arrays.binarySearch(numCanais, canal);
            audiencia[x] = audiencia[x] + pessoas;


        } while (canal > 0);

        for (int i = 0; i < numCanais.length; i++) {
            total = audiencia[i] + total;
        }

        for (int i = 0; i < numCanais.length; i++) {
            System.out.println("Canal: " + numCanais[i]);
            System.out.println("Telespectadores: " + audiencia[i]);
            System.out.println("Porcentagem de audiência: " + (audiencia[i]/total)*100 + "%");
        }
        
    }

}
