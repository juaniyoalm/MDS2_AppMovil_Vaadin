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

public class ServiciosCombiDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public ServiciosCombiDetachedCriteria() {
		super(diagrama_bd.base_de_datos.ServiciosCombi.class, diagrama_bd.base_de_datos.ServiciosCombiCriteria.class);
		nServicio = new StringExpression("nServicio", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		precio = new FloatExpression("precio", this.getDetachedCriteria());
		caracteristicas = new StringExpression("caracteristicas", this.getDetachedCriteria());
		visible = new BooleanExpression("visible", this.getDetachedCriteria());
		utilizado_por = new CollectionExpression("ORM_utilizado_por", this.getDetachedCriteria());
		genera = new CollectionExpression("ORM_genera", this.getDetachedCriteria());
		ofreceFFM = new CollectionExpression("ORM_ofreceFFM", this.getDetachedCriteria());
		nServCombi = new IntegerExpression("nServCombi", this.getDetachedCriteria());
		ofreceTVId = new StringExpression("ofreceTV.nServicio", this.getDetachedCriteria());
		ofreceTV = new AssociationExpression("ofreceTV", this.getDetachedCriteria());
	}
	
	public ServiciosCombiDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, diagrama_bd.base_de_datos.ServiciosCombiCriteria.class);
		nServicio = new StringExpression("nServicio", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		precio = new FloatExpression("precio", this.getDetachedCriteria());
		caracteristicas = new StringExpression("caracteristicas", this.getDetachedCriteria());
		visible = new BooleanExpression("visible", this.getDetachedCriteria());
		utilizado_por = new CollectionExpression("ORM_utilizado_por", this.getDetachedCriteria());
		genera = new CollectionExpression("ORM_genera", this.getDetachedCriteria());
		ofreceFFM = new CollectionExpression("ORM_ofreceFFM", this.getDetachedCriteria());
		nServCombi = new IntegerExpression("nServCombi", this.getDetachedCriteria());
		ofreceTVId = new StringExpression("ofreceTV.nServicio", this.getDetachedCriteria());
		ofreceTV = new AssociationExpression("ofreceTV", this.getDetachedCriteria());
	}
	
	public diagrama_bd.base_de_datos.ServiciosFFMDetachedCriteria createOfreceFFMCriteria() {
		return new diagrama_bd.base_de_datos.ServiciosFFMDetachedCriteria(createCriteria("ORM_ofreceFFM"));
	}
	
	public diagrama_bd.base_de_datos.ServicioTVDetachedCriteria createOfreceTVCriteria() {
		return new diagrama_bd.base_de_datos.ServicioTVDetachedCriteria(createCriteria("ofreceTV"));
	}
	
	public diagrama_bd.base_de_datos.ClienteDetachedCriteria createUtilizado_porCriteria() {
		return new diagrama_bd.base_de_datos.ClienteDetachedCriteria(createCriteria("ORM_utilizado_por"));
	}
	
	public diagrama_bd.base_de_datos.FacturaDetachedCriteria createGeneraCriteria() {
		return new diagrama_bd.base_de_datos.FacturaDetachedCriteria(createCriteria("ORM_genera"));
	}
	
	public ServiciosCombi uniqueServiciosCombi(PersistentSession session) {
		return (ServiciosCombi) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ServiciosCombi[] listServiciosCombi(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ServiciosCombi[]) list.toArray(new ServiciosCombi[list.size()]);
	}
}

