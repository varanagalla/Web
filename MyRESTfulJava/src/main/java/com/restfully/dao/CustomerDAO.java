/**
 * 
 */
package com.restfully.dao;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.restfully.shop.domain.Customer;
/**
 * @author vpsrini
 *
 */
public class CustomerDAO {
	
	private HibernateSessionBuilder builder = null;
	
	public CustomerDAO(){
		this.builder = new HibernateSessionBuilder();
	}
	
	/**
	 * 
	 * @param customer
	 */
	public void createCustomer(Customer customer){
		Session session = null;
		Transaction tx = null;
		try{
			session = builder.getSession();
			tx = session.beginTransaction();
			session.save(customer);
			tx.commit();
		}
		catch(HibernateException hEx){
			tx.rollback();
			throw hEx;
		}
		finally{
			builder.closeSession(session);
		}
	}
	
	/**
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public Customer[] readAllCustomers(){
		Customer[] customers = null;
		Session session = null;
		try{
			session = builder.getSession();
			List<Object> custList =  session.createQuery("from Customer").list();
			if(custList != null && !custList.isEmpty()){
				customers = (Customer[]) custList.toArray(new Customer[custList.size()]);
				custList.clear();
				custList = null;
			}
		}
		catch(HibernateException hEx){
			throw hEx;
		}
		finally{
			builder.closeSession(session);
		}
		return customers;
		
	}
	
	public Customer readCustomerById(Integer custId){
		Customer customer = null;
		Session session = null;
		try{
			session = builder.getSession();
			customer = (Customer)session.get(Customer.class, custId);
		}
		catch(HibernateException hEx){
			throw hEx;
		}
		finally{
			builder.closeSession(session);
		}
		return customer;
		
	}
	
	/**
	 * 
	 * @param customer
	 */
	public void updateCustomer(Customer customer){
		Session session = null;
		Transaction tx = null;
		try{
			session = builder.getSession();
			tx = session.beginTransaction();
			session.update(customer);
			tx.commit();
		}
		catch(HibernateException hEx){
			tx.rollback();
			throw hEx;
		}
		finally{
			builder.closeSession(session);
		}
	}
	
	/**
	 * 
	 * @param customer
	 */
	public void deleteCustomer(Integer custId){
		Session session = null;
		Transaction tx = null;
		try{
			session = builder.getSession();
			tx = session.beginTransaction();
			session.delete(session.get(Customer.class, custId));
			tx.commit();
		}
		catch(HibernateException hEx){
			tx.rollback();
			throw hEx;
		}
		finally{
			builder.closeSession(session);
		}
	}
	
	
	
}
