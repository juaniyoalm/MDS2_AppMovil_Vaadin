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

public class TerminalesCriteria extends AbstractORMCriteria {
	public final IntegerExpression nTerminal;
	public final IntegerExpression clienteId;
	public final AssociationExpression cliente;
	public final IntegerExpression de_tipoId;
	public final AssociationExpression de_tipo;
	public final StringExpression nombre;
	
	public TerminalesCriteria(Criteria criteria) {
		super(criteria);
		nTerminal = new IntegerExpression("nTerminal", this);
		clienteId = new IntegerExpression("cliente.nCliente", this);
		cliente = new AssociationExpression("cliente", this);
		de_tipoId = new IntegerExpression("de_tipo.nTipoTerminal", this);
		de_tipo = new AssociationExpression("de_tipo", this);
		nombre = new StringExpression("nombre", this);
	}
	
	public TerminalesCriteria(PersistentSession session) {
		this(session.createCriteria(Terminales.class));
	}
	
	public TerminalesCriteria() throws PersistentException {
		this(diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession());
	}
	
	public ClienteCriteria createClienteCriteria() {
		return new ClienteCriteria(createCriteria("cliente"));
	}
	
	public TipoTerminalCriteria createDe_tipoCriteria() {
		return new TipoTerminalCriteria(createCriteria("de_tipo"));
	}
	
	public Terminales uniqueTerminales() {
		return (Terminales) super.uniqueResult();
	}
	
	public Terminales[] listTerminales() {
		java.util.List list = super.list();
		return (Terminales[]) list.toArray(new Terminales[list.size()]);
	}
}

