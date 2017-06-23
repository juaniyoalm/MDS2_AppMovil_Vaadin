package diagrama_bd.base_de_datos.Diagrama_BD;

import java.util.ArrayList;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import diagrama_bd.base_de_datos.Comercial;
import diagrama_bd.base_de_datos.Incidencia;
import diagrama_bd.base_de_datos.IncidenciaDAO;

public class IComercial {
	
	public static ArrayList<Incidencia> getIncidencias(Comercial comercial) {
		ArrayList<Incidencia> res = new ArrayList<Incidencia>();
		res.addAll(comercial.tramita.getCollection());
		return res;
	}

	public static ArrayList<Incidencia> getGenerales(ArrayList<Incidencia> aux) {
		
		ArrayList<Incidencia> res = new ArrayList<Incidencia>();
		
		for (Incidencia incidencia : aux) {
			if (incidencia.getDe_tipo().getnTipoIncidencia() != 4)
				res.add(incidencia);
		}
		
		return res;
	}

	public static ArrayList<Incidencia> getLlamada(ArrayList<Incidencia> aux) {
		
		ArrayList<Incidencia> res = new ArrayList<Incidencia>();
		
		for (Incidencia incidencia : aux) {
			if (incidencia.getDe_tipo().getnTipoIncidencia() == 4)
				res.add(incidencia);
		}
		
		return res;
	}

	public static void realizarIncidencia(Incidencia realizar) throws PersistentException {
		
		ConexionBD conexion = new ConexionBD();
		PersistentTransaction t = conexion.beginT();		
		boolean res = false;
		
		realizar.setEstado(true);
		
		try {
			IncidenciaDAO.save(realizar);
			t.commit();
		} catch (PersistentException e) {
			t.rollback();
			e.printStackTrace();
		}

		
	}

}