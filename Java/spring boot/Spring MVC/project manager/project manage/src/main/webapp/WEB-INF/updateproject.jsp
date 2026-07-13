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
<a href="/projects">back to the shelves</a>

<form:form action="/projects/update/${projects.project_id}/edit" method="post" modelAttribute="projects">
    <form:hidden path="project_id" />

    <div>
        <form:label path="title">Title</form:label>
        <form:input path="title" />
        <form:errors path="title" />
    </div>

    <div>
        <form:label path= "dueDate">Date</form:label>
        <form:input type="Date" path= "dueDate" />
        <form:errors path="dueDate" />
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