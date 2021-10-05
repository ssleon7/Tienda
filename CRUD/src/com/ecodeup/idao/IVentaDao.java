package com.ecodeup.idao;

import java.util.List;

import com.ecodeup.model.Venta;

public interface IVentaDao {
	public boolean registrar(Venta venta);
	public List<Venta> obtener();
	public boolean actualizar(Venta venta);
	public boolean eliminar(Venta venta);
}
