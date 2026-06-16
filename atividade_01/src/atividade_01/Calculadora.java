package atividade_01;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		float valorFinal = 0.0f;

		System.out.print("\nDigite o primeiro número:  ");
		float numero1 = leia.nextFloat();
		System.out.print("\nDigite o segundo número:  ");
		float numero2 = leia.nextFloat();

		System.out.println("*******************************************  ");
		System.out.println("                Operações                    ");
		System.out.println("*******************************************\n");
		System.out.println("        1- Soma                              ");
		System.out.println("        2- Subtração                         ");
		System.out.println("        3- Multiplição                       ");
		System.out.println("        4- Divisão                           ");

		System.out.print("\nDigite o número da operação desejada:  ");
		int opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			valorFinal = numero1 + numero2;
			System.out.printf("Número 1: %.2f \nNúmero: %.2f \nResultado: %.2f", numero1, numero2, valorFinal);
			break;
		case 2:
			valorFinal = numero1 - numero2;
			System.out.printf("Número 1: %.2f \nNúmero: %.2f \nResultado: %.2f", numero1, numero2, valorFinal);
			break;
		case 3:
			valorFinal = numero1 * numero2;
			System.out.printf("Número 1: %.2f \nNúmero: %.2f \nResultado: %.2f", numero1, numero2, valorFinal);
			break;
		case 4:
			if (numero2 != 0) {
				valorFinal = numero1 / numero2;
				System.out.printf("Número 1: %.2f \nNúmero: %.2f \nResultado: %.2f", numero1, numero2, valorFinal);
			} else {
				System.out.println("Impossível dividir por zero!");
			}
			break;
		default:
			System.out.println("Opção Incorreta!");
			
	    }

	}
}