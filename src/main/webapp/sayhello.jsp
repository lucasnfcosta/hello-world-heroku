<%-- 
    Document   : sayhello
    Created on : 08/02/2021, 23:08:15
    Author     : viter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SayHello.jsp</title>
    </head>
    <body>
        <jsp:useBean id="myBean" class="hello.MessageBean"/>
        <div>
            <nav class="navbar navbar-light bg-light">
                <span class="navbar-brand p-2 h1">Aplicativo HelloWorld</span>
            </nav>
        </div>
        <% String lang = request.getParameter("lang"); %>
        <div class="p-3">
            <h2 class="text-center"><jsp:setProperty name="myBean" property="lang" value="<%=lang%>"/>
            <jsp:getProperty name="myBean" property="msg"/>, <%=request.getParameter("nome")%>!</h2>
        </div>
        <div class="fixed-bottom p-2 bg-light center">
            <jsp:getProperty name="myBean" property="msg2"/> <jsp:getProperty name="myBean" property="aut"/>
        </div>
    </body>
</html>
<script src="js/bootstrap.min.js"></script>
