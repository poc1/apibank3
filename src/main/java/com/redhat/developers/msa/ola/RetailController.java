/**
 * JBoss, Home of Professional Open Source
 * Copyright 2016, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.redhat.developers.msa.ola;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dedhat.developers.model2.CustomerContactAddressesDetail;
import com.dedhat.developers.model2.CustomerContactMediaDetail;
import com.dedhat.developers.model2.CustomerContactPhoneDetail;
import com.dedhat.developers.model2.CustomerDataRetail;
import com.dedhat.developers.model2.CustomerDocumentDetail;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/retail")
public class RetailController {


	public final RetailService retailService;

	@Autowired
	public RetailController(RetailService retailService) {
			this.retailService = retailService;
	}
	
	@RequestMapping(value="/retail/basicdata/{customerid}", method=RequestMethod.GET)
	@ApiOperation(value = "Get Customer Basic Data by CustomerId",response = CustomerDataRetail.class, produces = "application/json")
	public CustomerDataRetail getCustomerDataById(@PathVariable final String customerid)
	{
		return retailService.getCustomerDataById(customerid);
	}
	
	@RequestMapping(value="/retail/address/{customerid}", method=RequestMethod.GET)
	@ApiOperation(value = "Get Customer Address by CustomerId",response = CustomerContactAddressesDetail.class, produces = "application/json")
	public Iterable<CustomerContactAddressesDetail> getCustomerContactAddress(@PathVariable final String customerid)
	{
		return retailService.getCustomerContactAddress(customerid);
	}
	
	@RequestMapping(value="/retail/phone/{customerid}", method=RequestMethod.GET)
	@ApiOperation(value = "Get Customer Contact Phone by CustomerId",response = CustomerContactPhoneDetail.class, produces = "application/json")
	public Iterable<CustomerContactPhoneDetail> getCustomerContactPhone(@PathVariable final String customerid)
	{
		return retailService.getCustomerContactPhone(customerid);
	}
	
	@RequestMapping(value="/retail/media/{customerid}", method=RequestMethod.GET)
	@ApiOperation(value = "Get Customer Media by CustomerId",response = CustomerContactMediaDetail.class, produces = "application/json")
	public Iterable<CustomerContactMediaDetail> getCustomerContactMedia(@PathVariable final String customerid)
	{
		return retailService.getCustomerContactMedia(customerid);
	}
	
	@RequestMapping(value="/retail/document/{customerid}", method=RequestMethod.GET)
	@ApiOperation(value = "Get Customer Documents by CustomerId",response = CustomerDocumentDetail.class, produces = "application/json")
	public Iterable<CustomerDocumentDetail> getCustomerDocumentDetail(@PathVariable final String customerid)
	{
		return retailService.getCustomerDocumentDetail(customerid);
	}
}
