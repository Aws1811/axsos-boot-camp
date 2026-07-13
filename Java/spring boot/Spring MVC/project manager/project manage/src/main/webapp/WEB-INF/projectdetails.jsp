<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title><c:out value="${project.title}" /></title>
</head>
<body>
<a href="/logout">logout</a>
<h1><c:out value="${project.title}" /></h1>
<a href="/projects">back to the shelves</a>

<c:choose>
    <c:when test="${project.user.id == user.id}">
        <p>You read <c:out value="${project.title}" /> by <c:out value="${project.user.userName}" />.</p>
        <p>Here are your thoughts:</p>
    </c:when>
    <c:otherwise>
        <p><c:out value="${project.user.userName}" /> read <c:out value="${project.title}" /> by <c:out value="${project.user.userName}" />.</p>
        <p>Here are <c:out value="${project.user.userName}" />'s thoughts:</p>
    </c:otherwise>
</c:choose>

<p><c:out value="${project.description}" /></p>

<c:if test="${project.user.id == user.id}">
    <a href="/projects/update/${project.project_id}">edit</a>
    <a href="/projects/delete/${project.project_id}">delete</a>
</c:if>

</body>
</html>