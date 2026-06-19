package funcoes;

import java.util.ArrayList;

public class MediaNotas {
	
public static double calcularMediaNotas (ArrayList<Double> notas) {
		
		double total = 0;
		int contagem = 0;
		double resultado = 0;
		
		for(double nota : notas) {
			total += nota;
			contagem++;
			
			resultado = total/contagem;
			
		}
		
		return resultado;
	}
	

}
