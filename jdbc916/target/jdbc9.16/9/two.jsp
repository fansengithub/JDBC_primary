<%--
  Created by IntelliJ IDEA.
  User: fansen
  Date: 2017/10/25
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<title>录入表单信息</title>
<form action="three.jsp" method="post">
    用户名：<input type="text" name="usern"><br>
    技能：
    <input type="checkbox" name="skillll" value="java">java<br>
    <input type="checkbox" name="skillll" value="c">c<br>
    <input type="checkbox" name="skillll" value="c++">c++<br>
    <input type="submit" value="提交">
    <input type="reset"  value="重置">
</form>
</body>
</html>
