<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Book Club</title>
</head>
<body>

<h1>Welcome, <c:out value="${user.userName}" />!</h1>

<a href="/books/create">+ Add a book to my shelf</a>
<br><br>
<a href="/logout">logout</a>
<br><br>
<a href="/bookmarket">go to borrow section</a>
<c:choose>
	<c:when test="${empty books}">
		<p>No books have been added yet.</p>
	</c:when>
	<c:otherwise>
		<table border="1">
			<thead>
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Author Name</th>
				<th>Posted By</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach var="book" items="${books}">
				<tr>
					<td><c:out value="${book.book_id}" /></td>
					<td>
						<a href="/books/${book.book_id}">
							<c:out value="${book.title}" />
						</a>
					</td>
					<td><c:out value="${book.authorName}" /></td>
					<td><c:out value="${book.user.userName}" /></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</c:otherwise>
</c:choose>
</body>
</html>