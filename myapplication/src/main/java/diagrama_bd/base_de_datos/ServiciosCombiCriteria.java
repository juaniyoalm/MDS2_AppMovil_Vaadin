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

public class ServiciosCombiCriteria extends AbstractORMCriteria {
	public final StringExpression nServicio;
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final FloatExpression precio;
	public final StringExpression caracteristicas;
	public final BooleanExpression visible;
	public final CollectionExpression utilizado_por;
	public final CollectionExpression genera;
	public final CollectionExpression ofreceFFM;
	public final IntegerExpression nServCombi;
	public final StringExpression ofreceTVId;
	public final AssociationExpression ofreceTV;
	
	public ServiciosCombiCriteria(Criteria criteria) {
		super(criteria);
		nServicio = new StringExpression("nServicio", this);
		ID = new IntegerExpression("ID", this);
		nombre = new StringExpression("nombre", this);
		precio = new FloatExpression("precio", this);
		caracteristicas = new StringExpression("caracteristicas", this);
		visible = new BooleanExpression("visible", this);
		utilizado_por = new CollectionExpression("ORM_utilizado_por", this);
		genera = new CollectionExpression("ORM_genera", this);
		ofreceFFM = new CollectionExpression("ORM_ofreceFFM", this);
		nServCombi = new IntegerExpression("nServCombi", this);
		ofreceTVId = new StringExpression("ofreceTV.nServicio", this);
		ofreceTV = new AssociationExpression("ofreceTV", this);
	}
	
	public ServiciosCombiCriteria(PersistentSession session) {
		this(session.createCriteria(ServiciosCombi.class));
	}
	
	public ServiciosCombiCriteria() throws PersistentException {
		this(diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession());
	}
	
	public diagrama_bd.base_de_datos.ServiciosFFMCriteria createOfreceFFMCriteria() {
		return new diagrama_bd.base_de_datos.ServiciosFFMCriteria(createCriteria("ORM_ofreceFFM"));
	}
	
	public ServicioTVCriteria createOfreceTVCriteria() {
		return new ServicioTVCriteria(createCriteria("ofreceTV"));
	}
	
	public diagrama_bd.base_de_datos.ClienteCriteria createUtilizado_porCriteria() {
		return new diagrama_bd.base_de_datos.ClienteCriteria(createCriteria("ORM_utilizado_por"));
	}
	
	public diagrama_bd.base_de_datos.FacturaCriteria createGeneraCriteria() {
		return new diagrama_bd.base_de_datos.FacturaCriteria(createCriteria("ORM_genera"));
	}
	
	public ServiciosCombi uniqueServiciosCombi() {
		return (ServiciosCombi) super.uniqueResult();
	}
	
	public ServiciosCombi[] listServiciosCombi() {
		java.util.List list = super.list();
		return (ServiciosCombi[]) list.toArray(new ServiciosCombi[list.size()]);
	}
}

