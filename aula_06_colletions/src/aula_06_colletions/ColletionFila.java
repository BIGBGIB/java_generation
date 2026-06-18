package aula_06_colletions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ColletionFila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> listaPessoas = new ArrayList<String>(Arrays.asList("Bob", "Ricardo", "Diva", "Boberto"));
		
		fila.addAll(listaPessoas);
		
		System.out.println("Digite o nome da próxima pessoa: ");
		fila.add(leia.next());
		
		for(var pessoas : fila) {
		System.out.println(pessoas);
		}
		
		System.out.println("Borbeto está na fila?\n" + fila.contains("Boberto"));
		
		System.out.println("******Removendo******");
		fila.remove();
		
		for(var pessoas : fila) {
			System.out.println(pessoas);
		}
		

	}

}
