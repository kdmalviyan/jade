<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>


<jsp:useBean id="id" scope="session" class="com.interoperability.users.UserManagementServiceProxy" />
<%@ page import="com.interoperability.users.User" %>

<%
String username = request.getParameter("uname");    
String password = request.getParameter("pass");

User login35mtemp = id.login(username,password);
%>
 

<%
if(login35mtemp != null){
       String typeerrorMessage38 = login35mtemp.getErrorMessage();
         if(typeerrorMessage38 != null && !typeerrorMessage38.isEmpty()){
        request.setAttribute("errorMessage", typeerrorMessage38 );             
        request.getRequestDispatcher("home.jsp").forward(request, response);
        }else{
        	out.println("outside");
        	session.setAttribute("username", username);
        	request.getRequestDispatcher("success.jsp").forward(request, response);
        }
}


%>

