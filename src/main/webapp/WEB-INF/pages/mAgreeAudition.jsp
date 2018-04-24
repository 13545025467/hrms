<%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/23
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.text.SimpleDateFormat" %>
<%@page import="java.util.Date" %>
<% SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH24:mm-ss");
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
</head>
<body>
<form method="post" action="sendAudition">
    <br><br>
    ${sessionScope.mResume.res_name}！<br>
    &nbsp;&nbsp;&nbsp;&nbsp;您好！我公司已接到你的简历，请于<input type="datetime-local" placeholder="面试时间" name="audi_time" min=<%= sdf.format(new Date())%> >到公司<br>
    参加面试${sessionScope.mPost.audi_post}职位，联系电话<input type="number" placeholder="公司联系电话" name="audi_tel">，公司地址<input name="audi_local" placeholder="公司地址">，<br>
    请准时参加，谢谢!
    <br><input type="submit" value="确认发送">
</form>
</body>
</html>
