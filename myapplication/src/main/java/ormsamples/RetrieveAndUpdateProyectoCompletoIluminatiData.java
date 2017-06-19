/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProyectoCompletoIluminatiData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = diagrama_bd.base_de_datos.ProyectoCompletoIluminatiPersistentManager.instance().getSession().beginTransaction();
		try {
			diagrama_bd.base_de_datos.Cliente diagrama_BDBase_de_datosCliente = diagrama_bd.base_de_datos.ClienteDAO.loadClienteByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_bd.base_de_datos.ClienteDAO.save(diagrama_BDBase_de_datosCliente);
			diagrama_bd.base_de_datos.Comercial diagrama_BDBase_de_datosComercial = diagrama_bd.base_de_datos.ComercialDAO.loadComercialByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_bd.base_de_datos.ComercialDAO.save(diagrama_BDBase_de_datosComercial);
			diagrama_bd.base_de_datos.Administrador diagrama_BDBase_de_datosAdministrador = diagrama_bd.base_de_datos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_bd.base_de_datos.AdministradorDAO.save(diagrama_BDBase_de_datosAdministrador);
			diagrama_bd.base_de_datos.Servicio diagrama_BDBase_de_datosServicio = diagrama_bd.base_de_datos.ServicioDAO.loadServicioByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_bd.base_de_datos.ServicioDAO.save(diagrama_BDBase_de_datosServicio);
			diagrama_bd.base_de_datos.ServiciosFFM diagrama_BDBase_de_datosServiciosFFM = diagrama_bd.base_de_datos.ServiciosFFMDAO.loadServiciosFFMByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_bd.base_de_datos.ServiciosFFMDAO.save(diagrama_BDBase_de_datosServiciosFFM);
			diagrama_bd.base_de_datos.ServicioTV diagrama_BDBase_de_datosServicioTV = diagrama_bd.base_de_datos.ServicioTVDAO.loadServicioTVByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_bd.base_de_datos.ServicioTVDAO.save(diagrama_BDBase_de_datosServicioTV);
			diagrama_bd.base_de_datos.Incidencia diagrama_BDBase_de_datosIncidencia = diagrama_bd.base_de_datos.IncidenciaDAO.loadIncidenciaByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_bd.base_de_datos.IncidenciaDAO.save(diagrama_BDBase_de_datosIncidencia);
			diagrama_bd.base_de_datos.ServiciosCombi diagrama_BDBase_de_datosServiciosCombi = diagrama_bd.base_de_datos.ServiciosCombiDAO.loadServiciosCombiByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_bd.base_de_datos.ServiciosCombiDAO.save(diagrama_BDBase_de_datosServiciosCombi);
			diagrama_bd.base_de_datos.Canal diagrama_BDBase_de_datosCanal = diagrama_bd.base_de_datos.CanalDAO.loadCanalByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_bd.base_de_datos.CanalDAO.save(diagrama_BDBase_de_datosCanal);
			diagrama_bd.base_de_datos.Factura diagrama_BDBase_de_datosFactura = diagrama_bd.base_de_datos.FacturaDAO.loadFacturaByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_bd.base_de_datos.FacturaDAO.save(diagrama_BDBase_de_datosFactura);
			diagrama_bd.base_de_datos.TipoIncidencia diagrama_BDBase_de_datosTipoIncidencia = diagrama_bd.base_de_datos.TipoIncidenciaDAO.loadTipoIncidenciaByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_bd.base_de_datos.TipoIncidenciaDAO.save(diagrama_BDBase_de_datosTipoIncidencia);
			diagrama_bd.base_de_datos.Terminales diagrama_BDBase_de_datosTerminales = diagrama_bd.base_de_datos.TerminalesDAO.loadTerminalesByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_bd.base_de_datos.TerminalesDAO.save(diagrama_BDBase_de_datosTerminales);
			diagrama_bd.base_de_datos.TipoTerminal diagrama_BDBase_de_datosTipoTerminal = diagrama_bd.base_de_datos.TipoTerminalDAO.loadTipoTerminalByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_bd.base_de_datos.TipoTerminalDAO.save(diagrama_BDBase_de_datosTipoTerminal);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Cliente by ClienteCriteria");
		diagrama_bd.base_de_datos.ClienteCriteria diagrama_BDBase_de_datosClienteCriteria = new diagrama_bd.base_de_datos.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDBase_de_datosClienteCriteria.nCliente.eq();
		System.out.println(diagrama_BDBase_de_datosClienteCriteria.uniqueCliente());
		
		System.out.println("Retrieving Comercial by ComercialCriteria");
		diagrama_bd.base_de_datos.ComercialCriteria diagrama_BDBase_de_datosComercialCriteria = new diagrama_bd.base_de_datos.ComercialCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDBase_de_datosComercialCriteria.nComercial.eq();
		System.out.println(diagrama_BDBase_de_datosComercialCriteria.uniqueComercial());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		diagrama_bd.base_de_datos.AdministradorCriteria diagrama_BDBase_de_datosAdministradorCriteria = new diagrama_bd.base_de_datos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDBase_de_datosAdministradorCriteria.nAdmin.eq();
		System.out.println(diagrama_BDBase_de_datosAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Servicio by ServicioCriteria");
		diagrama_bd.base_de_datos.ServicioCriteria diagrama_BDBase_de_datosServicioCriteria = new diagrama_bd.base_de_datos.ServicioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDBase_de_datosServicioCriteria.nServicio.eq();
		System.out.println(diagrama_BDBase_de_datosServicioCriteria.uniqueServicio());
		
		System.out.println("Retrieving ServiciosFFM by ServiciosFFMCriteria");
		diagrama_bd.base_de_datos.ServiciosFFMCriteria diagrama_BDBase_de_datosServiciosFFMCriteria = new diagrama_bd.base_de_datos.ServiciosFFMCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDBase_de_datosServiciosFFMCriteria.nServicio.eq();
		System.out.println(diagrama_BDBase_de_datosServiciosFFMCriteria.uniqueServiciosFFM());
		
		System.out.println("Retrieving ServicioTV by ServicioTVCriteria");
		diagrama_bd.base_de_datos.ServicioTVCriteria diagrama_BDBase_de_datosServicioTVCriteria = new diagrama_bd.base_de_datos.ServicioTVCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDBase_de_datosServicioTVCriteria.nServicio.eq();
		System.out.println(diagrama_BDBase_de_datosServicioTVCriteria.uniqueServicioTV());
		
		System.out.println("Retrieving Incidencia by IncidenciaCriteria");
		diagrama_bd.base_de_datos.IncidenciaCriteria diagrama_BDBase_de_datosIncidenciaCriteria = new diagrama_bd.base_de_datos.IncidenciaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDBase_de_datosIncidenciaCriteria.nIncidencia.eq();
		System.out.println(diagrama_BDBase_de_datosIncidenciaCriteria.uniqueIncidencia());
		
		System.out.println("Retrieving ServiciosCombi by ServiciosCombiCriteria");
		diagrama_bd.base_de_datos.ServiciosCombiCriteria diagrama_BDBase_de_datosServiciosCombiCriteria = new diagrama_bd.base_de_datos.ServiciosCombiCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDBase_de_datosServiciosCombiCriteria.nServicio.eq();
		System.out.println(diagrama_BDBase_de_datosServiciosCombiCriteria.uniqueServiciosCombi());
		
		System.out.println("Retrieving Canal by CanalCriteria");
		diagrama_bd.base_de_datos.CanalCriteria diagrama_BDBase_de_datosCanalCriteria = new diagrama_bd.base_de_datos.CanalCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDBase_de_datosCanalCriteria.nCanal.eq();
		System.out.println(diagrama_BDBase_de_datosCanalCriteria.uniqueCanal());
		
		System.out.println("Retrieving Factura by FacturaCriteria");
		diagrama_bd.base_de_datos.FacturaCriteria diagrama_BDBase_de_datosFacturaCriteria = new diagrama_bd.base_de_datos.FacturaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDBase_de_datosFacturaCriteria.nFactura.eq();
		System.out.println(diagrama_BDBase_de_datosFacturaCriteria.uniqueFactura());
		
		System.out.println("Retrieving TipoIncidencia by TipoIncidenciaCriteria");
		diagrama_bd.base_de_datos.TipoIncidenciaCriteria diagrama_BDBase_de_datosTipoIncidenciaCriteria = new diagrama_bd.base_de_datos.TipoIncidenciaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDBase_de_datosTipoIncidenciaCriteria.nTipoIncidencia.eq();
		System.out.println(diagrama_BDBase_de_datosTipoIncidenciaCriteria.uniqueTipoIncidencia());
		
		System.out.println("Retrieving Terminales by TerminalesCriteria");
		diagrama_bd.base_de_datos.TerminalesCriteria diagrama_BDBase_de_datosTerminalesCriteria = new diagrama_bd.base_de_datos.TerminalesCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDBase_de_datosTerminalesCriteria.nTerminal.eq();
		System.out.println(diagrama_BDBase_de_datosTerminalesCriteria.uniqueTerminales());
		
		System.out.println("Retrieving TipoTerminal by TipoTerminalCriteria");
		diagrama_bd.base_de_datos.TipoTerminalCriteria diagrama_BDBase_de_datosTipoTerminalCriteria = new diagrama_bd.base_de_datos.TipoTerminalCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDBase_de_datosTipoTerminalCriteria.nTipoTerminal.eq();
		System.out.println(diagrama_BDBase_de_datosTipoTerminalCriteria.uniqueTipoTerminal());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProyectoCompletoIluminatiData retrieveAndUpdateProyectoCompletoIluminatiData = new RetrieveAndUpdateProyectoCompletoIluminatiData();
			try {
				retrieveAndUpdateProyectoCompletoIluminatiData.retrieveAndUpdateTestData();
				//retrieveAndUpdateProyectoCompletoIluminatiData.retrieveByCriteria();
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
