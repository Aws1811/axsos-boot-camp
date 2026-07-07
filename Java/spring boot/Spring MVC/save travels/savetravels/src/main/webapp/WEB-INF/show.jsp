<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="min-h-screen bg-[#ff9d7a] flex flex-col items-center py-12 px-4">
<div class="w-full max-w-lg bg-[#f3c98b] border-2 border-[#4EC0A0] rounded-xl shadow-md p-8 space-y-4">
    <h1 class="text-3xl font-bold text-[#DA6A7B]">Expense Details</h1>
    <a href="/expenses" class="inline-block text-[#E28F35] font-medium hover:underline">
        Go Back
    </a>
    <p class="text-gray-700"><span class="font-semibold text-[#DA6A7B]">Expense Name :</span> ${travel.expense}</p>
    <p class="text-gray-700"><span class="font-semibold text-[#DA6A7B]">Vendor Name  :</span> ${travel.vendor}</p>
    <p class="text-gray-700"><span class="font-semibold text-[#DA6A7B]">Amount :</span> ${travel.amount}</p>
    <p class="text-gray-700"><span class="font-semibold text-[#DA6A7B]">Descirption  :</span> ${travel.desc}</p>
</div>
</body>
</html>