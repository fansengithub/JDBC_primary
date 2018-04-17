<%--
  Created by IntelliJ IDEA.
  User: fansen
  Date: 2017/10/25
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>信息展示页面</title>
</head>
<body>
<h1>信息展示页面</h1>
用户名：<%=  request.getAttribute("name")  %>
技能：<%= request.getAttribute("skills") %> <br>
<br>
用户名： <%= request.getAttribute("name") %><br>
技能ss：  <%= request.getAttribute("skills") %>
</body>
</html>

