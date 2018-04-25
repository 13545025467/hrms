<%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/21
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
%>
<%@ page errorPage="/errorPage.jsp" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
</head>
<frameset rows="20%,*" name="allWindow">
    <frame src="logo.jsp">
    </frame>

    <frameset cols="15%,70%,*">
        <frame src="index2.jsp" noresize="noresize" frameborder="no"  />
        <frame name="rightWindow" src="http://ts.zhaopin.com/jump/index_new.html?sid=121120123&site=360so_pz_zbt_zhilianzhaopin1" noresize="noresize" ></frame>
        <frame src="index1.jsp" noresize="noresize" scrolling="no" />
    </frameset>
</frameset>
</html>
