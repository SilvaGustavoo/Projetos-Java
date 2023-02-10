// Autor: Gustavo Santos Silva
// Data: 20/01/2022

import java.util.Scanner;

public class ProcedenciaDeProduto {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        String procedencia = "";

        System.out.print("Digite o preco do produto: ");
        double preco = leitor.nextDouble();

        System.out.print("Digite seu código de origem (1 a 30): ");
        int codOrigem = leitor.nextInt();

        switch (codOrigem) {
            case 1: 
                procedencia = "Sul";
                break;
            case 2:
                procedencia = "Norte";
                break;
            case 3:
                procedencia = "Leste";
                break;
            case 4:
                procedencia = "Oeste";
                break;
            case 5,6:
                procedencia = "Nordeste";
                break;
            case 7,8,9:
                procedencia = "Sudeste";
                break;
            default:
                if (codOrigem >= 10 && codOrigem <= 20){
                    procedencia = "Centro Oeste";
                } else if (codOrigem>20 && codOrigem<=30){
                    procedencia = "Nordeste";
                } else {
                    System.out.println("Código Inválido!!");
                }

                break;
        }

        System.out.println("Produto com código de origem "+ codOrigem + " com o valor do produto R$ " + preco + " tem procedência na região " + procedencia);

    }
}
