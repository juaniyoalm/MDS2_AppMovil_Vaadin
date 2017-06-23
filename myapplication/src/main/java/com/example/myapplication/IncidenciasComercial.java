package com.example.myapplication;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.Icon;

import org.orm.PersistentException;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.renderers.ButtonRenderer;

import diagrama_bd.base_de_datos.Comercial;
import diagrama_bd.base_de_datos.Incidencia;
import diagrama_bd.base_de_datos.Diagrama_BD.IComercial;

public class IncidenciasComercial extends IncidenciasComercial_V {
	
	Comercial comercial = new Comercial();
	
	static Grid<Incidencia> generales;
	static Grid<Incidencia> llamada;
	
	static ArrayList<Incidencia> incidencias = new ArrayList<Incidencia>();
	static ArrayList<Incidencia> incGenerales = new ArrayList<Incidencia>();
	static ArrayList<Incidencia> incLlamada = new ArrayList<Incidencia>();

	public IncidenciasComercial() {
		inicializar();
	}
	
	public IncidenciasComercial(Comercial c) {
		comercial = c;
		inicializar();
	}

	private void inicializar() {
		
		incidencias = IComercial.getIncidencias(comercial);
		incGenerales = IComercial.getGenerales(incidencias);
		incLlamada = IComercial.getLlamada(incidencias);
		
		generales = new Grid<Incidencia>();
		
		generales.addColumn(Incidencia::getnIncidencia).setCaption("Nº Incidencia");
		generales.addColumn(Incidencia::getDNI).setCaption("DNI Cliente");
		generales.addColumn(Incidencia::getEstado).setCaption("Estado");
		generales.addColumn(Incidencia -> "Ver", new ButtonRenderer(ClickEvent -> {
			DetalleIncidencia di = new DetalleIncidencia((Incidencia)ClickEvent.getItem());
			PopupView pv = new PopupView("",di);
			absolute.addComponent(pv, "right: 25%; top:10%; z-index: 100;");
			pv.setHideOnMouseOut(false);
			pv.setPopupVisible(true);
		})).setCaption("Ver Incidencia");
		generales.addColumn(Incidencia -> "Realizar", new ButtonRenderer(ClickEvent -> {
			Incidencia realizar = (Incidencia) ClickEvent.getItem();
			try {
				IComercial.realizarIncidencia(realizar);
			} catch (PersistentException e) {
				e.printStackTrace();
			}
			Notification.show("La incidencia ha pasado al estado de Realizada");
			generales.setItems(incGenerales);
		})).setCaption("¿Realizar?");
		
		generales.setItems(incGenerales);
		
		llamada = new Grid<Incidencia>();
		
		llamada.addColumn(Incidencia::getnIncidencia).setCaption("Nº Incidencia");
		llamada.addColumn(Incidencia::getDetalleIncidencia).setCaption("Nombre");
		llamada.addColumn(Incidencia::getTelefono).setCaption("Telefono");
		llamada.addColumn(Incidencia::getEstado).setCaption("Estado");
		
		llamada.setItems(incLlamada);
		
		layoutGeneral.addComponent(generales);
		layoutLlamadas.addComponent(llamada);
		
		
		btnNuevaIncidencia.addClickListener(ClickEvent -> {
			NuevaIncidencia nueva = new NuevaIncidencia(comercial);
			PopupView pv = new PopupView("", nueva);
			absolute.addComponent(pv, "right: 25%; top:10%; z-index: 100;");
			pv.setHideOnMouseOut(false);
			pv.setPopupVisible(true);
			
		});
	
	}
	
	public static void actualizarTablaGenerales(Incidencia incidencia) {
		incGenerales.add(incidencia);
		generales.setItems(incGenerales);
	}

}