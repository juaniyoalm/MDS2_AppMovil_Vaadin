package com.example.myapplication;

import org.hibernate.hql.internal.ast.InvalidWithClauseException;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.UI;

public class Cibernauta extends ZonaComun implements View {
	
	public static final String VIEW_NAME = "Cibernauta";
	
	InicioSesion is;
	PopupView pv;
	
	public Cibernauta() {
		inicializar();
	}

	private void inicializar() {
		
		zonaCibernauta();
		viewTitle.setVisible(false);
		viewTitle.setEnabled(false);
		content.setVisible(false);
		content.setEnabled(false);
		contenido.setStyleName("mystyle");
		contenido.setHeight(662, Unit.PIXELS);
		
		HorizontalLayout hl = new HorizontalLayout();
		HorizontalLayout hl2 = new HorizontalLayout();
		
		hl.setStyleName("margenesO");
		hl2.setStyleName("margenesO");
		
		contenido.addComponent(hl);
		contenido.addComponent(hl2);
		
		Button o1 = new Button("OFERTA 1");
		Button o2 = new Button("OFERTA 2");
		Button o3 = new Button("OFERTA 3");
		Button o4 = new Button("OFERTA 4");
		Button o5 = new Button("OFERTA 5");
		Button o6 = new Button("OFERTA 6");
		
		
		o1.setStyleName("botonesOfertas");
		o2.setStyleName("botonesOfertas");
		o3.setStyleName("botonesOfertas");
		o4.setStyleName("botonesOfertas");
		o5.setStyleName("botonesOfertas");
		o6.setStyleName("botonesOfertas");
		
		hl.addComponent(o1);
		hl.addComponent(o2);
		hl.addComponent(o3);
		hl2.addComponent(o4);
		hl2.addComponent(o5);
		hl2.addComponent(o6);
		
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
