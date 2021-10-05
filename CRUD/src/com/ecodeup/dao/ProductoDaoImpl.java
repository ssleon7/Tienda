//Clase que implementa la interface.

package com.ecodeup.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 
import com.connection.Conexion;
import com.ecodeup.idao.IProductoDao;
import com.ecodeup.model.Producto; 

public class ProductoDaoImpl implements IProductoDao{
	
	@Override
	public boolean registrar(Producto producto) {
		boolean registrar = false;
		
		Statement stm= null;
		Connection con=null; 
		
		String sql="INSERT INTO producto values (NULL,'"+producto.getCodigo_producto()+"','"+producto.getNombre_producto()+"', '"+producto.getNitproveedor()+"', '"+producto.getPrecio_compra()+"', '"+producto.getIvacompra()+"', '"+producto.getPrecio_venta()+"','"+producto.getProveedores_idproveedores()+"')";
		
		try {			
			con=Conexion.conectar();
			stm= con.createStatement();
			stm.execute(sql);
			registrar=true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}
 
	@Override
	public List<Producto> obtener() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM PRODUCTO ORDER BY ID";
		
		List<Producto> listaProducto= new ArrayList<Producto>();
		
		try {			
			co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Producto c=new Producto();
				c.setIdproducto(rs.getInt(1));
				c.setCodigo_producto(rs.getString(2));
				c.setNombre_producto(rs.getString(3));
				c.setNitproveedor(rs.getString(4));
				c.setPrecio_compra(rs.getString(5));
				c.setIvacompra(rs.getString(6));
				c.setPrecio_venta(rs.getString(7));
				c.setProveedores_idproveedores(rs.getString(8));
				listaProducto.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ProductoDaoImple, método obtener");
			e.printStackTrace();
		}
		
		return listaProducto;
	}
 
	@Override
	public boolean actualizar(Producto producto) {
		Connection connect= null;
		Statement stm= null;
		
		boolean actualizar=false;
				
		String sql="UPDATE PRODUCTO SET codigo_producto='"+producto.getCodigo_producto()+"', nombre_producto='"+producto.getNombre_producto()+"', Nitproveedor='"+producto.getNitproveedor()+"'precio_compra='"+producto.getPrecio_compra()+"',Ivacompra='"+producto.getIvacompra()+"',precio_venta='"+producto.getPrecio_venta()+"',proveedores_idproveedores='"+producto.getProveedores_idproveedores()+"', " +" WHERE ID="+producto.getIdproducto();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase ProductoDaoImple, método actualizar");
			e.printStackTrace();
		}		
		return actualizar;
	}
 
	@Override
	public boolean eliminar(Producto producto) {
		Connection connect= null;
		Statement stm= null;
		
		boolean eliminar=false;
				
		String sql="DELETE FROM PRODUCTO WHERE ID="+producto.getIdproducto();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase ProductoDaoImple, método eliminar");
			e.printStackTrace();
		}		
		return eliminar;
	}
 
}

