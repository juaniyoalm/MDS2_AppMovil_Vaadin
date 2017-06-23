package com.example.myapplication;

import org.orm.PersistentException;

import com.vaadin.data.Binder;
import com.vaadin.data.Binder.Binding;
import com.vaadin.data.ValidationResult;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;

import diagrama_bd.base_de_datos.Administrador;
import diagrama_bd.base_de_datos.Cliente;
import diagrama_bd.base_de_datos.Comercial;
import diagrama_bd.base_de_datos.Diagrama_BD.ICibernauta;
import diagrama_bd.base_de_datos.Diagrama_BD.Base_de_datos.BD_Principal;

public class InicioSesion extends InicioSesion_V implements View {
	
	public static final String VIEW_NAME = "InicioSesion";
	
	Cibernauta ciber;
	
	String nombre = "";
	String password = "";
	
	Navigator nav;
	
	public InicioSesion() {
		Inicializar();
	}


	
	public void Inicializar() {
		
		
		
		
//		Binder<String> binder = new Binder<String>();
//        Binding<String, String> binding = binder.forField(usuarioTextFiekd)
//                .withValidator((value, context) -> value.isEmpty()
//                        ? ValidationResult.error("Empty value not allowed")
//                        : ValidationResult.ok()).bind(string -> string, null);
//        
//        
//        binder.setBean("Initial Value"); // goes to textfield directly
		
		
		
	}
	
	public View iniciarSesion() {
		
			
		Cliente c = null;
		Comercial com = null;
		Administrador ad = null;
		
		ICibernauta cibernauta = new ICibernauta();
		nombre = usuarioTextFiekd.getValue();
		password = passTextFiekd.getValue();
		
		try {
			c = cibernauta.iniciarSesionCliente(nombre, password);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (c == null) {
			com = cibernauta.iniciarSesionComercial(nombre, password);
			
			if (com == null) {
				ad = cibernauta.iniciarSesionAdmin(nombre, password);
			} else {
				com.example.myapplication.Comercial vistaComercial = new com.example.myapplication.Comercial(com);
				return vistaComercial;
			}
		} else {
			com.example.myapplication.Cliente vistaCliente = new com.example.myapplication.Cliente(c);
			return vistaCliente;
		}

		if (ad == null) {
			Notification.show("Seleccione una cita", Notification.Type.WARNING_MESSAGE);
			return null;
		} else {
			com.example.myapplication.Administrador vistaAdmin = new com.example.myapplication.Administrador(ad);
			return  vistaAdmin;
		}
		

	}


	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		Notification.show("Welcome to the Animal Farm");
	}
}
