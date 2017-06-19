package diagrama_bd.base_de_datos.Diagrama_BD;

import java.util.ArrayList;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.example.myapplication.MisIncidencias;

import diagrama_bd.base_de_datos.Administrador;
import diagrama_bd.base_de_datos.Cliente;
import diagrama_bd.base_de_datos.Comercial;
import diagrama_bd.base_de_datos.Incidencia;
import diagrama_bd.base_de_datos.IncidenciaDAO;
import diagrama_bd.base_de_datos.Servicio;
import diagrama_bd.base_de_datos.ServicioDAO;
import diagrama_bd.base_de_datos.ServiciosCombi;
import diagrama_bd.base_de_datos.ServiciosFFM;
import diagrama_bd.base_de_datos.Diagrama_BD.Base_de_datos.BD_Principal;

public class ICliente {
	
	BD_Principal bd = new BD_Principal();
	ServiciosFFM sFFM = new ServiciosFFM();
	ServiciosCombi sCombi = new ServiciosCombi();
	
	public static ArrayList<Servicio> cargarServicios (Cliente cliente) throws PersistentException {
		
		ArrayList<Servicio> a = new ArrayList<Servicio>();
		a.addAll(cliente.abonado_a.getCollection());
		return a;
	}

	public static ArrayList<Incidencia> cargarIncidencias(Cliente c) {
		ArrayList<Incidencia> incidencias = new ArrayList<Incidencia>();
		incidencias.addAll(c.reclama.getCollection());
		return incidencias;
	}

	public static boolean nuevaIncidencia(Incidencia incidencia) throws PersistentException {
		
		ConexionBD conexion = new ConexionBD();
		PersistentTransaction t = conexion.beginT();
		boolean resultado = false;
		
		boolean res = false;
		
		try {
			res = IncidenciaDAO.save(incidencia);
			t.commit();
		} catch (PersistentException e) {
			t.rollback();
			e.printStackTrace();
		}
		return res;
	}	
	
}