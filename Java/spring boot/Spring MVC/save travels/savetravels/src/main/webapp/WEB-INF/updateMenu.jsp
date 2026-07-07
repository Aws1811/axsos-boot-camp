<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Travel</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="min-h-screen bg-[#ff9d7a] flex flex-col items-center py-12 px-4">
<div class="w-full max-w-lg bg-[#f3c98b] border-2 border-[#E28F35] rounded-xl shadow-md p-8">
    <h2 class="text-2xl font-bold text-[#DA6A7B] mb-4">Edit the Travel</h2>

    <form:form action="/update/travel/${travel.id}" method="post" modelAttribute="travel" cssClass="space-y-4">
        <input type="hidden" name="_method">
        <form:hidden path="id"/>
        <p class="flex flex-col gap-1">
            <form:label path="expense" cssClass="font-medium text-gray-700">Expense</form:label>
            <form:errors path="expense" cssClass="text-[#DA6A7B] text-sm"/>
            <form:input path="expense" cssClass="border border-[#F7A99A] rounded-md px-3 py-2 focus:outline-none focus:ring-2 focus:ring-[#E28F35]"/>
        </p>
        <p class="flex flex-col gap-1">
            <form:label path="vendor" cssClass="font-medium text-gray-700">vendor</form:label>
            <form:errors path="vendor" cssClass="text-[#DA6A7B] text-sm"/>
            <form:input path="vendor" cssClass="border border-[#F7A99A] rounded-md px-3 py-2 focus:outline-none focus:ring-2 focus:ring-[#E28F35]"/>
        </p>
        <p class="flex flex-col gap-1">
            <form:label path="amount" cssClass="font-medium text-gray-700">amount</form:label>
            <form:errors path="amount" cssClass="text-[#DA6A7B] text-sm"/>
            <form:input type="number" path="amount" cssClass="border border-[#F7A99A] rounded-md px-3 py-2 w-28 focus:outline-none focus:ring-2 focus:ring-[#E28F35]"/>
        </p>
        <p class="flex flex-col gap-1">
            <form:label path="desc" cssClass="font-medium text-gray-700">desc</form:label>
            <form:errors path="desc" cssClass="text-[#DA6A7B] text-sm"/>
            <form:textarea path="desc" cssClass="border border-[#F7A99A] rounded-md px-3 py-2 focus:outline-none focus:ring-2 focus:ring-[#E28F35]" rows="4"/>
        </p>
        <input type="submit" value="Submit" class="bg-[#4EC0A0] hover:bg-[#3fa88a] text-white font-semibold px-6 py-2 rounded-md cursor-pointer"/>
    </form:form>
</div>
</body>
</html>