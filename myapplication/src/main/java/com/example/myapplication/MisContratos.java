package com.example.myapplication;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.ui.Button.ClickEvent;

import diagrama_bd.base_de_datos.Cliente;
import diagrama_bd.base_de_datos.Servicio;
import diagrama_bd.base_de_datos.Diagrama_BD.ICliente;

public class MisContratos extends MisContratos_V {
	Cliente cliente = new Cliente();
	ArrayList<Servicio> serv = new ArrayList<Servicio>();
	Servicio servElegido = null;
	
	public MisContratos() {
		inicializar();
	}
	
	public MisContratos(Cliente c) {
		cliente = c;
		inicializar();
	}

	private void inicializar() {
		
		try {
			serv = ICliente.cargarServicios(cliente);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		System.out.println(serv.size());
		boxContratos.setItems(cargarNombresServicios());
		
		btnMostrarContrato.addClickListener(ClickEvent -> {
			String contrato = boxContratos.getValue();
			labelContrato.setCaption(contrato);
			servElegido = descripcionServicio(contrato);
			if (servElegido == null)
				textContratos.setValue("No disponible.");
			else
				textContratos.setValue(servElegido.getCaracteristicas());
		});
		
		btnModificarContrato.addClickListener(ClickEvent -> {
			ModificarContrato modCon = new ModificarContrato(servElegido);
			
		});
		
	}
	
	public String[] cargarNombresServicios() {
		String[] s = new String[serv.size()];
		
		for (int i = 0; i < serv.size(); i++) {
			s[i] = serv.get(i).getNombre();
		}
		return s;
	}
	
	public Servicio descripcionServicio(String c) {
		
		for (Servicio servicio : serv) {
			if (servicio.getNombre() == c)
				return servicio;
		}
		
		return null;
		
	}

}
