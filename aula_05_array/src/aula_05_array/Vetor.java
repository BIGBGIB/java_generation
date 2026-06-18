package aula_05_array;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int vetorInteiros[] = { 10, 20, 30, 40, 50, 60 }; // Vetor inicializado com dados

		float vetorReal[] = new float[5]; // Vetor vazio

		for (int contador = 0; contador < vetorInteiros.length; contador++) {

			System.out.printf("vetorInterios[%d] = %d\n", contador, vetorInteiros[contador]);

		}

		for (int contador = 0; contador < vetorReal.length; contador++) {
			System.out.printf("Digite o %d número real: ", contador);
			float numeroReal = leia.nextFloat();

			vetorReal[contador] = numeroReal;
		}

		Arrays.sort(vetorReal); // Ordem Crescente - muda a ordem dos vetores

		for (int contador = 0; contador < vetorReal.length; contador++) {

			System.out.println("Ordem Crescente");
			System.out.printf("vetorReal[%d] = %.1f\n", contador, vetorReal[contador]);

		}

		for (int contador = vetorReal.length - 1; contador >= 0; contador--) {

			System.out.println("Ordem Decrescente"); // não muda a ordem so lista
			System.out.printf("vetorReal[%d] = %.1f\n", contador, vetorReal[contador]);

		}

		leia.close();

	}

}
