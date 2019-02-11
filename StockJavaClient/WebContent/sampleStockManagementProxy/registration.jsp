<%@ page import ="com.interoperability.users.User" %>
<jsp:useBean id="id" scope="session" class="com.interoperability.users.UserManagementServiceProxy" />

<%
    String username = request.getParameter("username");    
    String password = request.getParameter("password");
   
   
User register13mtemp = id.register(username,password);


if(register13mtemp != null){
  String typeerrorMessage16 = register13mtemp.getErrorMessage();
String tempResulterrorMessage16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeerrorMessage16));
if(typeerrorMessage16 != null && !typeerrorMessage16.isEmpty()){
	request.setAttribute("errorMessage", typeerrorMessage16 );             
    request.getRequestDispatcher("reg.jsp").forward(request, response);
}else{
	request.getRequestDispatcher("welcome.jsp").forward(request, response);
}
}%>
