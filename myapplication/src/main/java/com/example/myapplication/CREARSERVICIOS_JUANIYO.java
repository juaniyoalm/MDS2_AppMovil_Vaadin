package com.example.myapplication;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import diagrama_bd.base_de_datos.ServiciosFFM;
import diagrama_bd.base_de_datos.ServiciosFFMDAO;
import diagrama_bd.base_de_datos.Diagrama_BD.ConexionBD;
import diagrama_bd.base_de_datos.Diagrama_BD.Base_de_datos.BD_Principal;

public class CREARSERVICIOS_JUANIYO {

	public static void main(String[] args) throws PersistentException {
		// TODO Auto-generated method stub
		
		ConexionBD bd = new ConexionBD();
		PersistentTransaction t = bd.beginT();
		boolean res = false;
		
		ServiciosFFM s = ServiciosFFMDAO.createServiciosFFM();
		s.setnServFFM(1);
		s.setID(1);
		s.setnServicio("1");
		s.setNombre("Fibra 300Mb");
		s.setPrecio((float)29.92);
		s.setCaracteristicas("Fibra simétrica de 300Mb");
		
		
		
		
		try {
			res = ServiciosFFMDAO.save(s);
			t.commit();
			
		} catch (PersistentException e) {
			// TODO: handle exception
			t.rollback();
			System.out.println(res);
		}
		
		System.out.println(res);

	}

}
