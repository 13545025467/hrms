<%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/21
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.lv.model.User" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    User user= (User) session.getAttribute("user");
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
</head>
<body>
<ul>
    <li>
        <a href="http://www.youdao.com" target="rightWindow">首页</a>
    </li>
    <li>
        <a href="selectRecruit" target="rightWindow">浏览招聘信息</a>
    </li>
    <li>
        <a href="selectResume" target="rightWindow">我的简历</a>
    </li>
    <li>
        <a href="http://www.360.com" target="rightWindow">我的消息</a>
    </li>
    <li>
        <a href="userUpdatePass" target="rightWindow">修改密码</a>
    </li>
    <li>
        <a href="http://www.jd.com" target="rightWindow">京东</a>
    </li>
</ul>
<br><br>
<h4>
    --当前时间--
    <%= sdf.format(new Date())%>
</h4>
<%
    if (user!=null){
%>
<p>
    欢迎您:
    <%= user.getUser_name()%>
</p>
<%}%>
</body>
</html>
