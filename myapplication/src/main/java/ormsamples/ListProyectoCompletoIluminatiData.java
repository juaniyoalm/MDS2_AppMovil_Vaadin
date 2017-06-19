/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListProyectoCompletoIluminatiData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Cliente...");
		diagrama_bd.base_de_datos.Cliente[] diagrama_BDBase_de_datosClientes = diagrama_bd.base_de_datos.ClienteDAO.listClienteByQuery(null, null);
		int length = Math.min(diagrama_BDBase_de_datosClientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDBase_de_datosClientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Comercial...");
		diagrama_bd.base_de_datos.Comercial[] diagrama_BDBase_de_datosComercials = diagrama_bd.base_de_datos.ComercialDAO.listComercialByQuery(null, null);
		length = Math.min(diagrama_BDBase_de_datosComercials.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDBase_de_datosComercials[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		diagrama_bd.base_de_datos.Administrador[] diagrama_BDBase_de_datosAdministradors = diagrama_bd.base_de_datos.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(diagrama_BDBase_de_datosAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDBase_de_datosAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Servicio...");
		diagrama_bd.base_de_datos.Servicio[] diagrama_BDBase_de_datosServicios = diagrama_bd.base_de_datos.ServicioDAO.listServicioByQuery(null, null);
		length = Math.min(diagrama_BDBase_de_datosServicios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDBase_de_datosServicios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ServiciosFFM...");
		diagrama_bd.base_de_datos.ServiciosFFM[] diagrama_BDBase_de_datosServiciosFFMs = diagrama_bd.base_de_datos.ServiciosFFMDAO.listServiciosFFMByQuery(null, null);
		length = Math.min(diagrama_BDBase_de_datosServiciosFFMs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDBase_de_datosServiciosFFMs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ServicioTV...");
		diagrama_bd.base_de_datos.ServicioTV[] diagrama_BDBase_de_datosServicioTVs = diagrama_bd.base_de_datos.ServicioTVDAO.listServicioTVByQuery(null, null);
		length = Math.min(diagrama_BDBase_de_datosServicioTVs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDBase_de_datosServicioTVs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Incidencia...");
		diagrama_bd.base_de_datos.Incidencia[] diagrama_BDBase_de_datosIncidencias = diagrama_bd.base_de_datos.IncidenciaDAO.listIncidenciaByQuery(null, null);
		length = Math.min(diagrama_BDBase_de_datosIncidencias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDBase_de_datosIncidencias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ServiciosCombi...");
		diagrama_bd.base_de_datos.ServiciosCombi[] diagrama_BDBase_de_datosServiciosCombis = diagrama_bd.base_de_datos.ServiciosCombiDAO.listServiciosCombiByQuery(null, null);
		length = Math.min(diagrama_BDBase_de_datosServiciosCombis.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDBase_de_datosServiciosCombis[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Canal...");
		diagrama_bd.base_de_datos.Canal[] diagrama_BDBase_de_datosCanals = diagrama_bd.base_de_datos.CanalDAO.listCanalByQuery(null, null);
		length = Math.min(diagrama_BDBase_de_datosCanals.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDBase_de_datosCanals[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Factura...");
		diagrama_bd.base_de_datos.Factura[] diagrama_BDBase_de_datosFacturas = diagrama_bd.base_de_datos.FacturaDAO.listFacturaByQuery(null, null);
		length = Math.min(diagrama_BDBase_de_datosFacturas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDBase_de_datosFacturas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing TipoIncidencia...");
		diagrama_bd.base_de_datos.TipoIncidencia[] diagrama_BDBase_de_datosTipoIncidencias = diagrama_bd.base_de_datos.TipoIncidenciaDAO.listTipoIncidenciaByQuery(null, null);
		length = Math.min(diagrama_BDBase_de_datosTipoIncidencias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDBase_de_datosTipoIncidencias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Terminales...");
		diagrama_bd.base_de_datos.Terminales[] diagrama_BDBase_de_datosTerminaleses = diagrama_bd.base_de_datos.TerminalesDAO.listTerminalesByQuery(null, null);
		length = Math.min(diagrama_BDBase_de_datosTerminaleses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDBase_de_datosTerminaleses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing TipoTerminal...");
		diagrama_bd.base_de_datos.TipoTerminal[] diagrama_BDBase_de_datosTipoTerminals = diagrama_bd.base_de_datos.TipoTerminalDAO.listTipoTerminalByQuery(null, null);
		length = Math.min(diagrama_BDBase_de_datosTipoTerminals.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDBase_de_datosTipoTerminals[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Cliente by Criteria...");
		diagrama_bd.base_de_datos.ClienteCriteria diagrama_BDBase_de_datosClienteCriteria = new diagrama_bd.base_de_datos.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDBase_de_datosClienteCriteria.nCliente.eq();
		diagrama_BDBase_de_datosClienteCriteria.setMaxResults(ROW_COUNT);
		diagrama_bd.base_de_datos.Cliente[] diagrama_BDBase_de_datosClientes = diagrama_BDBase_de_datosClienteCriteria.listCliente();
		int length =diagrama_BDBase_de_datosClientes== null ? 0 : Math.min(diagrama_BDBase_de_datosClientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDBase_de_datosClientes[i]);
		}
		System.out.println(length + " Cliente record(s) retrieved."); 
		
		System.out.println("Listing Comercial by Criteria...");
		diagrama_bd.base_de_datos.ComercialCriteria diagrama_BDBase_de_datosComercialCriteria = new diagrama_bd.base_de_datos.ComercialCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDBase_de_datosComercialCriteria.nComercial.eq();
		diagrama_BDBase_de_datosComercialCriteria.setMaxResults(ROW_COUNT);
		diagrama_bd.base_de_datos.Comercial[] diagrama_BDBase_de_datosComercials = diagrama_BDBase_de_datosComercialCriteria.listComercial();
		length =diagrama_BDBase_de_datosComercials== null ? 0 : Math.min(diagrama_BDBase_de_datosComercials.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDBase_de_datosComercials[i]);
		}
		System.out.println(length + " Comercial record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		diagrama_bd.base_de_datos.AdministradorCriteria diagrama_BDBase_de_datosAdministradorCriteria = new diagrama_bd.base_de_datos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDBase_de_datosAdministradorCriteria.nAdmin.eq();
		diagrama_BDBase_de_datosAdministradorCriteria.setMaxResults(ROW_COUNT);
		diagrama_bd.base_de_datos.Administrador[] diagrama_BDBase_de_datosAdministradors = diagrama_BDBase_de_datosAdministradorCriteria.listAdministrador();
		length =diagrama_BDBase_de_datosAdministradors== null ? 0 : Math.min(diagrama_BDBase_de_datosAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDBase_de_datosAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing Servicio by Criteria...");
		diagrama_bd.base_de_datos.ServicioCriteria diagrama_BDBase_de_datosServicioCriteria = new diagrama_bd.base_de_datos.ServicioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDBase_de_datosServicioCriteria.nServicio.eq();
		diagrama_BDBase_de_datosServicioCriteria.setMaxResults(ROW_COUNT);
		diagrama_bd.base_de_datos.Servicio[] diagrama_BDBase_de_datosServicios = diagrama_BDBase_de_datosServicioCriteria.listServicio();
		length =diagrama_BDBase_de_datosServicios== null ? 0 : Math.min(diagrama_BDBase_de_datosServicios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDBase_de_datosServicios[i]);
		}
		System.out.println(length + " Servicio record(s) retrieved."); 
		
		System.out.println("Listing ServiciosFFM by Criteria...");
		diagrama_bd.base_de_datos.ServiciosFFMCriteria diagrama_BDBase_de_datosServiciosFFMCriteria = new diagrama_bd.base_de_datos.ServiciosFFMCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDBase_de_datosServiciosFFMCriteria.nServicio.eq();
		diagrama_BDBase_de_datosServiciosFFMCriteria.setMaxResults(ROW_COUNT);
		diagrama_bd.base_de_datos.ServiciosFFM[] diagrama_BDBase_de_datosServiciosFFMs = diagrama_BDBase_de_datosServiciosFFMCriteria.listServiciosFFM();
		length =diagrama_BDBase_de_datosServiciosFFMs== null ? 0 : Math.min(diagrama_BDBase_de_datosServiciosFFMs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDBase_de_datosServiciosFFMs[i]);
		}
		System.out.println(length + " ServiciosFFM record(s) retrieved."); 
		
		System.out.println("Listing ServicioTV by Criteria...");
		diagrama_bd.base_de_datos.ServicioTVCriteria diagrama_BDBase_de_datosServicioTVCriteria = new diagrama_bd.base_de_datos.ServicioTVCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDBase_de_datosServicioTVCriteria.nServicio.eq();
		diagrama_BDBase_de_datosServicioTVCriteria.setMaxResults(ROW_COUNT);
		diagrama_bd.base_de_datos.ServicioTV[] diagrama_BDBase_de_datosServicioTVs = diagrama_BDBase_de_datosServicioTVCriteria.listServicioTV();
		length =diagrama_BDBase_de_datosServicioTVs== null ? 0 : Math.min(diagrama_BDBase_de_datosServicioTVs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDBase_de_datosServicioTVs[i]);
		}
		System.out.println(length + " ServicioTV record(s) retrieved."); 
		
		System.out.println("Listing Incidencia by Criteria...");
		diagrama_bd.base_de_datos.IncidenciaCriteria diagrama_BDBase_de_datosIncidenciaCriteria = new diagrama_bd.base_de_datos.IncidenciaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDBase_de_datosIncidenciaCriteria.nIncidencia.eq();
		diagrama_BDBase_de_datosIncidenciaCriteria.setMaxResults(ROW_COUNT);
		diagrama_bd.base_de_datos.Incidencia[] diagrama_BDBase_de_datosIncidencias = diagrama_BDBase_de_datosIncidenciaCriteria.listIncidencia();
		length =diagrama_BDBase_de_datosIncidencias== null ? 0 : Math.min(diagrama_BDBase_de_datosIncidencias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDBase_de_datosIncidencias[i]);
		}
		System.out.println(length + " Incidencia record(s) retrieved."); 
		
		System.out.println("Listing ServiciosCombi by Criteria...");
		diagrama_bd.base_de_datos.ServiciosCombiCriteria diagrama_BDBase_de_datosServiciosCombiCriteria = new diagrama_bd.base_de_datos.ServiciosCombiCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDBase_de_datosServiciosCombiCriteria.nServicio.eq();
		diagrama_BDBase_de_datosServiciosCombiCriteria.setMaxResults(ROW_COUNT);
		diagrama_bd.base_de_datos.ServiciosCombi[] diagrama_BDBase_de_datosServiciosCombis = diagrama_BDBase_de_datosServiciosCombiCriteria.listServiciosCombi();
		length =diagrama_BDBase_de_datosServiciosCombis== null ? 0 : Math.min(diagrama_BDBase_de_datosServiciosCombis.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDBase_de_datosServiciosCombis[i]);
		}
		System.out.println(length + " ServiciosCombi record(s) retrieved."); 
		
		System.out.println("Listing Canal by Criteria...");
		diagrama_bd.base_de_datos.CanalCriteria diagrama_BDBase_de_datosCanalCriteria = new diagrama_bd.base_de_datos.CanalCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDBase_de_datosCanalCriteria.nCanal.eq();
		diagrama_BDBase_de_datosCanalCriteria.setMaxResults(ROW_COUNT);
		diagrama_bd.base_de_datos.Canal[] diagrama_BDBase_de_datosCanals = diagrama_BDBase_de_datosCanalCriteria.listCanal();
		length =diagrama_BDBase_de_datosCanals== null ? 0 : Math.min(diagrama_BDBase_de_datosCanals.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDBase_de_datosCanals[i]);
		}
		System.out.println(length + " Canal record(s) retrieved."); 
		
		System.out.println("Listing Factura by Criteria...");
		diagrama_bd.base_de_datos.FacturaCriteria diagrama_BDBase_de_datosFacturaCriteria = new diagrama_bd.base_de_datos.FacturaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDBase_de_datosFacturaCriteria.nFactura.eq();
		diagrama_BDBase_de_datosFacturaCriteria.setMaxResults(ROW_COUNT);
		diagrama_bd.base_de_datos.Factura[] diagrama_BDBase_de_datosFacturas = diagrama_BDBase_de_datosFacturaCriteria.listFactura();
		length =diagrama_BDBase_de_datosFacturas== null ? 0 : Math.min(diagrama_BDBase_de_datosFacturas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDBase_de_datosFacturas[i]);
		}
		System.out.println(length + " Factura record(s) retrieved."); 
		
		System.out.println("Listing TipoIncidencia by Criteria...");
		diagrama_bd.base_de_datos.TipoIncidenciaCriteria diagrama_BDBase_de_datosTipoIncidenciaCriteria = new diagrama_bd.base_de_datos.TipoIncidenciaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDBase_de_datosTipoIncidenciaCriteria.nTipoIncidencia.eq();
		diagrama_BDBase_de_datosTipoIncidenciaCriteria.setMaxResults(ROW_COUNT);
		diagrama_bd.base_de_datos.TipoIncidencia[] diagrama_BDBase_de_datosTipoIncidencias = diagrama_BDBase_de_datosTipoIncidenciaCriteria.listTipoIncidencia();
		length =diagrama_BDBase_de_datosTipoIncidencias== null ? 0 : Math.min(diagrama_BDBase_de_datosTipoIncidencias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDBase_de_datosTipoIncidencias[i]);
		}
		System.out.println(length + " TipoIncidencia record(s) retrieved."); 
		
		System.out.println("Listing Terminales by Criteria...");
		diagrama_bd.base_de_datos.TerminalesCriteria diagrama_BDBase_de_datosTerminalesCriteria = new diagrama_bd.base_de_datos.TerminalesCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDBase_de_datosTerminalesCriteria.nTerminal.eq();
		diagrama_BDBase_de_datosTerminalesCriteria.setMaxResults(ROW_COUNT);
		diagrama_bd.base_de_datos.Terminales[] diagrama_BDBase_de_datosTerminaleses = diagrama_BDBase_de_datosTerminalesCriteria.listTerminales();
		length =diagrama_BDBase_de_datosTerminaleses== null ? 0 : Math.min(diagrama_BDBase_de_datosTerminaleses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDBase_de_datosTerminaleses[i]);
		}
		System.out.println(length + " Terminales record(s) retrieved."); 
		
		System.out.println("Listing TipoTerminal by Criteria...");
		diagrama_bd.base_de_datos.TipoTerminalCriteria diagrama_BDBase_de_datosTipoTerminalCriteria = new diagrama_bd.base_de_datos.TipoTerminalCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDBase_de_datosTipoTerminalCriteria.nTipoTerminal.eq();
		diagrama_BDBase_de_datosTipoTerminalCriteria.setMaxResults(ROW_COUNT);
		diagrama_bd.base_de_datos.TipoTerminal[] diagrama_BDBase_de_datosTipoTerminals = diagrama_BDBase_de_datosTipoTerminalCriteria.listTipoTerminal();
		length =diagrama_BDBase_de_datosTipoTerminals== null ? 0 : Math.min(diagrama_BDBase_de_datosTipoTerminals.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDBase_de_datosTipoTerminals[i]);
		}
		System.out.println(length + " TipoTerminal record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListProyectoCompletoIluminatiData listProyectoCompletoIluminatiData = new ListProyectoCompletoIluminatiData();
			try {
				listProyectoCompletoIluminatiData.listTestData();
				//listProyectoCompletoIluminatiData.listByCriteria();
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
