//Clase que implementa la interface.
package com.ecodeup.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 
import com.connection.Conexion;
import com.ecodeup.idao.IClienteDao;
import com.ecodeup.model.Cliente;


public class ClienteDaoImpl implements IClienteDao {	
	
	@Override
	public boolean registrar(Cliente cliente) {
		boolean registrar = false;
		
		Statement stm= null;
		Connection con=null; 
		
		String sql="INSERT INTO cliente values (NULL,'"+cliente.getCedula_cliente()+"','"+cliente.getDireccion_cliente()+"', '"+cliente.getCorreo_cliente()+"', '"+cliente.getNombre_cliente()+"','"+cliente.getTelefono_cliente()+"')";
		
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
	public List<Cliente> obtener() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM CLIENTE ORDER BY ID";
		
		List<Cliente> listaCliente= new ArrayList<Cliente>();
		
		try {			
			co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Cliente c=new Cliente();
				c.setIdclientes(rs.getInt(1));
				c.setCedula_cliente(rs.getInt(2));
				c.setDireccion_cliente(rs.getString(3));
				c.setCorreo_cliente(rs.getString(4));
				c.setNombre_cliente(rs.getString(5));
				c.setTelefono_cliente(rs.getInt(6));
				listaCliente.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método obtener");
			e.printStackTrace();
		}
		
		return listaCliente;
	}
 
	@Override
	public boolean actualizar(Cliente cliente) {
		Connection connect= null;
		Statement stm= null;
		
		boolean actualizar=false;
				
		String sql="UPDATE CLIENTE SET cedula_cliente='"+cliente.getCedula_cliente()+"', direccion_cliente='"+cliente.getDireccion_cliente()+"', correo_cliente='"+cliente.getCorreo_cliente()+"'nombre_cliente='"+cliente.getNombre_cliente()+"',telefono_cliente='"+cliente.getTelefono_cliente()+"', " +" WHERE ID="+cliente.getIdclientes();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método actualizar");
			e.printStackTrace();
		}		
		return actualizar;
	}
 
	@Override
	public boolean eliminar(Cliente cliente) {
		Connection connect= null;
		Statement stm= null;
		
		boolean eliminar=false;
				
		String sql="DELETE FROM CLIENTE WHERE ID="+cliente.getIdclientes();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método eliminar");
			e.printStackTrace();
		}		
		return eliminar;
	}
 
	
}