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

    <h1> New Dojo</h1>

    <form:form action="/create/dojo" method="post"  modelAttribute="dojos">

        <form:label path="name"> enter the name of the dojo</form:label>
        <form:input path="name"></form:input>
        <form:errors path="name"></form:errors>

        <button type="submit">submit</button>

    </form:form>




</body>
</html>