/**
 * 
 */
package com.restfully.shop.services;

import java.net.URI;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import com.restfully.shop.domain.Customer;
import com.restfully.shop.resources.JSONCustomerResource;

/**
 * @author vpsrini
 *
 */
public class JSonCustomerResource implements JSONCustomerResource {
	
	private Map<Integer,Customer> customerDB = 
			new ConcurrentHashMap<Integer,Customer>(100);
	private AtomicInteger idCounter = new AtomicInteger(1);

	/* (non-Javadoc)
	 * @see com.restfully.shop.resources.JSONCustomerResource#getCustomers()
	 */
	@Override
	public Response getCustomers() {
		System.out.println("Fetching all customers...");
		Customer[] customers = customerDB.values().toArray(new Customer[customerDB.size()]);
		return Response.ok(customers).header("Cache-Control", "no-cache, must-revalidate").header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE").build();
		//'Access-Control-Allow-Methods: GET, POST, PUT, DELETE'
	}

	/* (non-Javadoc)
	 * @see com.restfully.shop.resources.JSONCustomerResource#getCustomer(int)
	 */
	@Override
	public Customer getCustomer(int id) {
		final Customer customer = customerDB.get(id);
		if(customer == null)
		{
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
		System.out.println("Got customer :: "+id);
		return customer;
	}

	/* (non-Javadoc)
	 * @see com.restfully.shop.resources.JSONCustomerResource#updateCustomer(int)
	 */
	@Override
	public Response updateCustomer(int id,Customer customer) {
		Customer current = customerDB.get(id);
		
		if(current == null)
		{
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
		
		current.setFirstName(customer.getFirstName());
		current.setLastName(customer.getLastName());
		current.setStreet(customer.getStreet());
		current.setState(customer.getState());
		current.setCity(customer.getCity());
		current.setZip(customer.getZip());
		current.setCountry(customer.getCountry());
		System.out.println("Updated customer :: "+id);
		return Response.ok("Customer updated succesfully!!").header("Cache-Control", "no-cache, must-revalidate").build();
		
		//header("Cache-Control: no-cache, must-revalidate")
	}

	/* (non-Javadoc)
	 * @see com.restfully.shop.resources.JSONCustomerResource#createCustomer(com.restfully.shop.domain.Customer)
	 */
	@Override
	public Response createCustomer(Customer customer) {
		customer.setId(idCounter.incrementAndGet());
		customerDB.put(customer.getId(), customer);
		System.out.println("Created customer: "+customer.getId());
		return Response.created(URI.create("/"+customer.getId())).build();
	}

	/* (non-Javadoc)
	 * @see com.restfully.shop.resources.JSONCustomerResource#deleteCustomer(int)
	 */
	@Override
	public Response deleteCustomer(int id) {
		Customer current = customerDB.get(id);
		
		if(current == null)
		{
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
		
		customerDB.remove(id);
		System.out.println("Deleted customer :: "+id);
		return Response.ok("Customer deleted successfully!!").build();
	}

}
