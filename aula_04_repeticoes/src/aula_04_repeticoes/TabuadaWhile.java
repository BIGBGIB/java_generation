package aula_04_repeticoes;

import java.util.Scanner;

public class TabuadaWhile {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int contador = 1;

		System.out.println("*******************************************  ");
		System.out.println("               Escolha uma opção             ");
		System.out.println("*******************************************\n");
		System.out.println("         Vertebrado ou Invertebrado          ");

		System.out.print("Digite um número inteiro: ");
		int numero = leia.nextInt();

		while (contador <= 10) {

			System.out.printf("%d * %d = %d\n", numero, contador, numero * contador);
			contador ++;
		}

		leia.close();

	}

}
