<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
request.setCharacterEncoding("UTF-8");
String name=request.getParameter("name");
String id=request.getParameter("id");
%>
<h2>가져온 내용</h2>
<h3>이름 : <%=name %></h3>
<h3>아이디 : <%=id %></h3>
</body>
</html>