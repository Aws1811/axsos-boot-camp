<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Your Omikuji</title>
    <link href="/style.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h1>here's the  Omikuji of You ${name}</h1>
    <div>
        <p>
            In <span>${num}</span> years, you will live in <span>${city}</span> with
            <span>${name}</span> as your roommate, selling <span>${hobby}</span> for a living.
            The next time you see a <span>${thing}</span>, you will have good luck.
            Also, <span>${desc}</span>
        </p>
    </div>
    <a href="/omikuji">Go Back</a>
    </div>
</body>
