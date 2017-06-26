package com.example.myapplication;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.ui.Grid;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.renderers.ButtonRenderer;

import diagrama_bd.base_de_datos.Comercial;
import diagrama_bd.base_de_datos.ComercialDAO;
import diagrama_bd.base_de_datos.Diagrama_BD.IAdministrador;

public class Admin_Comerciales extends Admin_Comerciales_V {
	
	static ArrayList<Comercial> comercialesAGranel = new ArrayList<Comercial>();
	NuevoComercial vistaNuevoComercial;
	PopupView pv;
	static Grid<Comercial> tablaDeComerciales;

	
	public Admin_Comerciales() {
			inicializar();
	}

	private void inicializar() {
		
		comercialesAGranel = IAdministrador.volcarComerciales();
		
		/*
		 * Construccion de la tabla de comerciales para mostrar
		 */
		tablaDeComerciales = new Grid<Comercial>();
		comercialesAGranel = IAdministrador.volcarComerciales();
		tablaDeComerciales.addColumn(Comercial::getDNI).setCaption("DNI");
		tablaDeComerciales.addColumn(Comercial::getNombre).setCaption("Nombre");
		tablaDeComerciales.addColumn(Comercial::getApellido1).setCaption("1er Apellido");
		tablaDeComerciales.addColumn(Comercial::getApellido2).setCaption("2º Apellido");
		tablaDeComerciales.addColumn(Comercial -> "Ver", new ButtonRenderer(ClickEvent -> {
			DetalleComercial dc = new DetalleComercial((Comercial) ClickEvent.getItem());
			PopupView pv = new PopupView("",dc);
			layoutNuevoComercial.addComponent(pv);
			pv.setHideOnMouseOut(false);
			pv.setPopupVisible(true);
		})).setCaption("Ver Comercial");
		tablaDeComerciales.addColumn(Comercial -> "borrar", new ButtonRenderer(ClickEvent -> {
			try {
				Comercial c = (Comercial) ClickEvent.getItem();
				//System.out.println(c.getApellido1());
				IAdministrador.delComercial(c);
				Admin_Comerciales.actualizarTablaAlBorrar(c);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		})).setCaption("Borrar Comercial");
			
		
		tablaDeComerciales.setItems(comercialesAGranel);
		tablaDeComerciales.setWidth("-1");
		layoutNuevoComercial.setWidth("-1");
		layoutNuevoComercial.addComponent(tablaDeComerciales);

		
		/*
		 * desencadenar accion addComercial
		 */
		nuevoComercial.addClickListener(ClickEvent -> {
			vistaNuevoComercial = new NuevoComercial();
			vistaNuevoComercial.tituloAddComercial.setValue("Nuevo Comercial");
			pv = new PopupView("", vistaNuevoComercial);
			pv.setHideOnMouseOut(false);
			pv.setPopupVisible(true);
			layoutNuevoComercial.addComponent(pv);
		});
	
		
	}
	
	/*
	 * actualizar tabla comerciales tras introducir un nuevo comercial
	 */
	public static void actualizarTabla(Comercial comercial) {
		
		comercialesAGranel.add(comercial);
		tablaDeComerciales.setItems(comercialesAGranel);
		
	}

	/*
	 * actualizar tabla de comerciales tras borrar un cumercial
	 */
	public static void actualizarTablaAlBorrar(Comercial comercialABorrar) {
		
		comercialesAGranel.remove(comercialABorrar);
		tablaDeComerciales.setItems(comercialesAGranel);
	}


}
