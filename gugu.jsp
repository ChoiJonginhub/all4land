<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">구구단</h1>
<table align="center" border="1" style="border-collapse:collapse;">
<tr style="text-align:center;">
<%! int i=0;
int j=0;%>
<td></td>
<% for(i=2; i<=9; i++){ %>
<td><%=i%>단</td>
<%} %>
</tr>
<% for(i=1; i<=9; i++){ %>
<tr>
<td><%=i%></td>
<% for(j=2; j<=9; j++){ %>
<td>&nbsp;<%=j %> X <%=i %> = <%=i*j %>&nbsp;</td>
<%} %>
</tr>
<%} %>
</table>
</body>
</html>