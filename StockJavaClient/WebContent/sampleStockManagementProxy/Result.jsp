<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleStockManagementProxyid" scope="session" class="com.interoperability.stocks.StockManagementProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleStockManagementProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleStockManagementProxyid.getEndpoint();
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
        sampleStockManagementProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.interoperability.stocks.StockManagement getStockManagement10mtemp = sampleStockManagementProxyid.getStockManagement();
if(getStockManagement10mtemp == null){
%>
<%=getStockManagement10mtemp %>
<%
}else{
        if(getStockManagement10mtemp!= null){
        String tempreturnp11 = getStockManagement10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        com.interoperability.stocks.Stock[] findAllStocks13mtemp = sampleStockManagementProxyid.findAllStocks();
if(findAllStocks13mtemp == null){
%>
<%=findAllStocks13mtemp %>
<%
}else{
        String tempreturnp14 = null;
        if(findAllStocks13mtemp != null){
        java.util.List listreturnp14= java.util.Arrays.asList(findAllStocks13mtemp);
        tempreturnp14 = listreturnp14.toString();
        }
        %>
        <%=tempreturnp14%>
        <%
}
break;
case 16:
        gotMethod = true;
        String arg0_1id=  request.getParameter("arg041");
            java.lang.String arg0_1idTemp = null;
        if(!arg0_1id.equals("")){
         arg0_1idTemp  = arg0_1id;
        }
        com.interoperability.stocks.Stock getStock16mtemp = sampleStockManagementProxyid.getStock(arg0_1idTemp);
if(getStock16mtemp == null){
%>
<%=getStock16mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getStock16mtemp != null){
%>
<%=getStock16mtemp.getId()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">highPrice:</TD>
<TD>
<%
if(getStock16mtemp != null){
%>
<%=getStock16mtemp.getHighPrice()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">closePrice:</TD>
<TD>
<%
if(getStock16mtemp != null){
%>
<%=getStock16mtemp.getClosePrice()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">symbol:</TD>
<TD>
<%
if(getStock16mtemp != null){
java.lang.String typesymbol25 = getStock16mtemp.getSymbol();
        String tempResultsymbol25 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesymbol25));
        %>
        <%= tempResultsymbol25 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">high52Week:</TD>
<TD>
<%
if(getStock16mtemp != null){
%>
<%=getStock16mtemp.getHigh52Week()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">netTradeQuantity:</TD>
<TD>
<%
if(getStock16mtemp != null){
%>
<%=getStock16mtemp.getNetTradeQuantity()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">openPrice:</TD>
<TD>
<%
if(getStock16mtemp != null){
%>
<%=getStock16mtemp.getOpenPrice()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">low52Week:</TD>
<TD>
<%
if(getStock16mtemp != null){
%>
<%=getStock16mtemp.getLow52Week()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">security:</TD>
<TD>
<%
if(getStock16mtemp != null){
java.lang.String typesecurity35 = getStock16mtemp.getSecurity();
        String tempResultsecurity35 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesecurity35));
        %>
        <%= tempResultsecurity35 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">previousClosePrice:</TD>
<TD>
<%
if(getStock16mtemp != null){
%>
<%=getStock16mtemp.getPreviousClosePrice()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">netTradeVaule:</TD>
<TD>
<%
if(getStock16mtemp != null){
%>
<%=getStock16mtemp.getNetTradeVaule()
%><%}%>
</TD>
</TABLE>
<%
}
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