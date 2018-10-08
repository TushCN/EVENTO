package com.controllers;

import com.dao.StudentDAOImpl;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet({"/StudentLogin"})
public class StudentLogin extends HttpServlet
{
  private static final long serialVersionUID = 1L;
  
  public StudentLogin() {}
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
    String u_name = request.getParameter("u_name");
    String password = request.getParameter("password");
    StudentDAOImpl sdao = new StudentDAOImpl();
    try {
      if (sdao.check(u_name, password))
      {
        HttpSession session = request.getSession();
        session.setAttribute("u_name", u_name);
        response.sendRedirect("ShowEventDetails.jsp");
      }
      else
      {
        request.setAttribute("auth", "wrong");
        RequestDispatcher rd = request.getRequestDispatcher("StuLogin.jsp");
        rd.forward(request, response);
      }
    } catch (Exception e) {
      request.setAttribute("error", e);
      RequestDispatcher rd = request.getRequestDispatcher("Error_page.jsp");
      rd.forward(request, response);
    }
  }
}
