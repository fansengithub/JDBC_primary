<%--
  Created by IntelliJ IDEA.
  User: fansen
  Date: 2017/9/17
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>request对象示例</title>
</head>
<body>
   <form action="" method="post">
       <input type="text" name="userName">
       <input type="submit" value="提交">
   </form>
请求方法名：<%= request.getMethod() %><br>
请求的资源：<%= request.getRequestURI() %><br>
请求的服务器IP： <%= request.getServerName() %><br>
表单提交的数据： <%= request.getParameter("userName")%>
</body>
</html>
