package aula_05_array;

import java.util.Scanner;

public class MatrizRegular {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int matrizInteiros[][] = {
				                     { 10, 15, 7 }, 
				                     { 5, 4, 20 }, 
				                     { 7, 21, 30 } 
				                 };
		double matrizDouble[][] = new double[2][3];
		
		for (int linha = 0; linha < matrizInteiros.length; linha ++) {
			for (int coluna = 0; coluna < matrizInteiros.length; coluna ++) {
			System.out.printf("matrizInteiros[%d][%d] = %d\n", linha, coluna, matrizInteiros[linha][coluna]);
			}
		}
		
		for (int linha = 0; linha < matrizDouble.length; linha ++) {
			for (int coluna = 0; coluna < matrizDouble[linha].length; coluna ++) {
				System.out.printf("Digite um número para a posição [%d][%d] = ", linha, coluna); 
						matrizDouble[linha][coluna] = leia.nextDouble();
			}
		}
	
		for (double linha[] : matrizDouble) {
			for (double numero : linha) {
				System.out.println(numero);
			}
		}
		
		leia.close();

	}

}
