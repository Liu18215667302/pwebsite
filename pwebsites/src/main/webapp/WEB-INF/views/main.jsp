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

                </div>
            </div>
            <!--left part end -->
            <!--right part start -->
            <div id="right">
            </div>
            <!--right part end -->
            <br class="spacer" />
        </div>
        <!--body part end -->
    </div>
    <jsp:include page="footer/footer.jsp"/>
</div>
<jsp:include page="prompt/prompt.jsp"/>
<!--1004 div end-->
<script src="js/main.js" type="text/javascript"></script>
</body>
</html>
