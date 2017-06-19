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

public class ClienteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression nCliente;
	public final IntegerExpression DNI;
	public final StringExpression nombre;
	public final StringExpression apellido1;
	public final StringExpression apellido2;
	public final StringExpression domicilio;
	public final StringExpression email;
	public final StringExpression IBAN;
	public final StringExpression password;
	public final CollectionExpression abonado_a;
	public final CollectionExpression reclama;
	public final CollectionExpression terminales;
	
	public ClienteDetachedCriteria() {
		super(diagrama_bd.base_de_datos.Cliente.class, diagrama_bd.base_de_datos.ClienteCriteria.class);
		nCliente = new IntegerExpression("nCliente", this.getDetachedCriteria());
		DNI = new IntegerExpression("DNI", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido1 = new StringExpression("apellido1", this.getDetachedCriteria());
		apellido2 = new StringExpression("apellido2", this.getDetachedCriteria());
		domicilio = new StringExpression("domicilio", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		IBAN = new StringExpression("IBAN", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		abonado_a = new CollectionExpression("ORM_abonado_a", this.getDetachedCriteria());
		reclama = new CollectionExpression("ORM_reclama", this.getDetachedCriteria());
		terminales = new CollectionExpression("ORM_terminales", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, diagrama_bd.base_de_datos.ClienteCriteria.class);
		nCliente = new IntegerExpression("nCliente", this.getDetachedCriteria());
		DNI = new IntegerExpression("DNI", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido1 = new StringExpression("apellido1", this.getDetachedCriteria());
		apellido2 = new StringExpression("apellido2", this.getDetachedCriteria());
		domicilio = new StringExpression("domicilio", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		IBAN = new StringExpression("IBAN", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		abonado_a = new CollectionExpression("ORM_abonado_a", this.getDetachedCriteria());
		reclama = new CollectionExpression("ORM_reclama", this.getDetachedCriteria());
		terminales = new CollectionExpression("ORM_terminales", this.getDetachedCriteria());
	}
	
	public diagrama_bd.base_de_datos.ServicioDetachedCriteria createAbonado_aCriteria() {
		return new diagrama_bd.base_de_datos.ServicioDetachedCriteria(createCriteria("ORM_abonado_a"));
	}
	
	public diagrama_bd.base_de_datos.IncidenciaDetachedCriteria createReclamaCriteria() {
		return new diagrama_bd.base_de_datos.IncidenciaDetachedCriteria(createCriteria("ORM_reclama"));
	}
	
	public diagrama_bd.base_de_datos.TerminalesDetachedCriteria createTerminalesCriteria() {
		return new diagrama_bd.base_de_datos.TerminalesDetachedCriteria(createCriteria("ORM_terminales"));
	}
	
	public Cliente uniqueCliente(PersistentSession session) {
		return (Cliente) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cliente[] listCliente(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cliente[]) list.toArray(new Cliente[list.size()]);
	}
}

