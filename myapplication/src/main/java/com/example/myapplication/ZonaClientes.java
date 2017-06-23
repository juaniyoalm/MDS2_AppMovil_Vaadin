package com.example.myapplication;

import java.util.ArrayList;
import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.ui.Grid;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.renderers.ButtonRenderer;

import diagrama_bd.base_de_datos.Cliente;
import diagrama_bd.base_de_datos.Incidencia;
import diagrama_bd.base_de_datos.Diagrama_BD.IAdministrador;

public class ZonaClientes extends ZonaClientes_V {
	
	static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	NuevoCliente vistaNuevoCliente;
	PopupView pv;
	static Grid<Cliente> tableNuevoCliente;
	
	public ZonaClientes() {
		inicializar();
	}

	private void inicializar() {
		
		clientes = IAdministrador.getClientes();
		
		tableNuevoCliente = new Grid<Cliente>();
		tableNuevoCliente.addColumn(Cliente::getDNI).setCaption("DNI");
		tableNuevoCliente.addColumn(Cliente::getNombre).setCaption("Nombre");
		tableNuevoCliente.addColumn(Cliente::getApellido1).setCaption("Apellido");
		tableNuevoCliente.addColumn(Cliente::getEmail).setCaption("Email");
		tableNuevoCliente.addColumn(Cliente -> "Ver", new ButtonRenderer(ClickEvent -> {
			DetalleCliente dc = new DetalleCliente((Cliente)ClickEvent.getItem());
			PopupView pv = new PopupView("",dc);
			absolute.addComponent(pv, "right: 25%; top:10%; z-index: 100;");
			pv.setHideOnMouseOut(false);
			pv.setPopupVisible(true);
		})).setCaption("Ver Cliente");
		tableNuevoCliente.addColumn(Cliente -> "Delete", new ButtonRenderer(ClickEvent -> {
			Cliente borrar = (Cliente)ClickEvent.getItem();
			try {
				IAdministrador.borrarCliente(borrar);
			} catch (PersistentException e) {
				e.printStackTrace();
			}
			actualizarTablaBorrado(borrar);
		})).setCaption("Borrar");
		tableNuevoCliente.setItems(clientes);
		
		tableNuevoCliente.setWidth("-1");
		
		layoutNuevoCliente.setWidth("-1");
		layoutNuevoCliente.addComponent(tableNuevoCliente);
	
		btnNuevoC.addClickListener(ClickEvent -> {
			vistaNuevoCliente = new NuevoCliente();
			pv = new PopupView("",vistaNuevoCliente);
			pv.setHideOnMouseOut(false);
			pv.setPopupVisible(true);			
			layoutNuevoCliente.addComponent(pv);
		});
		
		
	}
	
	public static void actualizarTabla(Cliente c) {
		clientes.add(c);
		tableNuevoCliente.setItems(clientes);
	}
	
	public static void actualizarTablaBorrado(Cliente c) {
		clientes.remove(c);
		tableNuevoCliente.setItems(clientes);
	}

	
}