//package com.controllers;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//
//
//
//  @WebServlet({"/UpdateInfo"})
//   public class UpdateInfo
//   extends HttpServlet
//{
//  private static final long serialVersionUID = 1L;
//  
//  public UpdateInfo() {}
//  
//  protected void doGet(HttpServletRequest request, HttpServletResponse response)
//    throws ServletException, IOException
//  {
//	  ServletRequest req;
//	String u_name= req.getParameter("u_name");
//	     String password = req.getParameter("password");
//	  
//	  
//    response.getWriter().append("Served at: ").append(request.getContextPath());
//  }
//  
//
//
//  protected void doPost(HttpServletRequest request, HttpServletResponse response)
//    throws ServletException, IOException
//  {
//	  String id = req.getParameter("realname");
//	    String password = req.getParameter("mypassword");
//	    
//	    
//    doGet(request, response);
//  }
//}
