package com.dao;

import com.connect.DBConnection;
import com.model.Event;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EventDAOImpl implements EventDAO
{
  public EventDAOImpl() {}
  
  public boolean updateeve(Event e) throws Exception
  {
    String sql1 = "update ROHAN.events set dt= ?, venue= ?, fees= ?, About= ? where e_name= ?";
    PreparedStatement st = com.connect.DBConnection.getCon().prepareStatement(sql1);
    st.setString(1, e.getDt());
    st.setString(2, e.getVenue());
    st.setString(3, e.getFees());
    st.setString(4, e.getabout());
    st.setString(5, e.gete_name());
    int i = st.executeUpdate();
    return i == 1;
  }
  

  public java.sql.ResultSet allevents()
    throws Exception
  {
    String sql2 = "select * from ROHAN.events where dt > sysdate";
    PreparedStatement st = com.connect.DBConnection.getCon().prepareStatement(sql2);
    java.sql.ResultSet rs = st.executeQuery();
    return rs;
  }
  
  public boolean isEvent(String e_name) throws Exception
  {
    String sql0 = "select * from ROHAN.events where e_name = ?";
    PreparedStatement st = com.connect.DBConnection.getCon().prepareStatement(sql0);
    st.setString(1, e_name);
    java.sql.ResultSet rs = st.executeQuery();
    if (rs.next())
    {
      return true;
    }
    return false;
  }
  
  public java.sql.ResultSet searchevent(String ser) throws Exception
  {
    String sql3 = "select * from ROHAN.events where e_name like ? and dt>sysdate";
    PreparedStatement st = com.connect.DBConnection.getCon().prepareStatement(sql3);
    st.setString(1, ser);
    java.sql.ResultSet rs = st.executeQuery();
    return rs;
  }
  
  public java.sql.ResultSet perevent(String e_name) throws Exception
  {
    String sql4 = "select participant from ROHAN.participants where e_name like ?";
    PreparedStatement st = com.connect.DBConnection.getCon().prepareStatement(sql4);
    st.setString(1, e_name);
    java.sql.ResultSet rs = st.executeQuery();
    return rs;
  }
  
  public boolean inserteve(Event e) throws Exception
  {
    PreparedStatement pstmt = com.connect.DBConnection.getCon().prepareStatement("insert into ROHAN.events values(?,?,?,?,?)");
    pstmt.setString(1, e.gete_name());
    pstmt.setString(2, e.getDt());
    pstmt.setString(3, e.getVenue());
    pstmt.setString(4, e.getFees());
    pstmt.setString(5, e.getabout());
    int i = pstmt.executeUpdate();
    return i == 1;
  }
  
  public boolean deleteeve(String e_name)
    throws Exception
  {
    PreparedStatement pstmt1 = com.connect.DBConnection.getCon().prepareStatement("delete from ROHAN.participants where e_name='" + e_name + "'");
    PreparedStatement pstmt = com.connect.DBConnection.getCon().prepareStatement("delete from ROHAN.events where e_name='" + e_name + "'");
    int i = pstmt1.executeUpdate();
    int j = pstmt.executeUpdate();
    return (i == 1) && (j == 1);
  }
  
  public boolean deleteuserfromeve(String u_name, String e_name) throws Exception
  {
    PreparedStatement pstmt = com.connect.DBConnection.getCon().prepareStatement("delete from ROHAN.participants where u_name='" + u_name + "' AND e_name='" + e_name + "'");
    int i = pstmt.executeUpdate();
    return i == 1;
  }


  
//  public Event getDetails(String e_name) throws Exception
//	{
//	String sql8= "select * from ROHAN.events where e_name like ? and dt>sysdate";
//	PreparedStatement st= DBConnection.getCon().prepareStatement(sql8);
//	st.setString(1, e_name);
//		ResultSet rs= st.executeQuery();
//		
//		EntityManager em=new EntityManager();
//		Event e = em.find(Event.class, e_name);
//	return e;
//	}




}



