<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100 flex items-center justify-center h-screen">
<div class="bg-white p-10 rounded-xl shadow-lg text-center">
    <p class="text-lg text-gray-700 mb-4">
        You have visited
        <span class="font-bold">${count} || <c:out value="${count}"></c:out></span> times.
    </p>
    <a href="/" class="text-blue-500 font-bold hover:underline">Test another visit for the first page?</a>
    <p class="text-lg text-gray-700 mb-4">
    <span class="font-bold">${count2} || <c:out value="${count2}"></c:out></span>    times.
    </p>
    <a href="/sec" class="text-blue-500 font-bold hover:underline">Test another visit for the secound page?</a>
    <br>
    <button><a href="/reset" class="display-block text-blue-500 font-bold hover:underline">reset</a></button>
</div>
</body>
</html>
