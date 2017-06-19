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
@Table(name="Canal")
public class Canal implements Serializable {
	public Canal() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Canal))
			return false;
		Canal canal = (Canal)aObj;
		if ((getnCanal() != null && !getnCanal().equals(canal.getnCanal())) || (getnCanal() == null && canal.getnCanal() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getnCanal() == null ? 0 : getnCanal().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == diagrama_bd.base_de_datos.ORMConstants.KEY_CANAL_ES_PARTE) {
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
	
	@Column(name="NCanal", nullable=false, length=255)	
	@Id	
	private String nCanal;
	
	@Column(name="ID", nullable=false, length=10)	
	private int ID;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Categoria", nullable=true, length=255)	
	private String categoria;
	
	@Column(name="RutaIcono", nullable=true, length=255)	
	private String rutaIcono;
	
	@ManyToMany(targetEntity=diagrama_bd.base_de_datos.ServicioTV.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Servicio_Canal", joinColumns={ @JoinColumn(name="CanalNCanal") }, inverseJoinColumns={ @JoinColumn(name="ServicioNServicio") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_parte = new java.util.HashSet();
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setnCanal(String value) {
		this.nCanal = value;
	}
	
	public String getnCanal() {
		return nCanal;
	}
	
	public String getORMID() {
		return getnCanal();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setCategoria(String value) {
		this.categoria = value;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setRutaIcono(String value) {
		this.rutaIcono = value;
	}
	
	public String getRutaIcono() {
		return rutaIcono;
	}
	
	private void setORM_Es_parte(java.util.Set value) {
		this.ORM_es_parte = value;
	}
	
	private java.util.Set getORM_Es_parte() {
		return ORM_es_parte;
	}
	
	@Transient	
	public final diagrama_bd.base_de_datos.ServicioTVSetCollection es_parte = new diagrama_bd.base_de_datos.ServicioTVSetCollection(this, _ormAdapter, diagrama_bd.base_de_datos.ORMConstants.KEY_CANAL_ES_PARTE, diagrama_bd.base_de_datos.ORMConstants.KEY_SERVICIOTV_COMPUESTO_POR, diagrama_bd.base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getnCanal());
	}
	
}
