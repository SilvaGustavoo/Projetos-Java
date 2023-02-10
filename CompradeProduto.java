// Autor: Gustavo Santos Silva
// Data: 17/01/2022

import java.util.Scanner;

public class CompradeProduto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int codProduto = 0;
        int qtdProduto = 0;
        double custo = 0;
        double total = 0;

        System.out.print("Digite o codigo do produto (1 a 40): ");
        codProduto = leitor.nextInt();
        System.out.print("Digite a quantidade desejada: ");
        qtdProduto = leitor.nextInt();

        if (codProduto > 0 && codProduto <= 10) {
            custo = 10;
            total = qtdProduto * custo;
            if (total < 250) {
                total = total*0.95;
            }
        } else
        if (codProduto > 10 && codProduto <= 20) {
            custo = 15;
            total = qtdProduto* custo;
            if (total >= 250 && total < 500) {
                total = total * 0.90;
            }
        } else
        if (codProduto > 20 && codProduto <= 30) {
            custo = 20;
            total = qtdProduto * custo;
            if (total > 50) {
                total = total * 0.85;
            }
        } else
        if (codProduto > 30 && codProduto <= 40) {
            custo = 30;
            total = qtdProduto * custo;
        } 
        else {
            System.out.println("Codigo de produto inválido");
        }

        System.out.println("O valor do produto: R$ " + custo);
        System.out.println("Valor total: R$ " + qtdProduto*custo);
        System.out.println("Desconto aplicado: R$" + ((qtdProduto*custo) - total));
        System.out.println("Valor final: R$ " + total );

    }
}
