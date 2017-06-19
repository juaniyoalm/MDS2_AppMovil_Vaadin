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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("ServiciosCombi")
public class ServiciosCombi extends diagrama_bd.base_de_datos.Servicio implements Serializable {
	public ServiciosCombi() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == diagrama_bd.base_de_datos.ORMConstants.KEY_SERVICIOSCOMBI_OFRECEFFM) {
			return ORM_ofreceFFM;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == diagrama_bd.base_de_datos.ORMConstants.KEY_SERVICIOSCOMBI_OFRECETV) {
			this.ofreceTV = (diagrama_bd.base_de_datos.ServicioTV) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@ManyToMany(targetEntity=diagrama_bd.base_de_datos.ServiciosFFM.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Servicio_Servicio", joinColumns={ @JoinColumn(name="ServicioNServicio2") }, inverseJoinColumns={ @JoinColumn(name="ServicioNServicio") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_ofreceFFM = new java.util.HashSet();
	
	@Column(name="NServCombi", nullable=true, length=10)	
	private int nServCombi;
	
	@ManyToOne(targetEntity=diagrama_bd.base_de_datos.ServicioTV.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ServicioNServicio", referencedColumnName="NServicio") })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private diagrama_bd.base_de_datos.ServicioTV ofreceTV;
	
	public void setnServCombi(int value) {
		this.nServCombi = value;
	}
	
	public int getnServCombi() {
		return nServCombi;
	}
	
	private void setORM_OfreceFFM(java.util.Set value) {
		this.ORM_ofreceFFM = value;
	}
	
	private java.util.Set getORM_OfreceFFM() {
		return ORM_ofreceFFM;
	}
	
	@Transient	
	public final diagrama_bd.base_de_datos.ServiciosFFMSetCollection ofreceFFM = new diagrama_bd.base_de_datos.ServiciosFFMSetCollection(this, _ormAdapter, diagrama_bd.base_de_datos.ORMConstants.KEY_SERVICIOSCOMBI_OFRECEFFM, diagrama_bd.base_de_datos.ORMConstants.KEY_SERVICIOSFFM_ES_PARTE, diagrama_bd.base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setOfreceTV(diagrama_bd.base_de_datos.ServicioTV value) {
		if (ofreceTV != null) {
			ofreceTV.es_parte.remove(this);
		}
		if (value != null) {
			value.es_parte.add(this);
		}
	}
	
	public diagrama_bd.base_de_datos.ServicioTV getOfreceTV() {
		return ofreceTV;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_OfreceTV(diagrama_bd.base_de_datos.ServicioTV value) {
		this.ofreceTV = value;
	}
	
	private diagrama_bd.base_de_datos.ServicioTV getORM_OfreceTV() {
		return ofreceTV;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
