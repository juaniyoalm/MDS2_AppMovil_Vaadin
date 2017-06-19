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

public class TipoTerminalCriteria extends AbstractORMCriteria {
	public final IntegerExpression nTipoTerminal;
	public final StringExpression nombre;
	public final CollectionExpression tipifica;
	
	public TipoTerminalCriteria(Criteria criteria) {
		super(criteria);
		nTipoTerminal = new IntegerExpression("nTipoTerminal", this);
		nombre = new StringExpression("nombre", this);
		tipifica = new CollectionExpression("ORM_tipifica", this);
	}
	
	public TipoTerminalCriteria(PersistentSession session) {
		this(session.createCriteria(TipoTerminal.class));
	}
	
	public TipoTerminalCriteria() throws PersistentException {
		this(diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession());
	}
	
	public diagrama_bd.base_de_datos.TerminalesCriteria createTipificaCriteria() {
		return new diagrama_bd.base_de_datos.TerminalesCriteria(createCriteria("ORM_tipifica"));
	}
	
	public TipoTerminal uniqueTipoTerminal() {
		return (TipoTerminal) super.uniqueResult();
	}
	
	public TipoTerminal[] listTipoTerminal() {
		java.util.List list = super.list();
		return (TipoTerminal[]) list.toArray(new TipoTerminal[list.size()]);
	}
}

