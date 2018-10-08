package com.dao;

import com.model.Student;
import java.sql.ResultSet;

public abstract interface StudentDAO
{
  public abstract boolean check(String paramString1, String paramString2)
    throws Exception;
  
  public abstract boolean insertrec(String paramString1, String paramString2)
    throws Exception;
  
  public abstract boolean register(String paramString1, String paramString2)
    throws Exception;
  
  public abstract ResultSet allusers()
    throws Exception;
  
  public abstract ResultSet peruser(String paramString)
    throws Exception;
  
  public abstract boolean updaterec(Student paramStudent)
    throws Exception;
  
  public abstract boolean deleterec(String paramString)
    throws Exception;
  
  public boolean isUser(String paramString) 
		  throws Exception;
  
  
}
