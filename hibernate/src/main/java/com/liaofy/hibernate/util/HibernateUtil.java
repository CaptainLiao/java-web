package com.liaofy.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
  private static SessionFactory sessionXMLFactory;
  private static SessionFactory sessionAnnotationFactory;
  private static SessionFactory sessionJavaConfigFactory;

  private static SessionFactory buildSessionXMLFactory() {
    Configuration configuration = new Configuration();
    configuration.configure("hibernate.cfg.xml");

    System.out.println("Hibernate Configuration loaded");

    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
        .applySettings(configuration.getProperties())
        .build();
    System.out.println("Hibernate serviceRegistry created");

    SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

    return sessionFactory;
  }

  private static SessionFactory buildSessionAnnotationFactory() {
    Configuration configuration = new Configuration();
    configuration.configure("hibernate-annotation.cfg.xml");

    System.out.println("Hibernate Annotation Configuration loaded");

    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
        .applySettings(configuration.getProperties())
        .build();
    System.out.println("Hibernate Annotation serviceRegistry created");

    SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

    return sessionFactory;
  }

  public static SessionFactory getSessionXMLFactory() {
    if (sessionXMLFactory == null) sessionXMLFactory = buildSessionXMLFactory();
    return sessionXMLFactory;
  }

  public static SessionFactory getSessionJavaConfigFactory() {
    if (sessionAnnotationFactory == null) sessionAnnotationFactory = buildSessionAnnotationFactory();
    return sessionAnnotationFactory;
  }
}





































