package com.example.myapplication;

import java.util.ArrayList;
import java.util.Arrays;

import org.orm.PersistentException;

import com.mysql.fabric.xmlrpc.base.Array;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.ComboBox;

import diagrama_bd.base_de_datos.Cliente;
import diagrama_bd.base_de_datos.ClienteDAO;
import diagrama_bd.base_de_datos.Comercial;
import diagrama_bd.base_de_datos.Incidencia;
import diagrama_bd.base_de_datos.IncidenciaDAO;
import diagrama_bd.base_de_datos.TipoIncidencia;
import diagrama_bd.base_de_datos.TipoIncidenciaDAO;
import diagrama_bd.base_de_datos.Diagrama_BD.ICliente;

public class NuevaIncidencia extends NuevaIncidencia_V implements View {
	
	Comercial com = null;
	Cliente cl = new Cliente();
	Incidencia incidencia = new Incidencia();
	boolean insertada = false;
	
	public NuevaIncidencia() {
		inicializar();
	}
	
	public NuevaIncidencia(Cliente c) {
		cl = c;
		inicializar();
	}

	public NuevaIncidencia(Comercial comercial) {
		com = comercial;
		inicializar();
	}

	private void inicializar() {
		
		TipoIncidencia[] tipos = null;
		try {
			tipos = TipoIncidenciaDAO.listTipoIncidenciaByQuery("NTipoIncidencia > 0", "NTipoIncidencia");
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		comboNuevaIncidencia.setItems(tipos);
		comboNuevaIncidencia.setItemCaptionGenerator(TipoIncidencia::getNombre);
		
		String elegidaQuery = "Nombre='"+comboNuevaIncidencia.getValue() + "'";
		
		btnGuardarIncidencia.addClickListener(ClickEvent -> {
			
			if (com == null) {
				// NUEVA DEL CLIENTE
				
				lblDNI.setVisible(false);
				labelDNI.setVisible(false);
				labelDNI.setEnabled(false);
				lblDNI.setEnabled(false);
				
				incidencia = IncidenciaDAO.createIncidencia();
				incidencia.setDNI(String.valueOf(cl.getDNI()));
				incidencia.setEstado(false);
				incidencia.setORM_Reclamada_por(cl);
				incidencia.setDe_tipo(comboNuevaIncidencia.getValue());
				incidencia.setDetalleIncidencia(textNuevaIncidencia.getValue());
				
				try {
					insertada = ICliente.nuevaIncidencia(incidencia);
					
				} catch (PersistentException e) {
					e.printStackTrace();
				}
				
				if (insertada) {
					MisIncidencias.actualizarTabla(incidencia);
					this.setVisible(false);
				}
				
				
			} else {
				
				// NUEVA DEL COMERCIAL
				lblDNI.setVisible(true);
				labelDNI.setVisible(true);
				labelDNI.setEnabled(true);
				lblDNI.setEnabled(true);
				
				try {
					cl = ClienteDAO.loadClienteByQuery("DNI="+labelDNI.getValue(), "DNI");
				} catch (PersistentException e) {
					e.printStackTrace();
				}
				
				incidencia = IncidenciaDAO.createIncidencia();
				incidencia.setDNI(labelDNI.getValue());
				incidencia.setEstado(false);
				incidencia.setORM_Reclamada_por(cl);
				incidencia.setDe_tipo(comboNuevaIncidencia.getValue());
				incidencia.setDetalleIncidencia(textNuevaIncidencia.getValue());
				incidencia.setTramitada_por(com);
				
				try {
					insertada = ICliente.nuevaIncidencia(incidencia);
					
				} catch (PersistentException e) {
					e.printStackTrace();
				}
				
				if (insertada) {
					IncidenciasComercial.actualizarTablaGenerales(incidencia);
					this.setVisible(false);

				}
				
			}
			
		});
		
		cancelarIncidencia.addClickListener(ClickEvent -> this.setVisible(false));
	
		
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}