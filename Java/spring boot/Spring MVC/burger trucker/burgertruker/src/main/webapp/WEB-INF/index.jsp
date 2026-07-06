<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Burger Tracker</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="min-h-screen bg-orange-50 flex flex-col items-center py-12 px-4">

<div class="w-full max-w-3xl bg-white border-2 border-orange-900 rounded-xl shadow-md p-8 space-y-10">

    <h1 class="text-4xl font-bold text-orange-800">🍔 Burger Tracker</h1>

    <table class="w-full border-collapse border border-orange-300 rounded-lg overflow-hidden">
        <thead>
        <tr class="bg-orange-800 text-white">
            <th class="px-4 py-3 text-left">Burger Name</th>
            <th class="px-4 py-3 text-left">Restaurant Name</th>
            <th class="px-4 py-3 text-center">Rating (out of 5)</th>
            <th class="px-4 py-3 text-center">Edit</th>
            <th class="px-4 py-3 text-center">Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="burger" items="${burgers}" varStatus="status">
            <tr class="${status.index % 2 == 0 ? 'bg-white' : 'bg-orange-50'} border-t border-orange-200 hover:bg-orange-100">
                <td class="px-4 py-2">${burger.burgerName}</td>
                <td class="px-4 py-2">${burger.resturantName}</td>
                <td class="px-4 py-2 text-center font-semibold text-orange-700">${burger.rating} ★</td>
                <td class="px-4 py-2"><a href="update/${burger.id}">Update..</a></td>
                <td class="px-4 py-2"><a href="delete/${burger.id}">Delete..</a></td>

            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div>
        <h2 class="text-2xl font-bold text-orange-800 mb-4">Add a Burger</h2>

        <form:form action="/" method="post" modelAttribute="burger" cssClass="space-y-4">
            <p class="flex flex-col gap-1">
                <form:label path="burgerName" cssClass="font-medium text-gray-700">Burger Name</form:label>
                <form:errors path="burgerName" cssClass="text-red-600 text-sm"/>
                <form:input path="burgerName" cssClass="border border-orange-300 rounded-md px-3 py-2 focus:outline-none focus:ring-2 focus:ring-orange-400"/>
            </p>
            <p class="flex flex-col gap-1">
                <form:label path="resturantName" cssClass="font-medium text-gray-700">Restaurant Name</form:label>
                <form:errors path="resturantName" cssClass="text-red-600 text-sm"/>
                <form:input path="resturantName" cssClass="border border-orange-300 rounded-md px-3 py-2 focus:outline-none focus:ring-2 focus:ring-orange-400"/>
            </p>
            <p class="flex flex-col gap-1">
                <form:label path="rating" cssClass="font-medium text-gray-700">Rating</form:label>
                <form:errors path="rating" cssClass="text-red-600 text-sm"/>
                <form:input type="number" path="rating" cssClass="border border-orange-300 rounded-md px-3 py-2 w-28 focus:outline-none focus:ring-2 focus:ring-orange-400"/>
            </p>
            <p class="flex flex-col gap-1">
                <form:label path="note" cssClass="font-medium text-gray-700">Notes</form:label>
                <form:errors path="note" cssClass="text-red-600 text-sm"/>
                <form:textarea path="note" cssClass="border border-orange-300 rounded-md px-3 py-2 focus:outline-none focus:ring-2 focus:ring-orange-400" rows="4"/>
            </p>
            <input type="submit" value="Submit" class="bg-orange-800 hover:bg-orange-700 text-white font-semibold px-6 py-2 rounded-md cursor-pointer"/>
        </form:form>
    </div>

</div>

</body>
</html>