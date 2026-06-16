package atividade_01;

import java.util.Scanner;

public class NotaAluno {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		float media = 0.0f;
		
		System.out.print("Informe o nome do aluno: ");
		String nome = leia.nextLine();
		
		System.out.print("Informe a primeira nota: ");
		float nota1 = leia.nextFloat();
		
		System.out.print("Informe a segunda nota: ");
		float nota2 = leia.nextFloat();
		
		System.out.print("Informe a terceira nota: ");
		float nota3 = leia.nextFloat();
		
		
		media = (nota1 + nota2 + nota3) / 3;
		
		if (media >= 7) {
			System.out.printf("Aluno: %s \nMédia: %.1f \nAprovado!", nome, media);
		} else if (media >= 5 && media < 7) {
			System.out.printf("Aluno: %s \nMédia: %.1f \nRecuperação!", nome, media);
		} else if (media < 5 && media >= 0) {
			System.out.printf("Aluno: %s \nMédia: %.1f \nReprovado!", nome, media);
		} else {
			System.out.println("Valor Inválido!");
		}
		
		leia.close();

	}

	}


