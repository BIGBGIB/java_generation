package aula_04_repeticoes;

import java.util.Scanner;

public class Lista03_5 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int positivo = 0;
		int numero;

		System.out.println("*******************************************  ");
		System.out.println("            Digite 0 para finalizar          ");
		System.out.println("*******************************************\n");

		do {
			System.out.print("Digite um número inteiro: ");
			numero = leia.nextInt();
			
			if(numero > 0) {
				positivo += numero;
			}

		} while (numero != 0);
		
		System.out.printf("A soma dos números positivos é: %d", positivo);

		leia.close();

	}

}
