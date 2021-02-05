package ec.edu.ups.appdis.examen.negocio;

import javax.ejb.Remote;

import ec.edu.ups.appdis.examen.modelo.Productos;

@Remote
public interface GestionProductoOnRemoto {
	
	public Productos buscarProducto(String cod);
	public boolean actualizarProducto(Productos prod) throws Exception;

}
