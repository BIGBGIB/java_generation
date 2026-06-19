package atividade_02;

import java.util.ArrayList;
import java.util.Scanner;

import funcoes.MediaNotas;

public class ControleEstoque {

	public static void main(String[] args) {

		ArrayList<String> produtos = new ArrayList<String>();
		ArrayList<Integer> quantidades = new ArrayList<Integer>();
		Scanner leia = new Scanner(System.in);
		int opcao = 1;

		while (opcao > 0) {
			System.out.println("*******************************************  ");
			System.out.println("               Escolha uma opção             ");
			System.out.println("*******************************************\n");
			System.out.println("  1- Cadastrar um novo produto               ");
			System.out.println("  2- Atualizar a quantidade de um produto    ");
			System.out.println("  3- Listar todos os produtos                ");
			System.out.println("  0- Sair                                    ");

			System.out.print("Digite a opção desejada: ");
			opcao = leia.nextInt();

			if (opcao == 1) {
				System.out.print("Informe o nome do produto: ");
				leia.nextLine();
				produtos.add(leia.nextLine());
				System.out.print("Informe a quantidade: ");
				quantidades.add(leia.nextInt());
				System.out.println("Produto cadastrado com sucesso!");

			} else if (opcao == 2) {

				if (produtos.isEmpty() == true) {
					System.out.println("A lista está vazia!");
				} else {

					System.out.print("Informe o nome do produto que deseja atualizar: ");
					leia.nextLine();
					String nome = leia.nextLine();
					if(produtos.contains(nome) == true) {
						
						for (int quantidade : quantidades) {
							
							if (produtos.indexOf(nome) == quantidades.indexOf(quantidade)) {
								int indiceP = produtos.indexOf(nome);
								int indiceQ = quantidades.indexOf(quantidade);
								
								System.out.printf("Produto: %s | Quantidade: %d%n", produtos.get(indiceP), quantidades.get(indiceQ));
								System.out.println("Digite a quantidade atualizada: ");
								quantidades.set(indiceQ, leia.nextInt()); 
								System.out.println("Produto atualizado com sucesso");
								System.out.printf("Produto: %s | Quantidade: %d%n", produtos.get(indiceP), quantidades.get(indiceQ));
								
							}
						}
						
					}	
				}
			} else if (opcao == 3) {
				
				System.out.println("Pordutos Cadastrados");
				for (int posicao = 0; posicao < produtos.size(); posicao++) {

					System.out.println("*******************************************");
					System.out.printf("Produto: %s | Quantidade: %d%n", produtos.get(posicao), quantidades.get(posicao));
					System.out.println("*******************************************\n");

				}
			} else if(opcao != 0) {
				System.out.println("Opção Inválida!");
			}
		}
				
		System.out.println("Sessão Finalizada");
		leia.close();
	}
}
