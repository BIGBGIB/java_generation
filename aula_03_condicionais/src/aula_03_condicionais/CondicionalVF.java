package aula_03_condicionais;

import java.util.Scanner;

public class CondicionalVF {

	public static void main(String[] args) {
		
		    Scanner leia = new Scanner(System.in);
			
			System.out.print("Informe sua idade: ");
			int idade = leia.nextInt();
		
		if (idade >= 18) {
			System.out.println("\nO participante é maior de idade");
			System.out.println("\n---Teste Finalizado!---");
		} else {
			System.out.println("\nO participante é menor de idade");
			System.out.println("\n---Teste Finalizado!---");
		}
		
		leia.close();

	}

}
