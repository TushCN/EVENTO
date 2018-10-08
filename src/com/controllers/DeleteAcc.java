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



@WebServlet({"/DeleteAcc"})
public class DeleteAcc
  extends HttpServlet
{
  private static final long serialVersionUID = 1L;
  
  public DeleteAcc() {}
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    response.getWriter().append("Served at: ").append(request.getContextPath());
  }
  

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    String u_name = request.getParameter("u_name");
    StudentDAOImpl sdao = new StudentDAOImpl();
    try {
      if (sdao.deleterec(u_name))
      {
        HttpSession session = request.getSession();
        session.removeAttribute("username");
        response.sendRedirect("StuLogin.jsp");
      }
      else
      {
        request.setAttribute("auth", "wrong");
        RequestDispatcher rd = request.getRequestDispatcher("DeleteAcc.jsp");
        rd.forward(request, response);
      }
    }
    catch (Exception e) {
      request.setAttribute("error", e);
      RequestDispatcher rd = request.getRequestDispatcher("Error_page.jsp");
      rd.forward(request, response);
    }
  }
}
