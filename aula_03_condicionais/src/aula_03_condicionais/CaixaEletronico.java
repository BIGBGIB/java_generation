package aula_03_condicionais;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		float saldo = 1000;

		System.out.println("*******************************************  ");
		System.out.println("                 Operações                   ");
		System.out.println("*******************************************\n");
		System.out.println("        1- Verificar Saldo                   ");
		System.out.println("        2- Saque                             ");
		System.out.println("        3- Depositar                         ");

		System.out.print("\nDigite o código da operação:  ");
		int codigo = leia.nextInt();

		switch (codigo) {
		case 1:
			System.out.println("\n*******Saldo Disponível*******");
			System.out.printf("\nR$ %.2f", saldo);
			break;
		case 2:
			System.out.println("\n*******Saldo Disponível*******");
			System.out.printf("\nR$ %.2f", saldo);
			System.out.print("\nDigite o valor do saque: ");
			float saque = leia.nextFloat();

			if (saque > saldo) {
				System.out.println("Saldo Insuficiente!");
			} else if (saque <= saldo && saque > 0) {
				saldo = saldo - saque;
				System.out.println("\nSaque Realizado!");
				System.out.printf("\nSaldo: R$ %.2f", saldo);
			} else
				System.out.println("Valor Inválido!");
			break;
		case 3:
			System.out.println("*******Saldo Disponível*******");
			System.out.printf("\nR$ %.2f", saldo);
			System.out.print("\nDigite o valor do depósito: ");
			float deposito = leia.nextFloat();

			if (deposito > 0) {
				saldo = saldo + deposito;
				System.out.println("\nDepósito Realizado!");
				System.out.printf("\nSaldo: R$ %.2f", saldo);
			} else
				System.out.println("Valor Inválido!");
			break;
		default:
			System.out.println("Operação Inválida!");

		}
	}

}
