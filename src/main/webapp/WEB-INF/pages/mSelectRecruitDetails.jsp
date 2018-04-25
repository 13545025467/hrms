<%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/25
  Time: 05:24
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
<div style="background: beige">
    <br>职位：${sessionScope.mRecruitDetails.rec_job}
    <br>招聘人数：${sessionScope.mRecruitDetails.rec_count}
    <br>工作地点：${sessionScope.mRecruitDetails.rec_local}
    <br>福利待遇：${sessionScope.mRecruitDetails.rec_sal}元
    <br>学历要求：${sessionScope.mRecruitDetails.rec_education}
    <br>工作经验：${sessionScope.mRecruitDetails.rec_beforejob}
    <br>公司：${sessionScope.mRecruitDetails.rec_company}
    <br>状态：${sessionScope.mRecruitDetails.rec_state}
    <br>具体要求：${sessionScope.mRecruitDetails.rec_require}<br><br><br>
    <form method="post" action="mUpdateRecruit">
        <input type="hidden" name="rec_id" value=${ sessionScope.mRecruitDetails.rec_id}>
        <input type="submit" value="修改招聘信息" style="background: yellow">
    </form>
    <form method="post" action="mDeleteRecruit">
        <input type="hidden" name="rec_id" value=${ sessionScope.mRecruitDetails.rec_id}>
        <input type="submit" value="删除" style="background: yellow">
    </form>
</div>
</body>
</html>
