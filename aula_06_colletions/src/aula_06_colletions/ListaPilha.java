package aula_06_colletions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class ListaPilha {

	public static void main(String[] args) {
		
		Deque<String> pilha = new ArrayDeque<String>();
		Scanner leia = new Scanner(System.in);
		int opcao = 1;
		
		System.out.println("Bem_Vindo ao sistema de pilhas da Biblioteca");
		
		while (opcao > 0) {
			
			System.out.println("*******************************************  ");
			System.out.println("               Escolha uma opção             ");
			System.out.println("*******************************************\n");
			System.out.println("  1- Adicionar um novo livro na pilha        ");
			System.out.println("  2- Listar todos os livros da pilha         ");
			System.out.println("  3- Retirar um livro da pilha                ");
			System.out.println("  0- Sair                                    ");

			System.out.print("Digite a opção desejada: ");
			opcao = leia.nextInt();
			
			if (opcao == 1) {

				
				System.out.println("******Adicionar um novo livro na pilha******");
				System.out.print("Digite o nome do livro: ");
				leia.nextLine();
				pilha.push(leia.nextLine());
				
				System.out.println("Livro adicionado com sucesso na pilha!");

			} else if (opcao == 2) {
				if (pilha.isEmpty() == true) {
					System.out.println("A pilha de livros está vazia!");
				} else {
				
				for (var titulo : pilha) {
					System.out.println(titulo);
				}
				}
			} else if (opcao == 3) {
				if (pilha.isEmpty() == true) {
					System.out.println("A pilha de livros está vazia!");
				} else {
				
					pilha.remove();
					System.out.println("Um livro do pilha foi retirado!");
				}
				} else if (opcao != 0){
				System.out.println("Opção Inválida!");
			}
		}
		
		System.out.println("Sessão Finalizada!");
		
		leia.close();
	}
}

						
		
		