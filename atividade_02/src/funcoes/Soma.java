package funcoes;

import java.util.ArrayList;

public class Soma {
	
	public static int somar(ArrayList<Integer> numeros) {
		
		int total = 0;
		
		for(int numero : numeros) {
			total += numero;
		}
		
		return total;
	}
}