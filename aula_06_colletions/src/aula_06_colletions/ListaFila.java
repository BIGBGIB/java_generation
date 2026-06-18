package aula_06_colletions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ListaFila {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int opcao = 1;
		
		System.out.println("**********Fila de Espera**********");
		
		while (opcao > 0) {
			
			System.out.println("*******************************************  ");
			System.out.println("               Escolha uma opção             ");
			System.out.println("*******************************************\n");
			System.out.println("  1- Adicionar cliente na fila               ");
			System.out.println("  2- Listar todos os clientes em espera      ");
			System.out.println("  3- Chamar o próximo cliente                ");
			System.out.println("  0- Sair                                    ");

			System.out.print("Digite a opção desejada: ");
			opcao = leia.nextInt();
			
			if (opcao == 1) {

				System.out.println("******Adicionar cliente na fila******");
				System.out.print("Digite o nome do cliente: ");
				fila.add(leia.next());
				
				System.out.println("Cliente adicionado com sucesso!");

			} else if (opcao == 2) {
				if (fila.isEmpty() == true) {
					System.out.println("A fila está vazia!");
				} else {
				
				for (var nome : fila) {
					System.out.println(nome);
				}
				}
			} else if (opcao == 3) {
				if (fila.isEmpty() == true) {
					System.out.println("A fila está vazia!");
				} else {
				
					fila.remove();
					System.out.println("Próximo cliente!");
				}
				} else if (opcao != 0){
				System.out.println("Opção Inválida!");
			}
		}
		
		System.out.println("Sessão Finalizada!");
		leia.close();
	}
}

