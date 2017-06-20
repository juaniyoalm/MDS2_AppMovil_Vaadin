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
	
	private void this_setOwner(Object owner, int key) {
		if (key == diagrama_bd.base_de_datos.ORMConstants.KEY_FACTURA_CORRESPONDE_A) {
			this.corresponde_a = (diagrama_bd.base_de_datos.Servicio) owner;
		}
		
		else if (key == diagrama_bd.base_de_datos.ORMConstants.KEY_FACTURA_CLIENTE) {
			this.cliente = (diagrama_bd.base_de_datos.Cliente) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="NFactura", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DIAGRAMA_BD_BASE_DE_DATOS_FACTURA_NFACTURA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DIAGRAMA_BD_BASE_DE_DATOS_FACTURA_NFACTURA_GENERATOR", strategy="native")	
	private int nFactura;
	
	@ManyToOne(targetEntity=diagrama_bd.base_de_datos.Cliente.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ClienteNCliente", referencedColumnName="NCliente", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private diagrama_bd.base_de_datos.Cliente cliente;
	
	@ManyToOne(targetEntity=diagrama_bd.base_de_datos.Servicio.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ServicioNServicio", referencedColumnName="NServicio", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private diagrama_bd.base_de_datos.Servicio corresponde_a;
	
	@Column(name="FechaEmision", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fechaEmision;
	
	@Column(name="Importe", nullable=true)	
	private Float importe;
	
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
	
	public void setCorresponde_a(diagrama_bd.base_de_datos.Servicio value) {
		if (corresponde_a != null) {
			corresponde_a.genera.remove(this);
		}
		if (value != null) {
			value.genera.add(this);
		}
	}
	
	public diagrama_bd.base_de_datos.Servicio getCorresponde_a() {
		return corresponde_a;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Corresponde_a(diagrama_bd.base_de_datos.Servicio value) {
		this.corresponde_a = value;
	}
	
	private diagrama_bd.base_de_datos.Servicio getORM_Corresponde_a() {
		return corresponde_a;
	}
	
	public void setCliente(diagrama_bd.base_de_datos.Cliente value) {
		if (cliente != null) {
			cliente.factura.remove(this);
		}
		if (value != null) {
			value.factura.add(this);
		}
	}
	
	public diagrama_bd.base_de_datos.Cliente getCliente() {
		return cliente;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Cliente(diagrama_bd.base_de_datos.Cliente value) {
		this.cliente = value;
	}
	
	private diagrama_bd.base_de_datos.Cliente getORM_Cliente() {
		return cliente;
	}
	
	public String toString() {
		return String.valueOf(getnFactura());
	}
	
}
