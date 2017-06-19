package com.example.myapplication;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button.ClickEvent;

import diagrama_bd.base_de_datos.Incidencia;

public class DetalleIncidencia extends DetalleIncidencia_V implements View {
	
	Incidencia incidencia = new Incidencia();
	
	public DetalleIncidencia() {
		inicializar();
	}
	
	public DetalleIncidencia(Incidencia i) {
		incidencia = i;
		inicializar();
	}

	private void inicializar() {
		btnCerrarIncidencia.addClickListener(ClickEvent -> {
			this.setVisible(false);
		});
		
		labelNincidencia.setValue(String.valueOf(incidencia.getnIncidencia()));
		labelDNI.setValue(String.valueOf(incidencia.getDNI()));
		labelTipo.setValue(String.valueOf(incidencia.getDe_tipo()));
		textDescripcionInc.setValue(incidencia.getDetalleIncidencia());
		
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}