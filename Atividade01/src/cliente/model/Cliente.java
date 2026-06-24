package cliente.model;

public class Cliente {
	
	private String nome;
	private int idade;
	private String endereco;
	private String cep;
	private int numeroCasa;
	private String telefone;
	private String cpf;
	
	public Cliente(String nome, int idade, String endereco, String cep, int numeroCasa, String telefone, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.cep = cep;
		this.numeroCasa = numeroCasa;
		this.telefone = telefone;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void visualizar() {

		System.out.println("*************************************");
		System.out.println("           DADOS DO CLIENTE           ");
		System.out.println("*************************************");
		System.out.printf("Nome do cliente: %s%n", this.nome);
		System.out.printf("Idade do cliente: %d anos\n", this.idade);
		System.out.printf("Endereço do cliente: %s%n", this.endereco);
		System.out.printf("CEP: %s%n", this.cep);
		System.out.printf("Número da casa: %d%n", this.numeroCasa);
		System.out.printf("Telefone: %s%n", this.telefone);
		System.out.printf("CPF: %s%n", this.cpf);
		System.out.println("\n");
	}
	
}
