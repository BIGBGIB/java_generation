package aula_03_condicionais;

import java.util.Scanner;

public class PlanoDeSaude {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		String nome = leia.nextLine();
		
		System.out.print("Informe sua idade: ");
		int idade = leia.nextInt();
		
		System.out.printf("---%s---\n", nome);
		
		if(idade >= 0 && idade <= 18) {
			System.out.println("A mensalidade do Plano é R$ 100,00");
		} else if(idade >= 19 && idade <= 23) {
			System.out.println("A mensalidade do Plano é R$ 200,00");
		} else if(idade >= 24 && idade <= 28) {
			System.out.println("A mensalidade do Plano é R$ 300,00");
		} else if(idade >= 29 && idade <= 33) {
			System.out.println("A mensalidade do Plano é R$ 400,00");
		} else if(idade >= 34 && idade <= 38) {
			System.out.println("A mensalidade do Plano é R$ 500,00");
		} else if(idade >= 39 && idade <= 43) {
			System.out.println("A mensalidade do Plano é R$ 600,00");
		} else if(idade >= 441 && idade <= 48) {
			System.out.println("A mensalidade do Plano é R$ 700,00");
		} else if(idade >= 49 && idade <= 53) {
			System.out.println("A mensalidade do Plano é R$ 800,00");
		} else if(idade >= 54 && idade <= 58) {
			System.out.println("A mensalidade do Plano é R$ 900,00");
		} else {
			System.out.println("A mensalidade do Plano é R$ 1.000,00");
		}
		
		leia.close();

	}

}
