//Clase que implementa la interface.
package com.ecodeup.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connection.Conexion;
import com.ecodeup.idao.IVentaDao;
import com.ecodeup.model.Venta;


public class VentaDaoImpl implements IVentaDao{
	
	@Override
	public boolean registrar(Venta venta) {
		boolean registrar = false;
		
		Statement stm= null;
		Connection con=null; 
		
		String sql="INSERT INTO ventas values (NULL,'"+venta.getCodigo_venta()+"','"+venta.getIva_venta()+"', '"+venta.getTotal_venta()+"', '"+venta.getValor_venta()+"' , '"+venta.getClientes_idclientes()+"','"+venta.getUsuario_iduser()+"')";
		
		try {			
			con=Conexion.conectar();
			stm= con.createStatement();
			stm.execute(sql);
			registrar=true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase VentaDaoImple, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}
 
	@Override
	public List<Venta> obtener() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM VENTAS ORDER BY ID";
		
		List<Venta> listaVenta= new ArrayList<Venta>();
		
		try {			
			co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Venta c=new Venta();
				c.setIdventas(rs.getInt(1));                                 
				c.setCodigo_venta(rs.getDouble(2));
				c.setIva_venta(rs.getDouble(3));
				c.setTotal_venta(rs.getDouble(4));
				c.setValor_venta(rs.getDouble(5));
				c.setClientes_idclientes(rs.getInt(6));
				c.setUsuario_iduser(rs.getInt(7));
				listaVenta.add(c);
				
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase VentaDaoImple, método obtener");
			e.printStackTrace();
		}
		
		return listaVenta;
	}
 
	@Override
	public boolean actualizar(Venta venta) {
		Connection connect= null;
		Statement stm= null;
		
		boolean actualizar=false;
				
		String sql="UPDATE VENTAS SET codigo_venta='"+venta.getCodigo_venta()+"',iva_venta='"+venta.getIva_venta()+"', total_venta='"+venta.getTotal_venta()+"'valor_venta='"+venta.getValor_venta()+"',clientes_idclientes='"+venta.getClientes_idclientes()+"',usuario_iduser='"+venta.getUsuario_iduser()+"', " +" WHERE ID="+venta.getIdventas();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase VentaDaoImple, método actualizar");
			e.printStackTrace();
		}		
		return actualizar;
	}
 
	@Override
	public boolean eliminar(Venta venta) {
		Connection connect= null;
		Statement stm= null;
		
		boolean eliminar=false;
				
		String sql="DELETE FROM VENTAS WHERE ID="+venta.getIdventas();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase VentaDaoImple, método eliminar");
			e.printStackTrace();
		}		
		return eliminar;
	}
 
}
