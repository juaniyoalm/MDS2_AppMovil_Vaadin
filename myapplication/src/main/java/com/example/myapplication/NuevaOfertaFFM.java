package com.example.myapplication;

import org.orm.PersistentException;

import com.vaadin.event.MouseEvents.ClickEvent;

import diagrama_bd.base_de_datos.Servicio;
import diagrama_bd.base_de_datos.ServicioDAO;
import diagrama_bd.base_de_datos.Diagrama_BD.IAdministrador;

public class NuevaOfertaFFM extends NuevaOfertaFFM_V {
	
	Servicio nuevoServicioARellenar = null;
	boolean correcto = false;
	
	public NuevaOfertaFFM() {
		inicializar();
	}

	private void inicializar() {
		
		/*
		 * evento para guardar un nuevo servicioFFM en la base de datos
		 */
		btnNuevoFFM.addClickListener(ClickEvent -> {
			if (nuevoServicioARellenar == null) {
				nuevoServicioARellenar = new Servicio();
				nuevoServicioARellenar = ServicioDAO.createServicio();
			}
			nuevoServicioARellenar.setNombre(nombreNuevoFFM.getValue());
			nuevoServicioARellenar.setPrecio(Float.valueOf(precioNuevoFFM.getValue()));
			nuevoServicioARellenar.setCaracteristicas(caracteristicasNuevoFFM.getValue());
			
			try {
				correcto = IAdministrador.addServicioFFM(nuevoServicioARellenar);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});
		
	}
	
	
	
	
	
//	private Label _precioL;
//	private TextField _precioTF;
//	private Label _caracteristicasL;
//	private TextArea _caracteristicasTA;
//	public OpcionesComunesFFM _unnamed_OpcionesComunesFFM_;
}