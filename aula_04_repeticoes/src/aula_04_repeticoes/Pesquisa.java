package aula_04_repeticoes;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int idade, esporte;
		int totalRespostas = 0;
		int somaIdades = 0;
		int futebol = 0;
		int basqueteM18 = 0;
		double mediaIdades = 0.0;
		char continua = 'S';

		while (continua == 'S') {

			System.out.println("*******************************************  ");
			System.out.println("                  Esportes                   ");
			System.out.println("*******************************************\n");

			System.out.print("Digite sua idade: ");
			idade = leia.nextInt();

			do {
				System.out.println("       Selecione seu Esporte favorito       ");
				System.out.println("        1- Futebol                          ");
				System.out.println("        2- Basquetebol                      ");
				System.out.println("        3- Handebol                         ");
				System.out.println("        4- Voleibol                         ");
				System.out.println("        5- Outros                           ");

				System.out.println("Digite a opção desejada: ");
				esporte = leia.nextInt();
			} while (esporte < 1 || esporte > 4);

			totalRespostas++;

			somaIdades += idade;
			
			if(esporte == 1) {
				futebol ++;
			}
			
			if(idade > 18 && esporte == 2) {
				basqueteM18 ++;
			}

			do {
				System.out.print("Deseja continuar?(S/N): ");
				continua = leia.next().toUpperCase().charAt(0);
			} while (!(continua == 'S') && !(continua == 'N'));

		}

		mediaIdades = somaIdades / totalRespostas;

		System.out.printf("Média das idades: %.2f\n", mediaIdades);
		System.out.printf("Quantidade de pessoas que gostam de futebol: %d\n", futebol);
		System.out.printf("Quantidade de pessoas maiores de 18 anos que gostam de basquete: %d\n", basqueteM18);

		leia.close();

	}

}