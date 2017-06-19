package com.example.myapplication;

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
		CabeceraLogueado cl = new CabeceraLogueado();
		head_iluminati.addComponent(cl);
	}
	
	public void zonaComercial() {
		zmc.menuComercial();
		CabeceraLogueado cl = new CabeceraLogueado();
		head_iluminati.addComponent(cl);
	}
	
	public void zonaCliente() {
		zmc.menuCliente();
		ca = new CabeceraLogueado();
		head_iluminati.addComponent(ca);
	}
	
	public void zonaCibernauta() {
		zmc.menu.setVisible(false);
		zmc.tituloMenu.setCaption("");
		cc = new CabeceraCibernauta();
		cc.setStyleName("mytheme");
		head_iluminati.addComponent(cc);
		
	}
	
}