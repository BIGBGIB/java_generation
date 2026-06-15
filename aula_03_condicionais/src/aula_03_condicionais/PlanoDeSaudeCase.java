package aula_03_condicionais;

import java.util.Scanner;

public class PlanoDeSaudeCase {

	public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		String nome = leia.nextLine();
		
		System.out.printf(" ---            %s                 ---\n", nome);
		
		System.out.println("*******************************************  ");
		System.out.println("               Faixa Etária                  ");
		System.out.println("*******************************************\n");
		System.out.println("        1- De 00 a 18 anos de idade          ");
		System.out.println("        2- De 19 a 23 anos de idade          ");
		System.out.println("        3- De 24 a 28 anos de idade          ");
		System.out.println("        4- De 29 a 33 anos de idade          ");
		System.out.println("        5- De 34 a 38 anos de idade          ");
		System.out.println("        6- De 39 a 43 anos de idade          ");
		System.out.println("        7- De 44 a 48 anos de idade          ");
		System.out.println("        8- De 49 a 53 anos de idade          ");
		System.out.println("        9- De 54 a 58 anos de idade          ");
		System.out.println("        10- 59 anos de idade ou mais         ");
		
		System.out.print("\nEscolha sua faixa etária:  ");
		int opcao = leia.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("A mensalidade do Plano é R$ 100,00");
			break;
		case 2:
			System.out.println("A mensalidade do Plano é R$ 200,00");
			break;
		case 3:
			System.out.println("A mensalidade do Plano é R$ 300,00");
			break;
		case 4:
			System.out.println("A mensalidade do Plano é R$ 400,00");
			break;
		case 5:
			System.out.println("A mensalidade do Plano é R$ 500,00");
			break;
		case 6:
			System.out.println("A mensalidade do Plano é R$ 600,00");
			break;
		case 7:
			System.out.println("A mensalidade do Planno é R$ 700,00");
			break;
		case 8:
			System.out.println("A mensalidade do Plano é R$ 800,00");
			break;
		case 9:
			System.out.println("A mensalidade do Plano é R$ 900,00");
			break;
		case 10:
			System.out.println("A mensalidade do Plano é R$ 1.000,00");
			break;
		default:
			System.out.println("Opção Incorreta!");
			
	    }
		
		leia.close();
		
	}

}
