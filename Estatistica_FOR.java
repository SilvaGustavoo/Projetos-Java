// Autor: Gustavo Santos Silva
// Data: 18/01/2022

// package aula1;

// import java.util.Iterator;
import java.util.Scanner;

public class Estatistica_FOR {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String[] codCidade = new String[5];
		int[] numVeiculos = new int[5];
		int[] numAcidentes = new int[5];
		
		String continuar = "S";
		int numCidades = 0;
		double eMaior = 0; // Armazena o maior numero
		double eMenor = 0;
		int totalVeiculos = 0;
		int x = 0; // Contador de cuidades com menos de 200 veiculos
		double media = 0; // Media de Acidentes
		double indice = 0;
		
		
		while(numCidades != 5 && (continuar.equals("S")  || continuar.equals("s"))){
			
			//
			System.out.print("Digite o código da cidade: ");
			codCidade[numCidades] = leitor.nextLine();
			
			System.out.print("Digite o numero de veiculos de passeio: ");
			numVeiculos[numCidades] = leitor.nextInt();
			
			System.out.print("Digite o número de acidentes de trânsito com vítimas: ");
			numAcidentes[numCidades] = leitor.nextInt();
			
			System.out.print("Deseja continuar? [S/N]");
			leitor.nextLine();
			continuar = leitor.nextLine();
			
			indice = ((numAcidentes[numCidades] * 100)/ numVeiculos[numCidades]);
			
			System.out.println(numAcidentes[numCidades]);
			System.out.println(numVeiculos[numCidades]);
			System.out.println(indice);
			
			if(indice > eMaior ) {
				eMaior = indice;
			}

			if(eMenor == 0) {
				eMenor = indice;
			}
			
			if(eMenor > indice) {
				eMenor = indice;
			}
			
			totalVeiculos = totalVeiculos + numVeiculos[numCidades];
			
			if(numVeiculos[numCidades] < 2000) {
				media = media + numAcidentes[numCidades];
				x = x + 1;
			}
			
			
			numCidades++;
		}

		System.out.println("O maior indice é: " + eMaior + "%");
		System.out.println("O menor indice é: " + eMenor + "%");
		System.out.println("A média de veiculos nas cidades é: " + (totalVeiculos/numCidades));
		System.out.println("A média de acidentes nas cidades com menos de 2000 veiculos é: " + (media/x));
		
		for (int i = 0; i < numCidades; i++) {
			System.out.println("Cidade: " + codCidade[i]);
			System.out.println("Numero de veículos: " + numVeiculos[i] + ", Acidentes: " + numAcidentes[i] + "\nIndice: " + numAcidentes[i]/numVeiculos[i]);
		}
		
			
			

	}

	
}


