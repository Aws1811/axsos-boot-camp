<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h1>${dojo.name} Ninjas</h1>

<table>
    <tr>
        <th>id</th>
        <th>FirstName</th>
        <th>LastName</th>
        <th>Age</th>
    </tr>

    <c:forEach var="ninja" items="${dojo.ninja}">
        <tr>
            <td>${ninja.ninjaId}</td>
            <td>${ninja.firstName}</td>
            <td>${ninja.lastName}</td>
            <td>${ninja.age}</td>
        </tr>
    </c:forEach>

</table>


</body>
</html>