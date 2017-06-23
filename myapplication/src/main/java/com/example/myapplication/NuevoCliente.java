package com.example.myapplication;

import java.util.ArrayList;

import org.orm.PersistentException;

import com.vaadin.ui.Button.ClickEvent;

import diagrama_bd.base_de_datos.Cliente;
import diagrama_bd.base_de_datos.ClienteDAO;
import diagrama_bd.base_de_datos.Servicio;
import diagrama_bd.base_de_datos.Diagrama_BD.IAdministrador;
import diagrama_bd.base_de_datos.Diagrama_BD.ICliente;

public class NuevoCliente extends NuevoCliente_V{
	
	Cliente nuevoClienteARellenar = null;
	
	public NuevoCliente() {
		inicializar();
	}
	
	public NuevoCliente(Cliente c) {
		nuevoClienteARellenar = c;
		inicializar();
	}

	private void inicializar() {
		
		if (nuevoClienteARellenar == null) {
			try {
				listaServiciosCrearCliente.setItems(nombresDeServicios());
				btn_.setEnabled(false);
			} catch (PersistentException e) {
				e.printStackTrace();
			}
		} else {
			try {
				ArrayList<Servicio> listaCliente = ICliente.cargarServicios(nuevoClienteARellenar);
				listaServiciosCrearCliente.setItems(listaCliente.toString());
			} catch (PersistentException e) {
				e.printStackTrace();
			}
			
		}
		/*
		 * evento para guardar un cliente en la base de datos
		 * 
		 * 
		 */
		guardarClienteEnBD.addClickListener(ClickEvent -> {
			
			if (nuevoClienteARellenar == null) {
				nuevoClienteARellenar = new Cliente();
				nuevoClienteARellenar = ClienteDAO.createCliente();
			}
			nuevoClienteARellenar.setDNI(Integer.valueOf(nuevoClienteDNI.getValue()));
			nuevoClienteARellenar.setNombre(nuevoClienteNombre.getValue());
			nuevoClienteARellenar.setApellido1(nuevoClienteApellido1.getValue());
			nuevoClienteARellenar.setApellido2(nuevoClienteApellido2.getValue());
			nuevoClienteARellenar.setDomicilio(nuevoClienteDomicilio.getValue());
			nuevoClienteARellenar.setEmail(nuevoClienteEmail.getValue());
			
			String IBAN =  "" + nuevoClienteIBAN1.getValue() + " " +nuevoClienteIBAN2.getValue() + " " +
					nuevoClienteIBAN3.getValue() + " " + nuevoClienteIBAN4.getValue();
			nuevoClienteARellenar.setIBAN(IBAN);

			String pass1 = nuevoClientePassword1.getValue();
			String pass2 = nuevoClientePassword2.getValue();
			if (pass1.equals(pass2)) {
				nuevoClienteARellenar.setPassword(pass1);
				
				try {
					IAdministrador.addCliente(nuevoClienteARellenar);
				} catch (PersistentException e) {
					e.printStackTrace();
				}
;
				this.setVisible(false);
			}else{
				// habra que decirle que no coinciden
				nuevoClientePassword1.setValue("las contraseñas no coinciden");
			}
		});
		
		btnCancelar.addClickListener(ClickEvent -> {
			this.setVisible(false);
		});
		
		}
	
	/*
	 * extrae los nombres de los servicios existentes en la base de datos, y 
	 * rellena un array con ellos, despues lo devuelve.
	 */
	public String[] nombresDeServicios() throws PersistentException{
		ArrayList<diagrama_bd.base_de_datos.Servicio> servicios = new ArrayList<>();
		servicios = IAdministrador.getServicios();
		String[] nombresDeServicios = new String[servicios.size()];
		for (int i = 0; i < servicios.size(); i++) {
			nombresDeServicios[i] = servicios.get(i).getNombre();
		}
		return nombresDeServicios;
	}
	
	
}