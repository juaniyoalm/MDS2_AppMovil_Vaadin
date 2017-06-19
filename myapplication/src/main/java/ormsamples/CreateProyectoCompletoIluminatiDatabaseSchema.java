/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateProyectoCompletoIluminatiDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance());
			diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
