<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="/style.css">
    <title>Document</title>
</head>
<body>
        <h1>Fruit Store</h1>
        <table>
            <tr>
                <th>Name</th>
                <th>Price</th>
            </tr>
            <c:forEach var="item" items="${fruits}">
            <tr>
                <c:choose>
                    <c:when test="${fn:startsWith(item.name,'g')}">
                <td> <span style="color: orangered"><c:out value="${item.name}"></c:out></span></td>
                    </c:when>
                    <c:otherwise>
                <td><c:out value="${item.name}"></c:out></td>
                    </c:otherwise>
                </c:choose>
                <td><c:out value="${item.price}"></c:out></td>

            </tr>
            </c:forEach>
        </table>
</body>
</html>