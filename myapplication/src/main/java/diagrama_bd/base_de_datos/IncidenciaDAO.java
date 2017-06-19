/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package diagrama_bd.base_de_datos;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class IncidenciaDAO {
	public static Incidencia loadIncidenciaByORMID(int nIncidencia) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadIncidenciaByORMID(session, nIncidencia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia getIncidenciaByORMID(int nIncidencia) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return getIncidenciaByORMID(session, nIncidencia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia loadIncidenciaByORMID(int nIncidencia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadIncidenciaByORMID(session, nIncidencia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia getIncidenciaByORMID(int nIncidencia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return getIncidenciaByORMID(session, nIncidencia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia loadIncidenciaByORMID(PersistentSession session, int nIncidencia) throws PersistentException {
		try {
			return (Incidencia) session.load(diagrama_bd.base_de_datos.Incidencia.class, new Integer(nIncidencia));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia getIncidenciaByORMID(PersistentSession session, int nIncidencia) throws PersistentException {
		try {
			return (Incidencia) session.get(diagrama_bd.base_de_datos.Incidencia.class, new Integer(nIncidencia));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia loadIncidenciaByORMID(PersistentSession session, int nIncidencia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Incidencia) session.load(diagrama_bd.base_de_datos.Incidencia.class, new Integer(nIncidencia), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia getIncidenciaByORMID(PersistentSession session, int nIncidencia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Incidencia) session.get(diagrama_bd.base_de_datos.Incidencia.class, new Integer(nIncidencia), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryIncidencia(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return queryIncidencia(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryIncidencia(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return queryIncidencia(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia[] listIncidenciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return listIncidenciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia[] listIncidenciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return listIncidenciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryIncidencia(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.Incidencia as Incidencia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryIncidencia(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.Incidencia as Incidencia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Incidencia", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia[] listIncidenciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryIncidencia(session, condition, orderBy);
			return (Incidencia[]) list.toArray(new Incidencia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia[] listIncidenciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryIncidencia(session, condition, orderBy, lockMode);
			return (Incidencia[]) list.toArray(new Incidencia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia loadIncidenciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadIncidenciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia loadIncidenciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadIncidenciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia loadIncidenciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Incidencia[] incidencias = listIncidenciaByQuery(session, condition, orderBy);
		if (incidencias != null && incidencias.length > 0)
			return incidencias[0];
		else
			return null;
	}
	
	public static Incidencia loadIncidenciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Incidencia[] incidencias = listIncidenciaByQuery(session, condition, orderBy, lockMode);
		if (incidencias != null && incidencias.length > 0)
			return incidencias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateIncidenciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return iterateIncidenciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateIncidenciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return iterateIncidenciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateIncidenciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.Incidencia as Incidencia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateIncidenciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.Incidencia as Incidencia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Incidencia", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia createIncidencia() {
		return new diagrama_bd.base_de_datos.Incidencia();
	}
	
	public static boolean save(diagrama_bd.base_de_datos.Incidencia incidencia) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().saveObject(incidencia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(diagrama_bd.base_de_datos.Incidencia incidencia) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().deleteObject(incidencia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(diagrama_bd.base_de_datos.Incidencia incidencia)throws PersistentException {
		try {
			if (incidencia.getDe_tipo() != null) {
				incidencia.getDe_tipo().clasifica_a.remove(incidencia);
			}
			
			if (incidencia.getReclamada_por() != null) {
				incidencia.getReclamada_por().reclama.remove(incidencia);
			}
			
			if (incidencia.getTramitada_por() != null) {
				incidencia.getTramitada_por().tramita.remove(incidencia);
			}
			
			return delete(incidencia);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(diagrama_bd.base_de_datos.Incidencia incidencia, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (incidencia.getDe_tipo() != null) {
				incidencia.getDe_tipo().clasifica_a.remove(incidencia);
			}
			
			if (incidencia.getReclamada_por() != null) {
				incidencia.getReclamada_por().reclama.remove(incidencia);
			}
			
			if (incidencia.getTramitada_por() != null) {
				incidencia.getTramitada_por().tramita.remove(incidencia);
			}
			
			try {
				session.delete(incidencia);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(diagrama_bd.base_de_datos.Incidencia incidencia) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession().refresh(incidencia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(diagrama_bd.base_de_datos.Incidencia incidencia) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession().evict(incidencia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Incidencia loadIncidenciaByCriteria(IncidenciaCriteria incidenciaCriteria) {
		Incidencia[] incidencias = listIncidenciaByCriteria(incidenciaCriteria);
		if(incidencias == null || incidencias.length == 0) {
			return null;
		}
		return incidencias[0];
	}
	
	public static Incidencia[] listIncidenciaByCriteria(IncidenciaCriteria incidenciaCriteria) {
		return incidenciaCriteria.listIncidencia();
	}
}
