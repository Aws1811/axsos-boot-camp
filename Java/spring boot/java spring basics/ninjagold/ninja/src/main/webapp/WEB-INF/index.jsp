<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ninja gold</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<label for="">Your Gold:
    <input type="text" name="" value="${total}" readonly>
</label>
<main>
    <section>
        <h2>Farm</h2>
        <p>(earns 15 to 20 golds)</p>
        <form method="POST" action="/gold">
            <input type="hidden" name="place" value="farm">
            <button type="submit">Find gold !</button>
        </form>
    </section>
    <section>
        <h2>cave</h2>
        <p>earns 5 to 10 golds</p>
        <form method="POST" action="/gold">
            <input type="hidden" name="place" value="cave">
            <button type="submit">Find gold !</button>
        </form>
    </section>
    <section>
        <h2>house </h2>
        <p>earns 2 to 5 golds </p>
        <form method="POST" action="/gold">
            <input type="hidden" name="place" value="house">
            <button type="submit">Find gold !</button>
        </form>
    </section>
    <section>
        <h2>casino</h2>
        <p>earns 0 to 50 golds</p>
        <form method="POST" action="/gold">
            <button type="submit">Find gold !</button>
            <input type="hidden" name="place" value="quest">
        </form>
    </section>
</main>
<textarea name="" readonly>
    <c:forEach var="msg" items="${hobby}">
        ${msg}
    </c:forEach>
    </textarea>
</body>
</html>