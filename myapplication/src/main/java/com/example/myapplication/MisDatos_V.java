package com.example.myapplication;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TextField;
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
public class MisDatos_V extends CssLayout {
	protected HorizontalLayout menuInterno;
	protected TabSheet menuMisDatos;
	protected Label lblNombre;
	protected Label lblApellido1;
	protected Label lblApellido2;
	protected Label lblDNI;
	protected Label lblOtro;
	protected Label lblDomicilio;
	protected Label txtNombre;
	protected Label txtApellido1;
	protected Label txtApellido2;
	protected Label txtDNI;
	protected TextField txtEmail;
	protected TextField txtPass;
	protected Label txtDireccion;
	protected Button btnGuardad;

	public MisDatos_V() {
		Design.read(this);
	}
}
