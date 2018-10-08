package com.dao;

import com.connect.DBConnection;
import com.model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDAOImpl implements StudentDAO
{
  public StudentDAOImpl() {}
  
  public boolean check(String u_name, String password) throws Exception
  {
    String sql = "select * from ROHAN.users where u_name= ? and password= ?";
    PreparedStatement st = DBConnection.getCon().prepareStatement(sql);
    st.setString(1, u_name);
    st.setString(2, password);
    ResultSet rs = st.executeQuery();
    if (rs.next())
    {
      return true;
    }
    return false;
  }
  
  public boolean insertrec(String u_name, String password) throws Exception
  {
    String sql1 = "insert into ROHAN.users values (?, ?)";
    PreparedStatement st = DBConnection.getCon().prepareStatement(sql1);
    st.setString(1, u_name);
    st.setString(2, password);
    int i = st.executeUpdate();
    return i == 1;
  }
  
  public boolean register(String u_name, String e_name)
    throws Exception
  {
    String sql2 = "insert into ROHAN.participants values (?, ?)";
    PreparedStatement st = DBConnection.getCon().prepareStatement(sql2);
    st.setString(1, u_name);
    st.setString(2, e_name);
    int i = st.executeUpdate();
    return i == 1;
  }
  
  public ResultSet allusers() throws Exception
  {
    String sql3 = "select u_name from ROHAN.users";
    PreparedStatement st = DBConnection.getCon().prepareStatement(sql3);
    ResultSet rs = st.executeQuery();
    return rs;
  }
  
  public ResultSet peruser(String u_name) throws Exception
  {
    String sql4 = "select participant from ROHAN.participants where u_name=?";
    PreparedStatement st = DBConnection.getCon().prepareStatement(sql4);
    st.setString(1, u_name);
    ResultSet rs = st.executeQuery();
    return rs;
  }
  
  public boolean updaterec(Student s) throws Exception {
    String sql5 = "update ROHAN.users set password= ? where u_name= ?";
    
    PreparedStatement st = DBConnection.getCon().prepareStatement(sql5);
    st.setString(1, s.getPassword());
    st.setString(2, s.getu_name());
    int i = st.executeUpdate();
    return i == 1;
  }
  


  public boolean allparticipants(String u_name)
    throws Exception
  {
    String sql = "select * from ROHAN.participants where u_name= ?";
    PreparedStatement st = DBConnection.getCon().prepareStatement(sql);
    st.setString(1, u_name);
    ResultSet rs = st.executeQuery();
    if (rs.next())
    {
      return true;
    }
    return false;
  }
  
  public boolean deleterec(String u_name) throws Exception
  {
    if (allparticipants(u_name))
    {
      PreparedStatement pstmt1 = DBConnection.getCon().prepareStatement("delete from ROHAN.participants where u_name='" + u_name + "'");
      pstmt1.executeUpdate();
    }
    PreparedStatement pstmt = DBConnection.getCon().prepareStatement("delete from ROHAN.users where u_name='" + u_name + "'");
    int j = pstmt.executeUpdate();
    return j == 1;
  }
  
	public boolean isUser(String u_name) throws Exception
	{
		String sql0= "select * from ROHAN.users where u_name = ?";
		PreparedStatement st= DBConnection.getCon().prepareStatement(sql0);
		st.setString(1, u_name);
		ResultSet rs= st.executeQuery();
		if(rs.next())
		{
			return true;
		}
		return false;
	}
	


//	public void insertrec(String uname, String pwd) throws Exception
//	{
//		
//	String sql3= "insert into shubham.stu_login values (?, ?)";	
//		PreparedStatement st= DBConnection.getCon().prepareStatement(sql3);
//		st.setString(1, uname);
//		st.setString(2, pwd);
//		st.executeUpdate();
	
//	}
	
}

