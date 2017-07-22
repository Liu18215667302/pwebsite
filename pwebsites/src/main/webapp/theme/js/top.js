$(function () {
    var topObject = new TopObject();

    topObject.pageChange();
});

function TopObject() {

    /**
     * 页面跳转到内容页
     */
    this.pageChange = function () {
        $("#top-nav li").on("click","a",function () {
            console.info($(this).attr("data"));
            $("#left .innerLeft").load("/getContent");
        })
    }
}
