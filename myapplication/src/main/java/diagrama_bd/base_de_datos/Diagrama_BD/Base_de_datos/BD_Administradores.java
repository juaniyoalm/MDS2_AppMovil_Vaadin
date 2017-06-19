package diagrama_bd.base_de_datos.Diagrama_BD.Base_de_datos;

import java.util.Vector;
import diagrama_bd.base_de_datos.*;

public class BD_Administradores {
	public BD_Principal _bd_prin_admin;
	public Vector<Administrador> _contiene_administradores = new Vector<Administrador>();
	
	public Administrador getAdministrador(String aUsuario, String aPassword) {
		Administrador c = new Administrador();
		
		for (Administrador a : _contiene_administradores) {
			if (a.getDNI() == aUsuario)
				if(a.getPassword() == aPassword) {
					c = a;
					return c;
				}
		}
		return null;
	}
}