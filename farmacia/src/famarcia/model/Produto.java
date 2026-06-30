package famarcia.model;

public abstract class Produto {

	int id;
	String nome;
	int tipo;
	float preco;

	public Produto(int id, String nome, int tipo, float preco) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
	}

	public Produto() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void visualizar() {
		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Medicamento";
			break;
		case 2:
			tipo = "Cosmético";
			break;
		default:
			tipo = "Número Incorreto!";

		}
		System.out.println("*************************************");
		System.out.println("           DADOS DO PRODUTO          ");
		System.out.println("*************************************");
		System.out.printf("Nome do produto: %s%n", this.nome);
		System.out.printf("Tipo do produto: %s%n", tipo);
		System.out.printf("Preço do produto: %.2f%n", this.preco);
		System.out.printf("ID do produto: %d%n", this.id);
	}

}
