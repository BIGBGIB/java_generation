package aula_06_colletions;

import java.util.ArrayList;
import java.util.Comparator;

public class ColletionArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		numeros.add(1);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);

		for (int numero : numeros) {
			System.out.println(numero);
		}

		System.out.println(" - O objeto que está presente no indice 1: " + numeros.get(1));
		System.out.println(" - O indice do objeto 1: " + numeros.indexOf(1));

		numeros.set(0, 7); // mudar um objeto através do índice
		
		System.out.println("*********Alterando o valor do objeto do indice 0*******************");

		for (int numero : numeros) {
			System.out.println(numero);
		}

		numeros.remove(0);

		System.out.println("*********Removendo objeto do índice 0*******************");

		for (int numero : numeros) {
			System.out.println(numero);
		}

		System.out.println("***********add 1*****************");
		
		numeros.add(1);
		
		for (int numero : numeros) {
			System.out.println(numero);
		}

		numeros.sort(null); // Crescente

		System.out.println("***********Crescente***********");

		for (int numero : numeros) {
			System.out.println(numero);
		}

		numeros.sort(Comparator.reverseOrder()); // Decrescente

		System.out.println("***********Decrescente***********");

		for (int numero : numeros) {
			System.out.println(numero);
		}

	}

}
