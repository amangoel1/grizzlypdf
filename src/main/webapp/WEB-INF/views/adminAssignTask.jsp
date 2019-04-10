<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
              <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>admin assign task</title>
</head>
<body>
<h2>Available Workers</h2>
<table>
<form action="adminAssignTask.html" method="post">
<tr>
<td>WorkerId : </td>
<td> Select Worker </td>
</tr>
 <c:forEach  var="worker"  items= "${workerList}">
<tr>
<td>${worker.workerId} </td>
<td> <input type ="radio" name ="workerId" value="${worker.workerId}"></td>
</tr>
</c:forEach>
<input type="submit" value="assign"></form>
</table>
</body>
</html>