<%@page import="com.emergentes.modelo.Rectangulo"%>

<%
    Rectangulo miobj = (Rectangulo) request.getAttribute("miobj");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Area del rectangulo</h1>
        <p>Altura: <%= miobj.getAltura() %> </p>
       <p>Base: <%= miobj.getBase()%> </p>
        <p>Area del rectangulo es : <%= miobj.getArea() %></p>
    
       <a href="index.jsp"> Volver</a>
    </body>
</html>
