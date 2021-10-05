package com.ecodeup.demo;

/*
import com.ecodeup.controller.ControllerCliente;
import com.ecodeup.model.Cliente;
 
public class CrudJavaDemo {
 
	public static void main(String[] args) {
 
		Cliente cliente = new Cliente(5, 1111, "CALLE E", "San@gmail.com", "santi Arg", 351648755);			
		
		// controlador
		ControllerCliente controller = new ControllerCliente();
 
		// guarda un cliente a través del controlador
		controller.registrar(cliente);
 
		// ver clientes
		controller.verClientes();
 
		// editar un cliente por medio del id
		cliente.setIdclientes(1);
		cliente.setCedula_cliente(0000);
		cliente.setDireccion_cliente("calle s");
		cliente.setCorreo_cliente("sant@hotmail.com");
		cliente.setNombre_cliente("Santiago Arango");
		cliente.setTelefono_cliente(352645755);
		
		controller.actualizar(cliente);
 
		// eliminar un cliente por medio del id
		cliente.setIdclientes(1);
		controller.eliminar(cliente);
	}
}
*/
import com.ecodeup.controller.ControllerProducto;
import com.ecodeup.model.Producto;


public class CrudJavaDemo {
	 
	public static void main(String[] args) {
 
		Producto producto = new Producto(2, "011", "cuaDerno", "4567895784", "1.001", "20" ,"2.000","");			
		
		// controlador
		ControllerProducto controller = new ControllerProducto();
 
		// guarda un cliente a través del controlador
		controller.registrar(producto);
 
		// ver clientes
		controller.verProductos();
 
		// editar un cliente por medio del id
		producto.setIdproducto(1);
		producto.setCodigo_producto("010");
		producto.setNombre_producto("Cuaderno");
		producto.setNitproveedor("45897598654");
		producto.setPrecio_compra("1.000");
		producto.setIvacompra("20");
		producto.setPrecio_venta("2.000");
		producto.setProveedores_idproveedores("2");
		
		controller.actualizar(producto);
 
		// eliminar un cliente por medio del id
		producto.setIdproducto(1);
		controller.eliminar(producto);
	}
}
