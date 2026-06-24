package main;

import cliente.model.Cliente;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente ("Raquel", 20, "Bairro Jardim Tropical Rua das Margaridas", 
				"12345-678", 19, "(11) 98754-6789", "123.456.786-43" );
		
		Cliente c2 = new Cliente ("Pedro", 30, "Bairro Novo Oriente Rua Doze de Maio", 
				"38585-773", 21, "(13) 93847-3628", "741.859.582-85" );
		
		c1.visualizar();
		c2.visualizar();

	}

}
