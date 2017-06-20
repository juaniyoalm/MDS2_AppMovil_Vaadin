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

public class ServicioDAO {
	public static Servicio loadServicioByORMID(String nServicio) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadServicioByORMID(session, nServicio);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio getServicioByORMID(String nServicio) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return getServicioByORMID(session, nServicio);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio loadServicioByORMID(String nServicio, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadServicioByORMID(session, nServicio, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio getServicioByORMID(String nServicio, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return getServicioByORMID(session, nServicio, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio loadServicioByORMID(PersistentSession session, String nServicio) throws PersistentException {
		try {
			return (Servicio) session.load(diagrama_bd.base_de_datos.Servicio.class, nServicio);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio getServicioByORMID(PersistentSession session, String nServicio) throws PersistentException {
		try {
			return (Servicio) session.get(diagrama_bd.base_de_datos.Servicio.class, nServicio);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio loadServicioByORMID(PersistentSession session, String nServicio, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Servicio) session.load(diagrama_bd.base_de_datos.Servicio.class, nServicio, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio getServicioByORMID(PersistentSession session, String nServicio, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Servicio) session.get(diagrama_bd.base_de_datos.Servicio.class, nServicio, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryServicio(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return queryServicio(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryServicio(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return queryServicio(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio[] listServicioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return listServicioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio[] listServicioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return listServicioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryServicio(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.Servicio as Servicio");
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
	
	public static List queryServicio(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.Servicio as Servicio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Servicio", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio[] listServicioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryServicio(session, condition, orderBy);
			return (Servicio[]) list.toArray(new Servicio[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio[] listServicioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryServicio(session, condition, orderBy, lockMode);
			return (Servicio[]) list.toArray(new Servicio[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio loadServicioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadServicioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio loadServicioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadServicioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio loadServicioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Servicio[] servicios = listServicioByQuery(session, condition, orderBy);
		if (servicios != null && servicios.length > 0)
			return servicios[0];
		else
			return null;
	}
	
	public static Servicio loadServicioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Servicio[] servicios = listServicioByQuery(session, condition, orderBy, lockMode);
		if (servicios != null && servicios.length > 0)
			return servicios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateServicioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return iterateServicioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateServicioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return iterateServicioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateServicioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.Servicio as Servicio");
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
	
	public static java.util.Iterator iterateServicioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.Servicio as Servicio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Servicio", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio createServicio() {
		return new diagrama_bd.base_de_datos.Servicio();
	}
	
	public static boolean save(diagrama_bd.base_de_datos.Servicio servicio) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().saveObject(servicio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(diagrama_bd.base_de_datos.Servicio servicio) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().deleteObject(servicio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(diagrama_bd.base_de_datos.Servicio servicio)throws PersistentException {
		if (servicio instanceof diagrama_bd.base_de_datos.ServiciosFFM) {
			return diagrama_bd.base_de_datos.ServiciosFFMDAO.deleteAndDissociate((diagrama_bd.base_de_datos.ServiciosFFM) servicio);
		}
		
		if (servicio instanceof diagrama_bd.base_de_datos.ServicioTV) {
			return diagrama_bd.base_de_datos.ServicioTVDAO.deleteAndDissociate((diagrama_bd.base_de_datos.ServicioTV) servicio);
		}
		
		if (servicio instanceof diagrama_bd.base_de_datos.ServiciosCombi) {
			return diagrama_bd.base_de_datos.ServiciosCombiDAO.deleteAndDissociate((diagrama_bd.base_de_datos.ServiciosCombi) servicio);
		}
		
		try {
			diagrama_bd.base_de_datos.Cliente[] lUtilizado_pors = servicio.utilizado_por.toArray();
			for(int i = 0; i < lUtilizado_pors.length; i++) {
				lUtilizado_pors[i].abonado_a.remove(servicio);
			}
			diagrama_bd.base_de_datos.Factura[] lGeneras = servicio.genera.toArray();
			for(int i = 0; i < lGeneras.length; i++) {
				lGeneras[i].setCorresponde_a(null);
			}
			return delete(servicio);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(diagrama_bd.base_de_datos.Servicio servicio, org.orm.PersistentSession session)throws PersistentException {
		if (servicio instanceof diagrama_bd.base_de_datos.ServiciosFFM) {
			return diagrama_bd.base_de_datos.ServiciosFFMDAO.deleteAndDissociate((diagrama_bd.base_de_datos.ServiciosFFM) servicio, session);
		}
		
		if (servicio instanceof diagrama_bd.base_de_datos.ServicioTV) {
			return diagrama_bd.base_de_datos.ServicioTVDAO.deleteAndDissociate((diagrama_bd.base_de_datos.ServicioTV) servicio, session);
		}
		
		if (servicio instanceof diagrama_bd.base_de_datos.ServiciosCombi) {
			return diagrama_bd.base_de_datos.ServiciosCombiDAO.deleteAndDissociate((diagrama_bd.base_de_datos.ServiciosCombi) servicio, session);
		}
		
		try {
			diagrama_bd.base_de_datos.Cliente[] lUtilizado_pors = servicio.utilizado_por.toArray();
			for(int i = 0; i < lUtilizado_pors.length; i++) {
				lUtilizado_pors[i].abonado_a.remove(servicio);
			}
			diagrama_bd.base_de_datos.Factura[] lGeneras = servicio.genera.toArray();
			for(int i = 0; i < lGeneras.length; i++) {
				lGeneras[i].setCorresponde_a(null);
			}
			try {
				session.delete(servicio);
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
	
	public static boolean refresh(diagrama_bd.base_de_datos.Servicio servicio) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession().refresh(servicio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(diagrama_bd.base_de_datos.Servicio servicio) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession().evict(servicio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio loadServicioByCriteria(ServicioCriteria servicioCriteria) {
		Servicio[] servicios = listServicioByCriteria(servicioCriteria);
		if(servicios == null || servicios.length == 0) {
			return null;
		}
		return servicios[0];
	}
	
	public static Servicio[] listServicioByCriteria(ServicioCriteria servicioCriteria) {
		return servicioCriteria.listServicio();
	}
}
