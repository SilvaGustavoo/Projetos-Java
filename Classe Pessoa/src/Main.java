import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        pessoa.setNome(leitor.nextLine());

        System.out.print("Digite sua idade: ");
        pessoa.setIdade(leitor.nextInt());

        System.out.print("Digite sua altura: ");
        pessoa.setAltura(leitor.nextDouble());

        pessoa.incrementarIdade();
        System.out.println("Fez aniversárioo!! idade atual é " + pessoa.getIdade());
    }
}
