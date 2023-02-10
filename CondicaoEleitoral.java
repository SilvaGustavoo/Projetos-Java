import java.util.Scanner;

public class CondicaoEleitoral {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = leitor.nextInt();

        if(idade < 16) {
            System.out.println("Não Pode votar.");
        } else if (idade >= 16 && idade < 18 || idade >= 65 ) {
            System.out.println("Facultativo.");

        } else {
            System.out.println("Obrigatório ");
        }


    }
}
