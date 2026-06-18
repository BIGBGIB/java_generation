package aula_06_colletions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class ColletionPilha {

	public static void main(String[] args) {
		
		Deque<String> pilha = new ArrayDeque<String>();
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> listaDeCores = new ArrayList<String>(Arrays.asList("Roxo", "Rosa", "Amarelo", "Verde"));
		
		pilha.addAll(listaDeCores);
		
		System.out.println("Adicione uma cor: ");
		pilha.push(leia.next()); //add
		
		for(var cores : pilha) {
		System.out.println(cores);
		}
		
		System.out.println("*****Removendo*****");
		
		pilha.pop(); // remover
		
		for(var cores : pilha) {
			System.out.println(cores);
			}
		

	}

}
