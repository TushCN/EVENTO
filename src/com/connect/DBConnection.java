package com.connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection
{
  private static Connection con;
  
  static
  {
    try
    {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "ROHAN", "12345");
    }
    catch (Exception e)
    {
      System.out.println(e);
    } }
  
  public DBConnection() {}
  
  public static Connection getCon() { return con; }
}
