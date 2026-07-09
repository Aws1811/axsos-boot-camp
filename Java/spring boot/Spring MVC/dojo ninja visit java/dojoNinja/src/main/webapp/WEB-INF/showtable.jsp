<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>${dojo.name} Ninjas</title>
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
    </style>
</head>
<body class="bg-ink font-body text-cream min-h-screen flex flex-col">

<div class="belt-stripe h-1.5 w-full"></div>

<!-- nav -->
<nav class="max-w-4xl w-full mx-auto px-6 pt-6 flex gap-6 text-sm font-semibold">
    <a href="/" class="text-cream/60 hover:text-orange transition">Home</a>
    <a href="/dojos/new" class="text-cream/60 hover:text-orange transition">New Dojo</a>
    <a href="/ninja" class="text-cream/60 hover:text-orange transition">New Ninja</a>
</nav>

<main class="max-w-4xl w-full mx-auto px-6 py-12 flex-1">

    <p class="font-display tracking-[0.25em] text-orange text-xs mb-2">DOJO ROSTER</p>
    <h1 class="font-display text-5xl mb-10">${dojo.name} <span class="text-orange">Ninjas</span></h1>

    <c:choose>
        <c:when test="${empty dojo.ninja}">
            <div class="belt-fold bg-cream/5 border border-cream/10 py-16 text-center text-cream/50">
                No ninjas enrolled in this dojo yet.
            </div>
        </c:when>
        <c:otherwise>
            <div class="belt-fold bg-cream text-ink overflow-hidden shadow-xl">
                <table class="w-full text-sm">
                    <thead>
                    <tr class="bg-ink/5 text-left">
                        <th class="px-6 py-3 font-display tracking-wide text-ink/60 text-xs uppercase">id</th>
                        <th class="px-6 py-3 font-display tracking-wide text-ink/60 text-xs uppercase">FirstName</th>
                        <th class="px-6 py-3 font-display tracking-wide text-ink/60 text-xs uppercase">LastName</th>
                        <th class="px-6 py-3 font-display tracking-wide text-ink/60 text-xs uppercase">Age</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="ninja" items="${dojo.ninja}" varStatus="loop">
                        <tr class="${loop.index % 2 == 0 ? '' : 'bg-ink/[0.03]'} border-t border-ink/5">
                            <td class="px-6 py-4 text-ink/50">${ninja.ninjaId}</td>
                            <td class="px-6 py-4 font-medium">${ninja.firstName}</td>
                            <td class="px-6 py-4 font-medium">${ninja.lastName}</td>
                            <td class="px-6 py-4">${ninja.age}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </c:otherwise>
    </c:choose>

</main>

<footer class="belt-stripe h-1.5 w-full"></footer>

</body>
</html>
