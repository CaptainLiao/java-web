package com.learn.spring.jdbc.test;

import com.learn.spring.jdbc.dao.IEmployeeDAO;
import com.learn.spring.jdbc.model.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Random;

public class SpringJDBCTest {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-bean.xml");

    IEmployeeDAO employeeDAO = ctx.getBean("employeeDao", IEmployeeDAO.class);

    Employee employee = new Employee();
    int rand = new Random().nextInt(1000);
    employee.setId(rand);
    employee.setName("李四");
    employee.setRole("Java Developer");

    employeeDAO.save(employee);

    Employee employee1 = employeeDAO.getById(rand);
    System.out.println("Employee Retrieved::" + employee1);

    //Update
    employee.setRole("CEO");
    employeeDAO.update(employee);

    //Get All
    List<Employee> empList = employeeDAO.getAll();
    System.out.println(empList);

    //Delete
    employeeDAO.deleteById(rand);

    //Close Spring Context
    ctx.close();

    System.out.println("DONE");
  }
}

























