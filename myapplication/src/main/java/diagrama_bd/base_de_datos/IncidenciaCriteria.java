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

public class IncidenciaCriteria extends AbstractORMCriteria {
	public final IntegerExpression nIncidencia;
	public final IntegerExpression de_tipoId;
	public final AssociationExpression de_tipo;
	public final IntegerExpression reclamada_porId;
	public final AssociationExpression reclamada_por;
	public final IntegerExpression tramitada_porId;
	public final AssociationExpression tramitada_por;
	public final StringExpression detalleIncidencia;
	public final StringExpression telefono;
	public final StringExpression DNI;
	public final BooleanExpression estado;
	
	public IncidenciaCriteria(Criteria criteria) {
		super(criteria);
		nIncidencia = new IntegerExpression("nIncidencia", this);
		de_tipoId = new IntegerExpression("de_tipo.nTipoIncidencia", this);
		de_tipo = new AssociationExpression("de_tipo", this);
		reclamada_porId = new IntegerExpression("reclamada_por.nCliente", this);
		reclamada_por = new AssociationExpression("reclamada_por", this);
		tramitada_porId = new IntegerExpression("tramitada_por.nComercial", this);
		tramitada_por = new AssociationExpression("tramitada_por", this);
		detalleIncidencia = new StringExpression("detalleIncidencia", this);
		telefono = new StringExpression("telefono", this);
		DNI = new StringExpression("DNI", this);
		estado = new BooleanExpression("estado", this);
	}
	
	public IncidenciaCriteria(PersistentSession session) {
		this(session.createCriteria(Incidencia.class));
	}
	
	public IncidenciaCriteria() throws PersistentException {
		this(diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession());
	}
	
	public TipoIncidenciaCriteria createDe_tipoCriteria() {
		return new TipoIncidenciaCriteria(createCriteria("de_tipo"));
	}
	
	public ClienteCriteria createReclamada_porCriteria() {
		return new ClienteCriteria(createCriteria("reclamada_por"));
	}
	
	public ComercialCriteria createTramitada_porCriteria() {
		return new ComercialCriteria(createCriteria("tramitada_por"));
	}
	
	public Incidencia uniqueIncidencia() {
		return (Incidencia) super.uniqueResult();
	}
	
	public Incidencia[] listIncidencia() {
		java.util.List list = super.list();
		return (Incidencia[]) list.toArray(new Incidencia[list.size()]);
	}
}

