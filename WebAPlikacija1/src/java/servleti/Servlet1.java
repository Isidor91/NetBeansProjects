package servleti;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet1", urlPatterns = {"/Servlet1"})
public class Servlet1 extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String ime = request.getParameter("korime");
        String pass = request.getParameter("loz");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Aplikacija</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Parametri su: " + ime + " " + pass + "</h1>");
            out.println("</body>");
            out.println("</html>");
            RequestDispatcher rd;
            if(ime.equals("isidor") && pass.equals("isi123"))
            {
                rd = request.getRequestDispatcher("PrimerJspStranice.jsp");
                request.setAttribute("imePrenos", ime);
                request.setAttribute("lozinka", pass);               
            }
            else if(ime.equals("isidor456") && pass.equals("isidor456"))
            {
                rd = request.getRequestDispatcher("prijavaJsp.jsp");
                request.setAttribute("komentar", "Korisnik vec postoji!");  
            }
            else
            {
                rd = request.getRequestDispatcher("prijavaJsp.jsp");
                request.setAttribute("komentar", "Probajte ponovo");       
            }
                rd.forward(request, response);
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
