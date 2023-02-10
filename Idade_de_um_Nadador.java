// Autor: Gustavo Santos Silva
// Data: 18/01/2022

// package aula1;

import java.util.Scanner; // leitura do teclado


public class Idade_de_um_Nadador {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Bem vindos a competição de natação!! Insira sua idade e descubra sua categoria");
		System.out.print("Idade: ");
		int idade = leitor.nextInt();
		
		if (idade < 5) {
			System.out.println("Você é muito novo para participar dessa competição, a idade minima para entrar emalguma categoria é de 5 anos");
		}
		else if (idade >= 5 && idade < 8) {
	        System.out.println("Sua categoria é infantil!!");
		}
		else if (idade >= 8 && idade < 11) {
    		System.out.println("Sua categoria é Juvenil!!");
		}
	    else if (idade >= 11 && idade < 16) {
    		System.out.println("Sua categoria é Adolescente!!");
		}
	    else if (idade >= 16 && idade < 31) {
    		System.out.println("Sua categoria é Adulto!!");
	    }
	    else if (idade > 30) {
		    System.out.println("Sua categoria é Sênior!!");
	    }
		
		
	}

}
