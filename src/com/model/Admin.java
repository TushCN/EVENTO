package com.model;


public class Admin
{
  String a_name;
  String a_pass;
  
  public Admin(String a_name, String a_pass)
  {
    this.a_name = a_name;
    this.a_pass = a_pass;
  }
  
  public String geta_name() { return a_name; }
  
  public void seta_name(String a_name) {
    this.a_name = a_name;
  }
  
  public String geta_pass() { return a_pass; }
  
  public void seta_pass(String a_pass) {
    this.a_pass = a_pass;
  }
}
