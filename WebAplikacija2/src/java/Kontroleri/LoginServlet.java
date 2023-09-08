package Kontroleri;
import Model.Konekcija;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String ime = request.getParameter("username");
        String loz = request.getParameter("password");
        Connection con = Konekcija.konekcija();
        Statement st;
        ResultSet rs;
        RequestDispatcher rd;
          try (PrintWriter out = response.getWriter()) {
            try 
            {
                st = con.createStatement();                 
                String upit = "select * from login.login where ime='" + ime + "' and lozinka='" + loz + "'";
                rs = st.executeQuery(upit);  
                
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<body>");           
            out.println("<h1>Parametri su " + ime + ","+loz+"</h1>");
            while(rs.next())
            {
                rd = request.getRequestDispatcher("PotvrdaPrijave.jsp");
                rd.forward(request, response);
                out.println("Uspesno ste se ulogovali");
                out.println("<h3>"+ rs.getString("ime")+"</h3>");
                out.println("<h3>"+ rs.getString("lozinka")+"</h3>");               
            }
            rd = request.getRequestDispatcher("index.html");
            rd.forward(request, response);
            out.println("</body>");
            out.println("</html>");
        }
          catch (SQLException ex) {}
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
