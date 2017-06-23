package diagrama_bd.base_de_datos.Diagrama_BD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jsoup.select.NodeVisitor;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.example.myapplication.Admin_Comerciales;
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
import diagrama_bd.base_de_datos.ServicioTV;
import diagrama_bd.base_de_datos.ServicioTVDAO;
import diagrama_bd.base_de_datos.ServiciosCombi;
import diagrama_bd.base_de_datos.ServiciosCombiDAO;
import diagrama_bd.base_de_datos.ServiciosFFM;
import diagrama_bd.base_de_datos.ServiciosFFMDAO;
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

	// JUAN
		public static boolean addComercial(Comercial nuevoComercialARellenar) throws PersistentException {
		ConexionBD conexion 	= new ConexionBD();
		PersistentTransaction addCom = conexion.beginT();
		boolean correcto = false;
		try {
			correcto = ComercialDAO.save(nuevoComercialARellenar);
			addCom.commit();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			addCom.rollback();
			e.printStackTrace();
		}
		return correcto;
	}
	
	/*
	 * saca todos los comerciales a granel de la base de datos y los devuelve
	 * en un ArrayList.
	 */
	public static ArrayList<Comercial> volcarComerciales() {
		ArrayList<Comercial> comercialesDisponibles = new ArrayList<Comercial>();
		try {
			Comercial[] comercialesLeidos = ComercialDAO.listComercialByQuery("nComercial>0", "Nombre");
			
			for (int i = 0; i < comercialesLeidos.length; i++) {
				comercialesDisponibles.add(comercialesLeidos[i]);
			}
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		return comercialesDisponibles;
	}

	/*
	 * Elimina al comercial recibido por parametro de la base de datos
	 */
	public static void delComercial(Comercial comercialABorrar) throws PersistentException {
		ConexionBD conexion 			= new ConexionBD();
		PersistentTransaction delCom 	= conexion.beginT();
		boolean correcto = false;
		try {
			correcto = ComercialDAO.delete(comercialABorrar);
			delCom.commit();
		} catch (PersistentException e) {
			delCom.rollback();
			e.printStackTrace();
		}
		
	}

		public static TreeMap<Integer, ArrayList<Servicio>> volcarServicios() {
		TreeMap<Integer, ArrayList<Servicio>> listaServicios = new TreeMap<Integer, ArrayList<Servicio>>();
		
		ArrayList<Servicio> servFFMDisponibles = new ArrayList<Servicio>();
		ServiciosFFM[] servFFMLeidos;
		
		ArrayList<Servicio> servTVDisponibles = new ArrayList<Servicio>();
		ServicioTV[] servTVLeidos;
		
		ArrayList<Servicio> servCombiDisponibles = new ArrayList<Servicio>();
		ServiciosCombi[] servCombiLeidos;
				
		try {
			servFFMLeidos = ServiciosFFMDAO.listServiciosFFMByQuery("NServicio>0", "ID");
			for (int i = 0; i < servFFMLeidos.length; i++) {
				servFFMDisponibles.add(servFFMLeidos[i]);
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			servTVLeidos = ServicioTVDAO.listServicioTVByQuery("NServicio>0", "ID");
			for (int i = 0; i < servTVLeidos.length; i++) {
				servTVDisponibles.add(servTVLeidos[i]);
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			servCombiLeidos = ServiciosCombiDAO.listServiciosCombiByQuery("NServicio>0", "ID");
			for (int i = 0; i < servCombiLeidos.length; i++) {
				servCombiDisponibles.add(servCombiLeidos[i]);
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		listaServicios.put(1, servFFMDisponibles);
		listaServicios.put(2, servTVDisponibles);
		listaServicios.put(3, servCombiDisponibles);
		return listaServicios;
	}

	/*
	 * modifica el servicio recibido como parametro
	 */
	public static boolean updateServicio(Servicio s) throws PersistentException {
		ConexionBD conexion 			= new ConexionBD();
		PersistentTransaction modServ 	= conexion.beginT();
		boolean correcto = false;
		
		try {
			correcto = ServicioDAO.save(s);
			
			modServ.commit();
			
		} catch (PersistentException e) {
			modServ.rollback();
			e.printStackTrace();
		}
		
		
		
		return correcto;
	}

	/*
	 * elimina el servicio recivido por parametro de la base de datos
	 */
	public static boolean delServicio(Servicio s) throws PersistentException {
		ConexionBD conexion 			= new ConexionBD();
		PersistentTransaction delServ 	= conexion.beginT();
		boolean correcto = false;
		
		try {
			correcto = ServicioDAO.delete(s);
			delServ.commit();
		} catch (PersistentException e) {
			delServ.rollback();
			e.printStackTrace();
		}
		return correcto;
	}

	
	public static boolean addServicioFFM(Servicio s) throws PersistentException {
		ConexionBD conexion 				= new ConexionBD();
		PersistentTransaction addServFFM 	= conexion.beginT();
		TreeMap<Integer, ArrayList<Servicio>> losServicios = new TreeMap<Integer, ArrayList<Servicio>>();
		losServicios = volcarServicios();
		
//		for (TreeMap<Integer, ArrayList<Servicio>> u : losServicios) {
//			
//		}
		int nSFFM = (losServicios.get(1).size() + 1);
		
		
		ServiciosFFM nuevoServicioARellenarFFM = new ServiciosFFM();
		nuevoServicioARellenarFFM.setNombre(s.getNombre());
		nuevoServicioARellenarFFM.setPrecio(s.getPrecio());
		nuevoServicioARellenarFFM.setCaracteristicas(s.getCaracteristicas());
		nuevoServicioARellenarFFM.setnServFFM(nSFFM);
		
		boolean correcto = false;
		try {
			correcto = ServicioDAO.save(nuevoServicioARellenarFFM);
			addServFFM.commit();
		} catch (PersistentException e) {
			addServFFM.rollback();
			e.printStackTrace();
		}
		return correcto;
	}
}