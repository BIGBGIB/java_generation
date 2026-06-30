package farmacia.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import famarcia.model.Produto;
import farmacia.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private List<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;

	@Override
	public void listarTodosOsProdutos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}

	}

	@Override
	public void criarProduto(Produto produto) {
		listaProdutos.add(produto);
		System.out.printf("O Produto ID(%d) foi criado com sucesso!%n", produto.getId());

	}

	@Override
	public void consultarProdutoPorId(int id) {

		Optional<Produto> produto = buscarNaCollection(id);

		if (produto.isPresent())
			produto.get().visualizar();
		else
			System.out.printf("\nO produto ID (%d) não foi encontrado! ", id);

	}

	@Override
	public void atualizarProduto(Produto produto) {
		
		Optional<Produto> buscaProduto = buscarNaCollection(produto.getId());

		if (buscaProduto.isPresent()) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto.get()), produto);
				System.out.printf("\nO produto ID (%d) foi atualizado com sucesso!", produto.getId());
		}
		else
			System.out.printf("\nO produto ID (%d) não foi encontrado!", produto.getId());


	}

	@Override
	public void deletarProduto(int id) {
		
		Optional<Produto> produto = buscarNaCollection(id);

		if (produto.isPresent()) {
			if(listaProdutos.remove(produto.get()))
				System.out.printf("O Produto ID (%d) foi excluído com sucesso!", id);
		}
		else
			System.out.printf("\nO produto ID (%d) não foi encontrado!", id);

	}
	
	@Override
	public void listarPorTipo(int tipo) {
		
		List<Produto> listaTipos = listaProdutos.stream()
				.filter(produto -> produto.getTipo() == tipo)
				.collect(Collectors.toList());
		
		if(listaTipos.isEmpty()) {
			System.out.printf("Titular %s não encontrado!", tipo);
		} else 
			listaTipos.forEach(produto -> produto.visualizar());
	}

	public Optional<Produto> buscarNaCollection(int id) {
		for (var produto : listaProdutos) {
			if (produto.getId() == id)
				return Optional.of(produto);
		}

		return Optional.empty();
	}


}

	
	

