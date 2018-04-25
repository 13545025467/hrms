<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/24
  Time: 18:41
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
<table cellpadding="0" cellspacing="0" style="background: papayawhip" border="1px">
    <caption>招聘记录</caption>
    <tr>
        <th>编号</th>
        <th>职位</th>
        <th>人数</th>
        <th>工作地点</th>
        <th>学历要求</th>
        <th>工作经验</th>
        <th>待遇</th>
        <th>公司</th>
        <th>查看详情</th>
    </tr>

    <c:forEach items="${allRecruits}" var="r" varStatus="status">
        <tr>
            <td>${r.rec_id}</td>
            <td>${r.rec_job}</td>
            <td>${r.rec_count}</td>
            <td>${r.rec_local}</td>
            <td>${r.rec_education}</td>
            <td>${r.rec_beforejob}</td>
            <td>${r.rec_sal}</td>
            <td>${r.rec_company}</td>
            <td>
                <form action="mSelectRecruitDetails" method="post">
                    <input type="hidden" name="rec_id" value=${r.rec_id}>
                    <input type="submit" value="查看详情">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
