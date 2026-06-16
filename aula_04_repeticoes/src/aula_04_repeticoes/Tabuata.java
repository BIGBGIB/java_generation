package aula_04_repeticoes;

import java.util.Scanner;

public class Tabuata {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		System.out.println("*******************************************  ");
		System.out.println("               Escolha uma opção             ");
		System.out.println("*******************************************\n");
		System.out.println("         Vertebrado ou Invertebrado          ");

		System.out.print("Digite um número inteiro: ");
		int numero = leia.nextInt();
		
		for (int contador = 1; contador <= 10; contador++) {
			
			System.out.printf("%d * %d = %d\n", numero, contador, numero * contador);
		}
		
		leia.close();
		
	}

}
