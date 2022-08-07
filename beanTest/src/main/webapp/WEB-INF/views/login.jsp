<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
<form:form action="log" modelAttribute="member" method="post">
<form:input type = "text" path="id"></form:input><br>
<form:input type = "text" path="pw"></form:input>
<form:button type="submit">go</form:button>
</form:form>
</body>
</html>