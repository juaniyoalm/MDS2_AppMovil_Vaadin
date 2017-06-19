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

public class ComercialDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression nComercial;
	public final StringExpression DNI;
	public final StringExpression nombre;
	public final StringExpression apellido1;
	public final StringExpression apellido2;
	public final StringExpression domicilio;
	public final StringExpression email;
	public final StringExpression password;
	public final CollectionExpression tramita;
	
	public ComercialDetachedCriteria() {
		super(diagrama_bd.base_de_datos.Comercial.class, diagrama_bd.base_de_datos.ComercialCriteria.class);
		nComercial = new IntegerExpression("nComercial", this.getDetachedCriteria());
		DNI = new StringExpression("DNI", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido1 = new StringExpression("apellido1", this.getDetachedCriteria());
		apellido2 = new StringExpression("apellido2", this.getDetachedCriteria());
		domicilio = new StringExpression("domicilio", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		tramita = new CollectionExpression("ORM_tramita", this.getDetachedCriteria());
	}
	
	public ComercialDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, diagrama_bd.base_de_datos.ComercialCriteria.class);
		nComercial = new IntegerExpression("nComercial", this.getDetachedCriteria());
		DNI = new StringExpression("DNI", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido1 = new StringExpression("apellido1", this.getDetachedCriteria());
		apellido2 = new StringExpression("apellido2", this.getDetachedCriteria());
		domicilio = new StringExpression("domicilio", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		tramita = new CollectionExpression("ORM_tramita", this.getDetachedCriteria());
	}
	
	public diagrama_bd.base_de_datos.IncidenciaDetachedCriteria createTramitaCriteria() {
		return new diagrama_bd.base_de_datos.IncidenciaDetachedCriteria(createCriteria("ORM_tramita"));
	}
	
	public Comercial uniqueComercial(PersistentSession session) {
		return (Comercial) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Comercial[] listComercial(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Comercial[]) list.toArray(new Comercial[list.size()]);
	}
}

