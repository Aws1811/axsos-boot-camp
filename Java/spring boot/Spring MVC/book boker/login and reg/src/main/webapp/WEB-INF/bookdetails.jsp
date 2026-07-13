<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title><c:out value="${book.title}" /></title>
</head>
<body>

<h1><c:out value="${book.title}" /></h1>
<a href="/books">back to the shelves</a>

<c:choose>
    <c:when test="${book.user.id == user.id}">
        <p>You read <c:out value="${book.title}" /> by <c:out value="${book.authorName}" />.</p>
        <p>Here are your thoughts:</p>
    </c:when>
    <c:otherwise>
        <p><c:out value="${book.user.userName}" /> read <c:out value="${book.title}" /> by <c:out value="${book.authorName}" />.</p>
        <p>Here are <c:out value="${book.user.userName}" />'s thoughts:</p>
    </c:otherwise>
</c:choose>

<p><c:out value="${book.description}" /></p>

<c:if test="${book.user.id == user.id}">
    <a href="/books/update/${book.book_id}">edit</a>
    <a href="/books/delete/${book.book_id}">delete</a>
</c:if>

</body>
</html>