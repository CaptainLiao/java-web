package com.learn.spring.jdbc.model;

public class Customer {
  private int id;
  private int addressId;
  private String name;
  private Address address;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getAddressId() {
    return addressId;
  }

  public void setAddressId(int addressId) {
    this.addressId = addressId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }


  @Override
  public String toString() {
    return "Customer{" +
        "id=" + id +
        ", addressId=" + addressId +
        ", name='" + name + '\'' +
        ", address=" + address +
        '}';
  }

}
