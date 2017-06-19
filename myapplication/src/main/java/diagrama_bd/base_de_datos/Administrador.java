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
@Table(name="Administrador")
public class Administrador implements Serializable {
	public Administrador() {
	}
	
	@Column(name="NAdmin", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DIAGRAMA_BD_BASE_DE_DATOS_ADMINISTRADOR_NADMIN_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DIAGRAMA_BD_BASE_DE_DATOS_ADMINISTRADOR_NADMIN_GENERATOR", strategy="native")	
	private int nAdmin;
	
	@Column(name="DNI", nullable=true, length=255)	
	private String DNI;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Apellido", nullable=true, length=255)	
	private String apellido;
	
	@Column(name="Password", nullable=true, length=255)	
	private String password;
	
	private void setnAdmin(int value) {
		this.nAdmin = value;
	}
	
	public int getnAdmin() {
		return nAdmin;
	}
	
	public int getORMID() {
		return getnAdmin();
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
	
	public void setApellido(String value) {
		this.apellido = value;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String toString() {
		return String.valueOf(getnAdmin());
	}
	
}
