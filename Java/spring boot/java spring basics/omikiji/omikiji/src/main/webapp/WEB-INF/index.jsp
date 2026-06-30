<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Omikuji</title>
    <link href="style.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h1>Send  an Omikuji</h1>
<form method="post" action="/omikuji/send" >
    <label>Pick any number from 5 to 25</label>
    <input type="number" name="num" min="5" max="25" step="1"/>

    <label>Enter the name of the city</label>
    <input type="text" name="city"/>

    <label>Enter the name of any real person</label>
    <input type="text" name="name"/>

    <label>Enter professional endeavor or hobby</label>
    <input type="text" name="hobby"/>

    <label>Enter any type of livig thing</label>
    <input type="text" name="thing"/>

    <label>Say something nice  to someone  :-</label>
    <textarea name="desc"></textarea>
    <button type="submit">Send</button>
</form>
</div>

</body>