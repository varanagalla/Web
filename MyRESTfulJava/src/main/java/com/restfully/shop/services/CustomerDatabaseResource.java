/**
 * 
 */
package com.restfully.shop.services;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.restfully.shop.resources.CustomerResource;
import com.sun.jersey.spi.resource.Singleton;

/**
 * @author vpsrini
 *
 */
@Singleton
@Path("/customers")
public class CustomerDatabaseResource {
	
	private volatile Map<String, CustomerResource> datasources = new ConcurrentHashMap<String, CustomerResource>();
	
	@Path("{database}-db")
	public CustomerResource getDatabase(@PathParam("database") String database){
		System.out.println("Asked for "+database);
		CustomerResource resource = datasources.get(database);
		
		if(resource == null){
			resource = new CustomerResourceService();
			datasources.put(database, resource);
		}
		
		return resource;
	}

}
