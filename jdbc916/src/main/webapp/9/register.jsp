<%--
  Created by IntelliJ IDEA.
  User: fansen
  Date: 2017/9/17
  Time: 22:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>录入表单信息</title>
    <form action="do_register.jsp" method="post">
        用户名：<input type="text" name="userName"><br>
        技能：
        <input type="checkbox" name="skills" value="java">java
        <input type="checkbox" name="skills" value="python">python
        <input type="checkbox" name="skills" value="ruby">ruby
        <input type="checkbox" name="skills" value="golang">golang
        <br>
        <input type="submit" value="提交">
        <input type="reset" value="重置">

    </form>
</head>
<body>

</body>
</html>
