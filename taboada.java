

// Autor: Gustavo Santos Silva
// Data: 20/01/2022
// package aula1;

import java.util.Scanner;

public class taboada {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double x;
		double y;
		double resultado;
		
		System.out.println("Esse sistema faz o calculo de tavboada para você !!");
		System.out.print("Digite o valor da taboada que seja de seu interesse: ");
		x = leitor.nextDouble();
		
		System.out.print("Digite até onde deseja que sua taboada vá: ");
		y = leitor.nextDouble();
		
		for(int i = 0; i <= y; i++) {
			resultado = x * i;
			System.out.println(x + " X " + i + " = " + resultado);
		}
		
		
		
		

	}

}
