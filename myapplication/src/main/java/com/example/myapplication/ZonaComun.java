package com.example.myapplication;

import java.io.File;

import com.vaadin.server.FileResource;
import com.vaadin.server.ThemeResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.PopupView;

public class ZonaComun extends ZonaComun_V {
	
	CabeceraCibernauta cc;
	CabeceraLogueado ca;
	ZonaMenuComun zmc = new ZonaMenuComun();
	
	public ZonaComun() {
		inicializar();
	}

	private void inicializar() {
		
		
		cssL.addComponent(zmc);
		
	}
	
	public void zonaAdmin() {
		zmc.menuAdmin();
		ca = new CabeceraLogueado();
		head_iluminati.addComponent(ca);
		viewTitle.setValue("Zona Administrador");
	}
	
	public void zonaComercial() {
		zmc.menuComercial();
		ca = new CabeceraLogueado();
		head_iluminati.addComponent(ca);
		viewTitle.setValue("Zona Comercial");
	}
	
	public void zonaCliente() {
		zmc.menuCliente();
		ca = new CabeceraLogueado();
		head_iluminati.addComponent(ca);
		viewTitle.setValue("Zona Cliente");
	}
	
	public void zonaCibernauta() {
		zmc.menu.setVisible(false);
		zmc.tituloMenu.setCaption("");
		cc = new CabeceraCibernauta();
		cc.setStyleName("mytheme");
		head_iluminati.addComponent(cc);
		
	}
	
}