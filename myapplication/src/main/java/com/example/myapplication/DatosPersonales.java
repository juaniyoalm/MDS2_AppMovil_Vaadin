package com.example.myapplication;

import diagrama_bd.base_de_datos.Comercial;

public class DatosPersonales extends DatosPersonales_V {
	
	Comercial comercial = new Comercial();
	
	public DatosPersonales() {
		inicializar();
	}

	public DatosPersonales(Comercial com) {
		comercial = com;
		inicializar();
	}
	
	private void inicializar() {
		lblNombre.setValue(comercial.getNombre());
		lblApellido1.setValue(comercial.getApellido1());
		lblApellido2.setValue(comercial.getApellido2());
		lblNcomercial.setValue(String.valueOf(comercial.getnComercial()));
	
	}

}