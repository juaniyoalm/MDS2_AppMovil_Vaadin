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

public class IncidenciaDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public IncidenciaDetachedCriteria() {
		super(diagrama_bd.base_de_datos.Incidencia.class, diagrama_bd.base_de_datos.IncidenciaCriteria.class);
		nIncidencia = new IntegerExpression("nIncidencia", this.getDetachedCriteria());
		de_tipoId = new IntegerExpression("de_tipo.nTipoIncidencia", this.getDetachedCriteria());
		de_tipo = new AssociationExpression("de_tipo", this.getDetachedCriteria());
		reclamada_porId = new IntegerExpression("reclamada_por.nCliente", this.getDetachedCriteria());
		reclamada_por = new AssociationExpression("reclamada_por", this.getDetachedCriteria());
		tramitada_porId = new IntegerExpression("tramitada_por.nComercial", this.getDetachedCriteria());
		tramitada_por = new AssociationExpression("tramitada_por", this.getDetachedCriteria());
		detalleIncidencia = new StringExpression("detalleIncidencia", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		DNI = new StringExpression("DNI", this.getDetachedCriteria());
		estado = new BooleanExpression("estado", this.getDetachedCriteria());
	}
	
	public IncidenciaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, diagrama_bd.base_de_datos.IncidenciaCriteria.class);
		nIncidencia = new IntegerExpression("nIncidencia", this.getDetachedCriteria());
		de_tipoId = new IntegerExpression("de_tipo.nTipoIncidencia", this.getDetachedCriteria());
		de_tipo = new AssociationExpression("de_tipo", this.getDetachedCriteria());
		reclamada_porId = new IntegerExpression("reclamada_por.nCliente", this.getDetachedCriteria());
		reclamada_por = new AssociationExpression("reclamada_por", this.getDetachedCriteria());
		tramitada_porId = new IntegerExpression("tramitada_por.nComercial", this.getDetachedCriteria());
		tramitada_por = new AssociationExpression("tramitada_por", this.getDetachedCriteria());
		detalleIncidencia = new StringExpression("detalleIncidencia", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		DNI = new StringExpression("DNI", this.getDetachedCriteria());
		estado = new BooleanExpression("estado", this.getDetachedCriteria());
	}
	
	public diagrama_bd.base_de_datos.TipoIncidenciaDetachedCriteria createDe_tipoCriteria() {
		return new diagrama_bd.base_de_datos.TipoIncidenciaDetachedCriteria(createCriteria("de_tipo"));
	}
	
	public diagrama_bd.base_de_datos.ClienteDetachedCriteria createReclamada_porCriteria() {
		return new diagrama_bd.base_de_datos.ClienteDetachedCriteria(createCriteria("reclamada_por"));
	}
	
	public diagrama_bd.base_de_datos.ComercialDetachedCriteria createTramitada_porCriteria() {
		return new diagrama_bd.base_de_datos.ComercialDetachedCriteria(createCriteria("tramitada_por"));
	}
	
	public Incidencia uniqueIncidencia(PersistentSession session) {
		return (Incidencia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Incidencia[] listIncidencia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Incidencia[]) list.toArray(new Incidencia[list.size()]);
	}
}

