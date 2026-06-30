package farmacia.repository;

import famarcia.model.Produto;

public interface ProdutoRepository {

	//CRUD	
	
public void listarTodosOsProdutos();
public void criarProduto(Produto produto);
public void consultarProdutoPorId(int id);
public void atualizarProduto(Produto produto);
public void deletarProduto(int numero);
public void listarPorTipo(int tipo);
	
}
