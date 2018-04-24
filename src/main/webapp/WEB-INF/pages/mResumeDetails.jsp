<%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/23
  Time: 17:16
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
<h3>基本信息</h3>
姓名:${sessionScope.mResume.res_name}<br>
性别：${sessionScope.mResume.res_sex}<br>
年龄：${sessionScope.mResume.res_age}<br>
手机号码：${sessionScope.mResume.res_tel}<br>
邮箱地址：${sessionScope.mResume.res_email}<br>
<h3>教育背景</h3>AUDI_TIME
学校名称：${sessionScope.mEducation.edu_school}<br>
专业名称：${sessionScope.mEducation.edu_major}<br>
学历/学位：${sessionScope.mEducation.edu_degree}<br>
入学时间：${sessionScope.mEducation.edu_in}<br>
毕业时间：${sessionScope.mEducation.edu_out}<br>
<h3>工作经验</h3>
公司名称：${sessionScope.mExperience.exp_company}<br>
入职时间：${sessionScope.mExperience.exp_in}<br>
离职时间：${sessionScope.mExperience.exp_out}<br>
行业类别：${sessionScope.mExperience.exp_trade}<br>
职位名称：${sessionScope.mExperience.exp_post}<br>
<hr>
面试的职位:${sessionScope.mPost.audi_post}<br>
<br>
<form method="post" action="agreeAudition">
    <input type="submit" value="邀请面试">
</form>
</body>
</html>
