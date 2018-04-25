<%@ page import="com.lv.model.Dept" %>
<%@ page import="java.util.Set" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/25
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Set<Dept> dept1= (Set<Dept>) session.getAttribute("depts1");
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
</head>
<body>

    <h3>选择部门</h3>
    <%for(Dept d:dept1){%>
    <form method="post" action="addRecruit2">
        <%= d.getDept_name()%><input type="radio" name="id" value=${d.dept_id}></td>
        <%}%>
        <input type="submit" value="提交">
    </form>
</body>
</html>
