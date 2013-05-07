/**
 * 
 */
package com.restfully.shop.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.restfully.shop.domain.Customer;

/**
 * @author vpsrini
 *
 */
public interface JSONCustomerResource extends Resource
{
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCustomers();
	
	@GET
	@Path("{id:\\d+}")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomer(@PathParam("id")int id);
	
	@PUT
	@Path("{id:\\d+}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response updateCustomer(@PathParam("id")int id,Customer customer);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createCustomer(Customer customer);
	
	@DELETE
	@Path("{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response deleteCustomer(@PathParam("id")int id);
}
