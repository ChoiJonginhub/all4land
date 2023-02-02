<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마지막 페이지</title>
</head>
<body>
<h1>영역과 속성 테스트 마지막 화면</h1>
<%
request.setCharacterEncoding("UTF-8");

String name=(String)application.getAttribute("name");
String id=(String)application.getAttribute("id");

String email=(String)session.getAttribute("email");
String home=(String)session.getAttribute("home");
String tel=(String)session.getAttribute("tel");
/* 이런 방법도 가능!
Enumeration e = session.getAttributeNames();
while(e.hasMoreElements()){
	String attributeName = (String)e.nextElement();
	String attributeValue = (String)session.getAttribute(attributeName);
}
*/
%>

<h3><%=name %>님의 계정정보</h3>
<p>아이디 : <%=id %></p>
<p>이메일 : <%=email %></p>
<p>집 주소 : <%=home %></p>
<p>전화번호 : <%=tel %></p>
</body>
</html>