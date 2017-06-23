package com.example.myapplication;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import diagrama_bd.base_de_datos.ServicioTV;
import diagrama_bd.base_de_datos.ServicioTVDAO;
import diagrama_bd.base_de_datos.ServiciosCombi;
import diagrama_bd.base_de_datos.ServiciosCombiDAO;
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
		/*
		 * servicios de fibra
		 */
		ServiciosFFM s = ServiciosFFMDAO.createServiciosFFM();
		s.setnServFFM(1);
		s.setID(1);
		s.setnServicio("1");
		s.setNombre("Fibra 300Mb");
		s.setPrecio((float)29.92);
		s.setCaracteristicas("Fibra simétrica de 300Mb");
		
		ServiciosFFM s1 = ServiciosFFMDAO.createServiciosFFM();
		ServiciosFFM s2 = ServiciosFFMDAO.createServiciosFFM();
		ServiciosFFM s3 = ServiciosFFMDAO.createServiciosFFM();
		
		s1.setnServFFM(2);
		s1.setID(2);
		s1.setnServicio("2");
		s1.setNombre("Fibra 100Mb");
		s1.setPrecio((float)15.92);
		s1.setCaracteristicas("Fibra simétrica de 100Mb");
		
		s2.setnServFFM(3);
		s2.setID(3);
		s2.setnServicio("3");
		s2.setNombre("Fijo");
		s2.setPrecio((float)19.92);
		s2.setCaracteristicas("Fijo Tarifa Plana");
		
		s3.setnServFFM(4);
		s3.setID(4);
		s3.setnServicio("4");
		s3.setNombre("Movil");
		s3.setPrecio((float)15.92);
		s3.setCaracteristicas("Movil Tarifa Plana");
				
		/*
		 * Servicios de tv
		 */
		ServicioTV tv1 = ServicioTVDAO.createServicioTV();
		ServicioTV tv2 = ServicioTVDAO.createServicioTV();
		ServicioTV tv3 = ServicioTVDAO.createServicioTV();
		ServicioTV tv4 = ServicioTVDAO.createServicioTV();
		
		tv1.setnServicioTV(2);
		tv1.setID(5);
		tv1.setnServicio("5");
		tv1.setNombre("Paquete Liga");
		tv1.setPrecio((float)29.92);
		tv1.setCaracteristicas("Toda la liga de Primera");
		
		tv1.setnServicioTV(3);
		tv2.setID(6);
		tv2.setnServicio("6");
		tv2.setNombre("Paquete Copa del Rey");
		tv2.setPrecio((float)29.92);
		tv2.setCaracteristicas("Toda la Copa del Rey");
		
		tv3.setnServicioTV(4);
		tv3.setID(7);
		tv3.setnServicio("7");
		tv3.setNombre("Paquete Liga + Copa");
		tv3.setPrecio((float)29.92);
		tv3.setCaracteristicas("Toda la liga de Primera y la Copa del Rey");
		
		tv4.setnServicioTV(5);
		tv4.setID(8);
		tv4.setnServicio("8");
		tv4.setNombre("Paquete Champiosn total");
		tv4.setPrecio((float)29.92);
		tv4.setCaracteristicas("Toda la liga de Primera, la copa del Rey y la Champions");
		
		
		/*
		 * Servicio combi
		 */
		ServiciosCombi sc1 = ServiciosCombiDAO.createServiciosCombi();
		
		sc1.setnServCombi(1);
		sc1.setID(9);
		sc1.setnServicio("9");
		sc1.setNombre("Plus Total");
		sc1.setPrecio((float)49.90);
		sc1.setCaracteristicas("Paquetes: Fijo, Fibra300Mb, Movil, Champiosn Total");
		
		
		try {
			res = ServiciosFFMDAO.save(s);
			res = ServiciosFFMDAO.save(s1);
			res = ServiciosFFMDAO.save(s2);
			res = ServiciosFFMDAO.save(s3);
			
			res = ServicioTVDAO.save(tv1);
			res = ServicioTVDAO.save(tv2);
			res = ServicioTVDAO.save(tv3);
			res = ServicioTVDAO.save(tv4);
			
			res = ServiciosCombiDAO.save(sc1);
			
			t.commit();
			
		} catch (PersistentException e) {
			// TODO: handle exception
			t.rollback();
			System.out.println(res);
		}
		
		System.out.println(res);
		
	}

}
