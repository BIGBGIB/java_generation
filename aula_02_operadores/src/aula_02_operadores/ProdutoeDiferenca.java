package aula_02_operadores;

import java.util.Scanner;

public class ProdutoeDiferenca {

	public static void main(String[] args) {
		
	    Scanner leia = new Scanner(System.in);
		
	    float numero1, numero2, numero3, numero4;
			
		System.out.print("\nDigite o numero1: ");
		numero1 = leia.nextFloat();
		
		System.out.print("\nDigite o numero2: ");
		numero2 = leia.nextFloat();
		
		System.out.print("\nDigite o numero3: ");
		numero3 = leia.nextFloat();
		
		System.out.print("\nDigite o numero4: ");
		numero4 = leia.nextFloat();
		
		System.out.printf("\nDiferença: %.2f", (numero1 * numero2) - (numero3 * numero4));
		
		leia.close();
	

	}

}
