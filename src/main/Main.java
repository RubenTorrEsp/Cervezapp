package main;

import seccionCritica.Camarero;
import threads.Cliente;

public class Main {

	private static Camarero barman;
	private static Cliente [] clientes;
	
	
	
	public static void main(String[] args) {
		barman = new Camarero();
		clientes = new Cliente[3];
		
		for (int i = 0; i < clientes.length; i++) {
			clientes[i] = new Cliente(barman,i);
		}
		
		
		for (Cliente cliente : clientes) {
			cliente.start();
		}

		barman.start();
		
	}

}
