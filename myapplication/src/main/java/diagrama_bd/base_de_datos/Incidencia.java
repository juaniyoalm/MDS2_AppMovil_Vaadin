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
@Table(name="Incidencia")
public class Incidencia implements Serializable {
	public Incidencia() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == diagrama_bd.base_de_datos.ORMConstants.KEY_INCIDENCIA_TRAMITADA_POR) {
			this.tramitada_por = (diagrama_bd.base_de_datos.Comercial) owner;
		}
		
		else if (key == diagrama_bd.base_de_datos.ORMConstants.KEY_INCIDENCIA_RECLAMADA_POR) {
			this.reclamada_por = (diagrama_bd.base_de_datos.Cliente) owner;
		}
		
		else if (key == diagrama_bd.base_de_datos.ORMConstants.KEY_INCIDENCIA_DE_TIPO) {
			this.de_tipo = (diagrama_bd.base_de_datos.TipoIncidencia) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="NIncidencia", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DIAGRAMA_BD_BASE_DE_DATOS_INCIDENCIA_NINCIDENCIA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DIAGRAMA_BD_BASE_DE_DATOS_INCIDENCIA_NINCIDENCIA_GENERATOR", strategy="native")	
	private int nIncidencia;
	
	@ManyToOne(targetEntity=diagrama_bd.base_de_datos.TipoIncidencia.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="TipoIncidenciaNTipoIncidencia", referencedColumnName="NTipoIncidencia") })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private diagrama_bd.base_de_datos.TipoIncidencia de_tipo;
	
	@ManyToOne(targetEntity=diagrama_bd.base_de_datos.Cliente.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ClienteNCliente", referencedColumnName="NCliente") })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private diagrama_bd.base_de_datos.Cliente reclamada_por;
	
	@ManyToOne(targetEntity=diagrama_bd.base_de_datos.Comercial.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ComercialNComercial", referencedColumnName="NComercial") })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private diagrama_bd.base_de_datos.Comercial tramitada_por;
	
	@Column(name="DetalleIncidencia", nullable=true, length=255)	
	private String detalleIncidencia;
	
	@Column(name="Telefono", nullable=true, length=255)	
	private String telefono;
	
	@Column(name="DNI", nullable=true, length=255)	
	private String DNI;
	
	@Column(name="Estado", nullable=false, length=1)	
	private boolean estado;
	
	private void setnIncidencia(int value) {
		this.nIncidencia = value;
	}
	
	public int getnIncidencia() {
		return nIncidencia;
	}
	
	public int getORMID() {
		return getnIncidencia();
	}
	
	public void setDetalleIncidencia(String value) {
		this.detalleIncidencia = value;
	}
	
	public String getDetalleIncidencia() {
		return detalleIncidencia;
	}
	
	public void setTelefono(String value) {
		this.telefono = value;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setDNI(String value) {
		this.DNI = value;
	}
	
	public String getDNI() {
		return DNI;
	}
	
	public void setEstado(boolean value) {
		this.estado = value;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void setTramitada_por(diagrama_bd.base_de_datos.Comercial value) {
		if (tramitada_por != null) {
			tramitada_por.tramita.remove(this);
		}
		if (value != null) {
			value.tramita.add(this);
		}
	}
	
	public diagrama_bd.base_de_datos.Comercial getTramitada_por() {
		return tramitada_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tramitada_por(diagrama_bd.base_de_datos.Comercial value) {
		this.tramitada_por = value;
	}
	
	private diagrama_bd.base_de_datos.Comercial getORM_Tramitada_por() {
		return tramitada_por;
	}
	
	public void setReclamada_por(diagrama_bd.base_de_datos.Cliente value) {
		if (reclamada_por != null) {
			reclamada_por.reclama.remove(this);
		}
		if (value != null) {
			value.reclama.add(this);
		}
	}
	
	public diagrama_bd.base_de_datos.Cliente getReclamada_por() {
		return reclamada_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Reclamada_por(diagrama_bd.base_de_datos.Cliente value) {
		this.reclamada_por = value;
	}
	
	private diagrama_bd.base_de_datos.Cliente getORM_Reclamada_por() {
		return reclamada_por;
	}
	
	public void setDe_tipo(diagrama_bd.base_de_datos.TipoIncidencia value) {
		if (de_tipo != null) {
			de_tipo.clasifica_a.remove(this);
		}
		if (value != null) {
			value.clasifica_a.add(this);
		}
	}
	
	public diagrama_bd.base_de_datos.TipoIncidencia getDe_tipo() {
		return de_tipo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_De_tipo(diagrama_bd.base_de_datos.TipoIncidencia value) {
		this.de_tipo = value;
	}
	
	private diagrama_bd.base_de_datos.TipoIncidencia getORM_De_tipo() {
		return de_tipo;
	}
	
	public String toString() {
		return String.valueOf(getnIncidencia());
	}
	
}
