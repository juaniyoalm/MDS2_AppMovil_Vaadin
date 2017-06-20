package com.example.myapplication;

import com.vaadin.ui.Button.ClickEvent;

public class Confirmacion extends Confirmacion_V{

	boolean r = false;
	public boolean respuesta() {
		
		btnAceptar.addClickListener(ClickEvent -> {
			r = true;
		});
		
		return r;
	}
	
}