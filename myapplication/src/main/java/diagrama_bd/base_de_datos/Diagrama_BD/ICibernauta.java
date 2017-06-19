package diagrama_bd.base_de_datos.Diagrama_BD;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import diagrama_bd.base_de_datos.*;
import diagrama_bd.base_de_datos.Diagrama_BD.Base_de_datos.BD_Principal;

public class ICibernauta {
	
	BD_Principal bd = new BD_Principal();
	Cliente c = new Cliente();
	Comercial cm = new Comercial();
	Administrador ad = new Administrador();
	
	ConexionBD conexion = new ConexionBD();
	PersistentTransaction t = conexion.beginT();

	public Cliente iniciarSesionCliente(String aUsuario, String aPassword) throws PersistentException {
		
		Cliente[] clientes;
		
		String consulta = "Cliente.email='"+ aUsuario + "'";
		try {
			clientes = ClienteDAO.listClienteByQuery(consulta, "Cliente.email");
			
			for (Cliente cliente : clientes) {
				if (cliente.getPassword().equals(aPassword)){
					c = cliente;
					return c;
				}	
			}
			
		} catch (Exception e) {
			return null;
		}
		
		return null;
	}

	public Administrador iniciarSesionAdmin(String aUsuario, String aPassword) {
		
		Administrador[] admin;
		
		String consulta = "Administrador.nombre='"+ aUsuario + "'";
		try {
			admin = AdministradorDAO.listAdministradorByQuery(consulta, "Administrador.nombre");
			
			for (Administrador a : admin) {
				if (a.getPassword().equals(aPassword)){
					ad = a;
					return ad;
				}	
			}
			
		} catch (Exception e) {
			return null;
		}
		
		return null;
	}

	public Comercial iniciarSesionComercial(String aUsuario, String aPassword) {

		Comercial[] comerciales;
		
		String consulta = "Comercial.email='"+ aUsuario + "'";
		try {
			comerciales = ComercialDAO.listComercialByQuery(consulta, "Comercial.email");
			
			for (Comercial com : comerciales) {
				if (com.getPassword().equals(aPassword)){
					cm = com;
					return cm;
				}	
			}
			
		} catch (Exception e) {
			return null;
		}
		
		return null;
	}
}
