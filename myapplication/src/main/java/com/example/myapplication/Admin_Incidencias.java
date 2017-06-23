package com.example.myapplication;

import java.util.ArrayList;

import com.vaadin.ui.Grid;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.renderers.ButtonRenderer;

import diagrama_bd.base_de_datos.Incidencia;
import diagrama_bd.base_de_datos.Diagrama_BD.IAdministrador;

public class Admin_Incidencias extends Admin_Incidencias_V {
	
	ArrayList<Incidencia> incidencias = new ArrayList<Incidencia>();
	static ArrayList<Incidencia> incidenciasSinAsignar = new ArrayList<Incidencia>();
	static ArrayList<Incidencia> incidenciasEnCurso = new ArrayList<Incidencia>();
	ArrayList<Incidencia> incidenciasCompletadas = new ArrayList<Incidencia>();
	
	static Grid<Incidencia> sinAsignar;
	static Grid<Incidencia> enCurso;

	
	public Admin_Incidencias() {
		inicializar();
	}

	private void inicializar() {
		
		incidencias = IAdministrador.cargarIncidencias();
		
		incidenciasSinAsignar = IAdministrador.cargarSinAsignar(incidencias);
		incidenciasEnCurso = IAdministrador.cargarEnCurso(incidencias);
		incidenciasCompletadas = IAdministrador.cargarCompletadas(incidencias);
		
		sinAsignar = new Grid<Incidencia>();
		
		sinAsignar.setWidth("500px");
		
		sinAsignar.addColumn(Incidencia::getnIncidencia).setCaption("Nº Incidencia");
		sinAsignar.addColumn(Incidencia::getDNI).setCaption("DNI Cliente");
		sinAsignar.addColumn(Incidencia::getEstado).setCaption("Estado");
		sinAsignar.addColumn(Incidencia::getDe_tipo).setCaption("Tipo");
		sinAsignar.addColumn(Incidencia -> "Ver", new ButtonRenderer(ClickEvent -> {
			DetalleIncidencia di = new DetalleIncidencia((Incidencia)ClickEvent.getItem());
			PopupView pv = new PopupView("",di);
			absoluteSin.addComponent(pv, "right: 25%; top:10%; z-index: 100;");
			pv.setHideOnMouseOut(false);
			pv.setPopupVisible(true);
		})).setCaption("Ver Incidencia");
		sinAsignar.addColumn(Incidencia -> "Asignar", new ButtonRenderer(ClickEvent -> {
			AsignarIncidencia di1 = new AsignarIncidencia((Incidencia)ClickEvent.getItem());
			PopupView pv1 = new PopupView("",di1);
			absoluteSin.addComponent(pv1, "right: 25%; top:10%; z-index: 100;");
			pv1.setHideOnMouseOut(false);
			pv1.setPopupVisible(true);
		})).setCaption("Asignar Incidencia");
		
		sinAsignar.setItems(incidenciasSinAsignar);
		
		layoutSinAsignar.addComponent(sinAsignar);
		
		
		 enCurso = new Grid<Incidencia>();
		
		enCurso.addColumn(Incidencia::getnIncidencia).setCaption("Nº Incidencia");
		enCurso.addColumn(Incidencia::getDNI).setCaption("DNI Cliente");
		enCurso.addColumn(Incidencia::getEstado).setCaption("Estado");
		enCurso.addColumn(Incidencia::getDe_tipo).setCaption("Tipo");
		enCurso.addColumn(Incidencia::getTramitada_por).setCaption("Comemrcial");
		enCurso.addColumn(Incidencia -> "Ver", new ButtonRenderer(ClickEvent -> {
			DetalleIncidencia di2 = new DetalleIncidencia((Incidencia)ClickEvent.getItem());
			PopupView pv2 = new PopupView("",di2);
			absoluteSin1.addComponent(pv2, "right: 25%; top:10%; z-index: 100;");
			pv2.setHideOnMouseOut(false);
			pv2.setPopupVisible(true);
		})).setCaption("Ver Incidencia");
		
		enCurso.setItems(incidenciasEnCurso);
		
		layoutEnCurso.addComponent(enCurso);
		
		
		Grid<Incidencia> completadas = new Grid<Incidencia>();
		
		completadas.addColumn(Incidencia::getnIncidencia).setCaption("Nº Incidencia");
		completadas.addColumn(Incidencia::getDNI).setCaption("DNI Cliente");
		completadas.addColumn(Incidencia::getEstado).setCaption("Estado");
		completadas.addColumn(Incidencia::getDe_tipo).setCaption("Tipo");
		completadas.addColumn(Incidencia::getTramitada_por).setCaption("Comemrcial");
		completadas.addColumn(Incidencia -> "Ver", new ButtonRenderer(ClickEvent -> {
			DetalleIncidencia di3 = new DetalleIncidencia((Incidencia)ClickEvent.getItem());
			PopupView pv3 = new PopupView("",di3);
			absoluteSin2.addComponent(pv3, "right: 25%; top:10%; z-index: 100;");
			pv3.setHideOnMouseOut(false);
			pv3.setPopupVisible(true);
		})).setCaption("Ver Incidencia");
		
		completadas.setItems(incidenciasCompletadas);
		
		layoutCompletadas.addComponent(completadas);
		
		
		Grid<Incidencia> consultar = new Grid<Incidencia>();
		
		
	
	}

	public static void actualizarTablasAlAsignar(Incidencia inc) {
		incidenciasSinAsignar.remove(inc);
		incidenciasEnCurso.add(inc);
		sinAsignar.setItems(incidenciasSinAsignar);
		enCurso.setItems(incidenciasEnCurso);
	}


}
