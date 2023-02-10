import java.util.Scanner;

public class AngulosDoTriangulo {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Esse sistema descreverá o tipo de triangulo que é através de seu ângulo. ");

        System.out.print("Qual a medida do primeiro ângulo: ");
        double angulo1 = leitor.nextDouble();
        System.out.print("Qual a medida do segundo ângulo: ");
        double angulo2 = leitor.nextDouble();
        System.out.print("Qual a medida do terceiro ângulo: ");
        double angulo3 = leitor.nextDouble();

        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
            System.out.println("Triângulo Retângulo");
        } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
            System.out.println("Triângulo Obtusângulo");
        } else if ((angulo1 + angulo2 + angulo3) != 180) {
            System.out.println("Não é um triangulo, a soma dos angulos devem ser 180°, ja o informado é " + (angulo1 + angulo2 + angulo3));
        } else {
            System.out.println("Triângulo Acutângulo");
        }

    }
}
