package atividade_02;

import java.util.ArrayList;
import java.util.Scanner;
import funcoes.Soma;
import funcoes.MaiorNumero;
import funcoes.Media;

public class NumeroseAnalise {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner leia = new Scanner(System.in);
		int contagem = 1;
		int opcao = 1;

		System.out.println("Monte uma lista com 5 números inteiros");

		do {
			System.out.printf("Digite o %d número: ", contagem);
			numeros.add(leia.nextInt());

			contagem++;

		} while (contagem <= 5);

		while (opcao > 0) {
			System.out.println("*******************************************  ");
			System.out.println("               Escolha uma opção             ");
			System.out.println("*******************************************\n");
			System.out.println("  1- Listar todos os números                 ");
			System.out.println("  2- Somar todos os números                  ");
			System.out.println("  3- Obter a média dos valores               ");
			System.out.println("  4- Descobrir o maior número da lista       ");
			System.out.println("  0- Sair                                    ");

			System.out.print("Digite a opção desejada: ");
			opcao = leia.nextInt();

			if (opcao == 1) {
				System.out.println("Números cadastrados: ");
				for (int numero : numeros) {
					System.out.println(numero);
				}
			} else if (opcao == 2) {
				System.out.print("Soma de todos os números: ");
				System.out.println(Soma.somar(numeros));
			} else if (opcao == 3) {

				System.out.print("Média dos valores: ");
				System.out.println(Media.media(numeros));
			} else if (opcao == 4) {
				System.out.print("O maior número da lista é: ");
				System.out.println(MaiorNumero.maiorNumero(numeros));
			} else if (opcao != 0) {
				System.out.println("Opção Inválida!");
			}
		}

		System.out.println("Sessão Finalizada");
		leia.close();
	}
}
