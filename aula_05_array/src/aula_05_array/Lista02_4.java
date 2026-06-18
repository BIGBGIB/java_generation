package aula_05_array;

import java.util.Scanner;

public class Lista02_4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int contagem = 1;
		double matrizNotas[][] = new double[10][4];
		double vetorMedias[] = new double[10];

		for (int linha = 0; linha < matrizNotas.length; linha++) {
			
			for (int coluna = 0; coluna < matrizNotas[linha].length; coluna++) {
				
				System.out.printf("Digite a %d nota do %d aluno: ", coluna + 1, contagem);
				matrizNotas[linha][coluna] = leia.nextDouble();
			}
			contagem++;
		}

		for (double linha[] : matrizNotas) {
			for (double numero : linha) {
				System.out.println("********notas*******");
				System.out.println(numero);
			}
		}

		for (int linha = 0; linha < 10; linha++) {
			double soma = 0;

			for (int coluna = 0; coluna < 4; coluna++) {
				soma += matrizNotas[linha][coluna];
			}

			vetorMedias[linha] = soma / 4;
		}

		for (double linha : vetorMedias) {

			System.out.println("********media*******");
			System.out.println(linha);
		}

		leia.close();

	}

}