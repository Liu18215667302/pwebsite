$(function () {
    var topObject = new TopObject();

    topObject.pageChange();

    topObject.getNav();
});

function TopObject() {

    /**
     * 页面跳转到内容页
     */
    this.pageChange = function () {
        $("#top-nav li").on("click", "a", function () {
            console.info($(this).attr("data"));
            $("#left .innerLeft").load("/getContent");
        })
    }
    /**
     * 获取菜单信息
     */
    this.getNav = function () {
        var url = "/getMediaType";
        $.ajax({
            url: url,
            type: "get",
            dataType: "json",
            success: function (data) {
                if (data.status) {
                    var liVar = $("#top-nav").find("li:eq(1)");
                    $("#top-nav").find("li:gt(0)").remove();
                    for (var i = 0; i < data.list.length - 1; i++) {
                        var listr = liVar.clone();
                        listr.attr("data",data.list[i].id);
                        listr.find("span").text(data.list[i].title);
                        $("#top-nav").append(listr);
                    }
                } else {
                    $("#system-alert-content").html("查询菜单信息失败");
                    $("#system-alert").modal("show");
                }
            }, error: function (error) {
                $("#system-alert-content").html("查询菜单信息失败");
                $("#system-alert").modal("show");
            }
        });
    }
}
