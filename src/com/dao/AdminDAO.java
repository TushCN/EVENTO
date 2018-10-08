package com.dao;

import com.model.Admin;

public abstract interface AdminDAO
{
  public abstract boolean check(String paramString1, String paramString2)
    throws Exception;
  
  public abstract boolean change_to(Admin paramAdmin)
    throws Exception;

  public void updateeve(String e_name, String dt, String venue, String fees, String about) throws Exception;
  
  public void insertrec(String u_name, String password) throws Exception;
  
  public void inserteve(String e_name, String dt, String venue, String fees, String about) throws Exception;
  
  public void deleterec(String u_name) throws Exception;

}
