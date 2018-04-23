<%@ page import="com.lv.model.Resume" %><%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/22
  Time: 12:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Resume resume= (Resume) session.getAttribute("resume");
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
</head>
<body>
<%if (resume==null){%>
<h3>您还没有个人的简历，赶快添加自己的个性简历吧！！！</h3>
<a href="saveResume">填写简历</a>
<%}else{%>
<h3>基本信息</h3>
姓名:${sessionScope.resume.res_name}<br>
性别：${sessionScope.resume.res_sex}<br>
年龄：${sessionScope.resume.res_age}<br>
手机号码：${sessionScope.resume.res_tel}<br>
邮箱地址：${sessionScope.resume.res_email}<br>
<h3>教育背景</h3>
学校名称：${sessionScope.education.edu_school}<br>
专业名称：${sessionScope.education.edu_major}<br>
学历/学位：${sessionScope.education.edu_degree}<br>
入学时间：${sessionScope.education.edu_in}<br>
毕业时间：${sessionScope.education.edu_out}<br>
<h3>工作经验</h3>
公司名称：${sessionScope.experience.exp_company}<br>
入职时间：${sessionScope.experience.exp_in}<br>
离职时间：${sessionScope.experience.exp_out}<br>
行业类别：${sessionScope.experience.exp_trade}<br>
职位名称：${sessionScope.experience.exp_post}<br>
<br>
<form method="post" action="updateResume">
    <input type="submit" value="修改简历">
</form>
<form method="post" action="deleteResume">
    <input type="submit" value="删除简历">
</form>
<%}%>
</body>
</html>
