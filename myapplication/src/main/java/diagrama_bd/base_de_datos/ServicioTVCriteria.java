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

public class ServicioTVCriteria extends AbstractORMCriteria {
	public final StringExpression nServicio;
	public final IntegerExpression generaId;
	public final AssociationExpression genera;
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final FloatExpression precio;
	public final StringExpression caracteristicas;
	public final BooleanExpression visible;
	public final CollectionExpression utilizado_por;
	public final IntegerExpression nServicioTV;
	public final CollectionExpression es_parte;
	public final CollectionExpression compuesto_por;
	
	public ServicioTVCriteria(Criteria criteria) {
		super(criteria);
		nServicio = new StringExpression("nServicio", this);
		generaId = new IntegerExpression("genera.nFactura", this);
		genera = new AssociationExpression("genera", this);
		ID = new IntegerExpression("ID", this);
		nombre = new StringExpression("nombre", this);
		precio = new FloatExpression("precio", this);
		caracteristicas = new StringExpression("caracteristicas", this);
		visible = new BooleanExpression("visible", this);
		utilizado_por = new CollectionExpression("ORM_utilizado_por", this);
		nServicioTV = new IntegerExpression("nServicioTV", this);
		es_parte = new CollectionExpression("ORM_es_parte", this);
		compuesto_por = new CollectionExpression("ORM_compuesto_por", this);
	}
	
	public ServicioTVCriteria(PersistentSession session) {
		this(session.createCriteria(ServicioTV.class));
	}
	
	public ServicioTVCriteria() throws PersistentException {
		this(diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession());
	}
	
	public diagrama_bd.base_de_datos.ServiciosCombiCriteria createEs_parteCriteria() {
		return new diagrama_bd.base_de_datos.ServiciosCombiCriteria(createCriteria("ORM_es_parte"));
	}
	
	public diagrama_bd.base_de_datos.CanalCriteria createCompuesto_porCriteria() {
		return new diagrama_bd.base_de_datos.CanalCriteria(createCriteria("ORM_compuesto_por"));
	}
	
	public FacturaCriteria createGeneraCriteria() {
		return new FacturaCriteria(createCriteria("genera"));
	}
	
	public diagrama_bd.base_de_datos.ClienteCriteria createUtilizado_porCriteria() {
		return new diagrama_bd.base_de_datos.ClienteCriteria(createCriteria("ORM_utilizado_por"));
	}
	
	public ServicioTV uniqueServicioTV() {
		return (ServicioTV) super.uniqueResult();
	}
	
	public ServicioTV[] listServicioTV() {
		java.util.List list = super.list();
		return (ServicioTV[]) list.toArray(new ServicioTV[list.size()]);
	}
}

