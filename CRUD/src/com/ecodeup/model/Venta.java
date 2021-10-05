//Esta clase va a mapear los atributos de la tabla cliente en la base de datos VENTAS.
package com.ecodeup.model;

public class Venta {

        private int idventas;
        private double codigo_venta; 
        private double iva_venta; 
        private double total_venta; 
        private double valor_venta; 
        private int clientes_idclientes; 
        private int usuario_iduser;
        
        
	public Venta() {
	}
	
	public Venta(int idventas, double codigo_venta, double iva_venta, double total_venta, double valor_venta, int clientes_idclientes, int usuario_iduser) {
		this.idventas = idventas;
		this.codigo_venta = codigo_venta;
		this.iva_venta = iva_venta;
		this.total_venta = total_venta;
                this.valor_venta = valor_venta;
                this.clientes_idclientes = clientes_idclientes ;
                this.usuario_iduser = usuario_iduser ;
	}

   

    public int getIdventas() {
        return idventas;
    }

    public void setIdventas(int idventas) {
        this.idventas = idventas;
    }

    public double getCodigo_venta() {
        return codigo_venta;
    }

    public void setCodigo_venta(double codigo_venta) {
        this.codigo_venta = codigo_venta;
    }

    public double getIva_venta() {
        return iva_venta;
    }

    public void setIva_venta(double iva_venta) {
        this.iva_venta = iva_venta;
    }

    public double getTotal_venta() {
        return total_venta;
    }

    public void setTotal_venta(double total_venta) {
        this.total_venta = total_venta;
    }

    public double getValor_venta() {
        return valor_venta;
    }

    public void setValor_venta(double valor_venta) {
        this.valor_venta = valor_venta;
    }

    public int getClientes_idclientes() {
        return clientes_idclientes;
    }

    public void setClientes_idclientes(int clientes_idclientes) {
        this.clientes_idclientes = clientes_idclientes;
    }

    public int getUsuario_iduser() {
        return usuario_iduser;
    }

    public void setUsuario_iduser(int usuario_iduser) {
        this.usuario_iduser = usuario_iduser;
    }
    @Override
      public String toString() {
              return this.getIdventas()+", "+this.getCodigo_venta()+", "+this.getIva_venta()+", "+this.getTotal_venta()+", "+this.getValor_venta()+", "+this.getClientes_idclientes()+", "+this.getUsuario_iduser();
      }
}