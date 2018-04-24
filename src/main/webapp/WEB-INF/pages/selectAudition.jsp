<%@ page import="com.lv.model.Audition" %>
<%@ page import="com.lv.model.User" %>
<%@ page import="java.util.Set" %>
<%@ taglib prefix="e" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page errorPage="/errorPage.jsp" %>
<%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/23
  Time: 22:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    User user= (User) session.getAttribute("user");
    Set<Audition> audition= (Set<Audition>) session.getAttribute("getAudition");
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
</head>
<body>
<% if(user==null){%>
<span style="font-size: 30px;color: red">请登录后重试</span>
<% }else if(audition==null){%>
<span style="font-size: 30px;color: red">暂时还没有任何消息</span>
<% }else {%>
<%--<% int state=-1;%>--%>
<table>
    <caption>面试通知</caption>
    <tr>
        <th>面试职位</th>
        <th>时间</th>
        <th>地点</th>
        <th>联系电话</th>
        <th>回复</th>
        <th>是否已读</th>
    </tr>
    <c:forEach items="${getAudition}" var="r" varStatus="status">
        <%--<% int $;%>--%>
            <%--state=${r.audi_state}--%>
        <tr>
            <td>${r.audi_post}</td>
            <td>${r.audi_time}</td>
            <td>${r.audi_local}</td>
            <td>${r.audi_tel}</td>
            <%--<% if (state==1){%>--%>
            <td>
                <form action="goAudition" method="post">
                    <input type="hidden" name="audi_id" value=${r.audi_id}>
                    <input type="submit" value="前去面试">
                    ${oldTime}
                </form>
            </td>
            <%--<%}else {%>--%>
            <%--<td>已读</td>--%>
            <%--<%}%>--%>
        </tr>
    </c:forEach>
</table>
<%}%>
</body>
</html>
