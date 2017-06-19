/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateProyectoCompletoIluminatiData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession().beginTransaction();
		try {
			diagrama_bd.base_de_datos.Cliente diagrama_BDBase_de_datosCliente = diagrama_bd.base_de_datos.ClienteDAO.createCliente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : terminales, abonado_a, DNI
			diagrama_bd.base_de_datos.ClienteDAO.save(diagrama_BDBase_de_datosCliente);
			diagrama_bd.base_de_datos.Comercial diagrama_BDBase_de_datosComercial = diagrama_bd.base_de_datos.ComercialDAO.createComercial();
			// Initialize the properties of the persistent object here
			diagrama_bd.base_de_datos.ComercialDAO.save(diagrama_BDBase_de_datosComercial);
			diagrama_bd.base_de_datos.Administrador diagrama_BDBase_de_datosAdministrador = diagrama_bd.base_de_datos.AdministradorDAO.createAdministrador();
			// Initialize the properties of the persistent object here
			diagrama_bd.base_de_datos.AdministradorDAO.save(diagrama_BDBase_de_datosAdministrador);
			diagrama_bd.base_de_datos.Servicio diagrama_BDBase_de_datosServicio = diagrama_bd.base_de_datos.ServicioDAO.createServicio();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : utilizado_por, ID, nServicio
			diagrama_bd.base_de_datos.ServicioDAO.save(diagrama_BDBase_de_datosServicio);
			diagrama_bd.base_de_datos.ServiciosFFM diagrama_BDBase_de_datosServiciosFFM = diagrama_bd.base_de_datos.ServiciosFFMDAO.createServiciosFFM();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_parte
			diagrama_bd.base_de_datos.ServiciosFFMDAO.save(diagrama_BDBase_de_datosServiciosFFM);
			diagrama_bd.base_de_datos.ServicioTV diagrama_BDBase_de_datosServicioTV = diagrama_bd.base_de_datos.ServicioTVDAO.createServicioTV();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : compuesto_por
			diagrama_bd.base_de_datos.ServicioTVDAO.save(diagrama_BDBase_de_datosServicioTV);
			diagrama_bd.base_de_datos.Incidencia diagrama_BDBase_de_datosIncidencia = diagrama_bd.base_de_datos.IncidenciaDAO.createIncidencia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estado
			diagrama_bd.base_de_datos.IncidenciaDAO.save(diagrama_BDBase_de_datosIncidencia);
			diagrama_bd.base_de_datos.ServiciosCombi diagrama_BDBase_de_datosServiciosCombi = diagrama_bd.base_de_datos.ServiciosCombiDAO.createServiciosCombi();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ofreceFFM
			diagrama_bd.base_de_datos.ServiciosCombiDAO.save(diagrama_BDBase_de_datosServiciosCombi);
			diagrama_bd.base_de_datos.Canal diagrama_BDBase_de_datosCanal = diagrama_bd.base_de_datos.CanalDAO.createCanal();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_parte, ID, nCanal
			diagrama_bd.base_de_datos.CanalDAO.save(diagrama_BDBase_de_datosCanal);
			diagrama_bd.base_de_datos.Factura diagrama_BDBase_de_datosFactura = diagrama_bd.base_de_datos.FacturaDAO.createFactura();
			// Initialize the properties of the persistent object here
			diagrama_bd.base_de_datos.FacturaDAO.save(diagrama_BDBase_de_datosFactura);
			diagrama_bd.base_de_datos.TipoIncidencia diagrama_BDBase_de_datosTipoIncidencia = diagrama_bd.base_de_datos.TipoIncidenciaDAO.createTipoIncidencia();
			// Initialize the properties of the persistent object here
			diagrama_bd.base_de_datos.TipoIncidenciaDAO.save(diagrama_BDBase_de_datosTipoIncidencia);
			diagrama_bd.base_de_datos.Terminales diagrama_BDBase_de_datosTerminales = diagrama_bd.base_de_datos.TerminalesDAO.createTerminales();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cliente
			diagrama_bd.base_de_datos.TerminalesDAO.save(diagrama_BDBase_de_datosTerminales);
			diagrama_bd.base_de_datos.TipoTerminal diagrama_BDBase_de_datosTipoTerminal = diagrama_bd.base_de_datos.TipoTerminalDAO.createTipoTerminal();
			// Initialize the properties of the persistent object here
			diagrama_bd.base_de_datos.TipoTerminalDAO.save(diagrama_BDBase_de_datosTipoTerminal);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateProyectoCompletoIluminatiData createProyectoCompletoIluminatiData = new CreateProyectoCompletoIluminatiData();
			try {
				createProyectoCompletoIluminatiData.createTestData();
			}
			finally {
				diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
