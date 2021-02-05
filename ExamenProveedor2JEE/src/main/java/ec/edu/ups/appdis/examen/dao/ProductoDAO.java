package ec.edu.ups.appdis.examen.dao;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.appdis.examen.modelo.Productos;


@Stateless
public class ProductoDAO {


	@Inject
	private EntityManager em;
	
	// metodo de read con JPA utilizando el Entity manager
		public Productos readJPA(String codigo) throws SQLException {
			Productos c = em.find(Productos.class, codigo);
			return c;
		}
		
		// metodo de update con JPA utilizando el Entity manager
		public boolean updateJPA(Productos prod) throws SQLException {
			em.merge(prod);
			return true;
		}
	
}
