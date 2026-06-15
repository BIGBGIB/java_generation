package aula_03_condicionais;

import java.util.Scanner;

public class CondicionalSimples {

	public static void main(String[] args) {
		
        Scanner leia = new Scanner(System.in);
	
		System.out.print("Digite um número inteiro: ");
		int numero = leia.nextInt();
		
		if(numero > 10 && numero < 100) {
			System.out.println("O número ");
		} else {
			System.out.println(" L");
		}
		
		leia.close();

	}

}
