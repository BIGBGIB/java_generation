package farmacia;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

import famarcia.model.Cosmetico;
import famarcia.model.Medicamento;
import famarcia.model.Produto;
import farmacia.controller.ProdutoController;
import farmacia.util.Sobre;

public class Menu {

	private static final Scanner leia = new Scanner(System.in);
	private static final ProdutoController produtoController = new ProdutoController();

	public static void main(String[] args) {

		int opcao;

		criarProdutosTeste();
		
		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                      GPharmacy                      ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produto                    ");
			System.out.println("            2 - Listar todos os Produtos             ");
			System.out.println("            3 - Buscar Produto por ID                ");
			System.out.println("            4 - Atualizar Porduto                    ");
			System.out.println("            5 - Deletar Porduto                      ");
			System.out.println("            6 - Buscar Produto por Tipo              ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

		
			try {
				opcao = leia.nextInt();
				leia.nextLine();
			} catch(InputMismatchException e) {
				opcao = -1;
				System.out.println("\nDigite um número inteiro entre 0 e 8");
				leia.nextLine();
			}
			
			if (opcao == 0) {
				System.out.println("GPharmacy - Aqui cuidamos de você!");
				Sobre.sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {

			case 1:
				System.out.println("Cadastrar Produto");
				cadastrarProduto();
				keyPress();
				break;
			case 2:
				System.out.println("Todos os produtos cadastrados");
				listarProdutos();
				keyPress();
				break;
			case 3:
			    procurarProdutoPorId();
				keyPress();
				break;
			case 4:
				atualizarProduto();
				keyPress();
				break;
			case 5:
				deletarProduto();
				keyPress();
				break;
			case 6:
				buscarPorTipo();
				keyPress();
				break;
			default:
				System.out.println("Opção inválida!");
				keyPress();
				break;
			}

		}
	}
	
	public static void keyPress() {
		System.out.println("\n\nPressione Enter para continuar...");
		leia.nextLine();
	}
	
	public static void criarProdutosTeste() {
		produtoController.criarProduto(new Medicamento(112026, "Paracetamol", 1, 20, "sim"));
		produtoController.criarProduto(new Cosmetico(122026, "BodySplash", 2, 45, "Ocean"));
	}
 

	public static void listarProdutos() {
		produtoController.listarTodosOsProdutos();
	}

	public static void cadastrarProduto() {

		System.out.print("Informe o nome do produto: ");
		String nome = leia.nextLine();
		System.out.print("Infome o preço: ");
		float preco = leia.nextFloat();
		System.out.print("Digite o tipo do produto (1 - Medicamento | 2 - Cosmético): ");
		int tipo = leia.nextInt();
		System.out.print("Digite o ID do produto: ");
		int id = leia.nextInt();
		leia.nextLine();

		switch (tipo) {
		case 1 -> {
			System.out.print("O Medicamento é genérico? (Sim | Não): ");
			String generico = leia.nextLine();
			leia.nextLine();
			
			produtoController.criarProduto(new Medicamento(id, nome, tipo, preco, generico));
		}
		case 2 -> {
			System.out.print("Informe a Fragância do cosmético: ");
			String fragancia = leia.nextLine();
			leia.nextLine();
			produtoController.criarProduto(new Cosmetico(id, nome, tipo, preco, fragancia));
		} 
		default -> System.out.println("Opção inválida!");
			}
	}
	
	public static void procurarProdutoPorId() {
		
		System.out.print("Digite o ID do produto que deseja buscar: ");
		int id = leia.nextInt();
		leia.nextLine();
		
		produtoController.consultarProdutoPorId(id);
	}
	
	public static void deletarProduto() {
		
		System.out.print("Digite o ID do produto que deseja deletar: ");
		int id = leia.nextInt();
		leia.nextLine();
		
		Optional<Produto> produto = produtoController.buscarNaCollection(id);
		
		if (produto.isPresent()) {
			
			//confirmação de exclusão
			
			System.out.printf("\nTem certeza que você deseja excluir o produto ID (%d) (S/N)?", id);
			String confirmacao = leia.nextLine();
			
			if(confirmacao.equalsIgnoreCase("S"))
				produtoController.deletarProduto(id);
			else
				System.out.println("\nOperação Cancelada!");
				
		} else {
			System.out.printf("\nO Produto ID (%d) não foi encontrado!", id);
		}
		}
	
	public static void atualizarProduto() {
		
		System.out.print("Digite o ID do produto que deseja atualizar: ");
		int idEntrada = leia.nextInt();
		leia.nextLine();
		
		Optional<Produto> produto = produtoController.buscarNaCollection(idEntrada);;
		
		if (produto.isPresent()) {
			
			//Obtém os dados atuais do produto
			String nome = produto.get().getNome();
			int tipo = produto.get().getTipo();
			float preco = produto.get().getPreco();
			int id = produto.get().getId();
			
			//Atualiza o nome ou mantém o valor atual
			System.out.printf("\nNome atual: %s%nDigite o nome do novo produto (Pressione ENTER para manter o valor atual)", nome);
			String entrada = leia.nextLine();
			nome = entrada.isEmpty() ? nome : (entrada);
			System.out.printf("Nome atual: %s%n", nome);
			
			//Atualiza o preco ou mantém o atual
			System.out.printf("\nPreço atual: %.2f%nDigite o preço do novo produto (Pressione ENTER para manter o titular atual)", preco);
			entrada = leia.nextLine();
			
			preco = entrada.isEmpty() ? preco : Float.parseFloat(entrada.replace("," , "."));
			System.out.printf("Preço atual: %.2f%n",preco);
			
			
			//Atualiza o id ou mantém o saldo atual
			System.out.printf("\nID atual: %d%nDigite o novo ID (Pressione ENTER para manter o valor atual)", id);
			entrada = leia.nextLine();
			
			id = entrada.isEmpty() ? id : Integer.parseInt(entrada);
			System.out.printf("ID atual: %d%n", id);
			
			switch(tipo) {
			
			case 1 -> {
				Medicamento medicamento = (Medicamento) produto.get();
				String generico = medicamento.getGenerico();
				
				//Atualiza o generico ou mantém o limite atual
				System.out.printf("\nGenérico: %s%nEsse medicamento é genérico (SIM | NÃO)? (Pressione ENTER para manter o valor atual)", generico);
				entrada = leia.nextLine();
				
				generico = entrada.isEmpty() ? generico : (entrada);
				System.out.printf("Genérico: %s", generico);
				
				produtoController.atualizarProduto(new Medicamento(id, nome, tipo, preco, generico));
				
			}
			
			case 2 -> {
				Cosmetico cosmetico = (Cosmetico) produto.get();
				String fragancia = cosmetico.getFragancia();
				
				//Atualizaa fragancia ou mantém o dia atual
				System.out.printf("\nFragância atual: %s%nDigite a nova fragância (Pressione ENTER para manter o valor atual)", fragancia);
				entrada = leia.nextLine();
				
				fragancia = entrada.isEmpty() ? fragancia : (entrada);
				System.out.printf("Fragância atual: %s", fragancia);
				produtoController.atualizarProduto(new Cosmetico(id, nome, tipo, preco, fragancia));
				
			}
			
			default -> System.out.println("Tipo do produto é inválido!");
			
			}
			
		} else {
			System.out.printf("\nO produto ID (%d) não foi encontrado!", idEntrada);
		}
		
		}
	
	
	
	public static void buscarPorTipo() {
		
		System.out.println("Digite o tipo do produto: ");
		int tipo = leia.nextInt();
		leia.nextLine();
		
		produtoController.listarPorTipo(tipo);
	}
	
	




}
