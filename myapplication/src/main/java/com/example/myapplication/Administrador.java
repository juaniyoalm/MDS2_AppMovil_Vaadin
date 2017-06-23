package com.example.myapplication;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

public class Administrador extends ZonaComun implements View {
	diagrama_bd.base_de_datos.Administrador admin =  new diagrama_bd.base_de_datos.Administrador();
	
	Admin_Principal ap = new Admin_Principal();
	Admin_Comerciales ac = new Admin_Comerciales();
	Admin_Incidencias ai = new Admin_Incidencias();
	Admin_Servicios as = new Admin_Servicios();
	ZonaClientes zc = new ZonaClientes();
	
	public Administrador() {
		admin.setNombre("Invitado");
		inicializar();
	}

	public Administrador(diagrama_bd.base_de_datos.Administrador c) {
		// TODO Auto-generated constructor stub
		admin = c;
		inicializar();
	}

	private void inicializar() {
		
		zonaAdmin();

		iconosF.addComponent(ap);
		
		zmc.button1.addClickListener(ClickEvent -> {
			iconosF.removeComponent(zc);
			iconosF.removeComponent(ac);
			iconosF.removeComponent(ai);
			iconosF.removeComponent(as);
			iconosF.addComponent(ap);
		});
		
		zmc.button2.addClickListener(ClickEvent -> {
			iconosF.removeComponent(ap);
			iconosF.removeComponent(ac);
			iconosF.removeComponent(ai);
			iconosF.removeComponent(as);
			iconosF.addComponent(zc);
		});
		
		zmc.button3.addClickListener(ClickEvent -> {
			iconosF.removeComponent(ap);
			iconosF.removeComponent(zc);
			iconosF.removeComponent(ai);
			iconosF.removeComponent(as);
			iconosF.addComponent(ac);
		});
		
		zmc.button4.addClickListener(ClickEvent -> {
			iconosF.removeComponent(ap);
			iconosF.removeComponent(zc);
			iconosF.removeComponent(ac);
			iconosF.removeComponent(as);
			iconosF.addComponent(ai);
		});
		
		zmc.button5.addClickListener(ClickEvent -> {
			iconosF.removeComponent(ap);
			iconosF.removeComponent(zc);
			iconosF.removeComponent(ac);
			iconosF.removeComponent(ai);
			iconosF.addComponent(as);
		});
		

		ca.nombreLabel.setValue("");
		ca.nombreLabel.setCaption("Bienvenido " + admin.getNombre());
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}