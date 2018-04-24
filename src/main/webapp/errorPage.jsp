<%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/24
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
isErrorPage="true"
%>

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
<%= exception.getMessage()%>
<p style="color: red;font-size: 30px">你访问的页面不存在，请返回重试</p>
</body>
</html>
