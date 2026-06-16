package aula_04_repeticoes;

import java.util.Scanner;

public class Lista01_2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int par = 0;
		int impar = 0;

		System.out.println("*******************************************  ");
		System.out.println("         Escreva 10 números inteiros         ");
		System.out.println("*******************************************\n");

		for (int contador = 1; contador <= 10; contador++) {

			System.out.printf("Digite o %d número inteiro: ", contador);
			int numero = leia.nextInt();

			if (numero % 2 == 0) {
				par++;
			} else if (numero % 2 >= 1) {
				impar++;
			} else {
				System.out.println("Número inválido!");
			}
		}
		
		System.out.printf("Total de números pares: %d\n", par);
		System.out.printf("Total de números ímpares: %d", impar);
		
		leia.close();

	}

}
