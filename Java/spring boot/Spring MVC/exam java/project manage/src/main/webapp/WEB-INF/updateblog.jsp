<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Change your Entry</title>
</head>
<body>

<h1>Change your Entry</h1>
<a href="/dashboard">go back to dashboard</a>

<form:form action="/edit/${blog.blog_id}/update" method="post" modelAttribute="blog">
    <form:hidden path="blog_id" />

    <div>
        <form:label path="title">Title</form:label>
        <form:input path="title" />
        <form:errors path="title" />
    </div>

    <div>
        <form:label path="category">Category</form:label>
        <form:input path="category" />
        <form:errors path="category" />
    </div>

    <div>
        <form:label path="description">Content</form:label>
        <form:textarea path="description" />
        <form:errors path="description" />
    </div>

    <input type="submit" value="Submit" />
</form:form>

</body>
</html>