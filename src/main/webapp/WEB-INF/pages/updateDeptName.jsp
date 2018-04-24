<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/24
  Time: 16:24
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
<table border="1px" cellspacing="0" cellpadding="0">
    <caption>所有部门</caption>
    <tr>
        <th>部门编号</th>
        <th>部门名称</th>
        <th>创建时间</th>
        <th>全体员工</th>
    </tr>

    <form action="updateDept" method="post">
    <c:forEach items="${dept}" var="r" varStatus="status">
        <tr>
            <td>${r.dept_id}</td>
            <td>
            <input type="text" name="dept_name" value=${r.dept_name}>
            </td>
            <td>${r.dept_createtime}</td>
            <td>

                    <%--<input type="hidden"  name="dept_name" >--%>
                    <input type="submit" value="确认修改">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
