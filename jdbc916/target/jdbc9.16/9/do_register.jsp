<%--
  Created by IntelliJ IDEA.
  User: fansen
  Date: 2017/9/17
  Time: 22:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //表单处理页面

    //通过getParameter方法，获取用户名
    String userName = request.getParameter("userName");
    String skills = "";
    //获取用户提交的技能数组
    String[] skillArr = request.getParameterValues("skills");
    //将技能数组拼装为字符串。
    if (skillArr != null && skillArr.length > 0) {
        for (String skill : skillArr) {
            skills = skills + skill + " ";
        }
    }
    ///通过setAttribute，保存到requset对象中。
    request.setAttribute("userNamess", userName);
    request.setAttribute("skillsss", skills);
%>
<%-- 通过forward 跳转到下一页面 --%>
<jsp:forward page="welcome.jsp"></jsp:forward>