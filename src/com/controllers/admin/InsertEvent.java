package com.controllers.admin;

import com.dao.EventDAOImpl;
import com.model.Event;
//import java.io.PrintStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@javax.servlet.annotation.WebServlet({"/InsertEvent"})
public class InsertEvent extends HttpServlet
{
  private static final long serialVersionUID = 1L;
  
  public InsertEvent() {}
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException
  {
    String E_name = request.getParameter("E_NAME");
    String dt = request.getParameter("DT");
    String venue = request.getParameter("venue");
    String fees =  request.getParameter("FEES");
    String about = request.getParameter("about");
    EventDAOImpl edao = new EventDAOImpl();
    try {
      if (edao.inserteve(new Event(E_name, dt, venue, fees, about)))
        response.sendRedirect("AdminOpt.jsp"); else {
        System.out.println("WRONG");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
