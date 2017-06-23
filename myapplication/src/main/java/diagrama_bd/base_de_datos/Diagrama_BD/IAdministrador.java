package diagrama_bd.base_de_datos.Diagrama_BD;

import java.util.ArrayList;
import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jsoup.select.NodeVisitor;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.example.myapplication.Admin_Incidencias;
import com.example.myapplication.ZonaClientes;

import diagrama_bd.base_de_datos.Cliente;
import diagrama_bd.base_de_datos.ClienteDAO;
import diagrama_bd.base_de_datos.Comercial;
import diagrama_bd.base_de_datos.ComercialDAO;
import diagrama_bd.base_de_datos.Incidencia;
import diagrama_bd.base_de_datos.IncidenciaDAO;
import diagrama_bd.base_de_datos.Servicio;
import diagrama_bd.base_de_datos.ServicioDAO;
import diagrama_bd.base_de_datos.Diagrama_BD.Base_de_datos.BD_Principal;

public class IAdministrador {
	
	public static ArrayList<Servicio> getServicios() throws PersistentException{
		ArrayList<Servicio> serviciosDisponibles = new ArrayList<Servicio>();
		Servicio[] serviciosLeidos = ServicioDAO.listServicioByQuery("Servicio.id>0","Servicio.nombre");
		
		for (int i = 0; i < serviciosLeidos.length; i++) {
			serviciosDisponibles.add(serviciosLeidos[i]);
		}

		return serviciosDisponibles;
	}

	
	public static void addCliente(Cliente nuevoClienteARellenar) throws PersistentException {
		ConexionBD conexion 	= new ConexionBD();
		PersistentTransaction t = conexion.beginT();
		
		boolean correcto;
		try {
			
			correcto = ClienteDAO.save(nuevoClienteARellenar);
			t.commit();
			ZonaClientes.actualizarTabla(nuevoClienteARellenar);
			
		} catch (PersistentException e) {
			t.rollback();
			e.printStackTrace();
		
		}
	}


	public static ArrayList<Cliente> getClientes() {
		
		ArrayList<Cliente> c = new ArrayList<Cliente>();
		
		try {
			Cliente[] aux =	ClienteDAO.listClienteByQuery("nCliente>0", "DNI");
			
			for (int i = 0; i < aux.length; i++) {
				c.add(aux[i]);
			}
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return c;
	}
	
	public static ArrayList<Comercial> getComerciales() {
		
		ArrayList<Comercial> c = new ArrayList<Comercial>();
		
		try {
			Comercial[] aux =	ComercialDAO.listComercialByQuery("nComercial>0", "DNI");
			
			for (int i = 0; i < aux.length; i++) {
				c.add(aux[i]);
			}
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return c;
	}


	public static void guardarOfertas(ArrayList<Servicio> ofertasMostradas) throws PersistentException {
		
		ConexionBD conexion 	= new ConexionBD();
		PersistentTransaction t = conexion.beginT();
		
		int contador = -1;
		
		for (int i = 0; i < ofertasMostradas.size(); i++) {
			
			Servicio borrar = ServicioDAO.getServicioByORMID(String.valueOf(contador));
			ServicioDAO.delete(borrar);
			
			Servicio agregar = ServicioDAO.createServicio();
			agregar.setnServicio(String.valueOf(contador));
			agregar.setNombre(ofertasMostradas.get(i).getNombre());
			agregar.setPrecio(ofertasMostradas.get(i).getPrecio());
			agregar.setVisible(true);
			agregar.setCaracteristicas(ofertasMostradas.get(i).getCaracteristicas());
			agregar.setID(contador);
			
			ServicioDAO.save(agregar);
			
			contador--;
			
		}
		
		try {
			t.commit();
		} catch (PersistentException e) {
			t.rollback();
			e.printStackTrace();
		}
		
	}


	public static ArrayList<Incidencia> cargarIncidencias() {
		ArrayList<Incidencia> incidencias = new ArrayList<Incidencia>();
		Incidencia[] str = new Incidencia[0];
		try {
			 str = IncidenciaDAO.listIncidenciaByQuery("NIncidencia>0", "nIncidencia");
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < str.length; i++) {
			incidencias.add(str[i]);
		}
		return incidencias;
	}


	public static ArrayList<Incidencia> cargarSinAsignar(ArrayList<Incidencia> incidencias) {
		ArrayList<Incidencia> inc = new ArrayList<Incidencia>();
		
		for (Incidencia incidencia : incidencias) {
			if (incidencia.getTramitada_por() == null)
				inc.add(incidencia);
		}

		return inc;
	}
	
	public static ArrayList<Incidencia> cargarCompletadas(ArrayList<Incidencia> incidencias) {
		ArrayList<Incidencia> inc = new ArrayList<Incidencia>();
		
		for (Incidencia incidencia : incidencias) {
			if (incidencia.getEstado() == true)
				inc.add(incidencia);
		}

		return inc;
	}
	
	public static ArrayList<Incidencia> cargarEnCurso(ArrayList<Incidencia> incidencias) {
		ArrayList<Incidencia> inc = new ArrayList<Incidencia>();
		
		for (Incidencia incidencia : incidencias) {
			if (incidencia.getTramitada_por() != null && incidencia.getEstado() == false)
				inc.add(incidencia);
		}

		return inc;
	}


	public static void asignarComercialIncidencia(Incidencia incidencia) throws PersistentException {
		
		ConexionBD conexion 	= new ConexionBD();
		PersistentTransaction t = conexion.beginT();
		
		try {
			IncidenciaDAO.save(incidencia);
			t.commit();
		} catch (PersistentException e) {
			t.rollback();
			e.printStackTrace();
		}
		
		Admin_Incidencias.actualizarTablasAlAsignar(incidencia);
		
		
	}


	public static void borrarCliente(Cliente borrar) throws PersistentException {
		
		ConexionBD conexion 	= new ConexionBD();
		PersistentTransaction t = conexion.beginT();
		boolean res = false;
		
		try {
			res = ClienteDAO.delete(borrar);
			t.commit();
		} catch (PersistentException e) {
			t.rollback();
			e.printStackTrace();
		}
	}
}