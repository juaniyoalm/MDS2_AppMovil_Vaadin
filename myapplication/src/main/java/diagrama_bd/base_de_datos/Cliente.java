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
@Table(name="Cliente")
public class Cliente implements Serializable {
	public Cliente() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == diagrama_bd.base_de_datos.ORMConstants.KEY_CLIENTE_ABONADO_A) {
			return ORM_abonado_a;
		}
		else if (key == diagrama_bd.base_de_datos.ORMConstants.KEY_CLIENTE_RECLAMA) {
			return ORM_reclama;
		}
		else if (key == diagrama_bd.base_de_datos.ORMConstants.KEY_CLIENTE_TERMINALES) {
			return ORM_terminales;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="NCliente", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DIAGRAMA_BD_BASE_DE_DATOS_CLIENTE_NCLIENTE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DIAGRAMA_BD_BASE_DE_DATOS_CLIENTE_NCLIENTE_GENERATOR", strategy="native")	
	private int nCliente;
	
	@Column(name="DNI", nullable=false, length=10)	
	private int DNI;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Apellido1", nullable=true, length=255)	
	private String apellido1;
	
	@Column(name="Apellido2", nullable=true, length=255)	
	private String apellido2;
	
	@Column(name="Domicilio", nullable=true, length=255)	
	private String domicilio;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="IBAN", nullable=true, length=255)	
	private String IBAN;
	
	@Column(name="Password", nullable=true, length=255)	
	private String password;
	
	@ManyToMany(targetEntity=diagrama_bd.base_de_datos.Servicio.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Servicio_Cliente", joinColumns={ @JoinColumn(name="ClienteNCliente") }, inverseJoinColumns={ @JoinColumn(name="ServicioNServicio") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_abonado_a = new java.util.HashSet();
	
	@OneToMany(mappedBy="reclamada_por", targetEntity=diagrama_bd.base_de_datos.Incidencia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_reclama = new java.util.HashSet();
	
	@OneToMany(mappedBy="cliente", targetEntity=diagrama_bd.base_de_datos.Terminales.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_terminales = new java.util.HashSet();
	
	private void setnCliente(int value) {
		this.nCliente = value;
	}
	
	public int getnCliente() {
		return nCliente;
	}
	
	public int getORMID() {
		return getnCliente();
	}
	
	public void setDNI(int value) {
		this.DNI = value;
	}
	
	public int getDNI() {
		return DNI;
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellido1(String value) {
		this.apellido1 = value;
	}
	
	public String getApellido1() {
		return apellido1;
	}
	
	public void setApellido2(String value) {
		this.apellido2 = value;
	}
	
	public String getApellido2() {
		return apellido2;
	}
	
	public void setDomicilio(String value) {
		this.domicilio = value;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setIBAN(String value) {
		this.IBAN = value;
	}
	
	public String getIBAN() {
		return IBAN;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	private void setORM_Abonado_a(java.util.Set value) {
		this.ORM_abonado_a = value;
	}
	
	private java.util.Set getORM_Abonado_a() {
		return ORM_abonado_a;
	}
	
	@Transient	
	public final diagrama_bd.base_de_datos.ServicioSetCollection abonado_a = new diagrama_bd.base_de_datos.ServicioSetCollection(this, _ormAdapter, diagrama_bd.base_de_datos.ORMConstants.KEY_CLIENTE_ABONADO_A, diagrama_bd.base_de_datos.ORMConstants.KEY_SERVICIO_UTILIZADO_POR, diagrama_bd.base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Reclama(java.util.Set value) {
		this.ORM_reclama = value;
	}
	
	private java.util.Set getORM_Reclama() {
		return ORM_reclama;
	}
	
	@Transient	
	public final diagrama_bd.base_de_datos.IncidenciaSetCollection reclama = new diagrama_bd.base_de_datos.IncidenciaSetCollection(this, _ormAdapter, diagrama_bd.base_de_datos.ORMConstants.KEY_CLIENTE_RECLAMA, diagrama_bd.base_de_datos.ORMConstants.KEY_INCIDENCIA_RECLAMADA_POR, diagrama_bd.base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Terminales(java.util.Set value) {
		this.ORM_terminales = value;
	}
	
	private java.util.Set getORM_Terminales() {
		return ORM_terminales;
	}
	
	@Transient	
	public final diagrama_bd.base_de_datos.TerminalesSetCollection terminales = new diagrama_bd.base_de_datos.TerminalesSetCollection(this, _ormAdapter, diagrama_bd.base_de_datos.ORMConstants.KEY_CLIENTE_TERMINALES, diagrama_bd.base_de_datos.ORMConstants.KEY_TERMINALES_CLIENTE, diagrama_bd.base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getnCliente());
	}
	
}
