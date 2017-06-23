package com.example.myapplication;

import org.orm.PersistentException;

import com.vaadin.ui.Button.ClickEvent;

import diagrama_bd.base_de_datos.Comercial;
import diagrama_bd.base_de_datos.Incidencia;
import diagrama_bd.base_de_datos.Diagrama_BD.IAdministrador;

public class AsignarIncidencia  extends AsignarIncidencia_V {
	
	Incidencia incidencia = new Incidencia();
	
	public AsignarIncidencia() {
		inicializar();
	}

	public AsignarIncidencia(Incidencia item) {
		incidencia = item;
		inicializar();
	}

	private void inicializar() {
		
		boxComerciales.setItemCaptionGenerator(Comercial::getDNI);
		boxComerciales.setItems(IAdministrador.getComerciales());
		
		btnAceptar.addClickListener(ClickEvent -> {
			incidencia.setTramitada_por(boxComerciales.getValue());
			
			System.out.println("Incidencia:" + incidencia.getDetalleIncidencia());
			System.out.println("Comercial: " + incidencia.getTramitada_por());
			try {
				IAdministrador.asignarComercialIncidencia(incidencia);
			} catch (PersistentException e) {
				e.printStackTrace();
			}
			this.setVisible(false);
		});
		
		btnCancelar.addClickListener(ClickEvent -> {
			this.setVisible(false);
		});
		
		
		
		

		
	}
}