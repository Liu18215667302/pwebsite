<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <table class="table base-info">
        <thead>
            <tr>
                <th width="15%">姓名：</th>
                <td>${sessionScope.user.result.name}</td>
                <th width="15%">性别：</th>
                <td>${sessionScope.user.result.sex}</td>
            </tr>
        </thead>
        <tbody>
            <tr>
                <th>年龄：</th>
                <td>${sessionScope.user.result.age}</td>
                <th>出生年月：</th>
                <td>${sessionScope.user.result.birthday}</td>
            </tr>
            <tr>
                <th>政治面貌：</th>
                <td>${sessionScope.user.result.politics}</td>
                <th>邮箱：</th>
                <td>${sessionScope.user.result.email}</td>
            </tr>
            <tr>
                <th>手机：</th>
                <td>${sessionScope.user.result.phone}</td>
                <th>微信：</th>
                <td>${sessionScope.user.result.wechat}</td>
            </tr>
            <tr>
                <th>QQ：</th>
                <td>${sessionScope.user.result.qq}</td>
                <th>户籍：</th>
                <td>${sessionScope.user.result.familyAddress}</td>
            </tr>
            <tr>
                <th>通讯地址：</th>
                <td colspan="3">${sessionScope.user.result.address}</td>
            </tr>
            <tr>
                <th>最高学历：</th>
                <td>${sessionScope.user.result.highestEducation}</td>
                <th>毕业学校：</th>
                <td>${sessionScope.user.result.graducatedSchool}</td>
            </tr>
            <tr>
                <th>专业：</th>
                <td>${sessionScope.user.result.major}</td>
                <th>研究方向：</th>
                <td>${sessionScope.user.result.researchDirection}</td>
            </tr>
        </tbody>

    </table>
</div>
</body>
</html>
