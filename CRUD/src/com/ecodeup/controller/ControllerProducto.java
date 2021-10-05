//Clase CONTROLADOR encargado de enlazar el acceso a los datos con la vista
package com.ecodeup.controller;

import java.util.ArrayList;
import java.util.List;
 
import com.ecodeup.dao.ProductoDaoImpl;
import com.ecodeup.idao.IProductoDao;
import com.ecodeup.model.Producto;
import com.ecodeup.vista.ViewProducto;

public class ControllerProducto {
	
private ViewProducto vista= new ViewProducto();

	
	public ControllerProducto() {
	}
	
	//llama al DAO para guardar un Producto
		public void registrar(Producto producto) {
			IProductoDao dao= new  ProductoDaoImpl();
			dao.registrar(producto);
	}
	
	//llama al DAO para actualizar un Producto
	public void actualizar(Producto producto) {
		IProductoDao dao= new  ProductoDaoImpl();
		dao.actualizar(producto);
	}
	
	//llama al DAO para eliminar un Producto
	public void eliminar(Producto producto) {
		IProductoDao dao= new  ProductoDaoImpl();
		dao.eliminar(producto);
	}
	
	//llama al DAO para obtener todos los Productos y luego los muestra en la vista
	public void verProductos(){
		List<Producto> productos = new ArrayList<Producto>();
		IProductoDao dao= new  ProductoDaoImpl();
		productos=dao.obtener();
		vista.verProductos(productos);
	}
}
