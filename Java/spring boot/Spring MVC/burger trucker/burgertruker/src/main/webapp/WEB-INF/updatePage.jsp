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
    <div>
        <h2 class="text-2xl font-bold text-orange-800 mb-4">Edit a Burger</h2>

        <form:form action="/update/${burger.id}" method="post" modelAttribute="burger" cssClass="space-y-4">
            <input type="hidden" name="_method">
            <form:hidden path="id"/>
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

</body>
</html>