package com.learn.spring.jdbc;

import com.learn.spring.jdbc.model.Address;
import com.learn.spring.jdbc.model.Customer;
import com.learn.spring.jdbc.service.CustomerManagerImpl;
import com.learn.spring.jdbc.service.ICustomerManager;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionManagerTest {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.cfg.xml");

    ICustomerManager customerManager = ctx.getBean("customerManager", CustomerManagerImpl.class);

    Customer customer = createDummyCustomer();
    customerManager.createCustomer(customer);

    ctx.close();
  }

  private static Customer createDummyCustomer() {
    Address address = new Address();
    address.setId(4);
    address.setCountry("India4");
    // 长度超过 20，导致 sql 插入失败，以验证事务
    address.setAddress("kill D4");

    Customer customer = new Customer();
    customer.setId(4);
    customer.setName("求带4");
    customer.setAddress(address);
    customer.setAddressId(4);

    return customer;
  }
}














