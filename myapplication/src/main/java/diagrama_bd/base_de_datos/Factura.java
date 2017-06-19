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
@Table(name="Factura")
public class Factura implements Serializable {
	public Factura() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == diagrama_bd.base_de_datos.ORMConstants.KEY_FACTURA_CORRESPONDE_A) {
			return ORM_corresponde_a;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="NFactura", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DIAGRAMA_BD_BASE_DE_DATOS_FACTURA_NFACTURA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DIAGRAMA_BD_BASE_DE_DATOS_FACTURA_NFACTURA_GENERATOR", strategy="native")	
	private int nFactura;
	
	@Column(name="FechaEmision", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fechaEmision;
	
	@Column(name="Importe", nullable=true)	
	private Float importe;
	
	@OneToMany(mappedBy="genera", targetEntity=diagrama_bd.base_de_datos.Servicio.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_corresponde_a = new java.util.HashSet();
	
	private void setnFactura(int value) {
		this.nFactura = value;
	}
	
	public int getnFactura() {
		return nFactura;
	}
	
	public int getORMID() {
		return getnFactura();
	}
	
	public void setFechaEmision(java.util.Date value) {
		this.fechaEmision = value;
	}
	
	public java.util.Date getFechaEmision() {
		return fechaEmision;
	}
	
	public void setImporte(float value) {
		setImporte(new Float(value));
	}
	
	public void setImporte(Float value) {
		this.importe = value;
	}
	
	public Float getImporte() {
		return importe;
	}
	
	private void setORM_Corresponde_a(java.util.Set value) {
		this.ORM_corresponde_a = value;
	}
	
	private java.util.Set getORM_Corresponde_a() {
		return ORM_corresponde_a;
	}
	
	@Transient	
	public final diagrama_bd.base_de_datos.ServicioSetCollection corresponde_a = new diagrama_bd.base_de_datos.ServicioSetCollection(this, _ormAdapter, diagrama_bd.base_de_datos.ORMConstants.KEY_FACTURA_CORRESPONDE_A, diagrama_bd.base_de_datos.ORMConstants.KEY_SERVICIO_GENERA, diagrama_bd.base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getnFactura());
	}
	
}
