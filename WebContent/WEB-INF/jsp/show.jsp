<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>姓名</td>
		</tr>
		<c:choose>
			<c:when test="${not empty userLists}">
				<c:forEach items="${userLists}" var="user" varStatus="vs">
					<tr>
						<td>${user.id}</td>
						<td>${user.name}</td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="2">无数据</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</table>
</body>
</html>