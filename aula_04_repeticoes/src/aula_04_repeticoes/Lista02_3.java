package aula_04_repeticoes;

import java.util.Scanner;

public class Lista02_3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int idade21 = 0;
		int idade50 = 0;
		int idade = 0;

		System.out.println("*********************************************");
		System.out.println("            Digite -1 para finalizar         ");
		System.out.println("*********************************************");

		while (idade > -1) {
			
			System.out.print("Digite sua idade: ");
			idade = leia.nextInt();

			if(idade < 21 && idade > -1) {
				idade21 ++;
			} else if (idade > 50) {
				idade50 ++;
			}
		}
		
		System.out.printf("Total de pessoas menores de 21 anos: %d\n", idade21);
		System.out.printf("Total de pessoas maiores de 50 anos: %d\n", idade50);
		
		leia.close();

	}

}
