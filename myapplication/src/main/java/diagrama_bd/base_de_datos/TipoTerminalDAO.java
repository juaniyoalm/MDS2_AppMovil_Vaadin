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

public class TipoTerminalDAO {
	public static TipoTerminal loadTipoTerminalByORMID(int nTipoTerminal) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadTipoTerminalByORMID(session, nTipoTerminal);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoTerminal getTipoTerminalByORMID(int nTipoTerminal) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return getTipoTerminalByORMID(session, nTipoTerminal);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoTerminal loadTipoTerminalByORMID(int nTipoTerminal, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadTipoTerminalByORMID(session, nTipoTerminal, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoTerminal getTipoTerminalByORMID(int nTipoTerminal, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return getTipoTerminalByORMID(session, nTipoTerminal, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoTerminal loadTipoTerminalByORMID(PersistentSession session, int nTipoTerminal) throws PersistentException {
		try {
			return (TipoTerminal) session.load(diagrama_bd.base_de_datos.TipoTerminal.class, new Integer(nTipoTerminal));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoTerminal getTipoTerminalByORMID(PersistentSession session, int nTipoTerminal) throws PersistentException {
		try {
			return (TipoTerminal) session.get(diagrama_bd.base_de_datos.TipoTerminal.class, new Integer(nTipoTerminal));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoTerminal loadTipoTerminalByORMID(PersistentSession session, int nTipoTerminal, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (TipoTerminal) session.load(diagrama_bd.base_de_datos.TipoTerminal.class, new Integer(nTipoTerminal), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoTerminal getTipoTerminalByORMID(PersistentSession session, int nTipoTerminal, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (TipoTerminal) session.get(diagrama_bd.base_de_datos.TipoTerminal.class, new Integer(nTipoTerminal), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipoTerminal(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return queryTipoTerminal(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipoTerminal(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return queryTipoTerminal(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoTerminal[] listTipoTerminalByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return listTipoTerminalByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoTerminal[] listTipoTerminalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return listTipoTerminalByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipoTerminal(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.TipoTerminal as TipoTerminal");
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
	
	public static List queryTipoTerminal(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.TipoTerminal as TipoTerminal");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("TipoTerminal", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoTerminal[] listTipoTerminalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTipoTerminal(session, condition, orderBy);
			return (TipoTerminal[]) list.toArray(new TipoTerminal[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoTerminal[] listTipoTerminalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTipoTerminal(session, condition, orderBy, lockMode);
			return (TipoTerminal[]) list.toArray(new TipoTerminal[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoTerminal loadTipoTerminalByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadTipoTerminalByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoTerminal loadTipoTerminalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadTipoTerminalByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoTerminal loadTipoTerminalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		TipoTerminal[] tipoTerminals = listTipoTerminalByQuery(session, condition, orderBy);
		if (tipoTerminals != null && tipoTerminals.length > 0)
			return tipoTerminals[0];
		else
			return null;
	}
	
	public static TipoTerminal loadTipoTerminalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		TipoTerminal[] tipoTerminals = listTipoTerminalByQuery(session, condition, orderBy, lockMode);
		if (tipoTerminals != null && tipoTerminals.length > 0)
			return tipoTerminals[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTipoTerminalByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return iterateTipoTerminalByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipoTerminalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return iterateTipoTerminalByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipoTerminalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.TipoTerminal as TipoTerminal");
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
	
	public static java.util.Iterator iterateTipoTerminalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.TipoTerminal as TipoTerminal");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("TipoTerminal", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoTerminal createTipoTerminal() {
		return new diagrama_bd.base_de_datos.TipoTerminal();
	}
	
	public static boolean save(diagrama_bd.base_de_datos.TipoTerminal tipoTerminal) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().saveObject(tipoTerminal);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(diagrama_bd.base_de_datos.TipoTerminal tipoTerminal) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().deleteObject(tipoTerminal);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(diagrama_bd.base_de_datos.TipoTerminal tipoTerminal)throws PersistentException {
		try {
			diagrama_bd.base_de_datos.Terminales[] lTipificas = tipoTerminal.tipifica.toArray();
			for(int i = 0; i < lTipificas.length; i++) {
				lTipificas[i].setDe_tipo(null);
			}
			return delete(tipoTerminal);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(diagrama_bd.base_de_datos.TipoTerminal tipoTerminal, org.orm.PersistentSession session)throws PersistentException {
		try {
			diagrama_bd.base_de_datos.Terminales[] lTipificas = tipoTerminal.tipifica.toArray();
			for(int i = 0; i < lTipificas.length; i++) {
				lTipificas[i].setDe_tipo(null);
			}
			try {
				session.delete(tipoTerminal);
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
	
	public static boolean refresh(diagrama_bd.base_de_datos.TipoTerminal tipoTerminal) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession().refresh(tipoTerminal);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(diagrama_bd.base_de_datos.TipoTerminal tipoTerminal) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession().evict(tipoTerminal);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoTerminal loadTipoTerminalByCriteria(TipoTerminalCriteria tipoTerminalCriteria) {
		TipoTerminal[] tipoTerminals = listTipoTerminalByCriteria(tipoTerminalCriteria);
		if(tipoTerminals == null || tipoTerminals.length == 0) {
			return null;
		}
		return tipoTerminals[0];
	}
	
	public static TipoTerminal[] listTipoTerminalByCriteria(TipoTerminalCriteria tipoTerminalCriteria) {
		return tipoTerminalCriteria.listTipoTerminal();
	}
}
