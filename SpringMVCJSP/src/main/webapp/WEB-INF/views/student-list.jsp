<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored = "false"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border = "2">
<tr><td>Student Id</td><td>Student Name</td><td>Score</td></tr>


<c:forEach items= "${students}" var="student">
<tr>
<td>${student.s_Id}</td><td>${student.s_Name}</td><td>${student.score}</td>
</tr>

</c:forEach>


</table>
</body>
</html>