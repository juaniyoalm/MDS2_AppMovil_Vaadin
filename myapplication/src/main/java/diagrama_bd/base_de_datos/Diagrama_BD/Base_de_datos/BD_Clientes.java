package diagrama_bd.base_de_datos.Diagrama_BD.Base_de_datos;

import java.security.Principal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import diagrama_bd.base_de_datos.*;
import diagrama_bd.base_de_datos.Diagrama_BD.ConexionBD;

public class BD_Clientes {
	public BD_Principal _bd_prin_clien;
	public Vector<Cliente> _contiene_clientes = new Vector<Cliente>();
	
	
	public Cliente getCliente(String aUsuario, String aPassword) throws PersistentException {
		
		Cliente c = new Cliente();
		
		return c;
	}
}
