package com.controllers.admin;

import com.dao.AdminDAOImpl;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@javax.servlet.annotation.WebServlet({"/AdminLogin"})
public class AdminLogin extends HttpServlet
{
  private static final long serialVersionUID = 1L;
  
  public AdminLogin() {}
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException
  {
    String a_name = request.getParameter("a_name");
    String a_pass = request.getParameter("a_pass");
   

    AdminDAOImpl adao = new AdminDAOImpl();
    try {
      if (adao.check(a_name, a_pass))
      {
        HttpSession session = request.getSession();
        session.setAttribute("username", a_name);
        response.sendRedirect("AdminOpt.jsp");
      }
      else
      {
        request.setAttribute("auth", "wrong");
        RequestDispatcher rd = request.getRequestDispatcher("AdminLogin.jsp");
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
