package com.example.myapplication;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button.ClickEvent;

import com.vaadin.ui.Notification;

public class Cliente extends ZonaComun implements View{
	
	public static final String VIEW_NAME = "Cliente";
	
	diagrama_bd.base_de_datos.Cliente cl = new diagrama_bd.base_de_datos.Cliente();
	
	MisContratos mc = new MisContratos(cl);;
	MisDatos md = new MisDatos();
	MisIncidencias mi = new MisIncidencias();
	MisFacturas mf = new MisFacturas();
	
	public Cliente(diagrama_bd.base_de_datos.Cliente c) {
		cl = c;
		mc = new MisContratos(cl);
		mi = new MisIncidencias(cl);
		md = new MisDatos(cl);
		mf = new MisFacturas(cl);
		inicializar();
	}
	
	public Cliente() {
		cl.setNombre("Invitado");
		inicializar();
	}

	private void inicializar() {
		
		zonaCliente();
		iconosF.addComponent(mc);
		
		zmc.button1.addClickListener(ClickEvent -> {
			mc = new MisContratos(cl);
			iconosF.removeComponent(md);
			iconosF.removeComponent(mf);
			iconosF.removeComponent(mi);
			iconosF.addComponent(mc);
		});
		
		zmc.button2.addClickListener(ClickEvent -> {
			md = new MisDatos(cl);
			iconosF.removeComponent(mc);
			iconosF.removeComponent(mf);
			iconosF.removeComponent(mi);
			iconosF.addComponent(md);
		});
		
		zmc.button3.addClickListener(ClickEvent -> {
			mf = new MisFacturas(cl);
			iconosF.removeComponent(mc);
			iconosF.removeComponent(md);
			iconosF.removeComponent(mi);
			iconosF.addComponent(mf);
		});
		
		zmc.button4.addClickListener(ClickEvent -> {
			mi = new MisIncidencias(cl);
			iconosF.removeComponent(mc);
			iconosF.removeComponent(md);
			iconosF.removeComponent(mf);
			iconosF.addComponent(mi);
		});
		
		ca.nombreLabel.setValue("");
		ca.nombreLabel.setCaption("Bienvenido " + cl.getNombre());
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		Notification.show("Welcome to the Animal Farm");
	}

}