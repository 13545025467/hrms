<%@ page import="com.lv.model.Post" %>
<%@ page import="java.util.Set" %><%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/24
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Set<Post> posts= (Set<Post>) session.getAttribute("posts");
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
</head>
<body>
<form method="post" action="addRecruitDetails" accept-charset="utf-8" onsubmit="check(this);return false;">
    <%for(Post p:posts){%>
    招聘职位： <select name="rec_job">
        <option><%= p.getPost_title()%></option>
    </select>
    <%--招聘职位：<input type="text" name="rec_job" value=""><br>--%>
    招聘人数：<input type="number" min="1" max="300" value="" name="rec_count"><br>
    工作地点：<input name="rec_local" value=""><br>
    学历要求：<input name="rec_education" value=""><br>
    工作经验要求：<input name="rec_beforejob" value=""><br>
    薪资：<input type="number" name="rec_sal" value="" min="1800"><br>
    公司名称：<input type="text" name="rec_company" value=""><br>
    具体要求：<input type="text" value="" name="rec_require" maxlength="666"><br>
    <input type="submit" value="发布">
    <input type="reset" value="重置">
</form>
<script type="text/javascript">

    function check(form) {
        if (form.rec_job.value =='') {
            alert('招聘信息职务不能为空');
            return;
        }
        if (form.rec_local.value == '') {
            alert('工作地点不能为空');
            return;
        }
        if (form.rec_education.value == '') {
            alert('学历要求不能为空');
            return;
        }
        if (form.rec_beforejob.value == '') {
            alert('工作经验不能为空');
            return;
        }
        if (form.rec_sal.value == '') {
            alert('薪资不能为空');
            return;
        }
        if (form.rec_company.value == '') {
            alert('请填写公司名称');
            return;
        }if (form.rec_require.value == '') {
                alert('请填写工作的要求');
                return;
        }else{

            alert("招聘信息发布成功")
        }
        form.submit();
    }

</script>
</body>
</html>
