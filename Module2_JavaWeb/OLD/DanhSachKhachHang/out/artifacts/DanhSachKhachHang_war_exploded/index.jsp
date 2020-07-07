<%@ page import="java.util.List" %>
<%@ page import="ListIdol.Customer" %>
<%@ page import="java.awt.*" %>
<%@ page import="ListIdol.ListCustomer" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/8/2020
  Time: 9:30 AM
  To change this template use File | Settings | File Templates.
--%>
<html>
  <head>
    <title>$Title$</title>
    <style>
      #customers {
        font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
        border-collapse: collapse;
        width: 100%;
      }
      img {
        transition: transform .2s;
        height: auto;
        width: 150px;
      }
      img:hover{
        transform: scale(2);
      }
      #customers td, #customers th {
        border: 1px solid #ddd;
        padding: 8px;
      }

      #customers tr:nth-child(even){background-color: #f2f2f2;}

      #customers tr:hover {background-color: #ddd;}

      #customers th {
        padding-top: 12px;
        padding-bottom: 12px;
        text-align: center;
        background-color: #4CAF50;
        color: white;
      }
    </style>
  </head>
  <body>
  <h1 style="text-align: center" >Danh Sách Khách Hàng</h1>
  <table id="customers" style="text-align: center">
    <tr>
      <th>Tên </th>
      <th>Thuộc tính </th>
      <th>Loại </th>
      <th>Ảnh </th>
    </tr>

    <c:forEach items="${requestScope.customers}" var="cus">
      <tr>
        <td> ${cus.name} </td>
        <td>${cus.properties} </td>
        <td>${cus.species} </td>
        <td><img src="${cus.img}"/></td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
