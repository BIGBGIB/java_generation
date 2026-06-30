package famarcia.model;

public class Medicamento extends Produto {
	
	String generico;

	public Medicamento(int id, String nome, int tipo, float preco, String generico) {
		super(id, nome, tipo, preco);
		this.generico = generico;
	}

	public String getGenerico() {
		return generico;
	}

	public void setGenerico(String generico) {
		this.generico = generico;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("Genérico: %s%n", this.generico);
	}

}
