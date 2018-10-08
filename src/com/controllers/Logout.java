package com.controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@javax.servlet.annotation.WebServlet({"/Logout"})
public class Logout extends HttpServlet
{
  private static final long serialVersionUID = 1L;
  
  public Logout() {}
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException
  {
    HttpSession session = request.getSession();
    session.removeAttribute("username");
    session.invalidate();
    response.sendRedirect("Main.jsp");
  }
}
