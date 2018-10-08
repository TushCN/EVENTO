package com.dao;

import com.connect.DBConnection;
import com.model.Admin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDAOImpl implements AdminDAO
{
  public AdminDAOImpl() {}
  
  public boolean check(String a_name, String a_pass) throws Exception
  {
    String sql = "select * from ROHAN.admin where a_name= ? and a_pass= ?";
    PreparedStatement st = com.connect.DBConnection.getCon().prepareStatement(sql);
    st.setString(1, a_name);
    st.setString(2, a_pass);
    ResultSet rs = st.executeQuery();
    if (rs.next())
    {
      return true;
    }
    return false;
  }
  
  
  
  public boolean change_to(Admin a)
throws Exception
{
String sql4 = "update ROHAN.admin set a_name= ? and a_pass= ?";
PreparedStatement st = com.connect.DBConnection.getCon().prepareStatement(sql4);
st.setString(2, a.geta_pass());
st.setString(1, a.geta_name());
int i = st.executeUpdate();
return i == 1;
}

	public void updateeve(String e_name, String dt, String venue, String fees, String about) throws Exception
	{
		String sql5= "update ROHAN.events set dt= ?, venue= ?, fees= ?, About= ? where e_name= ?";
			
		PreparedStatement st= DBConnection.getCon().prepareStatement(sql5);
		st.setString(1, dt);
		st.setString(2, venue);
		st.setString(3, fees);
		st.setString(4, about);
		st.setString(5, e_name);
		st.executeUpdate();
	
	}
	
	public void insertrec(String u_name, String password) throws Exception
	{
		
		String sql3= "insert into ROHAN.users values (u_name= ?,password= ?)";	
		
		PreparedStatement st2= DBConnection.getCon().prepareStatement(sql3);
		st2.setString(1, u_name);
		st2.setString(2, password);
		st2.executeUpdate();
	
	}

	public void inserteve(String e_name, String dt, String venue, String fees, String about) throws Exception
	{
		String sql4= "insert into ROHAN.events values (?, ?, ?, ?, ?)";
		
		PreparedStatement st= DBConnection.getCon().prepareStatement(sql4);
		st.setString(1, e_name);
		st.setString(2, dt);
		st.setString(3, venue);
		st.setString(4, fees);
		st.setString(5, about);
		st.executeUpdate();
	
	}
	
	public void deleterec(String u_name) throws Exception
	{
		String sql7= "delete from ROHAN.users where u_name= ?";
		
		PreparedStatement st1= DBConnection.getCon().prepareStatement(sql7);
		st1.setString(1, u_name);
		st1.executeUpdate();
	}
	
}



  
