import java.util.Scanner;

public class AlturaESexo {
    

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double IMC = 0;
        boolean x = true;
        int sexo = 0;
        
        System.out.println("CALCULO DE IMC");
        while (x) {
            System.out.println("1: Feminino \n2: Masculino");
            System.out.print("Digite o numero referente ao seu sexo: ");
            sexo = leitor.nextInt();
            if(sexo != 1 && sexo != 2) {
                continue;
            }
            break;
        }
        System.out.print("Digite sua altura: ");
        double altura = leitor.nextDouble();

        if(sexo == 2) {
            IMC = (altura*72.7)-58;
        } else {
            IMC = (62.1*altura)-44.7;
        }

        System.out.println("Seu IMC é " + IMC);

    }
}
