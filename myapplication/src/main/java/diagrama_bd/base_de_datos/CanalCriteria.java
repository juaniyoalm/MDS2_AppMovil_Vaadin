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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class CanalCriteria extends AbstractORMCriteria {
	public final StringExpression nCanal;
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression categoria;
	public final StringExpression rutaIcono;
	public final CollectionExpression es_parte;
	
	public CanalCriteria(Criteria criteria) {
		super(criteria);
		nCanal = new StringExpression("nCanal", this);
		ID = new IntegerExpression("ID", this);
		nombre = new StringExpression("nombre", this);
		categoria = new StringExpression("categoria", this);
		rutaIcono = new StringExpression("rutaIcono", this);
		es_parte = new CollectionExpression("ORM_es_parte", this);
	}
	
	public CanalCriteria(PersistentSession session) {
		this(session.createCriteria(Canal.class));
	}
	
	public CanalCriteria() throws PersistentException {
		this(diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession());
	}
	
	public diagrama_bd.base_de_datos.ServicioTVCriteria createEs_parteCriteria() {
		return new diagrama_bd.base_de_datos.ServicioTVCriteria(createCriteria("ORM_es_parte"));
	}
	
	public Canal uniqueCanal() {
		return (Canal) super.uniqueResult();
	}
	
	public Canal[] listCanal() {
		java.util.List list = super.list();
		return (Canal[]) list.toArray(new Canal[list.size()]);
	}
}

