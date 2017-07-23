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
<!-- 提示框 -->
<div class="modal fade" id="system-alert" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    系统提示
                </h4>
            </div>
            <div class="modal-body" id="system-alert-content">
                在这里添加一些文本
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary" data-dismiss="modal">确定
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<!--1004 div end-->
<script src="js/main.js" type="text/javascript"></script>
</body>
</html>
