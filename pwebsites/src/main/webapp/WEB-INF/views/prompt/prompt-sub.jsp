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
            <a href="#mySkill" data-toggle="tab">
                我的技能
            </a>
        </li>
        <li>
            <a href="#myAchievement" data-toggle="tab">
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
            <a href="#personal" data-toggle="tab">
                个人评价
            </a>
        </li>
    </ul>
    <div id="myTabContent" class="tab-content">
        <div class="tab-pane fade in active" id="baseInfo">
            <p>菜鸟教程是一个提供最新的web技术站点，本站免费提供了建站相关的技术文档，帮助广大web技术爱好者快速入门并建立自己的网站。菜鸟先飞早入行——学的不仅是技术，更是梦想。</p>
        </div>
        <div class="tab-pane fade" id="mySkill">
            <p>iOS 是一个由苹果公司开发和发布的手机操作系统。最初是于 2007 年首次发布 iPhone、iPod Touch 和 Apple
                TV。iOS 派生自 OS X，它们共享 Darwin 基础。OS X 操作系统是用在苹果电脑上，iOS 是苹果的移动版本。</p>
        </div>
        <div class="tab-pane fade" id="project1">
            <p>jMeter 是一款开源的测试软件。它是 100% 纯 Java 应用程序，用于负载和性能测试。</p>
        </div>
        <div class="tab-pane fade" id="project2">
            <p>Enterprise Java Beans（EJB）是一个创建高度可扩展性和强大企业级应用程序的开发架构，部署在兼容应用程序服务器（比如 JBOSS、Web Logic 等）的 J2EE 上。
            </p>
        </div>
        <div class="tab-pane fade" id="work1">
            <p>jMeter 是一款开源的测试软件。它是 100% 纯 Java 应用程序，用于负载和性能测试。</p>
        </div>
        <div class="tab-pane fade" id="work2">
            <p>Enterprise Java Beans（EJB）是一个创建高度可扩展性和强大企业级应用程序的开发架构，部署在兼容应用程序服务器（比如 JBOSS、Web Logic 等）的 J2EE 上。
            </p>
        </div>
    </div>
</div>
</body>
</html>
