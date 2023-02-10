// Gustavo Santos Silva
// 24/01/2023
import java.util.Scanner;

public class TresValoresEOMaiorDeles {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
       
        int[] valores = new int[3];

        
        System.out.print("Digite um valor: ");
        valores[0] = leitor.nextInt();

        System.out.print("Digite o segundo valor: ");
        valores[1] = leitor.nextInt();

        System.out.print("Digite o terceiro valor: ");
        valores[2] = leitor.nextInt();
        int eMaior = 0;

            
            // Descobre o maior valor
        for (int i = 0; i < valores.length; i++) {
            if(valores[i] > eMaior) {
                eMaior = valores[i];
            }
        }

        System.out.print("O maior inteiro é " + eMaior);

        
    }
}
