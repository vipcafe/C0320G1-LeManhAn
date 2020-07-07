<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/7/2020
  Time: 11:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <br>
  <form action="/product" method="post">
    <label>Name Production: </label><br/>
    <input type="text" name="name" placeholder="Name production" /><br/>
    <label>Giá SP: </label><br/>
    <input type="text" name="price" placeholder="Giá SP" /><br/>
    <label>Phần Trăm Chiết Khấu : </label><br/>
    <input type="text" name="percent" placeholder="Phần Trăm SP" value="0"/><br/>
    <input type="submit" id = "submit" value="Sign in"/>
  </form>
  </body>
</html>
