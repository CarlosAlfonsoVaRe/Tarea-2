/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hwi.Tarea2.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author carlo
 */
@WebServlet(name = "Servlet3", urlPatterns = {"/Servlet3"})
public class Servlet3 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String image = "Fam.jpg";
            String nom1 = null;
            String nom2 = null;
            String nom3 = null;
            String nom4 = null;
            String ed1 = null;
            String ed2 = null;
            String ed3 = null;
            String ed4 = null;
            String url3 = "Servlet1";
            
           nom1 = request.getParameter("nombre");
           nom2 = request.getParameter("nombre2");
           nom3 = request.getParameter("nombre3");
           nom4 = request.getParameter("nombre4");
           ed1 = request.getParameter("edad1");
           ed2 = request.getParameter("edad2");
           ed3 = request.getParameter("edad3");
           ed4 = request.getParameter("edad4");
          
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Bienvenido </h1>");
            out.println(String.format("<div align = \"center\"><image alt=\"\" src=\"Fam.jpg\"  width=\"250\" height=\"150\"/></div>", image));
            out.println("<h2>Papa: " + nom1 + "; Edad: " + ed1 + "</h2>");
            out.println("<h2>Mama: " + nom2 + "; Edad: " + ed2 + "</h2>");
            out.println("<h2>Hermano Mayor: " + nom4 + "; Edad: " + ed4 + "</h2>");
            out.println("<h2>Hermano Menor: " + nom3 + "; Edad: " + ed3 + "</h2>");
            out.println("<br><a href=\"" + url3 +"\"> Primer Servlet </a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
