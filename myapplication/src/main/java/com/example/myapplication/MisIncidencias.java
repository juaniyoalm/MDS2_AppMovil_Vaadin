package com.example.myapplication;

import java.util.ArrayList;

import org.hibernate.mapping.Table;
import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Grid;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.Grid.SelectionMode;
import com.vaadin.ui.renderers.ButtonRenderer;

import diagrama_bd.base_de_datos.Cliente;
import diagrama_bd.base_de_datos.Incidencia;
import diagrama_bd.base_de_datos.IncidenciaDAO;
import diagrama_bd.base_de_datos.Diagrama_BD.ICliente;

public class MisIncidencias extends MisIncidencias_V {
	
	Cliente c = new Cliente();
	static ArrayList<Incidencia> misIncidencias = new ArrayList<Incidencia>();
	static Grid <Incidencia> tableMisIncidencias;
	
	public MisIncidencias() {
		inicializar();
	}

	public MisIncidencias(Cliente cl) {
		c = cl;
		inicializar();
	}

	private void inicializar() {
		
		tableMisIncidencias = new Grid<Incidencia>();
		
		misIncidencias = ICliente.cargarIncidencias(c);
		
		tableMisIncidencias.addColumn(Incidencia::getnIncidencia).setCaption("Nº Incidencia");
		tableMisIncidencias.addColumn(Incidencia::getDNI).setCaption("DNI Cliente");
		tableMisIncidencias.addColumn(Incidencia::getDe_tipo).setCaption("Tipo");
		tableMisIncidencias.addColumn(Incidencia::getEstado).setCaption("Estado");		
		

		// Render a button that deletes the data row (item)
		tableMisIncidencias.addColumn(Incidencia -> "Ver", new ButtonRenderer(ClickEvent -> {
			DetalleIncidencia di = new DetalleIncidencia((Incidencia)ClickEvent.getItem());
			PopupView pv = new PopupView("",di);
			layoutMisIncidencias.addComponent(pv, "right: 25%; top:10%; z-index: 100;");
			pv.setHideOnMouseOut(false);
			pv.setPopupVisible(true);
		})).setCaption("Ver Incidencia");
		tableMisIncidencias.setItems(misIncidencias);	
		layoutMisIncidencias.addComponent(tableMisIncidencias, "left:10%; top:10%; z-index: 0;");
		
		btnNuevaIncidencia.addClickListener(ClickEvent -> {
			NuevaIncidencia nueva = new NuevaIncidencia(c);
			PopupView pv = new PopupView("", nueva);
			layoutMisIncidencias.addComponent(pv, "right: 25%; top:10%; z-index: 100;");
			pv.setHideOnMouseOut(false);
			pv.setPopupVisible(true);
		});
			
		
	}
	
	public static void actualizarTabla(Incidencia incidencia) {
		misIncidencias.add(incidencia);
		tableMisIncidencias.setItems(misIncidencias);
	}
	

	

}
