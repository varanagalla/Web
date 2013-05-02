/**
 * 
 */
package com.restfully.shop.services;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import javax.ws.rs.core.UriInfo;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.restfully.shop.domain.Customer;
import com.restfully.shop.resources.CustomerResource;

/**
 * @author Sysadmin
 *
 */
//@Singleton
//@Path("/customers")
public class CustomerResourceService implements CustomerResource{
	private Map<Integer,Customer> customerDB = 
			new ConcurrentHashMap<Integer,Customer>(100);
	private AtomicInteger idCounter = new AtomicInteger(1);
	
	/*@POST
	@Consumes(MediaType.APPLICATION_XML)*/
	public Response createCustomer(InputStream is)
	{
		Customer customer = readCustomer(is);
		customer.setId(idCounter.incrementAndGet());
		customerDB.put(customer.getId(), customer);
		System.out.println("Created customer: "+customer.getId());
		return Response.created(URI.create("/customers/"+customer.getId())).build();
	}

	protected Customer readCustomer(InputStream is) {
		Customer cust = null;
		try
		{
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document doc = builder.parse(is);
			
			Element root = doc.getDocumentElement();
			cust = new Customer();
			if(root.getAttribute("id") != null &&
					!root.getAttribute("id").trim().equals(""))
			{
				cust.setId(Integer.valueOf((root.getAttribute("id"))));
			}
			NodeList nodes = root.getChildNodes();
			for (int i = 0; i < nodes.getLength(); i++) {
				Element element = (Element) nodes.item(i);
				if (element.getTagName().equals("first-name")) {
				cust.setFirstName(element.getTextContent());
				}
				else if (element.getTagName().equals("last-name")) {
				cust.setLastName(element.getTextContent());
				}
				else if (element.getTagName().equals("street")) {
				cust.setStreet(element.getTextContent());
				}
				else if (element.getTagName().equals("city")) {
				cust.setCity(element.getTextContent());
				}
				else if (element.getTagName().equals("state")) {
				cust.setState(element.getTextContent());
				}
				else if (element.getTagName().equals("zip")) {
				cust.setZip(element.getTextContent());
				}
				else if (element.getTagName().equals("country")) {
				cust.setCountry(element.getTextContent());
				}
			}
			
		}
		catch(Exception e){
			throw new WebApplicationException(e, Response.Status.BAD_REQUEST);
		}
		return cust;
	}
	/*@GET
	@Path("{id : \\d+}")
	@Produces(MediaType.APPLICATION_XML)*/
	public StreamingOutput getCustomer(/*@PathParam("id")*/int id)
	{
		final Customer customer = customerDB.get(id);
		if(customer == null)
		{
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
		return new StreamingOutput() {
			
			@Override
			public void write(OutputStream output) throws IOException,
					WebApplicationException {
				outputCustomer(output,customer);
			}
			
		};
	}
	
	protected void outputCustomer(OutputStream output, Customer customer) {
		PrintStream writer = new PrintStream(output);
		writer.println("<customer id="+customer.getId() + "\">");
		writer.println("	<first-name>"+customer.getFirstName()+"</first-name>");
		writer.println("	<last-name>" + customer.getLastName()
						+ "</last-name>");
		writer.println(" 	<street>" + customer.getStreet() + "</street>");
		writer.println("    <city>" + customer.getCity() + "</city>");
		writer.println("    <state>" + customer.getState() + "</state>");
		writer.println("    <zip>" + customer.getZip() + "</zip>");
		writer.println("    <country>" + customer.getCountry() + "</country>");
		writer.println("</customer>");
		writer.close();
	}
	
	/*@PUT
	@Path("{id}")
	@Consumes(MediaType.APPLICATION_XML)*/
	public void updateCustomer(/*@PathParam("id")*/int id, InputStream is)
	{
		Customer customer = readCustomer(is);
		Customer current = customerDB.get(id);
		
		if(current == null)
		{
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
		
		current.setFirstName(customer.getFirstName());
		current.setLastName(customer.getLastName());
		current.setStreet(customer.getStreet());
		current.setState(customer.getState());
		current.setZip(customer.getZip());
		current.setCountry(customer.getCountry());
		
	}
	
	/*@Path("{id}")
	@LOCK*/
	public void lockIt(/*@PathParam("id")*/int id){
		System.out.println("Hey man!!! Lock me!!!");
	}

	@Override
	public StreamingOutput getCustomer(UriInfo info) {
		System.out.println("info.getPath()" +info.getPath());
		List<PathSegment> pathSegments = info.getPathSegments();
		if(pathSegments != null)
		{
			for(PathSegment pathSegment : pathSegments){
				System.out.println("pathSegment.getPath() :: "+pathSegment.getPath());
				System.out.println("pathSegment.getMatrixParameters() :: "+pathSegment.getMatrixParameters());
			}
		}
		System.out.println(info.getPathParameters());		
		return new StreamingOutput() {
			
			@Override
			public void write(OutputStream output) throws IOException,
					WebApplicationException {
				PrintStream writer = new PrintStream(output);
				writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?><customer id=\"1\"><first-name>Vara</first-name>" + 
							   "<last-name>Nagalla</last-name><street>2000 CRYSTAL SPRINGS ROAD</street><city>SAN BRUNO</city>"+
							   "<state>CA</state><zip>94066</zip><country>USA</country></customer>");
			}
			
		};
	}
	
	
	
	
}
