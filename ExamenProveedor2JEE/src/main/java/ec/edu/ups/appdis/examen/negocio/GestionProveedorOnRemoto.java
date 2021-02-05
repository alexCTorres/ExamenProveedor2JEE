package ec.edu.ups.appdis.examen.negocio;

import javax.ejb.Remote;

import ec.edu.ups.appdis.examen.modelo.Proveedor;

@Remote
public interface GestionProveedorOnRemoto {

	public Proveedor buscarProveedor(String nombre);
}
