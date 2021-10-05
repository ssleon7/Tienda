package com.ecodeup.vista;

import java.util.List;

import com.ecodeup.model.Venta;

public class ViewVenta {
	public void verVenta(Venta venta) {
		System.out.println("Datos de la venta	: "+venta);
	}
	
	public void verVentas(List<Venta> ventas) {
		for (Venta venta : ventas) {
			System.out.println("Datos de la venta: "+ventas);
		}		
	}
}
