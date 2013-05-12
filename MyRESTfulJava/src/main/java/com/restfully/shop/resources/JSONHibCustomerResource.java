/**
 * 
 */
package com.restfully.shop.resources;

import java.net.URI;

import javax.ws.rs.core.Response;

import com.restfully.shop.domain.Customer;

import com.restfully.dao.CustomerDAO;

/**
 * @author vpsrini
 *
 */
public class JSONHibCustomerResource implements JSONCustomerResource {
	
	private CustomerDAO customerDAO = null;
	
	public JSONHibCustomerResource(CustomerDAO customerDAO){
		this.customerDAO = customerDAO;
	}
	
	@Override
	public Response getCustomers() {
		Customer[] customers = customerDAO.readAllCustomers();
		return Response.ok(customers).header("Cache-Control", "no-cache, must-revalidate").header("Access-Control-Allow-Origin","*").build();
	}

	@Override
	public Customer getCustomer(int id) {
		return customerDAO.readCustomerById(id);
	}

	@Override
	public Response updateCustomer(int id, Customer customer) {
		customer.setId(id);
		customerDAO.updateCustomer(customer);
		return Response.ok("Customer updated succesfully!!").header("Cache-Control", "no-cache, must-revalidate").header("Access-Control-Allow-Origin","*").build();
	}

	@Override
	public Response createCustomer(Customer customer) {
		customerDAO.createCustomer(customer);
		return Response.created(URI.create("/"+customer.getId())).header("Cache-Control", "no-cache, must-revalidate").header("Access-Control-Allow-Origin","*").build();
	}

	@Override
	public Response deleteCustomer(int id) {
		customerDAO.deleteCustomer(id);
		return Response.ok("Customer deleted successfully!!").header("Cache-Control", "no-cache, must-revalidate").header("Access-Control-Allow-Origin","*").build();
	}

}
