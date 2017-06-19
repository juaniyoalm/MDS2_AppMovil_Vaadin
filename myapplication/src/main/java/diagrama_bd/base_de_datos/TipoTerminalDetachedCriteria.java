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

public class TipoTerminalDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression nTipoTerminal;
	public final StringExpression nombre;
	public final CollectionExpression tipifica;
	
	public TipoTerminalDetachedCriteria() {
		super(diagrama_bd.base_de_datos.TipoTerminal.class, diagrama_bd.base_de_datos.TipoTerminalCriteria.class);
		nTipoTerminal = new IntegerExpression("nTipoTerminal", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		tipifica = new CollectionExpression("ORM_tipifica", this.getDetachedCriteria());
	}
	
	public TipoTerminalDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, diagrama_bd.base_de_datos.TipoTerminalCriteria.class);
		nTipoTerminal = new IntegerExpression("nTipoTerminal", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		tipifica = new CollectionExpression("ORM_tipifica", this.getDetachedCriteria());
	}
	
	public diagrama_bd.base_de_datos.TerminalesDetachedCriteria createTipificaCriteria() {
		return new diagrama_bd.base_de_datos.TerminalesDetachedCriteria(createCriteria("ORM_tipifica"));
	}
	
	public TipoTerminal uniqueTipoTerminal(PersistentSession session) {
		return (TipoTerminal) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public TipoTerminal[] listTipoTerminal(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (TipoTerminal[]) list.toArray(new TipoTerminal[list.size()]);
	}
}

