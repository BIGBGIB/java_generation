package aula_02_operadores;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		
        Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4;
		
		System.out.print("Digite a nota1: ");
		nota1 = leia.nextFloat();
		
		System.out.print("Digite a nota2: ");
		nota2 = leia.nextFloat();
		
		System.out.print("Digite a nota3: ");
		nota3 = leia.nextFloat();
	
		System.out.print("Digite a nota4: ");
		nota4 = leia.nextFloat();
		
		System.out.printf("Média Final: %.2f", (nota1 + nota2 + nota3 + nota4) / 4);
		
		leia.close();
		
		}
 }
