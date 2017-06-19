package com.example.myapplication;

import diagrama_bd.base_de_datos.Servicio;

public class ModificarContrato extends ModificarContrato_V {
	Servicio servicio;
	
	public ModificarContrato() {
		inicializar();
	}


	public ModificarContrato(Servicio servElegido) {
		servicio = servElegido;
		inicializar();
	}


	private void inicializar() {
		
		
	}
	
}