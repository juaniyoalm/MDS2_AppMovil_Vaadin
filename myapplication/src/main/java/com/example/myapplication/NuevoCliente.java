package com.example.myapplication;

import java.util.ArrayList;

import org.orm.PersistentException;

import diagrama_bd.base_de_datos.Cliente;
import diagrama_bd.base_de_datos.ClienteDAO;
import diagrama_bd.base_de_datos.Diagrama_BD.IAdministrador;

public class NuevoCliente extends NuevoCliente_V{
	
//	Cliente nuevoClienteARellenar = new Cliente();
//	
//	public NuevoCliente() {
//		inicializar();
//	}
//
//	private void inicializar() {
//		try {
//			listaServiciosCrearCliente.setItems(nombresDeServicios());
//		} catch (PersistentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		/*
//		 * evento para guardar un cliente en la base de datos
//		 */
//		guardarClienteEnBD.addClickListener(ClickEvent -> {
//			nuevoClienteARellenar = ClienteDAO.createCliente();
//			nuevoClienteARellenar.setDNI(Integer.valueOf(nuevoClienteDNI.getValue()));
//			nuevoClienteARellenar.setNombre(nuevoClienteNombre.getValue());
//			nuevoClienteARellenar.setApellido1(nuevoClienteApellido1.getValue());
//			nuevoClienteARellenar.setApellido2(nuevoClienteApellido2.getValue());
//			nuevoClienteARellenar.setDomicilio(nuevoClienteDomicilio.getValue());
//			nuevoClienteARellenar.setEmail(nuevoClienteEmail.getValue());
//			nuevoClienteARellenar.setIBAN(nuevoClienteIBAN1.getValue());
//			nuevoClienteARellenar.setIBAN(nuevoClienteIBAN2.getValue());
//			nuevoClienteARellenar.setIBAN(nuevoClienteIBAN3.getValue());
//			nuevoClienteARellenar.setIBAN(nuevoClienteIBAN4.getValue());
//			String pass1 = nuevoClientePassword1.getValue();
//			String pass2 = nuevoClientePassword2.getValue();
//			if (pass1.equals(pass2)) {
//				nuevoClienteARellenar.setPassword(pass1);
//				
//				try {
//					IAdministrador.addCliente(nuevoClienteARellenar);
//				} catch (PersistentException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}else{
//				// habra que decirle que no coinciden
//				nuevoClientePassword1.setValue("las contraseñas no coinciden");
//			}
//		});
//		
//		}
//	
//	/*
//	 * extrae los nombres de los servicios existentes en la base de datos, y 
//	 * rellena un array con ellos, despues lo devuelve.
//	 */
//	public String[] nombresDeServicios() throws PersistentException{
//		ArrayList<diagrama_bd.base_de_datos.Servicio> servicios = new ArrayList<>();
//		servicios = IAdministrador.getServicios();
//		String[] nombresDeServicios = new String[servicios.size()];
//		for (int i = 0; i < servicios.size(); i++) {
//			nombresDeServicios[i] = servicios.get(i).getNombre();
//		}
//		return nombresDeServicios;
//	}
//	
	/*
	 * 
	 */
	
	
	
//	private Label _titulo;
//	private Label _dNIL;
//	private TextField _dNITF;
//	private Label _nombreL;
//	private TextField _nombreTF;
//	private Label _apellido1L;
//	private TextField _apellido1TF;
//	private Label _apellido2L;
//	private TextField _apellido2TF;
//	private Label _domicilioL;
//	private TextField _domicilioTF;
//	private Label _emailL;
//	private TextField _emailTF;
//	private Label _iBANL;
//	private TextField _iBANTF;
//	private Label _servicioL;
//	private DropList _servicioDL;
//	public ZonaClientes _unnamed_ZonaClientes_;
}