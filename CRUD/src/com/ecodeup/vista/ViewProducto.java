package com.ecodeup.vista;

import java.util.List;

import com.ecodeup.model.Producto;


public class ViewProducto {
	public void verProducto(Producto producto) {
		System.out.println("Datos del Producto: "+producto);
	}
	
	public void verProductos(List<Producto> productos) {
		for (Producto producto : productos) {
			System.out.println("Datos del Producto: "+productos);
		}		
	}
}
