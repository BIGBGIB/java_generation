package aula_04_repeticoes;

import java.util.Scanner;

public class TabuadaDoWhile {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int contador = 11;

		System.out.println("*******************************************  ");
		System.out.println("               Escolha uma opção   do while          ");
		System.out.println("*******************************************\n");
		System.out.println("         Vertebrado ou Invertebrado          ");

		System.out.print("Digite um número inteiro: ");
		int numero = leia.nextInt();
		
		do {
			System.out.printf("%d * %d = %d\n", numero, contador, numero * contador);
			contador++;
		} while (contador <= 10);

		leia.close();

	}

}
