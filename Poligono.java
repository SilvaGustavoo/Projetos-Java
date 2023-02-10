import java.util.Scanner;

public class Poligono {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o quantos lados tem o poligono: ");
        int lados = leitor.nextInt();

        if(lados<3) {
            System.out.println("Não existe poligonos com menos de 3 lados");
        } else if (lados == 3){
            System.out.println("TRIÂNGULO");
        } else if (lados == 4) {
            System.out.println("QUADRADO");
        } else if (lados == 5) {
            System.out.println("PENTÁGONO");
        } else {
            System.out.println("O alcande deste programa é de apenas 5 lados");
        }
    }
}
