package com.example.myapplication;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Link;

public class ZonaMenuComun extends ZonaMenuComun_V {
	
	public ZonaMenuComun() {
		
		
		
	}
	
	
	public void menuAdmin() {
		button1.setCaption("Principal");
		button2.setCaption("Clientes");
		button3.setCaption("Comerciales");
		button4.setCaption("Incidencias");
		button5.setCaption("Servicios");	
		button1.setIcon(VaadinIcons.CHEVRON_CIRCLE_RIGHT);
		button2.setIcon(VaadinIcons.GROUP);
		button1.setIcon(VaadinIcons.CHEVRON_CIRCLE_RIGHT);
		button2.setIcon(VaadinIcons.GROUP);
		button3.setIcon(VaadinIcons.SPECIALIST);
		button4.setIcon(VaadinIcons.EXCLAMATION);
		button5.setIcon(VaadinIcons.SERVER);
		
		button1.addClickListener(event -> button1.setCaption("Has pulsado"));
		
	}
	
	public void menuComercial() {
		button1.setCaption("Principal");
		button2.setCaption("Clientes");
		button3.setCaption("Incidencias");
		button4.setVisible(false);
		button5.setVisible(false);
		button1.setIcon(VaadinIcons.CHEVRON_CIRCLE_RIGHT);
		button2.setIcon(VaadinIcons.GROUP);
		button3.setIcon(VaadinIcons.EXCLAMATION);
		
		button1.addClickListener(event -> new Link("HOLITA", new ExternalResource("www.marca.com")));
	}
	
	public void menuCliente() {
		button1.setCaption("Mis Contratos");
		button2.setCaption("Mis Datos");
		button3.setCaption("Mis Facturas");
		button4.setCaption("Mis Incidencias");
		button5.setVisible(false);
		button1.setIcon(VaadinIcons.CLIPBOARD);
		button2.setIcon(VaadinIcons.USER_CARD);
		button3.setIcon(VaadinIcons.WALLET);
		button4.setIcon(VaadinIcons.EXCLAMATION);

		
	}
	
	
 }