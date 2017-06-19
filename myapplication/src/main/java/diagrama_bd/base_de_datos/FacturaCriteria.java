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

public class FacturaCriteria extends AbstractORMCriteria {
	public final IntegerExpression nFactura;
	public final DateExpression fechaEmision;
	public final FloatExpression importe;
	public final CollectionExpression corresponde_a;
	
	public FacturaCriteria(Criteria criteria) {
		super(criteria);
		nFactura = new IntegerExpression("nFactura", this);
		fechaEmision = new DateExpression("fechaEmision", this);
		importe = new FloatExpression("importe", this);
		corresponde_a = new CollectionExpression("ORM_corresponde_a", this);
	}
	
	public FacturaCriteria(PersistentSession session) {
		this(session.createCriteria(Factura.class));
	}
	
	public FacturaCriteria() throws PersistentException {
		this(diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession());
	}
	
	public diagrama_bd.base_de_datos.ServicioCriteria createCorresponde_aCriteria() {
		return new diagrama_bd.base_de_datos.ServicioCriteria(createCriteria("ORM_corresponde_a"));
	}
	
	public Factura uniqueFactura() {
		return (Factura) super.uniqueResult();
	}
	
	public Factura[] listFactura() {
		java.util.List list = super.list();
		return (Factura[]) list.toArray(new Factura[list.size()]);
	}
}

