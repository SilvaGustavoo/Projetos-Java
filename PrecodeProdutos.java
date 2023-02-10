// Autor: Gustavo Santos Silva
// Data: 20/01/2022

import java.util.Scanner;


public class PrecodeProdutos {


    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        String situacao = "";
        double preco = 0;
        int categoria = 0;
        boolean laco1 = true;
        String classificacao = "";
        

        while (laco1) {
        System.out.print("Qual o valor do produto: ");
        preco = leitor.nextDouble();


        System.out.println("\n1 = limpeza;\n2 = alimentação;\n3 = vestuário;\n*Digite o valor numerico*");
        System.out.print("Qual a categoria do produto: ");
        categoria = leitor.nextInt();

        if (categoria > 3 || categoria <= 0) {
            System.out.println("CATEGORIA INVALIDA!!");
            continue;
        }

        System.out.println("\nSituação\nR = produtos que necessitam de refrigeração;\nN = produtos que não necessitam de refrigeração\n* Digite somente N ou R *");
        System.out.print("Qual a sua situação: ");

        leitor.nextLine();
        situacao = leitor.nextLine().toUpperCase();

        String.valueOf(situacao);

        if (!situacao.equals("R") && !situacao.equals("N")) {
            System.out.println("SITUACAO INVALIDA!!");
            continue;
        } 

        break;

        }

        if (preco <= 25) {

            switch (categoria) {
                case 1:
                    preco = preco * 1.05;
                    break;
                case 2:
                    preco = preco * 1.08;
                    break;
                case 3: 
                    preco = preco * 1.1;
                    break;
                
                default:
                    System.out.println("CATEGORIA INVALIDA !!");
                    break;
            }
        } else if (preco > 25) {

            switch (categoria) {
                case 1:
                    preco = preco * 1.12;
                    break;
                case 2:
                    preco = preco * 1.15;
                    break;
                case 3: 
                    preco = preco * 1.18;

                default:
                    System.out.println("CATEGORIA INVALIDA !!");
                    break;
            }
        }

        if (categoria == 2 || situacao == "R" ) {
            preco = preco*0.95;
        } else {
            preco = preco * 0.92;
        }

        if (preco <= 50) {
            classificacao = "Barato";
        } else if (preco > 50 && preco < 120) {
            classificacao = "Normal";
        } else if (preco >= 120) {
            classificacao = "Caro !!";
        } else {
            classificacao = "invalida";
        }

        System.out.println("O preço final é R$ " + preco + ",ele está " + classificacao);
        System.out.println("Sua categoria é " + categoria);
        System.out.println("Sua situação é " + situacao);

        


    }
}