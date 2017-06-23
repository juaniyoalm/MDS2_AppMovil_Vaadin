package com.example.myapplication;

import com.vaadin.ui.PopupView;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Notification;

import diagrama_bd.base_de_datos.Cliente;
import diagrama_bd.base_de_datos.Servicio;
import diagrama_bd.base_de_datos.Diagrama_BD.IAdministrador;

public class DetalleCliente extends DetalleCliente_V {
	
	Cliente cliente = new Cliente();
	NuevoCliente vistaNuevoCliente;
	PopupView pv;
	
	public DetalleCliente() {
		inicializar();
	}

	public DetalleCliente(Cliente c) {
		cliente = c;
		inicializar();
	}

	private void inicializar() {
		
		lblDNI.setValue(String.valueOf(cliente.getDNI()));
		lblNombre.setValue(cliente.getNombre());
		lblApellido1.setValue(cliente.getApellido1());
		lblApellido2.setValue(cliente.getApellido2());
		lblDomicilio.setValue(cliente.getDomicilio());
		lblEmail.setValue(cliente.getEmail());
		lblIBAN.setValue(cliente.getIBAN());
		
		boxServicios.setItemCaptionGenerator(Servicio::getNombre);
		boxServicios.setItems(cliente.abonado_a.getCollection());
		
		btnModificar.addClickListener(ClickEvent -> {
			vistaNuevoCliente = new NuevoCliente(cliente);
			pv = new PopupView("",vistaNuevoCliente);
			pv.setHideOnMouseOut(false);
			pv.setPopupVisible(true);
			vistaNuevoCliente.lblNombreTitulo.setValue("Modificar Cliente");
			absolute.addComponent(pv);
		});
		
		
		btnCerrar.addClickListener(ClickEvent -> {
			this.setVisible(false);
		});
		
	}

}