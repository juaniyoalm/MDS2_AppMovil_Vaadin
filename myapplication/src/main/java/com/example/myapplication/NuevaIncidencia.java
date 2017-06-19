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
import diagrama_bd.base_de_datos.Incidencia;
import diagrama_bd.base_de_datos.IncidenciaDAO;
import diagrama_bd.base_de_datos.TipoIncidencia;
import diagrama_bd.base_de_datos.TipoIncidenciaDAO;
import diagrama_bd.base_de_datos.Diagrama_BD.ICliente;

public class NuevaIncidencia extends NuevaIncidencia_V implements View {
	
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
			
			incidencia = IncidenciaDAO.createIncidencia();
			incidencia.setDNI(String.valueOf(cl.getDNI()));
			incidencia.setEstado(false);
			incidencia.setORM_Reclamada_por(cl);
			incidencia.setDe_tipo(comboNuevaIncidencia.getValue());
			incidencia.setDetalleIncidencia(textNuevaIncidencia.getValue());
			
			
			try {
				insertada = ICliente.nuevaIncidencia(incidencia);
				
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (insertada) {
				MisIncidencias.actualizarTabla(incidencia);
				this.setVisible(false);
			}

			
		});
		
		cancelarIncidencia.addClickListener(ClickEvent -> this.setVisible(false));

		
		
		
		
		
		
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}