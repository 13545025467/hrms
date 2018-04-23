<%@ page import="com.lv.model.User" %><%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/21
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    User user= (User) session.getAttribute("user");
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
</head>
<body>
        <div id="panel">
            <form action="userUpdatePass1" method="get" accept-charset="utf-8" onsubmit="check(this);return false;">
                <div class="name">
                    旧&nbsp;密&nbsp;码:
                    <input type="text" name="name" value='' autofocus /></br></br>
                </div>
                <div class="pass">
                    新&nbsp;密&nbsp;码: <input type="password" name="pass"  value=''  /></br></br>
                </div>
                <div class="pass2">
                    确认密码:
                    <input type="password" name="pass2"  value=''  /></br></br>
                </div>
               <%--用户登录后才可以修改密码--%>
                <%if (user!=null){%>
                <div><input type="submit" value="确认修改"></div>
                <%}%>
            </form>
        </div>
    <script type="text/javascript">
        function check(form) {
            if (form.name.value !=<%= user.getUser_pass()%>) {
                alert('旧密码错误');
                return;
            }
            if (form.pass.value == '') {
                alert('密码不能为空');
                return;
            }
            if (form.pass.value != form.pass2.value) {
                alert('两次输入密码不一致');
                return;
            }
            form.submit();
        }
    </script>

</body>
</html>
