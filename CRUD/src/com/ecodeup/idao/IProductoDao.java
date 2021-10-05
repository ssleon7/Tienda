//Interface que registra los metodos CRUD.

package com.ecodeup.idao;

import java.util.List;

import com.ecodeup.model.Producto;

public interface IProductoDao {
	public boolean registrar(Producto producto);
	public List<Producto> obtener();
	public boolean actualizar(Producto producto);
	public boolean eliminar(Producto producto);
}
