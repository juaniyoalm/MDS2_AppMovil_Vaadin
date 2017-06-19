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

public class ComercialCriteria extends AbstractORMCriteria {
	public final IntegerExpression nComercial;
	public final StringExpression DNI;
	public final StringExpression nombre;
	public final StringExpression apellido1;
	public final StringExpression apellido2;
	public final StringExpression domicilio;
	public final StringExpression email;
	public final StringExpression password;
	public final CollectionExpression tramita;
	
	public ComercialCriteria(Criteria criteria) {
		super(criteria);
		nComercial = new IntegerExpression("nComercial", this);
		DNI = new StringExpression("DNI", this);
		nombre = new StringExpression("nombre", this);
		apellido1 = new StringExpression("apellido1", this);
		apellido2 = new StringExpression("apellido2", this);
		domicilio = new StringExpression("domicilio", this);
		email = new StringExpression("email", this);
		password = new StringExpression("password", this);
		tramita = new CollectionExpression("ORM_tramita", this);
	}
	
	public ComercialCriteria(PersistentSession session) {
		this(session.createCriteria(Comercial.class));
	}
	
	public ComercialCriteria() throws PersistentException {
		this(diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession());
	}
	
	public diagrama_bd.base_de_datos.IncidenciaCriteria createTramitaCriteria() {
		return new diagrama_bd.base_de_datos.IncidenciaCriteria(createCriteria("ORM_tramita"));
	}
	
	public Comercial uniqueComercial() {
		return (Comercial) super.uniqueResult();
	}
	
	public Comercial[] listComercial() {
		java.util.List list = super.list();
		return (Comercial[]) list.toArray(new Comercial[list.size()]);
	}
}

