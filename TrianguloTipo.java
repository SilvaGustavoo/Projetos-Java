// Gustavo Santos silva
// 25/01/2023

import java.util.Scanner;

public class TrianguloTipo   {
    
    public static void main(String[] args) {
    
        Scanner leitor = new Scanner(System.in);


        System.out.println("TIPOS DE TRIANGULOS");
        System.out.println("Digite as medidas do triângulo e o programa descrevera o tipo referente a ele");
        System.out.print("Digite a primeira medida: ");
        double lado1 = leitor.nextDouble();
        System.out.print("Digite a segunda medida: ");
        double lado2 = leitor.nextDouble();
        System.out.print("Digite a ultima medida: ");
        double lado3 = leitor.nextDouble();

        if(lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triangulo Equilatero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
            System.out.println("Triangulo Isosceles");
        } else {
            System.out.println("Triangulo Escaleno");
        }

    }
}
