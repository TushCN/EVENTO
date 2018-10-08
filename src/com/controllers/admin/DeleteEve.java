package com.controllers.admin;

import com.dao.EventDAOImpl;
import java.io.IOException;
import java.sql.ResultSetMetaData;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/DeleteEve"})
public class DeleteEve
  extends HttpServlet
{
  private static final long serialVersionUID = 1L;
  
  public DeleteEve() {}
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    String e_name = request.getParameter("e_name");
    //PrintWriter out= response.getWriter();
    EventDAOImpl edao = new EventDAOImpl();
    
    try
    {
      edao.deleteeve(e_name);
      response.sendRedirect("AdminOpt.jsp");

    }
    catch (Exception e)
    {
      request.setAttribute("error", e);
      RequestDispatcher rd = request.getRequestDispatcher("Error_page.jsp");
      rd.forward(request, response);
    }
 
  
//	System.out.println("<table width=50% border=1>");  
//	System.out.println("<caption>Upcoming Events</caption>");
//	PreparedStatement rs;
//	ResultSetMetaData col= rs.getMetaData();
//	int t= col.getColumnCount();
//    PrintStream out;
//	out.print("</tr>"); 
//    for(int i=1; i<=t; ++i)
//	{
//		out.println("<th>"+col.getColumnName(i)+"</th>");
//	}
//	while(((ResultSet) rs).next())  
//	{  
//	out.print("<tr><td>"+((ResultSet) rs).getString(1)+"</td><td>"+((ResultSet) rs).getDate(2)+"</td><td>"+((ResultSet) rs).getString(3)+"</td><td>"+((ResultSet) rs).getInt(4)+"</td><td>"+((ResultSet) rs).getString(5)+"</td></tr>");  
//	}
//	out.print("</table>"); 
//	}
//        catch (Exception e) 
//        {
//		request.setAttribute("error",e);
//		RequestDispatcher rd=request.getRequestDispatcher("Error_page.jsp");
//		rd.forward(request, response);
//    }	
//
  }
}



