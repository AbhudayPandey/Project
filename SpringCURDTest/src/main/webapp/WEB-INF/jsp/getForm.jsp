<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<a href = "index.jsp">HOME</a>
<body>
<form:form action="saveStudent" method="post" modelAttribute="student">
<table>
 	<tr>
              <td>Sid</td>
              <td><form:input path="sid"/></td>
           </tr>
           <tr>
              <td>FName</td>
              <td><form:input path="fname"/></td>
           </tr>
           <tr>
              <td>LName</td>
              <td><form:input path="lname"/></td>
           </tr>           
           <tr><td><input type="submit"  value="SUBMIT"/></td></tr>           
       </table>
</form:form>
</body>
</html>