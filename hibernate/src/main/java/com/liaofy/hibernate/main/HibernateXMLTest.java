package com.liaofy.hibernate.main;

import com.liaofy.hibernate.model.Employee;
import com.liaofy.hibernate.util.HibernateUtil;
import org.hibernate.Session;

import java.util.Date;

public class HibernateXMLTest {
  public static void main(String[] args) {
    Employee emp = new Employee();
    emp.setName("王五4");
    emp.setRole("Worker4");
    emp.setInsertTime(new Date());

    // get session
    Session session = HibernateUtil.getSessionXMLFactory().getCurrentSession();
    // start transaction
    session.beginTransaction();
    session.save(emp);
    session.getTransaction().commit();
    System.out.println("Employee ID = " + emp.getId());

    // 终止 session factory，否则程序不会结束
    HibernateUtil.getSessionXMLFactory().close();
  }
}

































