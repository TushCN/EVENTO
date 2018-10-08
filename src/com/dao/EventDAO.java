package com.dao;

import com.model.Event;
import java.sql.ResultSet;

public abstract interface EventDAO
{
  public abstract ResultSet allevents()
    throws Exception;
  
  public abstract boolean isEvent(String paramString)
    throws Exception;
  
  public abstract ResultSet searchevent(String paramString)
    throws Exception;
  
  public abstract ResultSet perevent(String paramString)
    throws Exception;
  
  public abstract ResultSet  inserteve(String  paramString)
    throws Exception;
  
  public abstract ResultSet  updateeve(String  paramString)
    throws Exception;
  
  public abstract boolean deleteeve(String paramString)
    throws Exception;
  
  public abstract boolean deleteuserfromeve(String paramString1, String paramString2)
    throws Exception;
  
}



