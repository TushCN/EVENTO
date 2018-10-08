package com.controllers.events;

import com.dao.EventDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/Showspec"})
public class Showspec extends HttpServlet
{
  private static final long serialVersionUID = 1L;
  
  public Showspec() {}
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
    String ser = request.getParameter("ser");
    PrintWriter out = response.getWriter();
    try {
      EventDAOImpl edao = new EventDAOImpl();
      ResultSet rs = edao.searchevent(ser);
      out.print("<html>");
      out.print("<head>");
      out.print("<link rel=\"stylesheet\" href=\"showspec.css\">");
      out.print("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
      out.print("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">");
      out.print("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>");
      out.print("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>");
	  out.print("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">");      


      out.print("</head>");
      out.print("<body class=yy>");
      out.print("<div id=sq>");
      out.print("<center>");
      out.print("<table  width=70% border=1>");
      out.print("<caption><h1 class=id>Your result</h1></caption>");
      ResultSetMetaData col = rs.getMetaData();
      int t = col.getColumnCount();
      out.print("</tr>");
      for (int i = 1; i <= t; i++)
      {
        out.println("<th class=ip>" + col.getColumnName(i) + "</th>");
      }
      while (rs.next())
      {
        out.print("<tr class=id><td>" + rs.getString(1) + "</td><td>" + rs.getDate(2) + "</td><td>" + rs.getString(3) + "</td><td>" + rs.getInt(4) + "</td><td>" + rs.getString(5) + "</td></tr>");
      }
      out.print("</table>");
      out.print("<a href=/EventManagement/ShowEventDetails.jsp><input class=btn  type=button value=BACK style=margin-top:15px></a>");
      out.print("</center>");
      out.print("</div>");
      out.print("</body>");
      out.print("</html>");
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}
