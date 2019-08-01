package com.learn.spring.jdbc.service;

import com.learn.spring.jdbc.dao.ICustomerDAO;
import com.learn.spring.jdbc.model.Customer;
import org.springframework.transaction.annotation.Transactional;

public class CustomerManagerImpl implements ICustomerManager {
  ICustomerDAO customerDAO = null;

  public void setCustomerDAO(ICustomerDAO customerDAO) {
    this.customerDAO = customerDAO;
  }

  @Transactional
  public void createCustomer(Customer customer) {
    customerDAO.create(customer);
  }
}
