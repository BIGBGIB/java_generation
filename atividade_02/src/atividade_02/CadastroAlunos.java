package atividade_02;

import java.util.ArrayList;
import java.util.Scanner;

import funcoes.MaiorNumero;
import funcoes.Media;
import funcoes.MediaNotas;
import funcoes.Soma;

public class CadastroAlunos {
	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<Integer> idades = new ArrayList<Integer>();
		ArrayList<Double> notas = new ArrayList<Double>();
		Scanner leia = new Scanner(System.in);
		int opcao = 1;

		while (opcao > 0) {
			System.out.println("*******************************************  ");
			System.out.println("               Escolha uma opção             ");
			System.out.println("*******************************************\n");
			System.out.println("  1- Cadastrar um novo aluno                 ");
			System.out.println("  2- Listar todos os alunos cadastrados      ");
			System.out.println("  3- Calcular a média geral das notas        ");
			System.out.println("  0- Sair                                    ");

			System.out.print("Digite a opção desejada: ");
			opcao = leia.nextInt();

			if (opcao == 1) {
				System.out.print("Informe o nome do aluno: ");
				leia.nextLine();
				nomes.add(leia.next());
				System.out.print("Informe a idade do aluno: ");
				idades.add(leia.nextInt());
				System.out.print("Informe a nota final do aluno: ");
				notas.add(leia.nextDouble());
				System.out.println("Aluno cadastrado com sucesso!");

			} else if (opcao == 2) {

				if (nomes.isEmpty() == true) {
					System.out.println("A lista está vazia!");
				} else {

					System.out.printf("Alunos cadastrados%n");

					for (int posicao = 0; posicao < nomes.size(); posicao++) {

						System.out.println("*******************************************");
						System.out.printf("Nome: %s%n", nomes.get(posicao));
						System.out.printf("Idade: %d%n", idades.get(posicao));
						System.out.printf("Nota Final: %.1f%n", notas.get(posicao));
						System.out.println("*******************************************\n");

					}
				}
			} else if (opcao == 3) {
				if (notas.isEmpty() == true) {
					System.out.println("A lista está vazia!");
				} else {

					System.out.print("Média geral dos alunos: ");
					System.out.println(MediaNotas.calcularMediaNotas(notas));

				}
			} else if (opcao != 0) {
				System.out.println("Opção Inválida!");
			}
		}

		System.out.println("Sessão Finalizada");
		leia.close();
	}
}
