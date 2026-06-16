package atividade_01;

import java.util.Scanner;

public class IdadeeAcesso {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.print("Informe seu nome: ");
		String nome = leia.nextLine();

		System.out.print("Informe sua idade: ");
		int idade = leia.nextInt();

		if (idade < 18) {
			System.out.print("Possui Autorização dos responsáveis? (1 / 0): ");
			int opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.printf("Acesso não liberado para %s", nome);
			} else if (opcao == 1) {
				System.out.printf("Acesso liberado com autorização para %s", nome);
			} else if (opcao != 1 && opcao != 0) {
				System.out.println("Opção Inválida!");
			} 
		} else if (idade >= 18) {
				System.out.printf("Acesso liberado para %s", nome);
			}

			leia.close();

		}
	}

