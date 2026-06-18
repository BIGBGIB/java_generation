package aula_06_colletions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lista02_3 {

	public static void main(String[] args) {
	
		Set<Integer> numeros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);

		int contagem = 1;
		int opcao = 1;
		
		System.out.println("Monte uma lista com 10 números inteiros não repetidos");
		
		do {
			System.out.printf("Digite o %d número: ", contagem);
			numeros.add(leia.nextInt());

			contagem++;

		} while (contagem <= 10);

		while (opcao > 0) {
			System.out.println("*******************************************  ");
			System.out.println("               Escolha uma opção             ");
			System.out.println("*******************************************\n");
			System.out.println("  1- Listar todos os números                 ");
			System.out.println("  2- Remover um número                       ");
			System.out.println("  7- Sair                                    ");

			System.out.print("Digite a opção desejada: ");
			opcao = leia.nextInt();

			if (opcao == 1) {

				System.out.println("******Listar todas os números******");

				for (int numero : numeros) {
					System.out.println(numero);
				}
			} else if (opcao == 2) {
				
				for (int numero : numeros) {
					System.out.println(numero);
				}
		
				System.out.print("Digite o número a ser removido: ");
				int remover = leia.nextInt();
				numeros.remove(Integer.valueOf(remover));
				
				System.out.printf("Número %d foi removido da lista!\n", remover);
				for (int numero : numeros) {
					System.out.println(numero);
				}
			} else if (opcao != 0){
				System.out.println("Opção Inválida!");
			}
		} 
		System.out.println("Sessão Finalizada!");
	}
}


