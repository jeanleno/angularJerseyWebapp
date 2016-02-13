package com.jlheidemann.angularJerseyWebapp.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jlheidemann.angularJerseyWebapp.entity.Company;

@Path("/companyservice")
public class CompanyRestService {

	
	@GET()
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Company getCompany() {
		Company company = new Company();
		company.setId(1);
		company.setName("Empresa");
		
		return company;
	}
}
