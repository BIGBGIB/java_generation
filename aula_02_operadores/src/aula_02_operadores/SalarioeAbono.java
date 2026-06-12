package aula_02_operadores;

import java.util.Scanner;

public class SalarioeAbono {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salario, abono;
		
		System.out.print("Digite o salario: ");
		salario = leia.nextFloat();
		
		System.out.print("Digite o abono: ");
		abono = leia.nextFloat();
		
		System.out.printf("Salário Final: R$ %.2f", salario + abono);
		
		leia.close();
		
	}

}
;