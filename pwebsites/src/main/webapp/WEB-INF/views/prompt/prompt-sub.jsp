<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/22 0022
  Time: 下午 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <ul id="myTab" class="nav nav-tabs">
        <li class="active">
            <a href="#baseInfo" data-toggle="tab">
                基本信息
            </a>
        </li>
        <li>
            <a href="#mySkill" data-toggle="tab" onclick="new PromptObj().getMySkillInfo()">
                我的技能
            </a>
        </li>
        <li>
            <a href="#myAchievement" data-toggle="tab" onclick="new PromptObj().getMyAchievement()">
                科研成果
            </a>
        </li>
        <li class="dropdown">
            <a href="#" id="projectInfo" class="dropdown-toggle"
               data-toggle="dropdown">项目信息
                <b class="caret"></b>
            </a>
            <ul class="dropdown-menu" role="menu" aria-labelledby="projectInfo">
                <li>
                    <a href="#project1" tabindex="-1" data-toggle="tab">
                        jmeter
                    </a>
                </li>
                <li>
                    <a href="#project2" tabindex="-1" data-toggle="tab">
                        ejb
                    </a>
                </li>
            </ul>
        </li>
        <li class="dropdown">
            <a href="#" id="workExp" class="dropdown-toggle"
               data-toggle="dropdown">工作经历
                <b class="caret"></b>
            </a>
            <ul class="dropdown-menu" role="menu" aria-labelledby="workExp">
                <li><a href="#work1" tabindex="-1" data-toggle="tab">jmeter</a></li>
                <li><a href="#work2" tabindex="-1" data-toggle="tab">ejb</a></li>
            </ul>
        </li>
        <li class="dropdown">
            <a href="#" id="education" class="dropdown-toggle"
               data-toggle="dropdown">教育背景
                <b class="caret"></b>
            </a>
            <ul class="dropdown-menu" role="menu" aria-labelledby="education">
                <li><a href="#edu1" tabindex="-1" data-toggle="tab">小学</a></li>
                <li><a href="#edu2" tabindex="-1" data-toggle="tab">中学</a></li>
                <li><a href="#edu3" tabindex="-1" data-toggle="tab">高中</a></li>
                <li><a href="#edu4" tabindex="-1" data-toggle="tab">大学</a></li>
                <li><a href="#edu5" tabindex="-1" data-toggle="tab">研究生</a></li>
            </ul>
        </li>
        <li>
            <a href="#personal" data-toggle="tab" onclick="new PromptObj().personalInfo()">
                个人评价
            </a>
        </li>
    </ul>
    <div id="myTabContent" class="tab-content">
        <div class="tab-pane fade in active" id="baseInfo">
            <jsp:include page="baseInfo.jsp"/>
        </div>
        <div class="tab-pane fade" id="mySkill">
           <jsp:include page="mySkill.jsp"/>
        </div>
        <div class="tab-pane fade" id="myAchievement">
            <jsp:include page="myAchievement.jsp"/>
        </div>
        <jsp:include page="project.jsp"/>
        <jsp:include page="work.jsp"/>
        <jsp:include page="education.jsp"/>
        <div class="tab-pane fade" id="personal">
            <jsp:include page="personal.jsp"/>
        </div>
    </div>
</div>
</body>
</html>
