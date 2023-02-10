import java.text.DecimalFormat;
import java.util.Scanner;

/*
* Gustavo Santos Silva
* 25/01/2023

A StackX abriu uma linha de crédito para os alunos. O valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Fazer um programa que permita entrar com o salário bruto, o valor do empréstimo e o número de parcelas e informar o
valor da parcela e se o empréstimo pode ou não ser concedido. Caso o empréstimo não possa ser concedido, informar ainda o valor máximo da prestação.
 */

public class CreditoParaAlunos {
    public static void main(String[] args) {
        System.out.println();
   
        Scanner leitor = new Scanner(System.in);
        double parcelaFinal = 0;
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("LINHA DE CREDITO STACKX");
        System.out.print("Digite o seu salário bruto: ");
        double salario = leitor.nextDouble();
    
        System.out.print("Digite o valor do emprestimo: ");
        double emprestimo = leitor.nextDouble();

        System.out.print("Em quantas parcelas: ");
        int parcela = leitor.nextInt();

        parcelaFinal = emprestimo/parcela;

        if (salario*0.3 >= parcelaFinal) {
            System.out.println("EMPRESTIMO CONCEDIDO");
            System.out.println("Emprestimo: " + emprestimo);
            System.out.println("Numero de parcelas: " + parcela);
            System.out.println("Prestação: " + df.format(parcelaFinal));
        } else {
            System.out.println("EMPRESTIMO NEGADO");
            System.out.println("O valor da parcela de R$ " + df.format(parcelaFinal) + " ultrapassa o limite suportado da prestação maxima, que é de R$ " + df.format(salario*0.3));

        }

        System.out.println();
    
    }
}
