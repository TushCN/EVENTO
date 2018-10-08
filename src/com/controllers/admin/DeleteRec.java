package com.controllers.admin;

import com.dao.StudentDAOImpl;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/DeleteRec"})
public class DeleteRec extends HttpServlet
{
  private static final long serialVersionUID = 1L;
  
  public DeleteRec() {}
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
    String u_name = request.getParameter("u_name");
    StudentDAOImpl sdao = new StudentDAOImpl();
    try
    {
      sdao.deleterec(u_name);
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
