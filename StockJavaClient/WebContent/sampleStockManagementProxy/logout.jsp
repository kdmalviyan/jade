<%
session.setAttribute("username", null);
session.invalidate();
response.sendRedirect("home.jsp");
%>