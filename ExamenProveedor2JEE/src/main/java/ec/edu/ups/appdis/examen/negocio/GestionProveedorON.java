package ec.edu.ups.appdis.examen.negocio;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.appdis.examen.dao.ProveedorDAO;
import ec.edu.ups.appdis.examen.modelo.Proveedor;

@Stateless
public class GestionProveedorON implements GestionProveedorOnRemoto {

	
	@Inject
	private ProveedorDAO daoProveedor;
	
	public Proveedor buscarProveedor(String nombre) {
		try {
			return daoProveedor.readJPA(nombre);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
