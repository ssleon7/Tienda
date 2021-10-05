//Clase Vista que es el lugar donde se va mostrar los datos del modelo
package com.ecodeup.vista;


import java.util.List;

import com.ecodeup.model.Cliente;
 
public class ViewCliente {
	public void verCliente(Cliente cliente) {
		System.out.println("Datos del Cliente: "+cliente);
	}
	
	public void verClientes(List<Cliente> clientes) {
		for (Cliente cliente : clientes) {
			System.out.println("Datos del Cliente: "+cliente);
		}		
	}
}
