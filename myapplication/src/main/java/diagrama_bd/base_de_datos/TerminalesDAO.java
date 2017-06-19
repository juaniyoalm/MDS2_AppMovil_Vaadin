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

public class TerminalesDAO {
	public static Terminales loadTerminalesByORMID(int nTerminal) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadTerminalesByORMID(session, nTerminal);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Terminales getTerminalesByORMID(int nTerminal) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return getTerminalesByORMID(session, nTerminal);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Terminales loadTerminalesByORMID(int nTerminal, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadTerminalesByORMID(session, nTerminal, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Terminales getTerminalesByORMID(int nTerminal, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return getTerminalesByORMID(session, nTerminal, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Terminales loadTerminalesByORMID(PersistentSession session, int nTerminal) throws PersistentException {
		try {
			return (Terminales) session.load(diagrama_bd.base_de_datos.Terminales.class, new Integer(nTerminal));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Terminales getTerminalesByORMID(PersistentSession session, int nTerminal) throws PersistentException {
		try {
			return (Terminales) session.get(diagrama_bd.base_de_datos.Terminales.class, new Integer(nTerminal));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Terminales loadTerminalesByORMID(PersistentSession session, int nTerminal, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Terminales) session.load(diagrama_bd.base_de_datos.Terminales.class, new Integer(nTerminal), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Terminales getTerminalesByORMID(PersistentSession session, int nTerminal, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Terminales) session.get(diagrama_bd.base_de_datos.Terminales.class, new Integer(nTerminal), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTerminales(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return queryTerminales(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTerminales(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return queryTerminales(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Terminales[] listTerminalesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return listTerminalesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Terminales[] listTerminalesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return listTerminalesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTerminales(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.Terminales as Terminales");
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
	
	public static List queryTerminales(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.Terminales as Terminales");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Terminales", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Terminales[] listTerminalesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTerminales(session, condition, orderBy);
			return (Terminales[]) list.toArray(new Terminales[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Terminales[] listTerminalesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTerminales(session, condition, orderBy, lockMode);
			return (Terminales[]) list.toArray(new Terminales[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Terminales loadTerminalesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadTerminalesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Terminales loadTerminalesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return loadTerminalesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Terminales loadTerminalesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Terminales[] terminaleses = listTerminalesByQuery(session, condition, orderBy);
		if (terminaleses != null && terminaleses.length > 0)
			return terminaleses[0];
		else
			return null;
	}
	
	public static Terminales loadTerminalesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Terminales[] terminaleses = listTerminalesByQuery(session, condition, orderBy, lockMode);
		if (terminaleses != null && terminaleses.length > 0)
			return terminaleses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTerminalesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return iterateTerminalesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTerminalesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession();
			return iterateTerminalesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTerminalesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.Terminales as Terminales");
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
	
	public static java.util.Iterator iterateTerminalesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.base_de_datos.Terminales as Terminales");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Terminales", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Terminales createTerminales() {
		return new diagrama_bd.base_de_datos.Terminales();
	}
	
	public static boolean save(diagrama_bd.base_de_datos.Terminales terminales) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().saveObject(terminales);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(diagrama_bd.base_de_datos.Terminales terminales) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().deleteObject(terminales);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(diagrama_bd.base_de_datos.Terminales terminales)throws PersistentException {
		try {
			if (terminales.getCliente() != null) {
				terminales.getCliente().terminales.remove(terminales);
			}
			
			if (terminales.getDe_tipo() != null) {
				terminales.getDe_tipo().tipifica.remove(terminales);
			}
			
			return delete(terminales);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(diagrama_bd.base_de_datos.Terminales terminales, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (terminales.getCliente() != null) {
				terminales.getCliente().terminales.remove(terminales);
			}
			
			if (terminales.getDe_tipo() != null) {
				terminales.getDe_tipo().tipifica.remove(terminales);
			}
			
			try {
				session.delete(terminales);
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
	
	public static boolean refresh(diagrama_bd.base_de_datos.Terminales terminales) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession().refresh(terminales);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(diagrama_bd.base_de_datos.Terminales terminales) throws PersistentException {
		try {
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession().evict(terminales);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Terminales loadTerminalesByCriteria(TerminalesCriteria terminalesCriteria) {
		Terminales[] terminaleses = listTerminalesByCriteria(terminalesCriteria);
		if(terminaleses == null || terminaleses.length == 0) {
			return null;
		}
		return terminaleses[0];
	}
	
	public static Terminales[] listTerminalesByCriteria(TerminalesCriteria terminalesCriteria) {
		return terminalesCriteria.listTerminales();
	}
}
