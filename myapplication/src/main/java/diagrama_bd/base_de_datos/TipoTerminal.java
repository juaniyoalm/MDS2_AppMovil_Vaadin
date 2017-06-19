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
@Table(name="TipoTerminal")
public class TipoTerminal implements Serializable {
	public TipoTerminal() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == diagrama_bd.base_de_datos.ORMConstants.KEY_TIPOTERMINAL_TIPIFICA) {
			return ORM_tipifica;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="NTipoTerminal", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DIAGRAMA_BD_BASE_DE_DATOS_TIPOTERMINAL_NTIPOTERMINAL_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DIAGRAMA_BD_BASE_DE_DATOS_TIPOTERMINAL_NTIPOTERMINAL_GENERATOR", strategy="native")	
	private int nTipoTerminal;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@OneToMany(mappedBy="de_tipo", targetEntity=diagrama_bd.base_de_datos.Terminales.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tipifica = new java.util.HashSet();
	
	private void setnTipoTerminal(int value) {
		this.nTipoTerminal = value;
	}
	
	public int getnTipoTerminal() {
		return nTipoTerminal;
	}
	
	public int getORMID() {
		return getnTipoTerminal();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setORM_Tipifica(java.util.Set value) {
		this.ORM_tipifica = value;
	}
	
	private java.util.Set getORM_Tipifica() {
		return ORM_tipifica;
	}
	
	@Transient	
	public final diagrama_bd.base_de_datos.TerminalesSetCollection tipifica = new diagrama_bd.base_de_datos.TerminalesSetCollection(this, _ormAdapter, diagrama_bd.base_de_datos.ORMConstants.KEY_TIPOTERMINAL_TIPIFICA, diagrama_bd.base_de_datos.ORMConstants.KEY_TERMINALES_DE_TIPO, diagrama_bd.base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getnTipoTerminal());
	}
	
}
