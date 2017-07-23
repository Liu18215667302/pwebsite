<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/22 0022
  Time: 上午 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <!--flash part start -->
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <%--<img src="img/header.jpg" alt="" width="527" height="262" />--%>
        <!-- 轮播（Carousel）指标 -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>
        <!-- 轮播（Carousel）项目 -->
        <div class="carousel-inner">
            <div class="item active">
                <img src="img/header.jpg" alt="First slide">
            </div>
            <div class="item">
                <img src="img/header.jpg" alt="Second slide">
            </div>
            <div class="item">
                <img src="img/header.jpg" alt="Third slide">
            </div>
        </div>
        <!-- 轮播（Carousel）导航 -->
        <a class="carousel-control left" href="#myCarousel"
           data-slide="prev">&lsaquo;</a>
        <a class="carousel-control right" href="#myCarousel"
           data-slide="next">&rsaquo;</a>
    </div>
    <!--flash part end -->
    <!--welcome part start -->
    <span class="welcomeTop">&nbsp;</span>
    <div id="welcome">
        <table class="table">
            <caption>${sessionScope.user.result.name}</caption>
            <tr>
                <th>性别：</th>
                <td>${sessionScope.user.result.sex}</td>
                <th>年龄：</th>
                <td>${sessionScope.user.result.age}</td>
            </tr>
            <tr>
                <th>出生日期：</th>
                <td colspan="3">${sessionScope.user.result.birthday}</td>
            </tr>
            <tr>
                <th>最高学历：</th>
                <td colspan="3">${sessionScope.user.result.highestEducation}</td>
            </tr>
        </table>
        <a href="javascript:void(0)" onclick="new LeftObj().showPrompt()" class="read_more">read more</a>
    </div>
    <span class="welcomebot">&nbsp;</span>
    <!--welcome part end -->
    <!--product item start -->
    <div class="width543">
        <img src="img/pic.gif" alt="" width="113" height="92" class="floatLeft" />
        <div class="productRight">
            <p class="text1">
                <strong>我的技能：</strong>
                <span id="myskill">
                熟悉Java语言、熟悉Java WEB、熟悉主流框架SSH（Spring MVC + Spring+Hibernate）、SSM（Spring MVC+Spring+MyBatis），了解Spring Data、Spring boot、BuguMongo等；
                熟悉网页编程(HTML5 + CSS3 + JavaScript)，熟悉JS框架JQuery、Angular2,了解JS框架vue、Angularjs、JQuery Mobile、Bootstrap、AMD等；
                熟悉MySQL，了解
                </span>
                <a href="javascript:void(0)" onclick="new LeftObj().showPrompt()">more</a>
            </p>
        </div>
        <br class="spacer" />
    </div>
    <div class="width543">
        <img src="img/pic1.gif" alt="" width="113" height="92" class="floatLeft" />
        <div class="productRight">
            <p class="text1">
                <strong>我的成果：</strong>
                <span id="result">
                Lorem Ipsum has
                been the industry's standard dummy text ever since the 1500s. Lorem Ipsum is simply dummy text of the
                printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the
                1500s.
                </span>
                <a href="javascript:void(0)" onclick="new LeftObj().showPrompt()">more</a>														</p>
        </div>
        <br class="spacer" />
    </div>
    <div class="width543">
        <img src="img/pic2.gif" alt="" width="113" height="92" class="floatLeft" />
        <div class="productRight">
            <p class="text1">
                <strong>技能信息：</strong>
                <span id="skillinfo">
                Lorem Ipsum has
                been the industry's standard dummy text ever since the 1500s. Lorem Ipsum is simply dummy text of the
                printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the
                1500s.
                </span>
                <a href="javascript:void(0)" onclick="new LeftObj().showPrompt()">more</a>														</p>
        </div>
        <br class="spacer" />
    </div>
    <!--product item end -->
    <p class="text1 nobotMar">
        <strong>个人评价：</strong>
        <span id="personal-pj">
        standard
        dummy text ever since the 1500s. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has
        been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled.
        </span>
        <a href="javascript:void(0)" onclick="new LeftObj().showPrompt()">more</a>									</p>

</div>
<script src="js/left.js" type="text/javascript"></script>
</body>
</html>
