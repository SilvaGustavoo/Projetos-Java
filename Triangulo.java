// Autor: Gustavo Santos Silva
// Data: 20/01/2022

import java.util.Scanner;

public class Triangulo {
    public static void  main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        double area;

        boolean laco1 = true;

        do {

        System.out.print("Digite a medida do primeiro lado: ");
        a = leitor.nextDouble();

        System.out.print("Digite a medida do segundo lado: ");
        b = leitor.nextDouble();

        System.out.print("Digite o valor do terceiro lado: ");
        c = leitor.nextDouble();

        if(a <= 0 || b <= 0|| c <= 0) {
            System.out.println(" O valor digitado é negativo ou é zero. Tente novamente !!");
            continue;
        }

        break;
        } while (laco1);

        double p = (a + b + c)/2;
        area = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println("A área do triândulo é " + area);

    }
}
