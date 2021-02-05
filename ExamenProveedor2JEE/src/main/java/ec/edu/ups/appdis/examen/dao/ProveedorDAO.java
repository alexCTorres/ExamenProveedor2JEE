package ec.edu.ups.appdis.examen.dao;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import ec.edu.ups.appdis.examen.modelo.Proveedor;

@Stateless
public class ProveedorDAO {


	@Inject
	private EntityManager em;


	// metodo de read con JPA utilizando el Entity manager
		public Proveedor readJPA(String nombre) throws SQLException {
			Proveedor c = em.find(Proveedor.class, nombre);
			return c;
		}
	
	
}
