package aula_06_colletions;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista01_1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();
		int contagem = 1;
		int opcao = 1;
		
		System.out.println("Monte uma lista com 5 cores");
		
		do {
			System.out.printf("Digite a %d cor: ", contagem);
			cores.add(leia.next());

			contagem++;

		} while (contagem <= 5);

		while (opcao > 0) {
			System.out.println("*******************************************  ");
			System.out.println("               Escolha uma opção             ");
			System.out.println("*******************************************\n");
			System.out.println("  1- Listar todas as cores                   ");
			System.out.println("  2- Listar todas as cores em ordem crescente");
			System.out.println("  0- Sair                                    ");

			System.out.print("Digite a opção desejada: ");
			opcao = leia.nextInt();

			if (opcao == 1) {

				System.out.println("******Listar todas as cores******");

				for (String cor : cores) {
					System.out.println(cor);
				}
			} else if (opcao == 2) {
				cores.sort(null);

				System.out.println("******Listar todas as cores em ordem crescente******");

				for (String cor : cores) {
					System.out.println(cor);
				}
			} else if (opcao != 0) {
				System.out.println("Opção Inválida!");
			}
		}
		System.out.println("Sessão Finalizada!");
		leia.close();
	}
}
