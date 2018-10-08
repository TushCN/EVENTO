package com.controllers;

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


@WebServlet({"/SignUp"})
public class SignUp
  extends HttpServlet
{
  private static final long serialVersionUID = 1L;
  
  public SignUp() {}
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    response.getWriter().append("Served at: ").append(request.getContextPath());
  }
  

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    String u_name = request.getParameter("u_name");
    String password = request.getParameter("password");
    StudentDAOImpl sdao = new StudentDAOImpl();
    try {
      if (sdao.insertrec(u_name, password))
      {
        HttpSession session = request.getSession();
        session.setAttribute("username", u_name);
        response.sendRedirect("ShowEventDetails.jsp");
      }
      else
      {
        request.setAttribute("auth", "wrong");
        RequestDispatcher rd = request.getRequestDispatcher("SignUp.jsp");
        rd.forward(request, response);
      }
    } catch (Exception e) {
      request.setAttribute("auth", "wrong");
      RequestDispatcher rd = request.getRequestDispatcher("SignUp.jsp");
      rd.forward(request, response);
    }
  }
}
