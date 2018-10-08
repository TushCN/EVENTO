package com.controllers;

import com.dao.EventDAOImpl;
import com.dao.StudentDAOImpl;
import java.io.IOException;
//import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet({"/Register"})
public class Register
  extends HttpServlet
{
  private static final long serialVersionUID = 1L;
  
  public Register() {}
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    response.getWriter().append("Served at: ").append(request.getContextPath());
  }
  

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    //HttpSession session = request.getSession();
    


    String u_name = request.getParameter("u_name");
    String e_name = request.getParameter("e_name");
    StudentDAOImpl sdao = new StudentDAOImpl();
    EventDAOImpl edao = new EventDAOImpl();
    try
    {
      if (edao.isEvent(e_name))
      {
        sdao.register(u_name, e_name);
        response.sendRedirect("ShowEventDetails.jsp");
      }
      else
      {
        request.setAttribute("auth", "wrong");
        RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
        rd.forward(request, response);
      }
    }
    catch (Exception e)
    {
      request.setAttribute("error", e);
      RequestDispatcher rd = request.getRequestDispatcher("Error_page.jsp");
      rd.forward(request, response);
    }
  }
}
