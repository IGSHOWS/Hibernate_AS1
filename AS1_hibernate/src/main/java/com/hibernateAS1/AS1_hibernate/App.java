package com.hibernateAS1.AS1_hibernate;

import org.hibernate.SessionFactory;

import com.hibernateAS1.AS1_hibernate.config.HibernateConfig;

/**
 * Hello world!
 *
 */
public class App 
{
	private static SessionFactory factory = HibernateConfig.getSessionFactory();
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
