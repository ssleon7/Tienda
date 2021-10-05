//Interface que registra los metodos CRUD.

package com.ecodeup.idao;

import java.util.List;
import com.ecodeup.model.Cliente;

public interface IClienteDao {	
	public boolean registrar(Cliente cliente);
	public List<Cliente> obtener();
	public boolean actualizar(Cliente cliente);
	public boolean eliminar(Cliente cliente);
}
