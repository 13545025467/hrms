<%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/20
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
</head>
<body>
<fieldset>
    <legend>登录界面</legend>
    <form action="login" method="post">
        账号：<input name="u_name"><br>
        密码：<input name="u_pass"><br>
        <input type="submit" value="登录">
    </form>
    <h4 style="color: red">${error}</h4>
</fieldset>
</body>
</html>
