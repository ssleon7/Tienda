/*package edu.mintic.Tienda1.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proveedores")
public class Provider {
    
    @Id
    @Column(name = "idproveedores")
    private int id;

    @Column(name = "nit_proveedor")
    private long nitProveedor;

    @Column(name = "ciudad_proveedor")
    private String ciudadProveedor;

    @Column(name = "direccion_proveedor")
    private String direccionProveedor;

    @Column(name = "nombre_proveedor")
    private String nombreProveedor;

    @Column(name = "telefono_proveedor")
    private String telProveedor;

    public Provider(int id, long nitProveedor, String ciudadProveedor, String direccionProveedor, String nombreProveedor, String telProveedor){
        this.id = id;
        this.nitProveedor = nitProveedor;
        this.ciudadProveedor = ciudadProveedor;
        this.direccionProveedor = direccionProveedor;
        this.nombreProveedor = nombreProveedor;
        this.telProveedor = telProveedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getNitProveedor() {
        return nitProveedor;
    }

    public void setNitProveedor(long nitProveedor) {
        this.nitProveedor = nitProveedor;
    }

    public String getCiudadProveedor() {
        return ciudadProveedor;
    }

    public void setCiudadProveedor(String ciudadProveedor) {
        this.ciudadProveedor = ciudadProveedor;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getTelProveedor() {
        return telProveedor;
    }

    public void setTelProveedor(String telProveedor) {
        this.telProveedor = telProveedor;
    }

    @Override
    public String toString() {
        return "Provider [ciudadProveedor=" + ciudadProveedor + ", direccionProveedor=" + direccionProveedor + ", id="
                + id + ", nitProveedor=" + nitProveedor + ", nombreProveedor=" + nombreProveedor + ", telProveedor="
                + telProveedor + "]";
    }

    
}
*/