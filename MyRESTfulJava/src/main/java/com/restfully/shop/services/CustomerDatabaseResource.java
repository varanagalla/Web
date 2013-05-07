/**
 * 
 */
package com.restfully.shop.services;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.restfully.shop.resources.JSONHibCustomerResource;
import com.restfully.shop.resources.Resource;
import com.sun.jersey.spi.resource.Singleton;
import com.restfully.dao.CustomerDAO;

/**
 * @author vpsrini
 *
 */
@Singleton
@Path("/customers")
public class CustomerDatabaseResource {
	
	private volatile Map<String, Resource> datasources = new ConcurrentHashMap<String, Resource>();
	
	@Path("{database}-db")
	public Resource getDatabase(@PathParam("database") String database){
		Resource resource = datasources.get(database);
		
		if(resource == null){
			
			if(database.equalsIgnoreCase("XML")){
				resource = new CustomerResourceService();
			}
			else if(database.equalsIgnoreCase("JSON")){
				resource = new JSONHibCustomerResource(new CustomerDAO());
			}		
			
			datasources.put(database, resource);
		}
		
		return resource;
	}

}
