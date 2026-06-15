package aula_03_condicionais;

import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		float total;
		int quantidade;

		System.out.println("*******************************************  ");
		System.out.println("                    Menu                     ");
		System.out.println("*******************************************\n");
		System.out.println("        1- Cachorro Quente R$ 10.00          ");
		System.out.println("        2- X-Salada R$ 15.00                 ");
		System.out.println("        3- X-Bacon R$ 18.00                  ");
		System.out.println("        4- Bauru R$ 12.00                    ");
		System.out.println("        5- Refrigerante R$ 8.00              ");
		System.out.println("        6- Suco de laranja R$ 13.00          ");

		System.out.print("\nDigite o número do seu pedido:  ");
		int opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			System.out.printf("Cachorro Quente");
			System.out.print("\nDigite a quantidade:  ");
			quantidade = leia.nextInt();
			total = 10 * quantidade;
			System.out.printf("Cachorro Quente %dX", quantidade);
			System.out.printf("\nValor total: R$ %.2f", total);
			break;
		case 2:
			System.out.printf("X-Salada");
			System.out.print("\nDigite a quantidade:  ");
			quantidade = leia.nextInt();
			total = 15 * quantidade;
			System.out.printf("X-Salada %dX", quantidade);
			System.out.printf("\nValor total: R$ %.2f", total);
			break;
		case 3:
			System.out.printf("X-Bacon");
			System.out.print("\nDigite a quantidade:  ");
			quantidade = leia.nextInt();
			total = 18 * quantidade;
			System.out.printf("X-Bacon %dX", quantidade);
			System.out.printf("\nValor total: R$ %.2f", total);
			break;
		case 4:
			System.out.printf("Bauru");
			System.out.print("\nDigite a quantidade:  ");
			quantidade = leia.nextInt();
			total = 12 * quantidade;
			System.out.printf("Bauru %dX", quantidade);
			System.out.printf("\nValor total: R$ %.2f", total);
			break;
		case 5:
			System.out.printf("Refrigerante");
			System.out.print("\nDigite a quantidade:  ");
			quantidade = leia.nextInt();
			total = 8 * quantidade;
			System.out.printf("Refrigerante %dX", quantidade);
			System.out.printf("\nValor total: R$ %.2f", total);
			break;
		case 6:
			System.out.printf("Suco de laranja");
			System.out.print("\nDigite a quantidade:  ");
			quantidade = leia.nextInt();
			total = 13 * quantidade;
			System.out.printf("Suco de laranja %dX", quantidade);
			System.out.printf("\nValor total: R$ %.2f", total);
			break;
		default:
			System.out.println("Opção Incorreta!");
			
	    }
		
		leia.close();
		
		}

	}

