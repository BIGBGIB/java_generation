package aula_02_operadores;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		
        Scanner leia = new Scanner(System.in);
		
		float salarioBruto, valorHora, adicionalNoturno, descontos;
		int horasExtras;
		
		System.out.print("Digite o Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.print("\nDigite o valor da Hora Extra: ");
		valorHora = leia.nextFloat();
		
		System.out.print("\nDigite a quantidade de horas trabalhadas: ");
		horasExtras = leia.nextInt();
		
		System.out.print("\nDigite o Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.print("\nDigite os Descontos: ");
		descontos = leia.nextFloat();
		
		System.out.printf("\nSalário Líquido: %.2f", salarioBruto + (valorHora * horasExtras) + adicionalNoturno - descontos);
		
		leia.close();
		
    }

}
