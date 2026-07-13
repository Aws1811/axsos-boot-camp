<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>The Book Broker</title>
</head>
<body>
<a href="/logout">logout</a>
<p>Hello, <c:out value="${user.userName}" />. Welcome to..</p>
<h1>All Projects!</h1>
<a href="/projects/create">+ new project</a>

<%-- ===== Table 1: All Projects (excluding your own) ===== --%>
<c:choose>
    <c:when test="${empty availableProjects}">
        <p>No other projects right now.</p>
    </c:when>
    <c:otherwise>
        <table border="1">
            <thead>
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Leader Name</th>
                <th>Due Date</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="project" items="${availableProjects}">
                <tr>
                    <td><c:out value="${project.project_id}" /></td>
                    <td>
                        <a href="/projects/${project.project_id}">
                            <c:out value="${project.title}" />
                        </a>
                    </td>
                    <td><c:out value="${project.user.userName}" /></td>
                    <td><c:out value="${project.dueDate}" /></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:otherwise>
</c:choose>

<%-- ===== Table 2: Your Projects — projects YOU created ===== --%>
<h2>Your Projects</h2>
<c:choose>
    <c:when test="${empty borrowedProjects}">
        <p>You haven't created any projects yet.</p>
    </c:when>
    <c:otherwise>
        <table border="1">
            <thead>
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Leader Name</th>
                <th>Due Date</th>
                <th>Actions</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="project" items="${borrowedProjects}">
                <tr>
                    <td><c:out value="${project.project_id}" /></td>
                    <td>
                        <a href="/projects/${project.project_id}">
                            <c:out value="${project.title}" />
                        </a>
                    </td>
                    <td><c:out value="${project.user.userName}" /></td>
                    <td><c:out value="${project.dueDate}" /></td>
                    <td>
                        <a href="/projects/update/${project.project_id}">edit</a>
                        <a href="/projects/delete/${project.project_id}">delete</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:otherwise>
</c:choose>

</body>
</html>