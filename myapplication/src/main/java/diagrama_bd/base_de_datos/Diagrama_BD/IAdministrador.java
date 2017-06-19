package diagrama_bd.base_de_datos.Diagrama_BD;

import java.util.ArrayList;
import java.util.Arrays;

import org.jsoup.select.NodeVisitor;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import diagrama_bd.base_de_datos.Cliente;
import diagrama_bd.base_de_datos.ClienteDAO;
import diagrama_bd.base_de_datos.Servicio;
import diagrama_bd.base_de_datos.ServicioDAO;
import diagrama_bd.base_de_datos.Diagrama_BD.Base_de_datos.BD_Principal;

public class IAdministrador {
	
	BD_Principal bd 		= new BD_Principal();
	
	
	/*
	 * Saca todos los servicios a granel de la base de datos y los devuelve
	 * en un ArrayList. 
	 */
	public static ArrayList<Servicio> getServicios() throws PersistentException{
		ArrayList<Servicio> serviciosDisponibles = new ArrayList<Servicio>();
		Servicio[] serviciosLeidos = ServicioDAO.listServicioByQuery("Servicio.id>0","Servicio.nombre");
		serviciosDisponibles = (ArrayList<Servicio>) Arrays.asList(serviciosLeidos);
		return serviciosDisponibles;
	}

	
	/*
	 * recive un objeto cliente por parametro, y lo envia a clienteDAo para que
	 * ser almacenado en la base de datos.
	 */
	public static void addCliente(Cliente nuevoClienteARellenar) throws PersistentException {
		ConexionBD conexion 	= new ConexionBD();
		PersistentTransaction t = conexion.beginT();
		// boolean correcto;
		try {
			
			ClienteDAO.save(nuevoClienteARellenar);
			t.commit();
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			t.rollback();
			e.printStackTrace();
		
		}
		
	}

	/*
	 * 
	 */
	public static void volcarClientes() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}