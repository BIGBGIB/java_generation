package aula_05_array;

import java.util.Arrays;
import java.util.Scanner;

public class Lista01_1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int end = 0;
		int opcao, numero;
		boolean verificar;

		while (end > -1) {
	
			System.out.println("       Selecione a opção desejada                    ");
			System.out.println("        1- Descobrir a posição de um número digitado ");
			System.out.println("        2- Descobrir o número na posição digitada    ");
			System.out.println("Digite a opção desejada: ");
			opcao = leia.nextInt();

			if (opcao == 1) {

				System.out.print("Digite um número inteiro: ");
				numero = leia.nextInt();

				Arrays.sort(vetorInteiros);
				int posicao = Arrays.binarySearch(vetorInteiros, numero);
				if (posicao >= 0) {
					System.out.printf("O número %d está localizado na posição: %d\n", numero, posicao);
				} else {
					System.out.printf("O número %d não foi encontrado!\n", numero);
				}
			} else if (opcao == 2) {
				System.out.print("Digite uma posição: ");
				numero = leia.nextInt();
			
				if (numero >= 0 && numero < vetorInteiros.length ) {
				System.out.printf("O número localizado na posição %d é: %d\n", numero, vetorInteiros[numero]);
				} else {
					System.out.println("Posição não encontrada!\n");
				}
			}

			System.out.println("*********************************************");
			System.out.println("  Digite -1 para finalizar e 1 para continuar");
			System.out.println("*********************************************");

			System.out.println("Deseja continuar?: ");
			end = leia.nextInt();
		
		}
		
		System.out.println("Teste Finalizado!");
		leia.close();
		
	}

}
