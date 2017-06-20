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
	public final IntegerExpression clienteId;
	public final AssociationExpression cliente;
	public final StringExpression corresponde_aId;
	public final AssociationExpression corresponde_a;
	public final DateExpression fechaEmision;
	public final FloatExpression importe;
	
	public FacturaCriteria(Criteria criteria) {
		super(criteria);
		nFactura = new IntegerExpression("nFactura", this);
		clienteId = new IntegerExpression("cliente.nCliente", this);
		cliente = new AssociationExpression("cliente", this);
		corresponde_aId = new StringExpression("corresponde_a.nServicio", this);
		corresponde_a = new AssociationExpression("corresponde_a", this);
		fechaEmision = new DateExpression("fechaEmision", this);
		importe = new FloatExpression("importe", this);
	}
	
	public FacturaCriteria(PersistentSession session) {
		this(session.createCriteria(Factura.class));
	}
	
	public FacturaCriteria() throws PersistentException {
		this(diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession());
	}
	
	public ClienteCriteria createClienteCriteria() {
		return new ClienteCriteria(createCriteria("cliente"));
	}
	
	public ServicioCriteria createCorresponde_aCriteria() {
		return new ServicioCriteria(createCriteria("corresponde_a"));
	}
	
	public Factura uniqueFactura() {
		return (Factura) super.uniqueResult();
	}
	
	public Factura[] listFactura() {
		java.util.List list = super.list();
		return (Factura[]) list.toArray(new Factura[list.size()]);
	}
}

