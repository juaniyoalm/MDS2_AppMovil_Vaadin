package com.example.myapplication;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Grid;
import com.vaadin.ui.TextField;
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
public class ZonaClientes_V extends CssLayout {
	protected VerticalLayout nuevoClienteLayout;
	protected Button botonBuscarCliente;
	protected TextField campoBuscarCliente;
	protected Button nuevoCLiente;
	protected Grid<diagrama_bd.base_de_datos.Cliente> tablaDeClientes;

	public ZonaClientes_V() {
		Design.read(this);
	}
}
