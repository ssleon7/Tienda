//Esta clase va a mapear los atributos de la tabla cliente en la base de datos VENTAS.
package com.ecodeup.model;


public class Cliente {
	
        private int idclientes;
        private int cedula_cliente; 
        private String direccion_cliente; 
        private String correo_cliente; 
        private String nombre_cliente; 
        private int telefono_cliente;
        
	public Cliente() {
	}
	
	public Cliente(int idclientes, int cedula_cliente, String direccion_cliente, String correo_cliente, String nombre_cliente, int telefono_cliente) {
		this.idclientes = idclientes;
		this.cedula_cliente = cedula_cliente;
		this.direccion_cliente = direccion_cliente;
		this.correo_cliente = correo_cliente;
        this.nombre_cliente = nombre_cliente;
        this.telefono_cliente = telefono_cliente ;
	}
    
    public int getIdclientes() {
        return idclientes;
    }

    public void setIdclientes(int idclientes) {
        this.idclientes = idclientes;
    }

    public int getCedula_cliente() {
        return cedula_cliente;
    }

    public void setCedula_cliente(int cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    public String getCorreo_cliente() {
        return correo_cliente;
    }

    public void setCorreo_cliente(String correo_cliente) {
        this.correo_cliente = correo_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public int getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(int telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }    
    
    @Override
	public String toString() {
		return this.idclientes+", "+this.cedula_cliente+", "+this.direccion_cliente+", "+this.correo_cliente+", "+this.nombre_cliente+", "+this.telefono_cliente;
	}

}