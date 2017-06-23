package com.example.myapplication;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.ui.Button.ClickEvent;

import diagrama_bd.base_de_datos.Cliente;
import diagrama_bd.base_de_datos.ClienteDAO;
import diagrama_bd.base_de_datos.Comercial;
import diagrama_bd.base_de_datos.ComercialDAO;
import diagrama_bd.base_de_datos.Diagrama_BD.IAdministrador;

public class NuevoComercial extends NuevoComercial_V {
	
	Comercial nuevoComercialARellenar = null;
		
	boolean correcto = false;
	
	public NuevoComercial() {
		inicializar();
	}

	public NuevoComercial(Comercial cm) {
		nuevoComercialARellenar = cm;
		inicializar();
	}

	private void inicializar() {
		
		
		
		/*
		 * evento para guardar un cliente en la base de datos
		 */
		guardarComercialEnBD.addClickListener(ClickEvent ->{
			
			if (nuevoComercialARellenar == null) {
				nuevoComercialARellenar = new Comercial();
				nuevoComercialARellenar = ComercialDAO.createComercial();
			}
			nuevoComercialARellenar.setDNI(nuevoComercialDNI.getValue());
			nuevoComercialARellenar.setNombre(nuevoComercialNombre.getValue());
			nuevoComercialARellenar.setApellido1(nuevoComercialApellido1.getValue());
			nuevoComercialARellenar.setApellido2(nuevoComercialApellido2.getValue());
			nuevoComercialARellenar.setDomicilio(nuevoComercialDomicilio.getValue());
			nuevoComercialARellenar.setEmail(nuevoComercialEmail.getValue());
			String pass1 = nuevoComercialPassword1.getValue();
			String pass2 = nuevoComercialPassword2.getValue();
			if(pass1.equals(pass2)){
				nuevoComercialARellenar.setPassword(pass1);
			}else{
				// habra que decirle que no coinciden
				nuevoComercialPassword1.setValue("las contraseñas no coinciden");
			}
			
			try {
				correcto = IAdministrador.addComercial(nuevoComercialARellenar);
				Admin_Comerciales.actualizarTabla(nuevoComercialARellenar);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (correcto) {
				
				Admin_Comerciales.actualizarTabla(nuevoComercialARellenar);
				this.setVisible(false);
			}
			
			
		});
		
		btnCancelar.addClickListener(ClickEvent -> {
			this.setVisible(false);
		});
	
	}
}