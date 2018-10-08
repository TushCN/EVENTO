package com.model;


public class Student
{
  String u_name;
  String password;
  
  public Student(String u_name, String password)
  {
    this.u_name = u_name;
    this.password = password;
  }
  
  public String getu_name() { return u_name; }
  
  public void setu_name(String u_name) {
    this.u_name = u_name;
  }
  
  public String getPassword() { return password; }
  
  public void setPassword(String password) {
    this.password = password;
  }
}
