package com.example.myapplication;

import java.util.ArrayList;

import com.vaadin.ui.PopupView;
import com.vaadin.ui.renderers.ButtonRenderer;

import diagrama_bd.base_de_datos.Cliente;
import diagrama_bd.base_de_datos.ClienteDAO;
import diagrama_bd.base_de_datos.Factura;
import diagrama_bd.base_de_datos.Incidencia;
import diagrama_bd.base_de_datos.Diagrama_BD.ICliente;

public class MisFacturas extends MisFacturas_V {
	
	diagrama_bd.base_de_datos.Cliente cliente = new Cliente();
	ArrayList<Factura> facturas = new ArrayList<Factura>();
	
	public MisFacturas() {
		inicializar();
	}
	
	public MisFacturas(Cliente cl) {
		cliente = cl;
		inicializar();
	}

	private void inicializar() {

		facturas = ICliente.FacturasCliente(cliente);
		
		rellenarUltimaFactura();
		cargarTablaFacturas();
			
	}

	private void cargarTablaFacturas() {
		
		
		tableFacturas.addColumn(Factura::getnFactura).setCaption("Nº Factura");
		tableFacturas.addColumn(Factura::getCorresponde_a).setCaption("Contrato");
		tableFacturas.addColumn(Factura::getFechaEmision).setCaption("Fecha");
		tableFacturas.addColumn(Factura::getImporte).setCaption("Importe (€)");
		tableFacturas.addColumn(Factura -> "Descargar", new ButtonRenderer()).setCaption("Descargar");
		
		tableFacturas.setItems(facturas);	
		
	}

	private void rellenarUltimaFactura() {
		Factura ultima = facturas.size()>0?facturas.get(facturas.size()-1):null;
		
		if (ultima != null) {
			lblNfactura.setValue("Nº Factura: "+String.valueOf(ultima.getnFactura()));
			lblServicio.setValue("Contrato: "+ultima.getCorresponde_a().getNombre());
			lblFecha.setValue("Fecha: "+String.valueOf(ultima.getFechaEmision()));
			lblImporte.setValue("Importe: "+String.valueOf(ultima.getImporte())+"€");
		} else {
			lblNfactura.setValue("Nº Factura: "+"No Disponible");
			lblServicio.setValue("Contrato: "+"No Disponible");
			lblFecha.setValue("Fecha: "+"No Disponible");
			lblImporte.setValue("Importe: "+"No Disponible");
		}
		
	}
	
}
