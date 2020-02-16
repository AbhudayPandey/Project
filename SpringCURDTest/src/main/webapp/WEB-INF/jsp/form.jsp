<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<a href = "index.jsp">HOME</a>
<body>
<p>hiii</p><br>
${list }<br>
<table align = "center" border="2px">
	<tr>
		<th>SID</th>
		<th>FNAME</th>
		<th>LNAME</th>
	</tr>
	<c:forEach var="student" items="${list }">
	<tr>
		<th>${student.sid }</th>
		<th>${student.fname }</th>
		<th>${student.lname }</th>
	</tr>
	</c:forEach>

</table>
</body>
</html>