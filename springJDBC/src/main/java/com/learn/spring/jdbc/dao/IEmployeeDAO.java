package com.learn.spring.jdbc.dao;

import com.learn.spring.jdbc.model.Employee;

import java.util.List;

// CRUD operations
public interface IEmployeeDAO {

  public void save(Employee employee);

  public Employee getById(int id);

  public void update(Employee employee);

  public void deleteById(int id);

  public List<Employee> getAll();
}
