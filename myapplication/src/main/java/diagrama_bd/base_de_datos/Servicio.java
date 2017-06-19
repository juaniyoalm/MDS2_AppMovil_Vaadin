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
@Table(name="Servicio")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Discriminator", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("Servicio")
public class Servicio implements Serializable {
	public Servicio() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Servicio))
			return false;
		Servicio servicio = (Servicio)aObj;
		if ((getnServicio() != null && !getnServicio().equals(servicio.getnServicio())) || (getnServicio() == null && servicio.getnServicio() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getnServicio() == null ? 0 : getnServicio().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == diagrama_bd.base_de_datos.ORMConstants.KEY_SERVICIO_UTILIZADO_POR) {
			return ORM_utilizado_por;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == diagrama_bd.base_de_datos.ORMConstants.KEY_SERVICIO_GENERA) {
			this.genera = (diagrama_bd.base_de_datos.Factura) owner;
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
	
	@Column(name="NServicio", nullable=false, length=255)	
	@Id	
	private String nServicio;
	
	@ManyToOne(targetEntity=diagrama_bd.base_de_datos.Factura.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="FacturaNFactura", referencedColumnName="NFactura") })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private diagrama_bd.base_de_datos.Factura genera;
	
	@Column(name="ID", nullable=false, length=10)	
	private int ID;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Precio", nullable=true)	
	private Float precio;
	
	@Column(name="Caracteristicas", nullable=true, length=255)	
	private String caracteristicas;
	
	@Column(name="Visible", nullable=true, length=1)	
	private Boolean visible;
	
	@ManyToMany(mappedBy="ORM_abonado_a", targetEntity=diagrama_bd.base_de_datos.Cliente.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_utilizado_por = new java.util.HashSet();
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setnServicio(String value) {
		this.nServicio = value;
	}
	
	public String getnServicio() {
		return nServicio;
	}
	
	public String getORMID() {
		return getnServicio();
	}
	
	public void setPrecio(float value) {
		setPrecio(new Float(value));
	}
	
	public void setPrecio(Float value) {
		this.precio = value;
	}
	
	public Float getPrecio() {
		return precio;
	}
	
	public void setCaracteristicas(String value) {
		this.caracteristicas = value;
	}
	
	public String getCaracteristicas() {
		return caracteristicas;
	}
	
	public void setVisible(boolean value) {
		setVisible(new Boolean(value));
	}
	
	public void setVisible(Boolean value) {
		this.visible = value;
	}
	
	public Boolean getVisible() {
		return visible;
	}
	
	private void setORM_Utilizado_por(java.util.Set value) {
		this.ORM_utilizado_por = value;
	}
	
	private java.util.Set getORM_Utilizado_por() {
		return ORM_utilizado_por;
	}
	
	@Transient	
	public final diagrama_bd.base_de_datos.ClienteSetCollection utilizado_por = new diagrama_bd.base_de_datos.ClienteSetCollection(this, _ormAdapter, diagrama_bd.base_de_datos.ORMConstants.KEY_SERVICIO_UTILIZADO_POR, diagrama_bd.base_de_datos.ORMConstants.KEY_CLIENTE_ABONADO_A, diagrama_bd.base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setGenera(diagrama_bd.base_de_datos.Factura value) {
		if (genera != null) {
			genera.corresponde_a.remove(this);
		}
		if (value != null) {
			value.corresponde_a.add(this);
		}
	}
	
	public diagrama_bd.base_de_datos.Factura getGenera() {
		return genera;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Genera(diagrama_bd.base_de_datos.Factura value) {
		this.genera = value;
	}
	
	private diagrama_bd.base_de_datos.Factura getORM_Genera() {
		return genera;
	}
	
	public String toString() {
		return String.valueOf(getnServicio());
	}
	
}
