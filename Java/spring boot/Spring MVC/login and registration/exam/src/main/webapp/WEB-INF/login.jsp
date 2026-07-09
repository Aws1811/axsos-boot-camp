<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<div style="display: flex; gap: 100px;">


    <div>
        <h2>Register</h2>

        <form:form action="/register" method="post" modelAttribute="user">

            <form:label  path="firstName">Firstname:- </form:label>
            <form:input  path="firstName" />
            <form:errors path="firstName"/>

            <form:label  path="lastName"> Lastname</form:label>
            <form:input  path="lastName" />
            <form:errors path="lastName"/>

            <form:label  path="age"> age</form:label>
            <form:input type="number"  path="age" />
            <form:errors path="age"/>

            <form:label  path="email"> email</form:label>
             <form:input path="email" />
            <form:errors path="email"/>

            <form:label path="password"/>
             <form:password path="password" />
            <form:errors path="password"/>

            <form:label path="confirmPassword"/>
            <form:password path="confirmPassword" />
            <form:errors path="confirmPassword"/>

            <button type="submit">Register</button>
        </form:form>
    </div>

    <div>
    <h2>login</h2>

    <form:form action="/login" method="post" modelAttribute="user">
        <form:label path="email"> email</form:label>
        <form:input path="email" />
        <form:errors path="email"/>

        <form:label path="password"/>
        <form:password path="password" />
        <form:errors path="password"/>

        <button type="submit">login</button>
    </form:form>
</div>


</div>
</body>
</html>