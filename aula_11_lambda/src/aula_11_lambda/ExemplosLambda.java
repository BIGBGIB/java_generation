package aula_11_lambda;

import java.util.Arrays;
import java.util.List;

public class ExemplosLambda {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		for(var numero : numeros) {
			System.out.println(numero);
		}
		
		System.out.println("com lambda");

		numeros.forEach(numero -> System.out.println(numero));
		
		System.out.println("par");
		
		numeros.forEach(numero -> {
			if(numero % 2 == 0)
				System.out.println(numero);
		});
		
		System.out.println("outro");
		
		numeros.forEach(numero -> {
			System.out.println(numero);
			System.out.println(numero + 1);
		});
	}

}
