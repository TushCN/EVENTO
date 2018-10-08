//package com.controllers.admin;
//
//import com.dao.EventDAOImpl;
//import com.model.Event;
////import java.io.PrintStream;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet({"/UpdateEvent"})
//public class UpdateEvent extends HttpServlet
//{
//  private static final long serialVersionUID = 1L;
//  
//  public UpdateEvent() {}
//  
//  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException
//  {
//    String e_name = request.getParameter("e_name");
//    
//    String dt = request.getParameter("dt");
//    String venue = request.getParameter("venue");
//    int fees = Integer.parseInt(request.getParameter("fees"));
//    String about = request.getParameter("about");
//    EventDAOImpl edao = new EventDAOImpl();
//    try
//    {
//      if (edao.updateeve(new Event(e_name, dt, venue, fees, about)))
//        response.sendRedirect("AdminOpt.jsp"); else {
//        System.out.println("WRONG");
//      }
//    }
//    catch (Exception e) {
//      request.setAttribute("error", e);
//      RequestDispatcher rd = request.getRequestDispatcher("Error_page.jsp");
//      rd.forward(request, response);
//    }
//  }
//}
