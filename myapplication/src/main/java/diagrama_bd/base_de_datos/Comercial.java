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
@Table(name="Comercial")
public class Comercial implements Serializable {
	public Comercial() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == diagrama_bd.base_de_datos.ORMConstants.KEY_COMERCIAL_TRAMITA) {
			return ORM_tramita;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="NComercial", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DIAGRAMA_BD_BASE_DE_DATOS_COMERCIAL_NCOMERCIAL_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DIAGRAMA_BD_BASE_DE_DATOS_COMERCIAL_NCOMERCIAL_GENERATOR", strategy="native")	
	private int nComercial;
	
	@Column(name="DNI", nullable=true, length=255)	
	private String DNI;
	
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
	
	@Column(name="Password", nullable=true, length=255)	
	private String password;
	
	@OneToMany(mappedBy="tramitada_por", targetEntity=diagrama_bd.base_de_datos.Incidencia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tramita = new java.util.HashSet();
	
	private void setnComercial(int value) {
		this.nComercial = value;
	}
	
	public int getnComercial() {
		return nComercial;
	}
	
	public int getORMID() {
		return getnComercial();
	}
	
	public void setDNI(String value) {
		this.DNI = value;
	}
	
	public String getDNI() {
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
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	private void setORM_Tramita(java.util.Set value) {
		this.ORM_tramita = value;
	}
	
	private java.util.Set getORM_Tramita() {
		return ORM_tramita;
	}
	
	@Transient	
	public final diagrama_bd.base_de_datos.IncidenciaSetCollection tramita = new diagrama_bd.base_de_datos.IncidenciaSetCollection(this, _ormAdapter, diagrama_bd.base_de_datos.ORMConstants.KEY_COMERCIAL_TRAMITA, diagrama_bd.base_de_datos.ORMConstants.KEY_INCIDENCIA_TRAMITADA_POR, diagrama_bd.base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getnComercial());
	}
	
}
