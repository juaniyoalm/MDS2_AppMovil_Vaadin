package diagrama_bd.base_de_datos.Diagrama_BD.Base_de_datos;

import java.util.Vector;
import diagrama_bd.base_de_datos.*;

public class BD_Comerciales {
	public BD_Principal _bd_prin_comer;
	public Vector<Comercial> _contiene_comerciales = new Vector<Comercial>();
	
	
	public Comercial getComercial(String aUsuario, String aPassword) {
		Comercial c = new Comercial();
		
		for (Comercial comercial : _contiene_comerciales) {
			if (comercial.getEmail() == aUsuario)
				if(comercial.getPassword() == aPassword) {
					c = comercial;
					return c;
				}
		}
		return null;
	}
}