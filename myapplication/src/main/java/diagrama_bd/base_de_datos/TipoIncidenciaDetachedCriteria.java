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

public class TipoIncidenciaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression nTipoIncidencia;
	public final StringExpression nombre;
	public final CollectionExpression clasifica_a;
	
	public TipoIncidenciaDetachedCriteria() {
		super(diagrama_bd.base_de_datos.TipoIncidencia.class, diagrama_bd.base_de_datos.TipoIncidenciaCriteria.class);
		nTipoIncidencia = new IntegerExpression("nTipoIncidencia", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		clasifica_a = new CollectionExpression("ORM_clasifica_a", this.getDetachedCriteria());
	}
	
	public TipoIncidenciaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, diagrama_bd.base_de_datos.TipoIncidenciaCriteria.class);
		nTipoIncidencia = new IntegerExpression("nTipoIncidencia", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		clasifica_a = new CollectionExpression("ORM_clasifica_a", this.getDetachedCriteria());
	}
	
	public diagrama_bd.base_de_datos.IncidenciaDetachedCriteria createClasifica_aCriteria() {
		return new diagrama_bd.base_de_datos.IncidenciaDetachedCriteria(createCriteria("ORM_clasifica_a"));
	}
	
	public TipoIncidencia uniqueTipoIncidencia(PersistentSession session) {
		return (TipoIncidencia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public TipoIncidencia[] listTipoIncidencia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (TipoIncidencia[]) list.toArray(new TipoIncidencia[list.size()]);
	}
}

