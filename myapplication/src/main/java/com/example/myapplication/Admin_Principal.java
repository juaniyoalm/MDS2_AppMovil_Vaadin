package com.example.myapplication;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.ui.Button.ClickEvent;

import diagrama_bd.base_de_datos.Servicio;
import diagrama_bd.base_de_datos.Diagrama_BD.IAdministrador;

public class Admin_Principal extends Admin_Principal_V {
	
	ArrayList<Servicio> servicios = new ArrayList<Servicio>();
	ArrayList<Servicio> ofertasMostradas = new ArrayList<Servicio>();

	public Admin_Principal() {
		inicializar();
	}

	private void inicializar() {
		
		try {
			servicios = IAdministrador.getServicios();
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		boxO1.setItemCaptionGenerator(Servicio::getNombre);
		boxO2.setItemCaptionGenerator(Servicio::getNombre);
		boxO3.setItemCaptionGenerator(Servicio::getNombre);
		boxO4.setItemCaptionGenerator(Servicio::getNombre);
		boxO5.setItemCaptionGenerator(Servicio::getNombre);
		boxO6.setItemCaptionGenerator(Servicio::getNombre);
		
		boxO1.setItems(servicios);
		boxO2.setItems(servicios);
		boxO3.setItems(servicios);
		boxO4.setItems(servicios);
		boxO5.setItems(servicios);
		boxO6.setItems(servicios);
		
		btnGuardarCambios.addClickListener(ClickEvent -> {
			
			Servicio oferta1 = boxO1.getValue();
			Servicio oferta2 = boxO2.getValue();
			Servicio oferta3 = boxO3.getValue();
			Servicio oferta4 = boxO4.getValue();
			Servicio oferta5 = boxO5.getValue();
			Servicio oferta6 = boxO6.getValue();
			
			ofertasMostradas.add(oferta1);
			ofertasMostradas.add(oferta2);
			ofertasMostradas.add(oferta3);
			ofertasMostradas.add(oferta4);
			ofertasMostradas.add(oferta5);
			ofertasMostradas.add(oferta6);
			
			try {
				IAdministrador.guardarOfertas(ofertasMostradas);
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		});

	}

}
