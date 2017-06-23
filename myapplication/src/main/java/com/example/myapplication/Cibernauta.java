package com.example.myapplication;

import java.util.ArrayList;

import org.hibernate.hql.internal.ast.InvalidWithClauseException;
import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import diagrama_bd.base_de_datos.Cliente;
import diagrama_bd.base_de_datos.ClienteDAO;
import diagrama_bd.base_de_datos.Servicio;
import diagrama_bd.base_de_datos.ServicioDAO;

public class Cibernauta extends ZonaComun implements View {
	
	public static final String VIEW_NAME = "Cibernauta";
	
	diagrama_bd.base_de_datos.Servicio oferta1 = new Servicio();
	diagrama_bd.base_de_datos.Servicio oferta2 = new Servicio();
	diagrama_bd.base_de_datos.Servicio oferta3 = new Servicio();
	diagrama_bd.base_de_datos.Servicio oferta4 = new Servicio();
	diagrama_bd.base_de_datos.Servicio oferta5 = new Servicio();
	diagrama_bd.base_de_datos.Servicio oferta6 = new Servicio();
	
	InicioSesion is;
	PopupView pv;
	
	public Cibernauta() {
		inicializar();
	}

	private void inicializar() {
		
		zonaCibernauta();
		
		VerticalLayout fondo = new VerticalLayout();
		viewTitle.setVisible(false);
		viewTitle.setEnabled(false);
		content.setVisible(false);
		content.setEnabled(false);
		contenido.setStyleName("mystyle");
		contenido.setHeight(800, Unit.PIXELS);
		contenido.addComponent(fondo);
		fondo.setStyleName("mystyle");
		fondo.setHeight(662, Unit.PIXELS);

		
		HorizontalLayout hl = new HorizontalLayout();
		HorizontalLayout hl2 = new HorizontalLayout();
		
		hl.setStyleName("margenesO");
		hl2.setStyleName("margenesO");
		
		contenido.addComponent(hl);
		contenido.addComponent(hl2);
		
//		Servicio[] serviciosMostrar = new Servicio[6];
//		
//		try {
//			
//			serviciosMostrar = ServicioDAO.listServicioByQuery("id<0", "id");
//			
//			oferta1 = serviciosMostrar[0];
//			oferta2 = serviciosMostrar[1];
//			oferta3 = serviciosMostrar[2];
//			oferta4 = serviciosMostrar[3];
//			oferta5 = serviciosMostrar[4];
//			oferta6 = serviciosMostrar[5];
//		} catch (PersistentException e) {
//			e.printStackTrace();
//		}
		
//		Button o1 = new Button(oferta1.getNombre());
//		Button o2 = new Button(oferta2.getNombre());
//		Button o3 = new Button(oferta3.getNombre());
//		Button o4 = new Button(oferta4.getNombre());
//		Button o5 = new Button(oferta5.getNombre());
//		Button o6 = new Button(oferta6.getNombre());
		
		
//		o1.setStyleName("botonesOfertas");
//		o2.setStyleName("botonesOfertas");
//		o3.setStyleName("botonesOfertas");
//		o4.setStyleName("botonesOfertas");
//		o5.setStyleName("botonesOfertas");
//		o6.setStyleName("botonesOfertas");
		
//		hl.addComponent(o1);
//		hl.addComponent(o2);
//		hl.addComponent(o3);
//		hl2.addComponent(o4);
//		hl2.addComponent(o5);
//		hl2.addComponent(o6);
		
		is = new InicioSesion();
		pv = new PopupView("",is);

		is.iniciar_btn.addClickListener(ClickEvent -> {
			View v = is.iniciarSesion();
			if (v == null) {
				is.usuarioTextFiekd.setValue("");
				is.passTextFiekd.setValue("");
			} else {
				UI.getCurrent().getNavigator().addView("vista", v);
				UI.getCurrent().getNavigator().navigateTo("vista");

			}

		});
	
		
        cc.acceso.addClickListener(ClickEvent -> {
        	
			cc.absolute.addComponent(pv, "right: 100px; top:100px; z-index: 100;");
			
			pv.setHideOnMouseOut(false);
			
			pv.setPopupVisible(true);
			
		});
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		Notification.show("Welcome to the Animal Farm");
	}
	

}
