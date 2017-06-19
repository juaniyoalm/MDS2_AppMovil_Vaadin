package diagrama_bd.base_de_datos.Diagrama_BD;
import java.io.File;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;


public class ConexionBD {
	
	public PersistentTransaction beginT () {
		try {
			PersistentTransaction t = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession().beginTransaction();
			return t;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
}
