<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
</script>
</head>
<body>
<% 
request.setCharacterEncoding("UTF-8");
String name=request.getParameter("name");
String id=request.getParameter("acid");
%>
<h2>중간이에요~</h2>
<!-- get 방식으로 전달 -->
<a href="onlyRequest3.jsp?name=<%=name%>&id=<%=id%>"> get으로 전달 확인하러 가기</a>
<br><br>
<!-- hidden 방식으로 전달 -->
<form action="onlyRequest3.jsp" method="post">
<input type="hidden" name="name" value="<%=name %>">
<input type="hidden" name="id" value="<%=id %>">
<input type="submit" value="hidden으로 넘어가기">
</form>
<br><br>
</body>
</html>