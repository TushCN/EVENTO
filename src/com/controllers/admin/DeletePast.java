package com.controllers.admin;

  import java.io.IOException;

  import java.io.PrintWriter;
  import java.sql.PreparedStatement;
  import java.sql.ResultSet;
  import java.sql.ResultSetMetaData;
 
  import javax.servlet.RequestDispatcher;
  import javax.servlet.ServletException;
  import javax.servlet.annotation.WebServlet;
  import javax.servlet.http.HttpServlet;
  import javax.servlet.http.HttpServletRequest;
  import javax.servlet.http.HttpServletResponse;
  
  import com.connect.DBConnection;


 @WebServlet("/DeletePast")
public class DeletePast extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	String sql10= "delete from ROHAN.events where dt<sysdate";
	String sql11= "select * from ROHAN.events";

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out= response.getWriter();
		try {
			PreparedStatement st1= DBConnection.getCon().prepareStatement(sql10);
     		PreparedStatement st2= DBConnection.getCon().prepareStatement(sql11);
     		st1.executeUpdate();
			ResultSet rs= st2.executeQuery();
			out.print("<table width=50% border=1>");  
			out.print("<caption>Upcoming Events</caption>");
			ResultSetMetaData col= rs.getMetaData();
			int t= col.getColumnCount();
			out.print("</tr>"); 
			for(int i=1; i<=t; ++i)
			{
				out.println("<th>"+col.getColumnName(i)+"</th>");
			}
			while(rs.next())  
			{  
			out.print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getDate(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getInt(4)+"</td><td>"+rs.getString(5)+"</td></tr>");  
			}
			out.print("</table>");	
		}
		catch (Exception e) {
			request.setAttribute("error",e);
			RequestDispatcher rd=request.getRequestDispatcher("Error_page.jsp");
			rd.forward(request, response);
		}
	}

 }


                                                                                                                                                                                                                                          