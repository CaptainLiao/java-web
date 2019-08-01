package com.liaofy.hibernate.main;

import com.liaofy.hibernate.model.Employee1;
import com.liaofy.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Date;

public class HibernateAnnotationTest {
  public static void main(String[] args) {
    Employee1 emp = new Employee1();
    emp.setName("钱大2");
    emp.setRole("UFO");
    emp.setInsertTime(new Date());

    // get session
    SessionFactory sessionFactory = HibernateUtil.getSessionJavaConfigFactory();
    Session session = sessionFactory.getCurrentSession();
    // start transaction
    session.beginTransaction();
    session.save(emp);
    session.getTransaction().commit();
    System.out.println("Employee ID = " + emp.getId());

    // 终止 sessionFactory，否则程序不会结束
    sessionFactory.close();
  }
}
