<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add a Book</title>
</head>
<body>

<h1>Add a Book to Your Shelf!</h1>
<a href="/books">back to the shelves</a>

<form:form action="/books/create/new" method="post" modelAttribute="books">
    <div>
        <form:label path="title">Title</form:label>
        <form:input path="title" />
        <form:errors path="title" />
    </div>

    <div>
        <form:label path="authorName">Author</form:label>
        <form:input path="authorName" />
        <form:errors path="authorName" />
    </div>

    <div>
        <form:label path="description">My thoughts</form:label>
        <form:textarea path="description" />
        <form:errors path="description" />
    </div>

    <input type="submit" value="Submit" />
</form:form>

</body>
</html>