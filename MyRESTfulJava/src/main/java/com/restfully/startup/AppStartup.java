package com.restfully.startup;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class AppStartup
 */
public class AppStartup extends HttpServlet {
	private static SessionFactory sessionFactory = null;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AppStartup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		if(sessionFactory == null || sessionFactory.isClosed()){
			sessionFactory = new Configuration().configure().buildSessionFactory();
			System.out.println("Hibernate Session Factory built successfully.");
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		if(sessionFactory != null && !sessionFactory.isClosed()){
			sessionFactory.close();
			System.out.println("Hibernate Session Factory closed successfully.");
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}

}
