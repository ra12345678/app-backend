package com.example.app;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;
  private String email;

  public Customer() {}
  public Customer(String name, String email) { this.name = name; this.email = email; }

  public Integer getId() { return id; }
  public String getName() { return name; }
  public String getEmail() { return email; }

  public void setId(Integer id) { this.id = id; }
  public void setName(String name) { this.name = name; }
  public void setEmail(String email) { this.email = email; }
}
