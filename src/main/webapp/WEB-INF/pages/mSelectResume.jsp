<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.lv.model.Resume" %>
<%@ page import="java.util.Set" %><%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/23
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Set<Resume> resumes= (Set<Resume>) session.getAttribute("intoResume");
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
</head>
<body>
<table cellpadding="0" cellspacing="0" style="background: papayawhip" border="1px">
    <caption>所有简历</caption>
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>年龄</th>
        <th>电话</th>
        <th>邮箱</th>
        <th>查看详情</th>
    </tr>

    <c:forEach items="${sessionScope.intoResume}" var="r" varStatus="status">
        <tr>
            <td>${r.res_id}</td>
            <td>${r.res_name}</td>
            <td>${r.res_sex}</td>
            <td>${r.res_age}</td>
            <td>${r.res_tel}</td>
            <td>${r.res_email}</td>
            <td>
                <form action="resumeDetails" method="post">
                    <input type="hidden" name="rec_id" value=${r.res_id}>
                    <input type="submit" value="查看详情">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
