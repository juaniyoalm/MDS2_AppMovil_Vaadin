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

public class TipoIncidenciaCriteria extends AbstractORMCriteria {
	public final IntegerExpression nTipoIncidencia;
	public final StringExpression nombre;
	public final CollectionExpression clasifica_a;
	
	public TipoIncidenciaCriteria(Criteria criteria) {
		super(criteria);
		nTipoIncidencia = new IntegerExpression("nTipoIncidencia", this);
		nombre = new StringExpression("nombre", this);
		clasifica_a = new CollectionExpression("ORM_clasifica_a", this);
	}
	
	public TipoIncidenciaCriteria(PersistentSession session) {
		this(session.createCriteria(TipoIncidencia.class));
	}
	
	public TipoIncidenciaCriteria() throws PersistentException {
		this(diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession());
	}
	
	public diagrama_bd.base_de_datos.IncidenciaCriteria createClasifica_aCriteria() {
		return new diagrama_bd.base_de_datos.IncidenciaCriteria(createCriteria("ORM_clasifica_a"));
	}
	
	public TipoIncidencia uniqueTipoIncidencia() {
		return (TipoIncidencia) super.uniqueResult();
	}
	
	public TipoIncidencia[] listTipoIncidencia() {
		java.util.List list = super.list();
		return (TipoIncidencia[]) list.toArray(new TipoIncidencia[list.size()]);
	}
}

