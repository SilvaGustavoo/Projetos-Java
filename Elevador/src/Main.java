import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        boolean laco = true;

        System.out.print("Digite a capacidade maxima do elevador: ");
        int capacidade = leitor.nextInt();

        System.out.print("Digite o numero de andares existentes no prédio: ");
        int qtdAndar = leitor.nextInt();

        Elevador elevador = new Elevador(capacidade, qtdAndar);

        while(laco) {
            System.out.println("Andar: " + elevador.getAtualAndar() + ", Numero de Pessoas: " + elevador.getNumPessoas());
            System.out.println("Digite o numero referente a ação desejada");
            System.out.println("1 - Entrar Pessoas \n2 - Saiu Pessoas \n3 - Subir elevador \n4 - Descer elevador");
            System.out.print("Digitar numero: ");
            int opcao = leitor.nextInt();


            switch (opcao) {
                case 1: 
                    System.out.print("Digite o numero de pessoas que entraram: ");
                    elevador.entrarPessoa(leitor.nextInt());
                    break;
                case 2:
                    System.out.print("Digite o numero de pessoas que sairam: ");
                    elevador.sairPessoa(leitor.nextInt());
                    break;
                case 3:
                    elevador.subirElevador();
                    break;
                case 4:
                    elevador.descerElevador();
                    break;
                default:
                    System.out.println("Opção invalida!!");
                    break;
            }

            System.out.print("Deseja continuar? [S/N] ");
            leitor.nextLine();
            String continuar = leitor.nextLine().toUpperCase();
            System.out.println("\n");

            if (continuar.equals("N")) {
                break;
            }

        }
        
    }
}
