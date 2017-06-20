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

public class FacturaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression nFactura;
	public final IntegerExpression clienteId;
	public final AssociationExpression cliente;
	public final StringExpression corresponde_aId;
	public final AssociationExpression corresponde_a;
	public final DateExpression fechaEmision;
	public final FloatExpression importe;
	
	public FacturaDetachedCriteria() {
		super(diagrama_bd.base_de_datos.Factura.class, diagrama_bd.base_de_datos.FacturaCriteria.class);
		nFactura = new IntegerExpression("nFactura", this.getDetachedCriteria());
		clienteId = new IntegerExpression("cliente.nCliente", this.getDetachedCriteria());
		cliente = new AssociationExpression("cliente", this.getDetachedCriteria());
		corresponde_aId = new StringExpression("corresponde_a.nServicio", this.getDetachedCriteria());
		corresponde_a = new AssociationExpression("corresponde_a", this.getDetachedCriteria());
		fechaEmision = new DateExpression("fechaEmision", this.getDetachedCriteria());
		importe = new FloatExpression("importe", this.getDetachedCriteria());
	}
	
	public FacturaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, diagrama_bd.base_de_datos.FacturaCriteria.class);
		nFactura = new IntegerExpression("nFactura", this.getDetachedCriteria());
		clienteId = new IntegerExpression("cliente.nCliente", this.getDetachedCriteria());
		cliente = new AssociationExpression("cliente", this.getDetachedCriteria());
		corresponde_aId = new StringExpression("corresponde_a.nServicio", this.getDetachedCriteria());
		corresponde_a = new AssociationExpression("corresponde_a", this.getDetachedCriteria());
		fechaEmision = new DateExpression("fechaEmision", this.getDetachedCriteria());
		importe = new FloatExpression("importe", this.getDetachedCriteria());
	}
	
	public diagrama_bd.base_de_datos.ClienteDetachedCriteria createClienteCriteria() {
		return new diagrama_bd.base_de_datos.ClienteDetachedCriteria(createCriteria("cliente"));
	}
	
	public diagrama_bd.base_de_datos.ServicioDetachedCriteria createCorresponde_aCriteria() {
		return new diagrama_bd.base_de_datos.ServicioDetachedCriteria(createCriteria("corresponde_a"));
	}
	
	public Factura uniqueFactura(PersistentSession session) {
		return (Factura) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Factura[] listFactura(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Factura[]) list.toArray(new Factura[list.size()]);
	}
}

