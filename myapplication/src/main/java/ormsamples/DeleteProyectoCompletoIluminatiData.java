/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteProyectoCompletoIluminatiData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession().beginTransaction();
		try {
			diagrama_bd.base_de_datos.Cliente diagrama_BDBase_de_datosCliente = diagrama_bd.base_de_datos.ClienteDAO.loadClienteByQuery(null, null);
			// Delete the persistent object
			diagrama_bd.base_de_datos.ClienteDAO.delete(diagrama_BDBase_de_datosCliente);
			diagrama_bd.base_de_datos.Comercial diagrama_BDBase_de_datosComercial = diagrama_bd.base_de_datos.ComercialDAO.loadComercialByQuery(null, null);
			// Delete the persistent object
			diagrama_bd.base_de_datos.ComercialDAO.delete(diagrama_BDBase_de_datosComercial);
			diagrama_bd.base_de_datos.Administrador diagrama_BDBase_de_datosAdministrador = diagrama_bd.base_de_datos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			diagrama_bd.base_de_datos.AdministradorDAO.delete(diagrama_BDBase_de_datosAdministrador);
			diagrama_bd.base_de_datos.Servicio diagrama_BDBase_de_datosServicio = diagrama_bd.base_de_datos.ServicioDAO.loadServicioByQuery(null, null);
			// Delete the persistent object
			diagrama_bd.base_de_datos.ServicioDAO.delete(diagrama_BDBase_de_datosServicio);
			diagrama_bd.base_de_datos.ServiciosFFM diagrama_BDBase_de_datosServiciosFFM = diagrama_bd.base_de_datos.ServiciosFFMDAO.loadServiciosFFMByQuery(null, null);
			// Delete the persistent object
			diagrama_bd.base_de_datos.ServiciosFFMDAO.delete(diagrama_BDBase_de_datosServiciosFFM);
			diagrama_bd.base_de_datos.ServicioTV diagrama_BDBase_de_datosServicioTV = diagrama_bd.base_de_datos.ServicioTVDAO.loadServicioTVByQuery(null, null);
			// Delete the persistent object
			diagrama_bd.base_de_datos.ServicioTVDAO.delete(diagrama_BDBase_de_datosServicioTV);
			diagrama_bd.base_de_datos.Incidencia diagrama_BDBase_de_datosIncidencia = diagrama_bd.base_de_datos.IncidenciaDAO.loadIncidenciaByQuery(null, null);
			// Delete the persistent object
			diagrama_bd.base_de_datos.IncidenciaDAO.delete(diagrama_BDBase_de_datosIncidencia);
			diagrama_bd.base_de_datos.ServiciosCombi diagrama_BDBase_de_datosServiciosCombi = diagrama_bd.base_de_datos.ServiciosCombiDAO.loadServiciosCombiByQuery(null, null);
			// Delete the persistent object
			diagrama_bd.base_de_datos.ServiciosCombiDAO.delete(diagrama_BDBase_de_datosServiciosCombi);
			diagrama_bd.base_de_datos.Canal diagrama_BDBase_de_datosCanal = diagrama_bd.base_de_datos.CanalDAO.loadCanalByQuery(null, null);
			// Delete the persistent object
			diagrama_bd.base_de_datos.CanalDAO.delete(diagrama_BDBase_de_datosCanal);
			diagrama_bd.base_de_datos.Factura diagrama_BDBase_de_datosFactura = diagrama_bd.base_de_datos.FacturaDAO.loadFacturaByQuery(null, null);
			// Delete the persistent object
			diagrama_bd.base_de_datos.FacturaDAO.delete(diagrama_BDBase_de_datosFactura);
			diagrama_bd.base_de_datos.TipoIncidencia diagrama_BDBase_de_datosTipoIncidencia = diagrama_bd.base_de_datos.TipoIncidenciaDAO.loadTipoIncidenciaByQuery(null, null);
			// Delete the persistent object
			diagrama_bd.base_de_datos.TipoIncidenciaDAO.delete(diagrama_BDBase_de_datosTipoIncidencia);
			diagrama_bd.base_de_datos.Terminales diagrama_BDBase_de_datosTerminales = diagrama_bd.base_de_datos.TerminalesDAO.loadTerminalesByQuery(null, null);
			// Delete the persistent object
			diagrama_bd.base_de_datos.TerminalesDAO.delete(diagrama_BDBase_de_datosTerminales);
			diagrama_bd.base_de_datos.TipoTerminal diagrama_BDBase_de_datosTipoTerminal = diagrama_bd.base_de_datos.TipoTerminalDAO.loadTipoTerminalByQuery(null, null);
			// Delete the persistent object
			diagrama_bd.base_de_datos.TipoTerminalDAO.delete(diagrama_BDBase_de_datosTipoTerminal);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteProyectoCompletoIluminatiData deleteProyectoCompletoIluminatiData = new DeleteProyectoCompletoIluminatiData();
			try {
				deleteProyectoCompletoIluminatiData.deleteTestData();
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
