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

public class TipoIncidenciaDAO {
	public static TipoIncidencia loadTipoIncidenciaByORMID(int nTipoIncidencia) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadTipoIncidenciaByORMID(session, nTipoIncidencia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoIncidencia getTipoIncidenciaByORMID(int nTipoIncidencia) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return getTipoIncidenciaByORMID(session, nTipoIncidencia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoIncidencia loadTipoIncidenciaByORMID(int nTipoIncidencia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadTipoIncidenciaByORMID(session, nTipoIncidencia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoIncidencia getTipoIncidenciaByORMID(int nTipoIncidencia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return getTipoIncidenciaByORMID(session, nTipoIncidencia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoIncidencia loadTipoIncidenciaByORMID(PersistentSession session, int nTipoIncidencia) throws PersistentException {
		try {
			return (TipoIncidencia) session.load(diagrama_bd.base_de_datos.TipoIncidencia.class, new Integer(nTipoIncidencia));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoIncidencia getTipoIncidenciaByORMID(PersistentSession session, int nTipoIncidencia) throws PersistentException {
		try {
			return (TipoIncidencia) session.get(diagrama_bd.base_de_datos.TipoIncidencia.class, new Integer(nTipoIncidencia));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoIncidencia loadTipoIncidenciaByORMID(PersistentSession session, int nTipoIncidencia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (TipoIncidencia) session.load(diagrama_bd.base_de_datos.TipoIncidencia.class, new Integer(nTipoIncidencia), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoIncidencia getTipoIncidenciaByORMID(PersistentSession session, int nTipoIncidencia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (TipoIncidencia) session.get(diagrama_bd.base_de_datos.TipoIncidencia.class, new Integer(nTipoIncidencia), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipoIncidencia(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return queryTipoIncidencia(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipoIncidencia(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return queryTipoIncidencia(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoIncidencia[] listTipoIncidenciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return listTipoIncidenciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoIncidencia[] listTipoIncidenciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return listTipoIncidenciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipoIncidencia(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.TipoIncidencia as TipoIncidencia");
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
	
	public static List queryTipoIncidencia(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.TipoIncidencia as TipoIncidencia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("TipoIncidencia", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoIncidencia[] listTipoIncidenciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTipoIncidencia(session, condition, orderBy);
			return (TipoIncidencia[]) list.toArray(new TipoIncidencia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoIncidencia[] listTipoIncidenciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTipoIncidencia(session, condition, orderBy, lockMode);
			return (TipoIncidencia[]) list.toArray(new TipoIncidencia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoIncidencia loadTipoIncidenciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadTipoIncidenciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoIncidencia loadTipoIncidenciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadTipoIncidenciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoIncidencia loadTipoIncidenciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		TipoIncidencia[] tipoIncidencias = listTipoIncidenciaByQuery(session, condition, orderBy);
		if (tipoIncidencias != null && tipoIncidencias.length > 0)
			return tipoIncidencias[0];
		else
			return null;
	}
	
	public static TipoIncidencia loadTipoIncidenciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		TipoIncidencia[] tipoIncidencias = listTipoIncidenciaByQuery(session, condition, orderBy, lockMode);
		if (tipoIncidencias != null && tipoIncidencias.length > 0)
			return tipoIncidencias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTipoIncidenciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return iterateTipoIncidenciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipoIncidenciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return iterateTipoIncidenciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipoIncidenciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.TipoIncidencia as TipoIncidencia");
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
	
	public static java.util.Iterator iterateTipoIncidenciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.TipoIncidencia as TipoIncidencia");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("TipoIncidencia", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoIncidencia createTipoIncidencia() {
		return new diagrama_bd.base_de_datos.TipoIncidencia();
	}
	
	public static boolean save(diagrama_bd.base_de_datos.TipoIncidencia tipoIncidencia) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().saveObject(tipoIncidencia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(diagrama_bd.base_de_datos.TipoIncidencia tipoIncidencia) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().deleteObject(tipoIncidencia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(diagrama_bd.base_de_datos.TipoIncidencia tipoIncidencia)throws PersistentException {
		try {
			diagrama_bd.base_de_datos.Incidencia[] lClasifica_as = tipoIncidencia.clasifica_a.toArray();
			for(int i = 0; i < lClasifica_as.length; i++) {
				lClasifica_as[i].setDe_tipo(null);
			}
			return delete(tipoIncidencia);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(diagrama_bd.base_de_datos.TipoIncidencia tipoIncidencia, org.orm.PersistentSession session)throws PersistentException {
		try {
			diagrama_bd.base_de_datos.Incidencia[] lClasifica_as = tipoIncidencia.clasifica_a.toArray();
			for(int i = 0; i < lClasifica_as.length; i++) {
				lClasifica_as[i].setDe_tipo(null);
			}
			try {
				session.delete(tipoIncidencia);
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
	
	public static boolean refresh(diagrama_bd.base_de_datos.TipoIncidencia tipoIncidencia) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession().refresh(tipoIncidencia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(diagrama_bd.base_de_datos.TipoIncidencia tipoIncidencia) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession().evict(tipoIncidencia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoIncidencia loadTipoIncidenciaByCriteria(TipoIncidenciaCriteria tipoIncidenciaCriteria) {
		TipoIncidencia[] tipoIncidencias = listTipoIncidenciaByCriteria(tipoIncidenciaCriteria);
		if(tipoIncidencias == null || tipoIncidencias.length == 0) {
			return null;
		}
		return tipoIncidencias[0];
	}
	
	public static TipoIncidencia[] listTipoIncidenciaByCriteria(TipoIncidenciaCriteria tipoIncidenciaCriteria) {
		return tipoIncidenciaCriteria.listTipoIncidencia();
	}
}
