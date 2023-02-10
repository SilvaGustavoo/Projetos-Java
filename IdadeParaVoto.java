import java.util.Scanner;

public class IdadeParaVoto {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o ano de seu nascimento: ");
        int ano = leitor.nextInt();

        if (ano <= 2007) {
            System.out.println("Você pode votar esse ano");
        } else {
            System.out.println("Você não pode votar esse ano");
        }

    }

}
