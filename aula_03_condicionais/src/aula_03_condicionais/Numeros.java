package aula_03_condicionais;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = leia.nextInt();

		if (numero >= 0 && numero % 2 == 0) {
			System.out.printf("O número %d é par e positivo!", numero);
		} else if (numero < 0 && numero % 2 == 0) {
			System.out.printf("O número %d é par e negativo!", numero);
		} else if (numero < 0 && numero % 2 != 0) {
			System.out.printf("O número %d é ímpar e negativo!", numero);
		} else if (numero >= 0 && numero % 2 != 0) {
			System.out.printf("O número %d é ímpar e positivo!", numero);
		} else {
			System.out.println("Apenas números");
		}
		
		leia.close();
	}

}
