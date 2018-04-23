<%@ page import="com.lv.model.User" %>
<%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/21
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%  User user= (User) session.getAttribute("user");
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
</head>
<body>
<div style="background: beige">
    <br>职位：${sessionScope.recruitDetails.rec_job}
    <br>招聘人数：${sessionScope.recruitDetails.rec_count}
    <br>工作地点：${sessionScope.recruitDetails.rec_local}
    <br>福利待遇：${sessionScope.recruitDetails.rec_sal}元
    <br>学历要求：${sessionScope.recruitDetails.rec_education}
    <br>工作经验：${sessionScope.recruitDetails.rec_beforejob}
    <br>公司：${sessionScope.recruitDetails.rec_company}
    <br>具体要求：${sessionScope.recruitDetails.rec_require}<br><br><br>
    <%
       if(user!=null){
    %>
    <form method="post" action="submitResume">
        <input type="hidden" name="id" value=${ sessionScope.recruitDetails.rec_id}>
        <input type="submit" value="申请职位" style="background: yellow">
    </form>
    <%}else{  %>
        <input type="submit" value="申请职位" style="background: yellow" disabled="disabled">
    <%}%>
</div>

</body>
</html>
