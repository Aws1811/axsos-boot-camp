<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ninja gold</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="flex flex-col items-center mt-[10%] gap-16 m-0 p-0">

<label class="text-2xl">Your Gold:
    <input type="text" name="" value="${total}" readonly class="text-2xl">
    <button class="w-60 h-12 bg-amber-800 text-white">
        <a href="/reset" class="text-thistle text-[20px]">StartOver?</a>
    </button>
</label>

<main class="w-[80em] justify-center flex gap-8">
    <section class="bg-[antiquewhite] flex flex-col items-center justify-center w-60 h-40 border-4 border-black gap-2">
        <h2>spa</h2>
        <p>(lose 5 to 20 golds💀)</p>
        <form method="POST" action="/gold">
            <input type="hidden" name="place" value="spa">
            <button type="submit" class="w-28 h-12 bg-amber-800 text-white">lsoe your gold !💀</button>
        </form>
    </section>

    <section class="bg-[antiquewhite] flex flex-col items-center justify-center w-60 h-40 border-4 border-black gap-2">
        <h2>Farm</h2>
        <p>(earns 15 to 20 golds)</p>
        <form method="POST" action="/gold">
            <input type="hidden" name="place" value="farm">
            <button type="submit" class="w-28 h-12 bg-amber-800 text-white">Find gold !</button>
        </form>
    </section>

    <section class="bg-[antiquewhite] flex flex-col items-center justify-center w-60 h-40 border-4 border-black gap-2">
        <h2>cave</h2>
        <p>earns 5 to 10 golds</p>
        <form method="POST" action="/gold">
            <input type="hidden" name="place" value="cave">
            <button type="submit" class="w-28 h-12 bg-amber-800 text-white">Find gold !</button>
        </form>
    </section>

    <section class="bg-[antiquewhite] flex flex-col items-center justify-center w-60 h-40 border-4 border-black gap-2">
        <h2>house</h2>
        <p>earns 2 to 5 golds</p>
        <form method="POST" action="/gold">
            <input type="hidden" name="place" value="house">
            <button type="submit" class="w-28 h-12 bg-amber-800 text-white">Find gold !</button>
        </form>
    </section>

    <section class="bg-[antiquewhite] flex flex-col items-center justify-center w-60 h-40 border-4 border-black gap-2">
        <h2>casino</h2>
        <p>earns 0 to 50 golds</p>
        <form method="POST" action="/gold">
            <button type="submit" class="w-28 h-12 bg-amber-800 text-white">Find gold !</button>
            <input type="hidden" name="place" value="quest">
        </form>
    </section>
</main>

<div name="" readonly class="text-black min-w-[82em] h-64 min-h-64 max-w-[82em] border-4 border-black h-fit">
    <c:forEach var="msg" items="${hobby}">
        <c:choose>
            <c:when test="${fn:contains(msg,'lost')}">
         <span class=" text-red-600"> ${msg} </span>
            </c:when>
            <c:otherwise>
                <span class=" text-green-600"> ${msg} </span>
            </c:otherwise>
        </c:choose>
             <br>
    </c:forEach>
</div>

</body>
</html>