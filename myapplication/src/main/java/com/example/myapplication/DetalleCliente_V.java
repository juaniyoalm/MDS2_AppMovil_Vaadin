package com.example.myapplication;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class DetalleCliente_V extends VerticalLayout {
	protected Label lblDNI;
	protected Label lblNombre;
	protected Label lblApellido1;
	protected Label lblApellido2;
	protected Label lblDomicilio;
	protected Label lblEmail;
	protected Label lblIBAN;
	protected ComboBox<diagrama_bd.base_de_datos.Servicio> boxServicios;
	protected AbsoluteLayout absolute;
	protected Button btnModificar;
	protected Button btnCerrar;

	public DetalleCliente_V() {
		Design.read(this);
	}
}
