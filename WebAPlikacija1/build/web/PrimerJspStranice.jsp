<%-- 
    Document   : PrimerJspStranice
    Created on : May 25, 2020, 10:21:59 PM
    Author     : isido
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Prva varijanta</h1>
        <% for(int i = 0 ; i < 0; i++)
            out.println("Bilo sta!<br>"); %> 
         <h3>Druga varijanta!</h3>  
        <% for(int i = 0 ; i < 0; i++) { %>
        <br>
            <%out.println("Bilo sta!"); } %> 
            <%=request.getAttribute("imePrenos")%>
            <%=request.getAttribute("lozinka")%>
            
                    
    </body>
</html>
