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

public class ServiciosFFMDAO {
	public static ServiciosFFM loadServiciosFFMByORMID(String nServicio) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadServiciosFFMByORMID(session, nServicio);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosFFM getServiciosFFMByORMID(String nServicio) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return getServiciosFFMByORMID(session, nServicio);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosFFM loadServiciosFFMByORMID(String nServicio, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadServiciosFFMByORMID(session, nServicio, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosFFM getServiciosFFMByORMID(String nServicio, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return getServiciosFFMByORMID(session, nServicio, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosFFM loadServiciosFFMByORMID(PersistentSession session, String nServicio) throws PersistentException {
		try {
			return (ServiciosFFM) session.load(diagrama_bd.base_de_datos.ServiciosFFM.class, nServicio);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosFFM getServiciosFFMByORMID(PersistentSession session, String nServicio) throws PersistentException {
		try {
			return (ServiciosFFM) session.get(diagrama_bd.base_de_datos.ServiciosFFM.class, nServicio);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosFFM loadServiciosFFMByORMID(PersistentSession session, String nServicio, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ServiciosFFM) session.load(diagrama_bd.base_de_datos.ServiciosFFM.class, nServicio, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosFFM getServiciosFFMByORMID(PersistentSession session, String nServicio, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ServiciosFFM) session.get(diagrama_bd.base_de_datos.ServiciosFFM.class, nServicio, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryServiciosFFM(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return queryServiciosFFM(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryServiciosFFM(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return queryServiciosFFM(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosFFM[] listServiciosFFMByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return listServiciosFFMByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosFFM[] listServiciosFFMByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return listServiciosFFMByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryServiciosFFM(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.ServiciosFFM as ServiciosFFM");
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
	
	public static List queryServiciosFFM(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.ServiciosFFM as ServiciosFFM");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ServiciosFFM", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosFFM[] listServiciosFFMByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryServiciosFFM(session, condition, orderBy);
			return (ServiciosFFM[]) list.toArray(new ServiciosFFM[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosFFM[] listServiciosFFMByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryServiciosFFM(session, condition, orderBy, lockMode);
			return (ServiciosFFM[]) list.toArray(new ServiciosFFM[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosFFM loadServiciosFFMByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadServiciosFFMByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosFFM loadServiciosFFMByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadServiciosFFMByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosFFM loadServiciosFFMByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ServiciosFFM[] serviciosFFMs = listServiciosFFMByQuery(session, condition, orderBy);
		if (serviciosFFMs != null && serviciosFFMs.length > 0)
			return serviciosFFMs[0];
		else
			return null;
	}
	
	public static ServiciosFFM loadServiciosFFMByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ServiciosFFM[] serviciosFFMs = listServiciosFFMByQuery(session, condition, orderBy, lockMode);
		if (serviciosFFMs != null && serviciosFFMs.length > 0)
			return serviciosFFMs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateServiciosFFMByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return iterateServiciosFFMByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateServiciosFFMByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return iterateServiciosFFMByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateServiciosFFMByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.ServiciosFFM as ServiciosFFM");
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
	
	public static java.util.Iterator iterateServiciosFFMByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.ServiciosFFM as ServiciosFFM");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ServiciosFFM", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosFFM createServiciosFFM() {
		return new diagrama_bd.base_de_datos.ServiciosFFM();
	}
	
	public static boolean save(diagrama_bd.base_de_datos.ServiciosFFM serviciosFFM) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().saveObject(serviciosFFM);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(diagrama_bd.base_de_datos.ServiciosFFM serviciosFFM) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().deleteObject(serviciosFFM);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(diagrama_bd.base_de_datos.ServiciosFFM serviciosFFM)throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ServiciosCombi[] lEs_partes = serviciosFFM.es_parte.toArray();
			for(int i = 0; i < lEs_partes.length; i++) {
				lEs_partes[i].ofreceFFM.remove(serviciosFFM);
			}
			if (serviciosFFM.getGenera() != null) {
				serviciosFFM.getGenera().corresponde_a.remove(serviciosFFM);
			}
			
			diagrama_bd.base_de_datos.Cliente[] lUtilizado_pors = serviciosFFM.utilizado_por.toArray();
			for(int i = 0; i < lUtilizado_pors.length; i++) {
				lUtilizado_pors[i].abonado_a.remove(serviciosFFM);
			}
			return delete(serviciosFFM);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(diagrama_bd.base_de_datos.ServiciosFFM serviciosFFM, org.orm.PersistentSession session)throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ServiciosCombi[] lEs_partes = serviciosFFM.es_parte.toArray();
			for(int i = 0; i < lEs_partes.length; i++) {
				lEs_partes[i].ofreceFFM.remove(serviciosFFM);
			}
			if (serviciosFFM.getGenera() != null) {
				serviciosFFM.getGenera().corresponde_a.remove(serviciosFFM);
			}
			
			diagrama_bd.base_de_datos.Cliente[] lUtilizado_pors = serviciosFFM.utilizado_por.toArray();
			for(int i = 0; i < lUtilizado_pors.length; i++) {
				lUtilizado_pors[i].abonado_a.remove(serviciosFFM);
			}
			try {
				session.delete(serviciosFFM);
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
	
	public static boolean refresh(diagrama_bd.base_de_datos.ServiciosFFM serviciosFFM) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession().refresh(serviciosFFM);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(diagrama_bd.base_de_datos.ServiciosFFM serviciosFFM) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession().evict(serviciosFFM);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ServiciosFFM loadServiciosFFMByCriteria(ServiciosFFMCriteria serviciosFFMCriteria) {
		ServiciosFFM[] serviciosFFMs = listServiciosFFMByCriteria(serviciosFFMCriteria);
		if(serviciosFFMs == null || serviciosFFMs.length == 0) {
			return null;
		}
		return serviciosFFMs[0];
	}
	
	public static ServiciosFFM[] listServiciosFFMByCriteria(ServiciosFFMCriteria serviciosFFMCriteria) {
		return serviciosFFMCriteria.listServiciosFFM();
	}
}
