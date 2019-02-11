<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="id" scope="session" class="com.interoperability.users.UserManagementServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
id.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = id.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        id.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.interoperability.users.UserManagementService getUserManagementService10mtemp = id.getUserManagementService();
if(getUserManagementService10mtemp == null){
%>
<%=getUserManagementService10mtemp %>
<%
}else{
        if(getUserManagementService10mtemp!= null){
        String tempreturnp11 = getUserManagementService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String username_1id=  request.getParameter("username24");
            java.lang.String username_1idTemp = null;
        if(!username_1id.equals("")){
         username_1idTemp  = username_1id;
        }
        String password_2id=  request.getParameter("password26");
            java.lang.String password_2idTemp = null;
        if(!password_2id.equals("")){
         password_2idTemp  = password_2id;
        }
        com.interoperability.users.User register13mtemp = id.register(username_1idTemp,password_2idTemp);
if(register13mtemp == null){
%>
<%=register13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">errorMessage:</TD>
<TD>
<%
if(register13mtemp != null){
java.lang.String typeerrorMessage16 = register13mtemp.getErrorMessage();
        String tempResulterrorMessage16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeerrorMessage16));
        %>
        <%= tempResulterrorMessage16 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">password:</TD>
<TD>
<%
if(register13mtemp != null){
java.lang.String typepassword18 = register13mtemp.getPassword();
        String tempResultpassword18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepassword18));
        %>
        <%= tempResultpassword18 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">username:</TD>
<TD>
<%
if(register13mtemp != null){
java.lang.String typeusername20 = register13mtemp.getUsername();
        String tempResultusername20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeusername20));
        %>
        <%= tempResultusername20 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(register13mtemp != null){
%>
<%=register13mtemp.getId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 28:
        gotMethod = true;
        String stockId_3id=  request.getParameter("stockId31");
        long stockId_3idTemp  = Long.parseLong(stockId_3id);
        String username_4id=  request.getParameter("username33");
            java.lang.String username_4idTemp = null;
        if(!username_4id.equals("")){
         username_4idTemp  = username_4id;
        }
        boolean removeStock28mtemp = id.removeStock(stockId_3idTemp,username_4idTemp);
        String tempResultreturnp29 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(removeStock28mtemp));
        %>
        <%= tempResultreturnp29 %>
        <%
break;
case 35:
        gotMethod = true;
        String username_5id=  request.getParameter("username46");
            java.lang.String username_5idTemp = null;
        if(!username_5id.equals("")){
         username_5idTemp  = username_5id;
        }
        String password_6id=  request.getParameter("password48");
            java.lang.String password_6idTemp = null;
        if(!password_6id.equals("")){
         password_6idTemp  = password_6id;
        }
        com.interoperability.users.User login35mtemp = id.login(username_5idTemp,password_6idTemp);
if(login35mtemp == null){
%>
<%=login35mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">errorMessage:</TD>
<TD>
<%
if(login35mtemp != null){
java.lang.String typeerrorMessage38 = login35mtemp.getErrorMessage();
        String tempResulterrorMessage38 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeerrorMessage38));
        %>
        <%= tempResulterrorMessage38 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">password:</TD>
<TD>
<%
if(login35mtemp != null){
java.lang.String typepassword40 = login35mtemp.getPassword();
        String tempResultpassword40 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepassword40));
        %>
        <%= tempResultpassword40 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">username:</TD>
<TD>
<%
if(login35mtemp != null){
java.lang.String typeusername42 = login35mtemp.getUsername();
        String tempResultusername42 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeusername42));
        %>
        <%= tempResultusername42 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(login35mtemp != null){
%>
<%=login35mtemp.getId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 50:
        gotMethod = true;
        String id_8id=  request.getParameter("id55");
        long id_8idTemp  = Long.parseLong(id_8id);
        String highPrice_9id=  request.getParameter("highPrice57");
        float highPrice_9idTemp  = Float.parseFloat(highPrice_9id);
        String closePrice_10id=  request.getParameter("closePrice59");
        float closePrice_10idTemp  = Float.parseFloat(closePrice_10id);
        String symbol_11id=  request.getParameter("symbol61");
            java.lang.String symbol_11idTemp = null;
        if(!symbol_11id.equals("")){
         symbol_11idTemp  = symbol_11id;
        }
        String high52Week_12id=  request.getParameter("high52Week63");
        float high52Week_12idTemp  = Float.parseFloat(high52Week_12id);
        String netTradeQuantity_13id=  request.getParameter("netTradeQuantity65");
        long netTradeQuantity_13idTemp  = Long.parseLong(netTradeQuantity_13id);
        String openPrice_14id=  request.getParameter("openPrice67");
        float openPrice_14idTemp  = Float.parseFloat(openPrice_14id);
        String low52Week_15id=  request.getParameter("low52Week69");
        float low52Week_15idTemp  = Float.parseFloat(low52Week_15id);
        String security_16id=  request.getParameter("security71");
            java.lang.String security_16idTemp = null;
        if(!security_16id.equals("")){
         security_16idTemp  = security_16id;
        }
        String previousClosePrice_17id=  request.getParameter("previousClosePrice73");
        float previousClosePrice_17idTemp  = Float.parseFloat(previousClosePrice_17id);
        String netTradeVaule_18id=  request.getParameter("netTradeVaule75");
        double netTradeVaule_18idTemp  = Double.parseDouble(netTradeVaule_18id);
        %>
        <jsp:useBean id="com1interoperability1users1Stock_7id" scope="session" class="com.interoperability.users.Stock" />
        <%
        com1interoperability1users1Stock_7id.setId(id_8idTemp);
        com1interoperability1users1Stock_7id.setHighPrice(highPrice_9idTemp);
        com1interoperability1users1Stock_7id.setClosePrice(closePrice_10idTemp);
        com1interoperability1users1Stock_7id.setSymbol(symbol_11idTemp);
        com1interoperability1users1Stock_7id.setHigh52Week(high52Week_12idTemp);
        com1interoperability1users1Stock_7id.setNetTradeQuantity(netTradeQuantity_13idTemp);
        com1interoperability1users1Stock_7id.setOpenPrice(openPrice_14idTemp);
        com1interoperability1users1Stock_7id.setLow52Week(low52Week_15idTemp);
        com1interoperability1users1Stock_7id.setSecurity(security_16idTemp);
        com1interoperability1users1Stock_7id.setPreviousClosePrice(previousClosePrice_17idTemp);
        com1interoperability1users1Stock_7id.setNetTradeVaule(netTradeVaule_18idTemp);
        String username_19id=  request.getParameter("username77");
            java.lang.String username_19idTemp = null;
        if(!username_19id.equals("")){
         username_19idTemp  = username_19id;
        }
        boolean addStock50mtemp = id.addStock(com1interoperability1users1Stock_7id,username_19idTemp);
        String tempResultreturnp51 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addStock50mtemp));
        %>
        <%= tempResultreturnp51 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>