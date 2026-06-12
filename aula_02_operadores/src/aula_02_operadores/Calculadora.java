package aula_02_operadores;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double numero1, numero2;
		 //Math.pow(potencia)
		System.out.print("Digite o primeiro número: ");
		numero1 = leia.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		numero2 = leia.nextDouble();
		
		System.out.printf("\n Potência %.2f ^ %.2f = %.2f", numero1, numero2, Math.pow(numero1, numero2));
		System.out.printf("\n Raiz Quadrada %.2f = %.2f", numero1, Math.sqrt(numero1));
		System.out.printf("\n Soma %.2f + %.2f = %.2f", numero1, numero2, numero1 + numero2);
		System.out.printf("\n Subtração %.2f - %.2f = %.2f", numero1, numero2, numero1 - numero2);
		System.out.printf("\n Multiplicação %.2f x %.2f = %.2f", numero1, numero2, numero1 * numero2);
		System.out.printf("\n Divisão %.2f / %.2f = %.2f", numero1, numero2, numero1 / numero2);
		
		
		
		
		
		
		
		
		leia.close();
		

	}

}
