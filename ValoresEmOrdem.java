import java.util.Scanner;

public class ValoresEmOrdem {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       
        double[] valores = new double[3];
        int x = 0;

        
        System.out.print("Digite um valor: ");
        valores[0] = leitor.nextInt();

        System.out.print("Digite o segundo valor: ");
        valores[1] = leitor.nextInt();

        System.out.print("Digite o terceiro valor: ");
        valores[2] = leitor.nextInt();


        while(x<valores.length) {
            double eMaior = 0;
            // Descobre o maior valor
            for (int i = 0; i < valores.length; i++) {
                if(valores[i] > eMaior) {
                    eMaior = valores[i];
                }
            }

            // Zera o maior valor para que ele não se repita
            for (int i = 0; i < valores.length; i++) {
                if(eMaior == valores[i]) {
                    valores[i] = 0;
                }
            } 

            // Mostra os valores existentes no array
            System.out.print(" " + eMaior);
            x++;
        }
        System.out.println();
    }
}
