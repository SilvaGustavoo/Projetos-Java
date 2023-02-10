import java.util.Scanner;

public class ValidarSenha {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String senha = "1234";

        System.out.print("Digite sua senha: ");
        String senhaDigitada = leitor.nextLine();

        if (senhaDigitada.equals(senha)) {
            System.out.println("ACESSO PERMITIDO");
        } else {
            System.out.println( "ACESSO NEGADO");
        }
    }
}
