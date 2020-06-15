<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/11/2020
  Time: 2:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sandwich condiments</h1>
<form action="/sandwich_condiment" method="post">
    <input type="checkbox" id="lettuce" name="condiment" value="Lettuce">
    <label for="lettuce"> Lettuce </label><br>
    <input type="checkbox" id="vehicle2" name="condiment" value="Tomato">
    <label for="vehicle2"> Tomato </label><br>
    <input type="checkbox" id="vehicle3" name="condiment" value="Mustard">
    <label for="vehicle3"> Mustard </label><br>
    <input type="checkbox" id="vehicle4" name="condiment" value="Sprouts">
    <label for="vehicle4"> Sprouts </label><br><br>
    <input type="submit" value="Save">
</form>
</body>
</html>
