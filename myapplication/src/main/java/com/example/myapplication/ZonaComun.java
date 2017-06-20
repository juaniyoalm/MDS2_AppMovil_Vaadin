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
		
//		// Find the application directory
//		String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
//		
//		System.out.println(basepath);
//
//		// Image as a file resource
//		ThemeResource resource = new ThemeResource(basepath + "/images/fiber.png");
//		FileResource resource2 = new FileResource(new File(basepath + "images/iconos.png"));
//		
//		
//		imgFiber.setSource(resource);
//		imgIcon.setSource(resource2);
		
		cssL.addComponent(zmc);
		
	}
	
	public void zonaAdmin() {
		zmc.menuAdmin();
		CabeceraLogueado cl = new CabeceraLogueado();
		head_iluminati.addComponent(cl);
		viewTitle.setValue("Zona Administrador");
	}
	
	public void zonaComercial() {
		zmc.menuComercial();
		CabeceraLogueado cl = new CabeceraLogueado();
		head_iluminati.addComponent(cl);
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