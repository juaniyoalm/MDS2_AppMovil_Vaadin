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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class CanalDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression nCanal;
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression categoria;
	public final StringExpression rutaIcono;
	public final CollectionExpression es_parte;
	
	public CanalDetachedCriteria() {
		super(diagrama_bd.base_de_datos.Canal.class, diagrama_bd.base_de_datos.CanalCriteria.class);
		nCanal = new StringExpression("nCanal", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		categoria = new StringExpression("categoria", this.getDetachedCriteria());
		rutaIcono = new StringExpression("rutaIcono", this.getDetachedCriteria());
		es_parte = new CollectionExpression("ORM_es_parte", this.getDetachedCriteria());
	}
	
	public CanalDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, diagrama_bd.base_de_datos.CanalCriteria.class);
		nCanal = new StringExpression("nCanal", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		categoria = new StringExpression("categoria", this.getDetachedCriteria());
		rutaIcono = new StringExpression("rutaIcono", this.getDetachedCriteria());
		es_parte = new CollectionExpression("ORM_es_parte", this.getDetachedCriteria());
	}
	
	public diagrama_bd.base_de_datos.ServicioTVDetachedCriteria createEs_parteCriteria() {
		return new diagrama_bd.base_de_datos.ServicioTVDetachedCriteria(createCriteria("ORM_es_parte"));
	}
	
	public Canal uniqueCanal(PersistentSession session) {
		return (Canal) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Canal[] listCanal(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Canal[]) list.toArray(new Canal[list.size()]);
	}
}

