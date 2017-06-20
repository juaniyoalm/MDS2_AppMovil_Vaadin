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

public class ServicioTVDAO {
	public static ServicioTV loadServicioTVByORMID(String nServicio) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadServicioTVByORMID(session, nServicio);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServicioTV getServicioTVByORMID(String nServicio) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return getServicioTVByORMID(session, nServicio);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServicioTV loadServicioTVByORMID(String nServicio, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadServicioTVByORMID(session, nServicio, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServicioTV getServicioTVByORMID(String nServicio, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return getServicioTVByORMID(session, nServicio, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServicioTV loadServicioTVByORMID(PersistentSession session, String nServicio) throws PersistentException {
		try {
			return (ServicioTV) session.load(diagrama_bd.base_de_datos.ServicioTV.class, nServicio);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServicioTV getServicioTVByORMID(PersistentSession session, String nServicio) throws PersistentException {
		try {
			return (ServicioTV) session.get(diagrama_bd.base_de_datos.ServicioTV.class, nServicio);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServicioTV loadServicioTVByORMID(PersistentSession session, String nServicio, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ServicioTV) session.load(diagrama_bd.base_de_datos.ServicioTV.class, nServicio, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServicioTV getServicioTVByORMID(PersistentSession session, String nServicio, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ServicioTV) session.get(diagrama_bd.base_de_datos.ServicioTV.class, nServicio, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryServicioTV(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return queryServicioTV(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryServicioTV(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return queryServicioTV(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServicioTV[] listServicioTVByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return listServicioTVByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServicioTV[] listServicioTVByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return listServicioTVByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryServicioTV(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.ServicioTV as ServicioTV");
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
	
	public static List queryServicioTV(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.ServicioTV as ServicioTV");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ServicioTV", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServicioTV[] listServicioTVByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryServicioTV(session, condition, orderBy);
			return (ServicioTV[]) list.toArray(new ServicioTV[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServicioTV[] listServicioTVByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryServicioTV(session, condition, orderBy, lockMode);
			return (ServicioTV[]) list.toArray(new ServicioTV[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServicioTV loadServicioTVByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadServicioTVByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServicioTV loadServicioTVByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadServicioTVByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServicioTV loadServicioTVByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ServicioTV[] servicioTVs = listServicioTVByQuery(session, condition, orderBy);
		if (servicioTVs != null && servicioTVs.length > 0)
			return servicioTVs[0];
		else
			return null;
	}
	
	public static ServicioTV loadServicioTVByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ServicioTV[] servicioTVs = listServicioTVByQuery(session, condition, orderBy, lockMode);
		if (servicioTVs != null && servicioTVs.length > 0)
			return servicioTVs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateServicioTVByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return iterateServicioTVByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateServicioTVByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return iterateServicioTVByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateServicioTVByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.ServicioTV as ServicioTV");
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
	
	public static java.util.Iterator iterateServicioTVByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.ServicioTV as ServicioTV");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ServicioTV", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServicioTV createServicioTV() {
		return new diagrama_bd.base_de_datos.ServicioTV();
	}
	
	public static boolean save(diagrama_bd.base_de_datos.ServicioTV servicioTV) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().saveObject(servicioTV);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(diagrama_bd.base_de_datos.ServicioTV servicioTV) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().deleteObject(servicioTV);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(diagrama_bd.base_de_datos.ServicioTV servicioTV)throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ServiciosCombi[] lEs_partes = servicioTV.es_parte.toArray();
			for(int i = 0; i < lEs_partes.length; i++) {
				lEs_partes[i].setOfreceTV(null);
			}
			diagrama_bd.base_de_datos.Canal[] lCompuesto_pors = servicioTV.compuesto_por.toArray();
			for(int i = 0; i < lCompuesto_pors.length; i++) {
				lCompuesto_pors[i].es_parte.remove(servicioTV);
			}
			diagrama_bd.base_de_datos.Cliente[] lUtilizado_pors = servicioTV.utilizado_por.toArray();
			for(int i = 0; i < lUtilizado_pors.length; i++) {
				lUtilizado_pors[i].abonado_a.remove(servicioTV);
			}
			diagrama_bd.base_de_datos.Factura[] lGeneras = servicioTV.genera.toArray();
			for(int i = 0; i < lGeneras.length; i++) {
				lGeneras[i].setCorresponde_a(null);
			}
			return delete(servicioTV);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(diagrama_bd.base_de_datos.ServicioTV servicioTV, org.orm.PersistentSession session)throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ServiciosCombi[] lEs_partes = servicioTV.es_parte.toArray();
			for(int i = 0; i < lEs_partes.length; i++) {
				lEs_partes[i].setOfreceTV(null);
			}
			diagrama_bd.base_de_datos.Canal[] lCompuesto_pors = servicioTV.compuesto_por.toArray();
			for(int i = 0; i < lCompuesto_pors.length; i++) {
				lCompuesto_pors[i].es_parte.remove(servicioTV);
			}
			diagrama_bd.base_de_datos.Cliente[] lUtilizado_pors = servicioTV.utilizado_por.toArray();
			for(int i = 0; i < lUtilizado_pors.length; i++) {
				lUtilizado_pors[i].abonado_a.remove(servicioTV);
			}
			diagrama_bd.base_de_datos.Factura[] lGeneras = servicioTV.genera.toArray();
			for(int i = 0; i < lGeneras.length; i++) {
				lGeneras[i].setCorresponde_a(null);
			}
			try {
				session.delete(servicioTV);
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
	
	public static boolean refresh(diagrama_bd.base_de_datos.ServicioTV servicioTV) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession().refresh(servicioTV);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(diagrama_bd.base_de_datos.ServicioTV servicioTV) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession().evict(servicioTV);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServicioTV loadServicioTVByCriteria(ServicioTVCriteria servicioTVCriteria) {
		ServicioTV[] servicioTVs = listServicioTVByCriteria(servicioTVCriteria);
		if(servicioTVs == null || servicioTVs.length == 0) {
			return null;
		}
		return servicioTVs[0];
	}
	
	public static ServicioTV[] listServicioTVByCriteria(ServicioTVCriteria servicioTVCriteria) {
		return servicioTVCriteria.listServicioTV();
	}
}
