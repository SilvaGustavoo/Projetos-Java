// Autor: Gustavo Santos Silva
// Data: 20/01/2022

import java.util.Scanner;

public class OperacoesComNumeros {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        double resultado = 0;

        System.out.print("Digite um valor: ");
        double x = leitor.nextDouble();
    
        System.out.print("Digite o segundo valor: ");
        double y = leitor.nextDouble();

        

        System.out.println("Digite o numero inteiro referente a operação desejada.");
        System.out.println("1 - Média.\n2 - Diferença do maior pelo menor.\n3 - Multiplicaçao.\n4 - Divisão do primeiro pelo segundo.");
        System.out.println("Digite a opção desejada: ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                resultado = (x + y)/2;
                break;
            case 2:
                resultado =  x>y ? x-y : y-x;
                break;
            case 3:
                resultado = x*y;
                break;
            case 4:
                resultado = x/y;
            default:
                break;
        }

        System.out.println("O resultado é igual a " + resultado);
    
    }
}
