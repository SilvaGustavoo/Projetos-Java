// Gustavo Santos Silva
// 25/01/2023
import java.util.Scanner;
public class DivisivelPor3EPor7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("O programa através de sua tecnologia avançada, descobrirá para você consumidor, se um numero é ou não pe multiplo de 3 e de 7");

        System.out.println();
        System.out.print("Digite um número: ");
        int a = leitor.nextInt();

        extracted(a);
    }

    private static void extracted(int x) {
        if (x % 3 == 0 && x % 7 == 0) {
            System.out.println("É divisivel por 7 e 3");
        } else {
            System.out.println("Não é divisivel por 7 e 3");
        }
    }
}
