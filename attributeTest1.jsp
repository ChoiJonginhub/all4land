<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>scope test</title>
</head>
<body>
<h1>영역과 속성 테스트</h1>
<% 
request.setCharacterEncoding("UTF-8");
String name=request.getParameter("name");
String id=request.getParameter("acid");
if(name!=null&&id!=null){
	application.setAttribute("name", name);
	application.setAttribute("id", id);
}
//application 영역에 등록된 속성들을 getAttribute() 메소드를 사용해 읽는다.
name=(String)application.getAttribute("name");
id=(String)application.getAttribute("id");
%>
<h2> <%=name %>님 반갑습니다.<br><%=name %>님의 아이디는 <%=id %>입니다.</h2>
<form action="attributeTest2.jsp" method="post">
<table border=1>
<tr><td colspan="2">Session 영역에 저장할 내용들</td></tr>
<tr><td>e-mail 주소</td><td><input type="text" name="email"></td></tr>
<tr><td>집 주소</td><td><input type="text" name="home"></td></tr>
<tr><td>전화번호</td><td><input type="text" name="tel"></td></tr>
<tr><td colspan="2"><input type="submit" value="전송"></td></tr>
</table>
</form>
</body>
</html>