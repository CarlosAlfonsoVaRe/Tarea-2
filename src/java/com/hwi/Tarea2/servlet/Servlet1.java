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
@WebServlet(name = "Servlet1", urlPatterns = {"/Servlet1"})
public class Servlet1 extends HttpServlet {

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
            String name = "Carlos";
            String image = "Eva.png";
            String nombre = "Cesar";
            String nombre2 = "Norma";
            String nombre3 = "Jose";
            String nombre4 = "Emmanuel";
            int edad1 = 56;
            int edad2 = 49;
            int edad3 = 11;
            int edad4 = 20;
            String url = "Servlet3";
            String url2 = "index.xhtml";
            
            url += "?nombre=" + nombre + "&nombre2=" + nombre2 + "&nombre3=" + nombre3 
                    + "&nombre4=" + nombre4 + "&edad1=" + edad1 + "&edad2=" + edad2 + "&edad3=" + edad3 + "&edad4=" + edad4;
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Carlos Valencia</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hola " + name + "</h1>");
            out.println(String.format("<div align = \"center\"><image alt=\"\" src=\"Eva.png\"  width=\"250\" height=\"300\"/></div>", image));
            out.println("<br><br>");
            out.println("<a href=\"" + url +"\"> Segundo Servlet </a>");
            out.println("<br><br>");
            out.println("<a href=\"" + url2 +"\"> Regresar al inicio </a>");
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
