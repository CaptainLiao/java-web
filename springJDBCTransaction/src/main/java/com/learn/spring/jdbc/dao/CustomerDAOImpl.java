package com.learn.spring.jdbc.dao;

import com.learn.spring.jdbc.model.Customer;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class CustomerDAOImpl implements ICustomerDAO {

  private DataSource dataSource;

  public void setDataSource(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  public void create(Customer customer) {
    String queryCustomer = "insert into Customer(id, name, addressId) values(?,?,?)";
    String queryAddress = "insert into Address(id, address, country) values(?,?,?)";

    JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

    jdbcTemplate.update(queryAddress, new Object[] {
        customer.getId(),
        customer.getAddress().getAddress(),
        customer.getAddress().getCountry()});
    System.out.println("Insert into Address Table Successfully");

    jdbcTemplate.update(queryCustomer, new Object[] {customer.getId(), customer.getName(), customer.getAddressId()});
    System.out.println("Inserted into Customer Table Successfully");
  }
}




























