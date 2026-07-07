<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<h1> New Ninja</h1>

<form:form action="/ninja/new" method="post"  modelAttribute="ninjas">

    <form:select path="dojo">
        <form:option value="" label="-- select a dojo --"/>
        <c:forEach var="d" items="${dojos}">
            <form:option value="${d.id}" label="${d.name}"/>
        </c:forEach>
    </form:select>

    <form:label path="firstName"> enter the first name</form:label>
    <form:input path="firstName"></form:input>
    <form:errors path="firstName"></form:errors>

    <form:label path="lastName">enter the last name</form:label>
    <form:input path="lastName"></form:input>
    <form:errors path="lastName"></form:errors>


    <form:label path="age"> enter the age</form:label>
    <form:input path="age"></form:input>
    <form:errors path="age"></form:errors>

    <button type="submit">Submit</button>

</form:form>




</body>
</html>