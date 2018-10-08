package com.controllers.admin;

import com.dao.StudentDAOImpl;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@javax.servlet.annotation.WebServlet({"/InsertRec"})
public class InsertRec extends HttpServlet
{
  private static final long serialVersionUID = 1L;
  
  public InsertRec() {}
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException
  {
    String u_name = request.getParameter("u_name");
    String password = request.getParameter("password");
    StudentDAOImpl sdao = new StudentDAOImpl();
    try {
      sdao.insertrec(u_name, password);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    
    response.sendRedirect("AdminOpt.jsp");
  }
}
