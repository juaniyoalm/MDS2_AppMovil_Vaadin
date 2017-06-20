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

public class ServiciosFFMCriteria extends AbstractORMCriteria {
	public final StringExpression nServicio;
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final FloatExpression precio;
	public final StringExpression caracteristicas;
	public final BooleanExpression visible;
	public final CollectionExpression utilizado_por;
	public final CollectionExpression genera;
	public final IntegerExpression nServFFM;
	public final CollectionExpression es_parte;
	
	public ServiciosFFMCriteria(Criteria criteria) {
		super(criteria);
		nServicio = new StringExpression("nServicio", this);
		ID = new IntegerExpression("ID", this);
		nombre = new StringExpression("nombre", this);
		precio = new FloatExpression("precio", this);
		caracteristicas = new StringExpression("caracteristicas", this);
		visible = new BooleanExpression("visible", this);
		utilizado_por = new CollectionExpression("ORM_utilizado_por", this);
		genera = new CollectionExpression("ORM_genera", this);
		nServFFM = new IntegerExpression("nServFFM", this);
		es_parte = new CollectionExpression("ORM_es_parte", this);
	}
	
	public ServiciosFFMCriteria(PersistentSession session) {
		this(session.createCriteria(ServiciosFFM.class));
	}
	
	public ServiciosFFMCriteria() throws PersistentException {
		this(diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession());
	}
	
	public diagrama_bd.base_de_datos.ServiciosCombiCriteria createEs_parteCriteria() {
		return new diagrama_bd.base_de_datos.ServiciosCombiCriteria(createCriteria("ORM_es_parte"));
	}
	
	public diagrama_bd.base_de_datos.ClienteCriteria createUtilizado_porCriteria() {
		return new diagrama_bd.base_de_datos.ClienteCriteria(createCriteria("ORM_utilizado_por"));
	}
	
	public diagrama_bd.base_de_datos.FacturaCriteria createGeneraCriteria() {
		return new diagrama_bd.base_de_datos.FacturaCriteria(createCriteria("ORM_genera"));
	}
	
	public ServiciosFFM uniqueServiciosFFM() {
		return (ServiciosFFM) super.uniqueResult();
	}
	
	public ServiciosFFM[] listServiciosFFM() {
		java.util.List list = super.list();
		return (ServiciosFFM[]) list.toArray(new ServiciosFFM[list.size()]);
	}
}

