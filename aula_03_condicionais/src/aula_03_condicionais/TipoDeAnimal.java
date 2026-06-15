package aula_03_condicionais;

import java.util.Scanner;

public class TipoDeAnimal {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String colunaC = "vertebrado";
		String colunaS = "invertebrado";

		System.out.println("*******************************************  ");
		System.out.println("               Escolha uma opção             ");
		System.out.println("*******************************************\n");
		System.out.println("         Vertebrado ou Invertebrado          ");

		System.out.print("Digite: ");
		String coluna = leia.nextLine();

		if (coluna.equalsIgnoreCase(colunaC)) { // vertebrado
			String classeA = "ave";
			String classeM = "mamifero";

			System.out.println("*******************************************  ");
			System.out.println("              Escolha uma opção             ");
			System.out.println("*******************************************\n");
			System.out.println("               Ave ou Mamífero               ");

			System.out.print("Digite: ");
			String classeV = leia.nextLine();

			if (classeV.equalsIgnoreCase(classeA)) { // ave
				String ordemC = "carnivoro";
				String ordemO = "onivoro";

				System.out.println("*******************************************  ");
				System.out.println("              Escolha uma opção              ");
				System.out.println("*******************************************\n");
				System.out.println("            Carnívoro ou Onívoro             ");

				System.out.print("Digite: ");
				String ordem = leia.nextLine();

				if (ordem.equalsIgnoreCase(ordemC)) { // carnivoro

					System.out.println("\n             Águia                      ");

				} else if (ordem.equalsIgnoreCase(ordemO)) { // onivoro

					System.out.println("\n             Pomba                     ");
				} else {
					System.out.println("Opção inexistente");
				}
			} else if (classeV.equalsIgnoreCase(classeM)) { // mamifero
				String ordemC = "carnivoro";
				String ordemO = "onivoro";
				String ordemH = "herbivoro";

				System.out.println("*******************************************  ");
				System.out.println("              Escolha uma opção              ");
				System.out.println("*******************************************\n");
				System.out.println("       Carnívoro, Onívoro ou Herbívoro       ");

				System.out.print("Digite: ");
				String ordem = leia.nextLine();

				if (ordem.equalsIgnoreCase(ordemC)) { // carnivoro

					System.out.println("\n             Leão                      ");

				} else if (ordem.equalsIgnoreCase(ordemO)) { // onivoro

					System.out.println("\n             Homem                    ");
				} else if (ordem.equalsIgnoreCase(ordemH)) { // herbivoro

					System.out.println("\n             Vaca                    ");
				} else {
					System.out.println("Opção inexistente");
				}
			} else {
				System.out.println("Opção inexistente");
			}

		} else if (coluna.equalsIgnoreCase(colunaS)) { // invertebrado

			String classeI = "inseto";
			String classeA = "anelideo";

			System.out.println("*******************************************  ");
			System.out.println("              Escolha uma opção              ");
			System.out.println("*******************************************\n");
			System.out.println("              Inseto ou Anelídeo             ");

			System.out.print("Digite: ");
			String classe = leia.nextLine();

			if (classe.equalsIgnoreCase(classeI)) { // inseto

				String ordemF = "hematofago";
				String ordemH = "herbivoro";

				System.out.println("*******************************************  ");
				System.out.println("              Escolha uma opção              ");
				System.out.println("*******************************************\n");
				System.out.println("            Hematófago ou Herbívoro          ");

				System.out.print("Digite: ");
				String ordem = leia.nextLine();

				if (ordem.equalsIgnoreCase(ordemF)) { // hematofogo

					System.out.println("\n             Piolho                      ");

				} else if (ordem.equalsIgnoreCase(ordemH)) { // herbivoro

					System.out.println("\n             Largata                     ");
				} else {
					System.out.println("Opção inexistente");
				}
			} else if (classe.equalsIgnoreCase(classeA)) { // anelideo

				String ordemO = "onivoro";
				String ordemF = "hematofago";

				System.out.println("*******************************************  ");
				System.out.println("              Escolha uma opção              ");
				System.out.println("*******************************************\n");
				System.out.println("            Onívoro ou Hematófago            ");

				System.out.print("Digite: ");
				String ordem = leia.nextLine();

				if (ordem.equalsIgnoreCase(ordemO)) { // onivoro

					System.out.println("\n             Minhoca                     ");

				} else if (ordem.equalsIgnoreCase(ordemF)) { // hematofogo

					System.out.println("\n            Sanguessuga                  ");
				} else {
					System.out.println("Opção inexistente");
				}
			} else {
				System.out.println("Opção inexistente");
			}

			leia.close();

		} else {
			System.out.println("Opção inexistente");
		}
	}
}
