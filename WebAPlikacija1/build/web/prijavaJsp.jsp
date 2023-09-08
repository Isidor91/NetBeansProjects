<%-- 
    Document   : prijavaJsp
    Created on : May 26, 2020, 7:43:07 PM
    Author     : isido
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prijava JSP</title>
    </head>
    <body>
        <div>Stranica za prijavu:</div>
        <%if(request.getAttribute("komentar") != null){%>
         <%=request.getAttribute("komentar")%> <% } %>
        <form method="post" action="Servlet1">
            <input type="text" name="korime" value="" />
            <input type="password" name="loz" value="" />
            <input type="submit" value="Uloguj se" />
        </form>
    </body>
</html>
