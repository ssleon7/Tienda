//Clase CONTROLADOR encargado de enlazar el acceso a los datos con la vista
package com.ecodeup.controller;

import java.util.ArrayList;
import java.util.List;

import com.ecodeup.dao.VentaDaoImpl;
import com.ecodeup.idao.IVentaDao;
import com.ecodeup.model.Venta;
import com.ecodeup.vista.ViewVenta;


public class ControllerVenta {
	
	private ViewVenta vista= new ViewVenta();
	
	public ControllerVenta() {
		}
		
		//llama al DAO para guardar una venta 
		public void registrar(Venta venta) {
			IVentaDao dao=  new  VentaDaoImpl();
			dao.registrar(venta);
		}
		
		//llama al DAO para actualizar una venta
		public void actualizar(Venta venta) {
			IVentaDao dao= new  VentaDaoImpl();
			dao.actualizar(venta);
		}
		
		//llama al DAO para eliminar una venta
		public void eliminar(Venta venta) {
			IVentaDao dao= new  VentaDaoImpl();
			dao.eliminar(venta);
		}
		
		//llama al DAO para obtener todas las ventas y luego los muestra en la vista
		public void verVentas(){
			List<Venta> ventas = new ArrayList<Venta>();
			IVentaDao dao= new  VentaDaoImpl();
			ventas=dao.obtener();
			vista.verVentas(ventas);
		}
}
