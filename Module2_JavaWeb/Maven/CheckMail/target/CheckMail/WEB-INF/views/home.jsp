<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/11/2020
  Time: 10:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Email Validate</h1>
<h3 style="color:red">${message}</h3>
<form action="validate" method="post">
    <fieldset style="width: 200px">
        <legend><h2>Nhap vao day</h2></legend>
        <input type="text" name="email"><br><br>
        <input type="submit" value="Validate">
    </fieldset>
</form>
</body>
</html>
