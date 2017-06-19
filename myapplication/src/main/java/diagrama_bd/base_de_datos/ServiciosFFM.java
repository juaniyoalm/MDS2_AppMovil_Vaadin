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
@DiscriminatorValue("ServiciosFFM")
public class ServiciosFFM extends diagrama_bd.base_de_datos.Servicio implements Serializable {
	public ServiciosFFM() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == diagrama_bd.base_de_datos.ORMConstants.KEY_SERVICIOSFFM_ES_PARTE) {
			return ORM_es_parte;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="NServFFM", nullable=true, length=10)	
	private int nServFFM;
	
	@ManyToMany(mappedBy="ORM_ofreceFFM", targetEntity=diagrama_bd.base_de_datos.ServiciosCombi.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_parte = new java.util.HashSet();
	
	public void setnServFFM(int value) {
		this.nServFFM = value;
	}
	
	public int getnServFFM() {
		return nServFFM;
	}
	
	private void setORM_Es_parte(java.util.Set value) {
		this.ORM_es_parte = value;
	}
	
	private java.util.Set getORM_Es_parte() {
		return ORM_es_parte;
	}
	
	@Transient	
	public final diagrama_bd.base_de_datos.ServiciosCombiSetCollection es_parte = new diagrama_bd.base_de_datos.ServiciosCombiSetCollection(this, _ormAdapter, diagrama_bd.base_de_datos.ORMConstants.KEY_SERVICIOSFFM_ES_PARTE, diagrama_bd.base_de_datos.ORMConstants.KEY_SERVICIOSCOMBI_OFRECEFFM, diagrama_bd.base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
