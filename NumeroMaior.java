import java.util.Scanner;

// Autor: Gustavo Santos Silva
// Data: 20/01/2022

public class NumeroMaior {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite dois valores, eu descobrirei qual é o maior HAHAHAHA");

        System.out.print("\nDigite o primeiro valor: ");
        double x = leitor.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double y = leitor.nextDouble();

        if(x>y) {
            System.out.println("O maior é o " + x + " HAHAHA");
        } else {
            System.out.println("O maior é o " + y + " HAHAHA");
        }
    }
}
