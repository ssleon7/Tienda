//Esta clase va a mapear los atributos de la tabla cliente en la base de datos VENTAS.
package com.ecodeup.model;


public class Producto {

        private int idproducto;
        private String codigo_producto; 
        private String nombre_producto; 
        private String Nitproveedor; 
        private String precio_compra; 
        private String Ivacompra; 
        private String precio_venta;
        private String proveedores_idproveedores;
          
        
        
	public Producto() {
	}
	
	public Producto(int idproducto, String codigo_producto, String nombre_producto, String Nitproveedor, String precio_compra, String Ivacompra, String precio_venta,String proveedores_idproveedores) {
		this.idproducto = idproducto;
		this.codigo_producto = codigo_producto;
		this.nombre_producto = nombre_producto;
		this.Nitproveedor = Nitproveedor;
                this.precio_compra = precio_compra;
                this.Ivacompra = Ivacompra ;
                this.precio_venta = precio_venta ;
                this.proveedores_idproveedores = proveedores_idproveedores ;
	}

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getNitproveedor() {
        return Nitproveedor;
    }

    public void setNitproveedor(String Nitproveedor) {
        this.Nitproveedor = Nitproveedor;
    }

    public String getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(String precio_compra) {
        this.precio_compra = precio_compra;
    }

    public String getIvacompra() {
        return Ivacompra;
    }

    public void setIvacompra(String Ivacompra) {
        this.Ivacompra = Ivacompra;
    }

    public String getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(String precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getProveedores_idproveedores() {
        return proveedores_idproveedores;
    }

    public void setProveedores_idproveedores(String proveedores_idproveedores) {
        this.proveedores_idproveedores = proveedores_idproveedores;
    }
    
    @Override
      public String toString() {
              return this.getIdproducto()+", "+this.getCodigo_producto()+", "+this.getNombre_producto()+", "+this.getNitproveedor()+", "+this.getPrecio_compra()+", "+this.getIvacompra()+", "+this.getPrecio_venta()+", "+this.getProveedores_idproveedores();
      }
}
