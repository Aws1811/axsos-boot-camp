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

<div class="w-full max-w-3xl bg-[#f3c98b] border-2 border-[#DA6A7B] rounded-xl shadow-md p-8 space-y-10">

    <h1 class="text-4xl font-bold text-[#DA6A7B]">Travels</h1>

    <table class="w-full border-collapse border border-[#F7A99A] rounded-lg overflow-hidden">
        <thead>
        <tr class="bg-[#DA6A7B] text-white">
            <th class="px-4 py-3 text-left">Expense</th>
            <th class="px-4 py-3 text-left">Vendor</th>
            <th class="px-4 py-3 text-center">Amount</th>
            <th class="px-4 py-3 text-center">Action</th>
            <th class="px-4 py-3 text-center">..</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="travel" items="${travels}" varStatus="status">
            <tr class="${status.index % 2 == 0 ? 'bg-[#f1e8b8]' : 'bg-[#FDEBF1]'} border-t border-[#F7A99A] hover:bg-[#F7A99A]/30">
                <td class="px-4 py-2"><a href="expenses/${travel.id}" class="text-[#E28F35] hover:underline"> ${travel.expense} </a> </td>
                <td class="px-4 py-2">${travel.vendor}</td>
                <td class="px-4 py-2 text-center font-semibold text-[#4EC0A0]">${travel.amount} $</td>
                <td class="px-4 py-2"><a href="expenses/edit/${travel.id}" class="text-[#E28F35] hover:underline">Update..</a></td>
                <td class="px-4 py-2"><a href="delete/page/${travel.id}" class="text-[#DA6A7B] hover:underline">Delete..</a></td>

            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div>
        <h2 class="text-2xl font-bold text-[#DA6A7B] mb-4">Add an expense</h2>

        <form:form action="/maketravel" method="post" modelAttribute="travel" cssClass="space-y-4">
            <p class="flex flex-col gap-1">
                <form:label path="expense" cssClass="font-medium text-gray-700">expense Name</form:label>
                <form:errors path="expense" cssClass="text-[#DA6A7B] text-sm"/>
                <form:input path="expense" cssClass="bg-[#f1e8b8] border border-[#F7A99A] rounded-md px-3 py-2 focus:outline-none focus:ring-2 focus:ring-[#E28F35]"/>
            </p>
            <p class="flex flex-col gap-1">
                <form:label path="vendor" cssClass="font-medium text-gray-700">vendor Name</form:label>
                <form:errors path="vendor" cssClass="text-[#DA6A7B] text-sm"/>
                <form:input path="vendor" cssClass=" bg-[#f1e8b8] border border-[#F7A99A] rounded-md px-3 py-2 focus:outline-none focus:ring-2 focus:ring-[#E28F35]"/>
            </p>
            <p class="flex flex-col gap-1">
                <form:label path="amount" cssClass="font-medium text-gray-700">Amount</form:label>
                <form:errors path="amount" cssClass="text-[#DA6A7B] text-sm"/>
                <form:input type="number" path="amount" cssClass="bg-[#f1e8b8] border border-[#F7A99A] rounded-md px-3 py-2 w-28 focus:outline-none focus:ring-2 focus:ring-[#E28F35]"/>
            </p>
            <p class="flex flex-col gap-1">
                <form:label path="desc" cssClass="font-medium text-gray-700">Description</form:label>
                <form:errors path="desc" cssClass="text-[#DA6A7B] text-sm"/>
                <form:textarea path="desc" cssClass="bg-[#f1e8b8] border border-[#F7A99A] rounded-md px-3 py-2 focus:outline-none focus:ring-2 focus:ring-[#E28F35]" rows="4"/>
            </p>
            <input type="submit" value="Submit" class="bg-[#4EC0A0] hover:bg-[#3fa88a] text-white font-semibold px-6 py-2 rounded-md cursor-pointer"/>
        </form:form>
    </div>

</div>

</body>
</html>