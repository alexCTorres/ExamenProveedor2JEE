package ec.edu.ups.appdis.examen.negocio;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.appdis.examen.dao.ProductoDAO;
import ec.edu.ups.appdis.examen.modelo.Productos;

@Stateless
public class GestionProductoON implements GestionProductoOnRemoto {


	@Inject
	private ProductoDAO daoProducto;
	
	public Productos buscarProducto(String cod) {
		try {
			return daoProducto.readJPA(cod);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	public boolean actualizarProducto(Productos prod) throws Exception {
		try {
			daoProducto.updateJPA(prod);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Error al registrar");
		}
		return true;
	}
}
