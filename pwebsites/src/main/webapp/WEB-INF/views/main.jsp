<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link href="css/main.css" type="text/css"  rel="stylesheet">
<body>
<div id="bigDiv">
    <jsp:include page="top/top.jsp"/>
    <!-- main div start -->
    <div id="main">
        <!--body part start -->
        <div id="body">
            <!--left part start -->
            <div id="left">
                <div class="innerLeft">
                    <!--flash part start -->
                    <div id="myCarousel" class="carousel slide">
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
                            <caption>刘兆龙</caption>
                            <tr>
                                <th>性别：</th>
                                <td>男</td>
                                <th>年龄：</th>
                                <td>27</td>
                            </tr>
                            <tr>
                                <th>出生日期：</th>
                                <td colspan="3">1990-06-14</td>
                            </tr>
                            <tr>
                                <th>最高学历：</th>
                                <td colspan="3">研究生</td>
                            </tr>
                           <%-- <tr>
                                <td>联系方式：</td>
                                <td>18215667302</td>
                                <td>邮箱：</td>
                                <td>liu2272772@163.com</td>
                            </tr>
                            <tr>
                                <td>QQ：</td>
                                <td>1282118543</td>
                                <td>微信：</td>
                                <td>18215667302</td>
                            </tr>--%>
                           <%-- <tr>
                                <td>籍贯：</td>
                                <td>山东省沂水县</td>
                                <td>最高学历：</td>
                                <td>研究生</td>
                            </tr>
                            <tr>
                                <td>通讯地址：</td>
                                <td colspan="3">成都市郫县林湾家园</td>
                            </tr>
                            <tr>
                                <td>毕业学校：</td>
                                <td colspan="3">重庆邮电大学</td>
                            </tr>--%>
                        </table>
                        <a href="#" class="read_more">read more</a>
                    </div>
                    <span class="welcomebot">&nbsp;</span>
                    <!--welcome part end -->
                    <!--product item start -->
                    <div class="width543">
                        <img src="img/pic.gif" alt="" width="113" height="92" class="floatLeft" />
                        <div class="productRight">
                            <p class="text1">
                                <strong>Lorem Ipsum is simply dummy text of the printing and typesetting industry.</strong> Lorem Ipsum has
                                been the industry's standard dummy text ever since the 1500s. Lorem Ipsum is simply dummy text of the
                                printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the
                                1500s.
                                <a href="#">more</a>														</p>
                        </div>
                        <br class="spacer" />
                    </div>
                    <div class="width543">
                        <img src="img/pic1.gif" alt="" width="113" height="92" class="floatLeft" />
                        <div class="productRight">
                            <p class="text1">
                                <strong>Lorem Ipsum is simply dummy text of the printing and typesetting industry.</strong> Lorem Ipsum has
                                been the industry's standard dummy text ever since the 1500s. Lorem Ipsum is simply dummy text of the
                                printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the
                                1500s.
                                <a href="#">more</a>														</p>
                        </div>
                        <br class="spacer" />
                    </div>
                    <div class="width543">
                        <img src="img/pic2.gif" alt="" width="113" height="92" class="floatLeft" />
                        <div class="productRight">
                            <p class="text1">
                                <strong>Lorem Ipsum is simply dummy text of the printing and typesetting industry.</strong> Lorem Ipsum has
                                been the industry's standard dummy text ever since the 1500s. Lorem Ipsum is simply dummy text of the
                                printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the
                                1500s.
                                <a href="#">more</a>														</p>
                        </div>
                        <br class="spacer" />
                    </div>
                    <!--product item end -->
                    <p class="text1 nobotMar">
                        <strong>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's </strong>standard
                        dummy text ever since the 1500s. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has
                        been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled.
                        <a href="#">more</a>									</p>

                </div>
            </div>
            <!--left part end -->
            <!--right part start -->
            <div id="right">
                <img src="img/logo.png" alt="Cruise Travel" title="Cruise Travel" class="logo" />
                <div id="event">
                    <h2>Latest events</h2>
                    <p class="rightText">
                        <strong>Porta vel, scelerisque eget, malesuada at, neque. suada at, neque.</strong> Vivamus eget nibh. Etiam cursus
                        leo vel metus. Nulla facilisi. Aenean nec eros. Vestibulum iaculis lacinia est. Proin dictum elementum velit. Fusce
                        euismod consequat ante.
                    </p>
                    <a href="#" class="read_more1">read more</a>
                    <p class="rightText">
                        <strong>Porta vel, scelerisque eget, malesuada at, neque. suada at, neque.</strong> Vivamus eget nibh. Etiam cursus
                        leo vel metus. Nulla facilisi. Aenean nec eros. Vestibulum iaculis lacinia est. Proin dictum elementum velit. Fusce
                        euismod consequat ante.
                    </p>
                    <a href="#" class="read_more1">read more</a>
                    <p class="rightText">
                        <strong>Porta vel, scelerisque eget, malesuada at, neque. suada at, neque.</strong> Vivamus eget nibh. Etiam cursus
                        leo vel metus. Nulla facilisi. Aenean nec eros. Vestibulum iaculis lacinia est. Proin dictum elementum velit. Fusce
                        euismod consequat ante.
                    </p>
                    <a href="#" class="read_more1">read more</a>
                    <img src="img/special.gif" alt="" />
                </div>
            </div>
            <!--right part end -->
            <br class="spacer" />
        </div>
        <!--body part end -->
    </div>
    <jsp:include page="footer/footer.jsp"/>
</div>
<!--1004 div end-->
</body>
</html>
