package com.example.myapplication;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

public class Comercial extends ZonaComun implements View {
	diagrama_bd.base_de_datos.Comercial com = new diagrama_bd.base_de_datos.Comercial();
	
	DatosPersonales dp = new DatosPersonales();
	ZonaClientes zc = new ZonaClientes();
	IncidenciasComercial ic = new IncidenciasComercial();
	
	public Comercial() {
		com.setNombre("Invitado");
		inicializar();
	}


	public Comercial(diagrama_bd.base_de_datos.Comercial c) {
		// TODO Auto-generated constructor stub
		com = c;
		inicializar();
	}

	private void inicializar() {
		
		zonaComercial();
		
		dp = new DatosPersonales(com);
		zc = new ZonaClientes();
		ic = new IncidenciasComercial();
		
		iconosF.addComponent(dp);

		zmc.button1.addClickListener(ClickEvent -> {
			iconosF.removeComponent(zc);
			iconosF.removeComponent(ic);
			iconosF.addComponent(dp);
		});
		
		zmc.button2.addClickListener(ClickEvent -> {
			iconosF.removeComponent(dp);
			iconosF.removeComponent(ic);
			iconosF.addComponent(zc);
		});
		
		zmc.button3.addClickListener(ClickEvent -> {
			iconosF.removeComponent(dp);
			iconosF.removeComponent(zc);
			iconosF.addComponent(ic);
		});
		
		ca.nombreLabel.setValue("");
		ca.nombreLabel.setCaption("Bienvenido " + com.getNombre());
		
	}


	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}