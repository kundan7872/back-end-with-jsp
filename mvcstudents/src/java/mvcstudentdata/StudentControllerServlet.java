/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcstudentdata;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kundan Singh
 */
public class StudentControllerServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String em=request.getParameter("em").toLowerCase();
         String pass=request.getParameter("pass").toLowerCase();
      if(em.isEmpty()){
          response.sendRedirect("errorpage.html");
        }else{
          try{
              List<Student>studentlist=StudentModel.getStudent(em,pass);
              RequestDispatcher rd=null;
              if(studentlist.isEmpty()){
                  rd=request.getRequestDispatcher("nodata.jsp");
                  request.setAttribute("em",em);
                  request.setAttribute("studentlist", studentlist);
                  rd.forward(request, response);
                  
              }else{
                  rd=request.getRequestDispatcher("showstudent.jsp");
                  request.setAttribute("em",em);
                  request.setAttribute("studentlist",studentlist);
                  rd.forward(request, response);
              }
      }catch(SQLException e){
              System.out.println(e.getMessage());
      }
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
