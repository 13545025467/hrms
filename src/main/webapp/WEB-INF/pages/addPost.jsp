<%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/25
  Time: 09:30
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
<form method="post" action="addPost">
    <fieldset>
        <legend>添加职位</legend>
        职位名称：<input type="text" name="post_name">
        基本薪资：<input type="number" name="post_sal">
        <input type="hidden" name="dept_id" value=${sessionScope.deptid}>
        <input type="submit" value="添加">
    </fieldset>
</form>

</body>
</html>
