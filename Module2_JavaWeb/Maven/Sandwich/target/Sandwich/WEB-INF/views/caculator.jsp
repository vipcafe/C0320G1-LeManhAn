<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/11/2020
  Time: 6:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Caculator</h1>
<form method="get" action="\result_caculator">
<input type="text" name="a" placeholder="Nhập a" value="9">
<input type="text" name="b" placeholder="Nhập b" value="9"></br></br>
    <button type="submit" name="result" value="Addtion">Addtion(+)</button>
    <button type="submit" name="result" value="Subtraction">Subtraction(-)</button>
    <button type="submit" name="result" value="Multiplication">Multiplication(X)</button>
    <button type="submit" name="result" value="Division">Division(/)</button></br></br>
    <h2>Result ${result_caculator}</h2>
</form>
</body>
</html>
