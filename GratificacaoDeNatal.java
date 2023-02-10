// Autor: Gustavo Santos Silva
// Data: 18/01/2022

import java.util.Scanner;

public class GratificacaoDeNatal {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double bonus = 0;

        System.out.print("Digite o numero de horas extras: ");
        double hrExtras = leitor.nextDouble();

        System.out.print("Digite o numero de horas faltas: ");
        double hrFalta = leitor.nextDouble();
        double H;

        H = (hrExtras - ((2/3) * hrFalta))*60;

        if (H >= 2400) {
            bonus = 500;
        } else if (H>1800 && H<2400) {
            bonus = 400;
        }else if (H>1200 && H<=1800) {
            bonus = 300;
        } else if (H>=600 && H<=1200) {
            bonus = 200;
        } else {
            bonus = 600;
        }

        System.out.println("O bonus recebido foi no valor de  R$ " + bonus);


    }
}
