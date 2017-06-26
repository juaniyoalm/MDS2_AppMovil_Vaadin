package com.example.myapplication;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.PopupView;

import diagrama_bd.base_de_datos.Comercial;

public class DetalleComercial  extends DetalleComercial_V{
	
	private Comercial cm = new Comercial();
	
	NuevoComercial vistaUpdateComercial;
	PopupView pv;
	
	public DetalleComercial() {
		inicializar();
	}
	
	public DetalleComercial(Comercial comercial) {
		cm = comercial;
		inicializar();
	}

	private void inicializar() {
		
		btnCerrarComercial.addClickListener(ClickEvent -> {
			this.setVisible(false);
		});
		comercialNombre.setValue(String.valueOf(cm.getNombre()));
		comercialApellido1.setValue(String.valueOf(cm.getApellido1()));
		comercialApellido2.setValue(String.valueOf(cm.getApellido2()));
		comercialDomicilio.setValue(String.valueOf(cm.getDomicilio()));
		comercialEmail.setValue(String.valueOf(cm.getEmail()));
		
		btnModificarComercial.addClickListener(ClickEvent -> {
			vistaUpdateComercial = new NuevoComercial(cm);
			vistaUpdateComercial.tituloAddComercial.setValue("Modificar Comercial");
			pv = new PopupView("", vistaUpdateComercial);
			pv.setHideOnMouseOut(false);
			pv.setPopupVisible(true);
			layoutUpdateComercial.addComponent(pv);
		});
		
		btnCerrarComercial.addClickListener(ClickEvent -> {
			this.setVisible(false);
		});
	}
	
	
	
//	private Label _nComercialL;
//	private Button _ncomercialB;
//	private Label _nombreL;
//	private Label _fechaAltaL;
//	private Label _emailL;
//	private Button _modificarB;
//	private Button _eliminarB;
//	public ZonaComerciales _unnamed_ZonaComerciales_;
//	public ResumenComercial _unnamed_ResumenComercial_;
//	public ModificarComercial _unnamed_ModificarComercial_;
//	public Confirmacion _unnamed_Confirmacion_;
}