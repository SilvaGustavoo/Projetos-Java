// Autor: Gustavo Santos Silva
// Data: 17/01/2022

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConjuntoDeValores {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean laco = true;
        DecimalFormat df = new DecimalFormat();
        while(laco) {
            System.out.print("Digite um valor: ");
            double x = leitor.nextDouble();
            if (x == 0) {
                break;
            }
            
            System.out.println("Quadrado: " + x*x);
            System.err.println("Cubo: " + x*x*x);
            System.out.println("Raiz quadrada: " + df.format(Math.sqrt(x)));

        }
        
    }
}
