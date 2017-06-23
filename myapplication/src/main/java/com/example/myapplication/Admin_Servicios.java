package com.example.myapplication;

import java.util.ArrayList;
import java.util.TreeMap;

import org.orm.PersistentException;

import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PopupView;

import diagrama_bd.base_de_datos.Servicio;
import diagrama_bd.base_de_datos.ServicioDAO;
import diagrama_bd.base_de_datos.Diagrama_BD.IAdministrador;

public class Admin_Servicios extends AdminServicios_V {
	
	TreeMap<Integer, ArrayList<Servicio>> serviciosAgranel = new TreeMap<Integer, ArrayList<Servicio>>();
	
	PopupView pv;
	boolean correcto = false;
	
	NuevaOfertaFFM vistaNuevaOfertaFFM;
	NuevaOfertaTV vistaNuevaOfertaTV;
	NuevaOfertaCombis vistaNuevaOfertaCombi;
	
	
	Servicio servicioFFMAModificar 	= null;
	Servicio servicioFFMAEliminar 	= null;

	Servicio servicioTVAModificar 	= null;
	Servicio servicioTVAEliminar 	= null;
	
	Servicio servicioCombiAModificar 	= null;
	Servicio servicioCombiAEliminar 	= null;
	
		
	public Admin_Servicios() {
		inicializar();
	}

	private void inicializar() {
		
		serviciosAgranel = IAdministrador.volcarServicios();
		//System.out.println(serviciosAgranel.isEmpty());
		
		ofertasFFM.setItems(serviciosAgranel.get(1));
		ofertasFFM.setItemCaptionGenerator(Servicio::getNombre);
		
		ofertasTV.setItems(serviciosAgranel.get(2));
		ofertasTV.setItemCaptionGenerator(Servicio::getNombre);
		
		ofertasCombis.setItems(serviciosAgranel.get(3));
		ofertasCombis.setItemCaptionGenerator(Servicio::getNombre);
		
		/*
		 * desencadena la accion modificar servicioFFM
		 */
		btnModificarFFM.addClickListener(ClickEvent ->{
			if (servicioFFMAModificar == null){
				servicioFFMAModificar = new Servicio();
				servicioFFMAModificar = ServicioDAO.createServicio();
			}
			servicioFFMAModificar.setnServicio(ofertasFFM.getValue().getnServicio());
			servicioFFMAModificar.setID(ofertasFFM.getValue().getID());
			servicioFFMAModificar.setNombre(nombreFFM.getValue());
			servicioFFMAModificar.setPrecio(Float.valueOf(precioFFM.getValue()));
			servicioFFMAModificar.setCaracteristicas(caracccicasFFM.getValue());
			try {
				correcto = IAdministrador.updateServicio(servicioFFMAModificar);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (correcto) {
				Notification.show("El servicio se ha modificado correctamente");
				correcto = false;
			} 
		});
		
		/*
		 * desencadenar la accion eliminar servicioFFM
		 */
		btnEliminarFFM.addClickListener(ClickEvent ->{
			servicioFFMAEliminar = ServicioDAO.createServicio();
			servicioFFMAEliminar.setnServicio(ofertasFFM.getValue().getnServicio());
			
			try {
				correcto = IAdministrador.delServicio(servicioFFMAEliminar);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (correcto){
				Notification.show("El servicio se ha eliminado correctamente");
				correcto = false;
			}
			
		});
		
		/*
		 * Desencadena la accion modificar serviciotv
		 */
		btnModificarTV.addClickListener(ClickEvent ->{
			if (servicioTVAModificar == null){
				servicioTVAModificar = new Servicio();
				servicioTVAModificar = ServicioDAO.createServicio();
			}
			servicioTVAModificar.setnServicio(ofertasTV.getValue().getnServicio());
			servicioTVAModificar.setID(ofertasTV.getValue().getID());
			servicioTVAModificar.setNombre(nombreTV.getValue());
			servicioTVAModificar.setPrecio(Float.valueOf(precioTV.getValue()));
			servicioTVAModificar.setCaracteristicas(caracteristicasTV.getValue());
			try {
				correcto = IAdministrador.updateServicio(servicioTVAModificar);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (correcto) {
				Notification.show("El servicio se ha modificado correctamente");
				correcto = false;
			} 
		});
		
		
		/*
		 * desencadena la accion eliminar serviciotv
		 */
		btnEliminarTV.addClickListener(ClickEvent ->{
			servicioTVAEliminar = ServicioDAO.createServicio();
			servicioTVAEliminar.setnServicio(ofertasTV.getValue().getnServicio());
			
			try {
				correcto = IAdministrador.delServicio(servicioTVAEliminar);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (correcto){
				Notification.show("El servicio se ha eliminado correctamente");
				correcto = false;
			}
			
		});
		
		/*
		 * desencadena la accion modificar servicioCombi
		 */
		btnModificarCombi.addClickListener(ClickEvent ->{
			if (servicioCombiAModificar == null) {
				servicioCombiAModificar = new Servicio();
				servicioCombiAModificar = ServicioDAO.createServicio();
			}
			servicioCombiAModificar.setnServicio(ofertasCombis.getValue().getnServicio());
			servicioCombiAModificar.setID(ofertasCombis.getValue().getID());
			servicioCombiAModificar.setNombre(nombreCombi.getValue());
			servicioCombiAModificar.setPrecio(Float.valueOf(precioCombi.getValue()));
			servicioCombiAModificar.setCaracteristicas(caracteristicasCombi.getValue());
			try {
				correcto = IAdministrador.updateServicio(servicioCombiAModificar);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (correcto) {
				Notification.show("El servicio se ha modificado correctamente");
				correcto = false;
			} 
		});
		
		
		/*
		 * desencadena la accion eliminar servicioCo
		 */
		btnEliminarCombi.addClickListener(ClickEvent ->{
			servicioCombiAEliminar = ServicioDAO.createServicio();
			servicioCombiAEliminar.setnServicio(ofertasCombis.getValue().getnServicio());
			try {
				correcto = IAdministrador.delServicio(servicioCombiAEliminar);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (correcto){
				Notification.show("El servicio se ha eliminado correctamente");
				correcto = false;
			}
		});
		
		/*
		 * desencadena la accion de añadir un servicioFFM a la base de datos
		 */
		addOfertaFFM.addClickListener(ClickEvent -> {
			
			
			vistaNuevaOfertaFFM = new NuevaOfertaFFM();
			pv = new PopupView("", vistaNuevaOfertaFFM);
			pv.setHideOnMouseOut(false);
			pv.setPopupVisible(true);
			layoutNuevaOferta.addComponent(pv);
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//fin de inicializar()
	
	

}
