package funcoes;

import java.util.ArrayList;

public class Media {

	public static int media (ArrayList<Integer> numeros) {
		
		int total = 0;
		int contagem = 0;
		int resultado = 0;
		
		for(int numero : numeros) {
			total += numero;
			contagem++;
			
			resultado = total/contagem;
			
		}
		
		return resultado;
	}
	
}