package com.controllers.admin;

import com.dao.AdminDAOImpl;
import com.model.Admin;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/ChngPass"})
public class ChngPass extends HttpServlet
{
  private static final long serialVersionUID = 1L;
  
  public ChngPass() {}
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException
  {
    String a_name = request.getParameter("a_name");
    String a_pass = request.getParameter("a_pass");
    AdminDAOImpl adao = new AdminDAOImpl();
    try
    {
      adao.change_to(new Admin(a_name, a_pass));
      response.sendRedirect("AdminOpt.jsp");

    }
    catch (Exception e)
    {
      request.setAttribute("error", e);
      RequestDispatcher rd = request.getRequestDispatcher("Error_page.jsp");
      rd.forward(request, response);
    }
  }
}
