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
@Table(name="TipoIncidencia")
public class TipoIncidencia implements Serializable {
	public TipoIncidencia() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == diagrama_bd.base_de_datos.ORMConstants.KEY_TIPOINCIDENCIA_CLASIFICA_A) {
			return ORM_clasifica_a;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="NTipoIncidencia", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DIAGRAMA_BD_BASE_DE_DATOS_TIPOINCIDENCIA_NTIPOINCIDENCIA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DIAGRAMA_BD_BASE_DE_DATOS_TIPOINCIDENCIA_NTIPOINCIDENCIA_GENERATOR", strategy="native")	
	private int nTipoIncidencia;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@OneToMany(mappedBy="de_tipo", targetEntity=diagrama_bd.base_de_datos.Incidencia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_clasifica_a = new java.util.HashSet();
	
	private void setnTipoIncidencia(int value) {
		this.nTipoIncidencia = value;
	}
	
	public int getnTipoIncidencia() {
		return nTipoIncidencia;
	}
	
	public int getORMID() {
		return getnTipoIncidencia();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setORM_Clasifica_a(java.util.Set value) {
		this.ORM_clasifica_a = value;
	}
	
	private java.util.Set getORM_Clasifica_a() {
		return ORM_clasifica_a;
	}
	
	@Transient	
	public final diagrama_bd.base_de_datos.IncidenciaSetCollection clasifica_a = new diagrama_bd.base_de_datos.IncidenciaSetCollection(this, _ormAdapter, diagrama_bd.base_de_datos.ORMConstants.KEY_TIPOINCIDENCIA_CLASIFICA_A, diagrama_bd.base_de_datos.ORMConstants.KEY_INCIDENCIA_DE_TIPO, diagrama_bd.base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getnTipoIncidencia());
	}
	
}
