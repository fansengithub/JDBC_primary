<%--
  Created by IntelliJ IDEA.
  User: fansen
  Date: 2017/9/17
  Time: 21:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册信息处理</title>
</head>
<body>

<%--<%=request.getParameter("userName")%>--%>
<%--<br/>--%>
<%--<%=request.getParameter("passWord")%>--%>

<%
    String userName = request.getParameter("userName");
    String passWord = request.getParameter("passWord");
    out.println(userName);
    out.println("<br/>");
    out.println(passWord);
%>
<br>
<br>
<%--通过useBean输出用户名和密码--%>
<jsp:useBean id="user" class="com.fan.entity.UserEntity"></jsp:useBean>
<jsp:setProperty name="user" property="userName"></jsp:setProperty>
<jsp:setProperty name="user" property="passWord"></jsp:setProperty>
<jsp:getProperty name="user" property="userName"></jsp:getProperty>
<jsp:getProperty name="user" property="passWord"></jsp:getProperty>
</body>
</html>
