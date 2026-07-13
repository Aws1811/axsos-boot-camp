<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>The Book Broker</title>
</head>
<body>

<p>Hello, <c:out value="${user.userName}" />. Welcome to..</p>
<h1>The Book Broker!</h1>
<a href="/books">back to the shelves</a>

<%-- ===== Table 1: Available Books to Borrow =====
     Shows every book with no current borrower, excluding the
     logged-in user's own books (per getAvailableBooks query).
     "borrow" sets this book's borrower to the logged-in user. --%>
<h2>Available Books to Borrow</h2>
<c:choose>
    <c:when test="${empty availableBooks}">
        <p>No books available to borrow right now.</p>
    </c:when>
    <c:otherwise>
        <table border="1">
            <thead>
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Author Name</th>
                <th>Owner</th>
                <th>Actions</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="book" items="${availableBooks}">
                <tr>
                    <td><c:out value="${book.book_id}" /></td>
                    <td>
                        <a href="/books/${book.book_id}">
                            <c:out value="${book.title}" />
                        </a>
                    </td>
                    <td><c:out value="${book.authorName}" /></td>
                    <td><c:out value="${book.user.userName}" /></td>
                    <td>
                        <c:choose>
                            <c:when test="${book.user.id == user.id}">
                                <a href="/books/update/${book.book_id}">edit</a>
                                <a href="/books/delete/${book.book_id}">delete</a>
                            </c:when>
                            <c:otherwise>
                                <a href="/bookmarket/${book.book_id}/borrow">borrow</a>
                            </c:otherwise>
                        </c:choose>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:otherwise>
</c:choose>

<%-- ===== Table 2: Books I'm Borrowing =====
     Shows every book whose borrower is the logged-in user.
     "return" clears the borrower, moving the book back to Table 1. --%>
<h2>Books I'm Borrowing</h2>
<c:choose>
    <c:when test="${empty borrowedBooks}">
        <p>You aren't borrowing any books right now.</p>
    </c:when>
    <c:otherwise>
        <table border="1">
            <thead>
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Author Name</th>
                <th>Owner</th>
                <th>Actions</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="book" items="${borrowedBooks}">
                <tr>
                    <td><c:out value="${book.book_id}" /></td>
                    <td>
                        <a href="/books/${book.book_id}">
                            <c:out value="${book.title}" />
                        </a>
                    </td>
                    <td><c:out value="${book.authorName}" /></td>
                    <td><c:out value="${book.user.userName}" /></td>
                    <td>
                        <a href="/bookmarket/${book.book_id}/return">return</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:otherwise>
</c:choose>

</body>
</html>