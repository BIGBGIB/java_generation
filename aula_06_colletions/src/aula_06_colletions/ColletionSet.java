package aula_06_colletions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ColletionSet {

	public static void main(String[] args) {
		
		Set<String> frutas = new HashSet<String>();
		
		ArrayList<String> listaFrutas = new ArrayList<String>(Arrays.asList("Uva", "Toranja"));
		
		frutas.add("Morango");
		frutas.add("pêra");
		frutas.add("Banana");
		frutas.add("uva");
		frutas.add("Banana");
		frutas.addAll(listaFrutas);
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}
		
		System.out.println("A fruta Toranja está presente?\n" + frutas.contains("Toranja"));
		
		frutas.remove("pêra");
		
		System.out.println("Removendo pêra");
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}
		
		
	}

}
