package com.example.myapplication;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
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
public class MisContratos_V extends CssLayout {
	protected VerticalLayout layoutIncidencias;
	protected ComboBox<java.lang.String> boxContratos;
	protected Button btnMostrarContrato;
	protected Label labelContrato;
	protected TextArea textContratos;
	protected Button btnModificarContrato;
	protected Button btnSolicitarBaja;
	protected AbsoluteLayout absolute;

	public MisContratos_V() {
		Design.read(this);
	}
}
