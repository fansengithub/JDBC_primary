<%--
  Created by IntelliJ IDEA.
  User: fansen
  Date: 2017/9/19
  Time: 0:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    ///登录验证的逻辑
  String userName = request.getParameter("userName");
  String passWord = request.getParameter("passWord");
  if(userName != null && passWord != null){
      session.setAttribute("userName",userName);
      response.setHeader("refresh","1;URL=welcome.jsp");
  }
%>