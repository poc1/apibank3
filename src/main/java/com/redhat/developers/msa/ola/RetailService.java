package com.redhat.developers.msa.ola;

import java.util.ArrayList;
import java.util.ListIterator;

import org.springframework.stereotype.Service;

import com.dedhat.developers.model2.CustomerContactAddressesDetail;
import com.dedhat.developers.model2.CustomerContactMediaDetail;
import com.dedhat.developers.model2.CustomerContactPhoneDetail;
import com.dedhat.developers.model2.CustomerDataRetail;
import com.dedhat.developers.model2.ExtensionNumbers;

@Service
public class RetailService {

	
	ArrayList<CustomerDataRetail> customerDataRetailList;
	ArrayList<CustomerContactAddressesDetail> customerContactAddressesDetailList;
	ArrayList<CustomerContactPhoneDetail> customerContactPhoneDetailList;
	ArrayList<CustomerContactMediaDetail> customerContactMediaDetailList;
		

	public RetailService() {
		super();
		
		// DATOS BASICOS DEL CLIENTE
		this.customerDataRetailList = new ArrayList<CustomerDataRetail>();
		this.customerDataRetailList.add(new CustomerDataRetail("11111", "ADOLFO", "ACEVES", "GONZALEZ", "CASADO", "MASCULINO", "NO", "", "1966-11-15", "SERVICIOS PERSONALES, PARA EL HOGAR", "USUARIOS MENORES DE SERVICIOS", "MEXICO", "MEXICO", "PREMIER", "MEXICO", "", "BANCA SERFIN", "CLIENTE", "NORMAL", "5679", "PERSONAS FISICAS", "SI"));
		
		// DOMICILIO
		customerContactAddressesDetailList = new ArrayList<CustomerContactAddressesDetail>();
		customerContactAddressesDetailList.add(new CustomerContactAddressesDetail("11111", "PRINCIPAL", "001", "OTROS", "NUM 26 120", "CALLE", "320", "4", "UNIVERSIDAD", "ZARAGOZA", "CASA - HABITACION", "COLONIA", "LAS AMERICAS SAN PABLO", "SANTIAGO DE QUERETARO", "QUERETARO", "QUERETARO", "AGUASCALIENTES MUNICIPIO DE", "00076121", "MEXICO", "DESHABITADO", "2015-06-02", "", "CALLE NUM 26 120 NUM 320 NUM INT 4, COLONIA LAS AMERICAS SAN PABLO, CP. 00076121, SANTIAGO DE QUERETARO, QUERETARO, QUERETARO", "2015-06-02", "2017-08-09"));
		customerContactAddressesDetailList.add(new CustomerContactAddressesDetail("22222", "SECUNDARIO", "002", "OTROS DETALLES", "NUM 57 120", "CALLE 3", "320", "4", "UNIVERSIDAD", "ZARAGOZA", "CASA - HABITACION", "COLONIA", "LAS AMERICAS SAN PABLO", "SANTIAGO DE QUERETARO", "QUERETARO", "QUERETARO", "AGUASCALIENTES MUNICIPIO DE", "00076121", "MEXICO", "DESHABITADO", "2015-06-02", "", "CALLE NUM 26 120 NUM 320 NUM INT 4, COLONIA LAS AMERICAS SAN PABLO, CP. 00076121, SANTIAGO DE QUERETARO, QUERETARO, QUERETARO", "2015-06-02", "2017-08-09"));
		
		
		// TELEFONOS
		customerContactPhoneDetailList = new ArrayList<CustomerContactPhoneDetail>();
		customerContactPhoneDetailList.add(new CustomerContactPhoneDetail("11111", "VIVIENDA", "001", "TELCEL", "FIJO", "ENVIAR CORRESPONDENCIA", "222", "5731959", "2016-12-28", "2017-08-09", "001", "TELEFONO SIN INTENTO DE MARC", "2016-12-28", "", new ExtensionNumbers("44444", "66666", "77777", "88888") ));
		
		// MEDIA
		customerContactMediaDetailList = new ArrayList<CustomerContactMediaDetail>();
		customerContactMediaDetailList.add(new CustomerContactMediaDetail("11111", "", "CORREO ELECTRONICO", "1", "abregocristela@santander.com", "INEXISTENTE", "ALTA POR CANAL"));
		customerContactMediaDetailList.add(new CustomerContactMediaDetail("11111", "", "CORREO ELECTRONICO", "2", "adolfo_acv@hotmail.com", "020", ""));
	
	}
	
	
	// Informacion basica del cliente
	public CustomerDataRetail getBasicData(String customerId)
	{
		ListIterator<CustomerDataRetail> iterator =  customerDataRetailList.listIterator();
		while(iterator.hasNext()) {
			
			CustomerDataRetail data = iterator.next();
			if(data.getCustomerId().equals(customerId))
				return data;
		}
		return (CustomerDataRetail)null;
	}
	
	
	// Domicilios del Cliente
	public Iterable<CustomerContactAddressesDetail> getCustomerContactAddress(String customerId)
	{
		ArrayList<CustomerContactAddressesDetail> it = new ArrayList<CustomerContactAddressesDetail>();
		ListIterator<CustomerContactAddressesDetail> iterator =  customerContactAddressesDetailList.listIterator();
		while(iterator.hasNext()) {
			
			CustomerContactAddressesDetail data = iterator.next();
			if(data.getCustomerId().equals(customerId)) {
				it.add(data);
			}
		}
		return it;		
	}
	
	
	// Telefonos del Cliente
	public Iterable<CustomerContactPhoneDetail> getCustomerContactPhone(String customerId)
	{
		ArrayList<CustomerContactPhoneDetail> it = new ArrayList<CustomerContactPhoneDetail>();
		ListIterator<CustomerContactPhoneDetail> iterator =  customerContactPhoneDetailList.listIterator();
		while(iterator.hasNext()) {
			
			CustomerContactPhoneDetail data = iterator.next();
			if(data.getCustomerId().equals(customerId)) {
				it.add(data);
			}
		}
		return it;		
	}
	
	
	// Medios electrónicos
	public Iterable<CustomerContactMediaDetail> getCustomerContactMedia(String customerId)
	{
		ArrayList<CustomerContactMediaDetail> it = new ArrayList<CustomerContactMediaDetail>();
		ListIterator<CustomerContactMediaDetail> iterator =  customerContactMediaDetailList.listIterator();
		while(iterator.hasNext()) {
			
			CustomerContactMediaDetail data = iterator.next();
			if(data.getCustomerId().equals(customerId)) {
				it.add(data);
			}
		}
		return it;		
	}
	
		
}
