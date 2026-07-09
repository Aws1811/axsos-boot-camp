<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>New Ninja</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&family=Inter:wght@400;500;600;700&display=swap" rel="stylesheet">
    <script src="https://cdn.tailwindcss.com"></script>
    <script>
        tailwind.config = {
            theme: {
                extend: {
                    colors: {
                        ink: '#001524', teal: '#15616D', cream: '#FFECD1',
                        orange: '#FF7D00', rust: '#78290F'
                    },
                    fontFamily: { display: ['Bebas Neue', 'sans-serif'], body: ['Inter', 'sans-serif'] }
                }
            }
        }
    </script>
    <style>
        .belt-fold { clip-path: polygon(0 0, 100% 0, 100% 100%, 32px 100%, 0 calc(100% - 32px)); }
        .belt-stripe { background: linear-gradient(90deg, #15616D 0 20%, #FFECD1 20% 40%, #FF7D00 40% 70%, #78290F 70% 100%); }
        .field-error { color: #78290F; font-size: 0.75rem; font-weight: 600; margin-top: 0.25rem; display: block; }

        select.dojo-select {
            width: 100%;
            border: 1px solid rgba(0,21,36,0.15);
            border-radius: 0.375rem;
            padding: 0.75rem 2.25rem 0.75rem 1rem;
            font-size: 0.875rem;
            background-color: white;
            appearance: none;
            background-image: url("data:image/svg+xml;charset=UTF-8,%3Csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 24 24' fill='none' stroke='%23001524' stroke-width='2'%3E%3Cpath d='M6 9l6 6 6-6'/%3E%3C/svg%3E");
            background-repeat: no-repeat;
            background-position: right 1rem center;
            background-size: 1rem;
        }
        select.dojo-select:focus {
            outline: none;
            border-color: #15616D;
            box-shadow: 0 0 0 2px rgba(21,97,109,0.35);
        }
    </style>
</head>
<body class="bg-ink font-body text-cream min-h-screen flex flex-col">

<div class="belt-stripe h-1.5 w-full"></div>

<!-- nav -->
<nav class="max-w-3xl w-full mx-auto px-6 pt-6 flex gap-6 text-sm font-semibold">
    <a href="/" class="text-cream/60 hover:text-orange transition">Home</a>
    <a href="/dojos/new" class="text-cream/60 hover:text-orange transition">New Dojo</a>
    <a href="/ninja" class="text-orange">New Ninja</a>
</nav>

<main class="flex-1 flex items-center justify-center px-6 py-12">
    <div class="belt-fold bg-cream text-ink w-full max-w-md p-8 shadow-xl">

        <p class="font-display tracking-[0.25em] text-rust text-xs mb-2">NEW RECRUIT</p>
        <h1 class="font-display text-4xl mb-8"> New Ninja</h1>

        <form:form action="/ninja/new" method="post"  modelAttribute="ninjas" cssClass="space-y-5">

            <div>
                <form:select path="dojo" cssClass="dojo-select">
                    <form:option value="" label="-- select a dojo --"/>
                    <c:forEach var="d" items="${dojos}">
                        <form:option value="${d.id}" label="${d.name}"/>
                    </c:forEach>
                </form:select>
            </div>

            <div>
                <form:label path="firstName" cssClass="block text-sm font-semibold text-ink mb-2"> enter the first name</form:label>
                <form:input path="firstName" cssClass="w-full border border-ink/15 rounded-md px-4 py-3 text-sm focus:outline-none focus:ring-2 focus:ring-teal focus:border-teal transition"></form:input>
                <form:errors path="firstName" cssClass="field-error"></form:errors>
            </div>

            <div>
                <form:label path="lastName" cssClass="block text-sm font-semibold text-ink mb-2">enter the last name</form:label>
                <form:input path="lastName" cssClass="w-full border border-ink/15 rounded-md px-4 py-3 text-sm focus:outline-none focus:ring-2 focus:ring-teal focus:border-teal transition"></form:input>
                <form:errors path="lastName" cssClass="field-error"></form:errors>
            </div>

            <div>
                <form:label path="age" cssClass="block text-sm font-semibold text-ink mb-2"> enter the age</form:label>
                <form:input path="age" cssClass="w-full border border-ink/15 rounded-md px-4 py-3 text-sm focus:outline-none focus:ring-2 focus:ring-teal focus:border-teal transition"></form:input>
                <form:errors path="age" cssClass="field-error"></form:errors>
            </div>

            <button type="submit" class="w-full bg-orange text-ink font-display text-lg tracking-wide px-5 py-3 hover:bg-orange/90 transition">Submit</button>

        </form:form>
    </div>
</main>

<footer class="belt-stripe h-1.5 w-full"></footer>

</body>
</html>
