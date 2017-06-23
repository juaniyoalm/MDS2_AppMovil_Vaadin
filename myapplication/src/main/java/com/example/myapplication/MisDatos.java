package com.example.myapplication;

import org.orm.PersistentException;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Notification;

import diagrama_bd.base_de_datos.ClienteDAO;
import diagrama_bd.base_de_datos.ServicioDAO;
import diagrama_bd.base_de_datos.Diagrama_BD.ICliente;

public class MisDatos extends MisDatos_V {
	
	diagrama_bd.base_de_datos.Cliente cliente = new diagrama_bd.base_de_datos.Cliente();

	public MisDatos() {
		inicializar();
	}

	public MisDatos(diagrama_bd.base_de_datos.Cliente cl) {
		cliente = cl;
		inicializar();
		
	}

	private void inicializar() {
		menuInterno.setStyleName("menuInt");
		
		String nombre = cliente.getNombre();
		String a1 = cliente.getApellido1();
		String a2 = cliente.getApellido2();
		String DNI = String.valueOf(cliente.getDNI());
		String email = cliente.getEmail();
		String domicilio = cliente.getDomicilio();
		String pass = cliente.getPassword();
		
		lblNombre.setValue(nombre);
		lblApellido1.setValue(a1);
		lblApellido2.setValue(a2);
		lblDNI.setValue(DNI);
		lblDomicilio.setValue(domicilio);
		lblOtro.setValue(email);
		
		txtNombre.setValue(nombre);
		txtApellido1.setValue(a1);
		txtApellido2.setValue(a2);
		txtDNI.setValue(DNI);
		txtDireccion.setValue(domicilio);
		
		btnGuardad.addClickListener(ClickEvent -> {
			
			diagrama_bd.base_de_datos.Cliente mod = cliente;
			mod.setEmail(txtEmail.getValue());
			mod.setPassword(txtPass.getValue());
			try {
				ICliente.modificarDatos(cliente);
			} catch (PersistentException e) {
				e.printStackTrace();
			}
			
			Notification.show("Los datos serán modificados en breve.");
		});
		
		
		
		
	}
}
