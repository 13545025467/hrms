<%--
  Created by IntelliJ IDEA.
  User: xgq
  Date: 2018/4/25
  Time: 05:39
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
<form method="post" action="mUpdateRecruits" accept-charset="utf-8" onsubmit="check(this);return false;">
    招聘职位：<input type="text" name="rec_job"  value=${sessionScope.mUpdateDetails.rec_job}><br>
    招聘人数：<input type="number" min="1" max="300" name="rec_count" value=${sessionScope.mUpdateDetails.rec_count}><br>
    工作地点：<input name="rec_local" value=${sessionScope.mUpdateDetails.rec_local}><br>
    学历要求：<input name="rec_education" value=${sessionScope.mUpdateDetails.rec_education}><br>
    工作经验要求：<input name="rec_beforejob" value=${sessionScope.mUpdateDetails.rec_beforejob}><br>
    薪资：<input type="number" name="rec_sal" value=${sessionScope.mUpdateDetails.rec_sal} min="1800"><br>
    公司名称：<input type="text" name="rec_company" value=${sessionScope.mUpdateDetails.rec_company}><br>
    具体要求：<input type="text" value=${sessionScope.mUpdateDetails.rec_require} name="rec_require" maxlength="666"><br>
    <input name="rec_id" value=${sessionScope.mUpdateDetails.rec_id} type="hidden">
    <input type="submit" value="点击修改">
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

            alert("招聘信息修改成功")
        }
        form.submit();
    }

</script>
</body>
</html>
