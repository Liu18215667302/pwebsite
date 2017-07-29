$(function () {

    var leftObj = new LeftObj();

    leftObj.pageInfo();

})

function LeftObj() {

    this.showPrompt = function () {
        $("#personal-body-info").load("/mainPrompt",function() {
            $("#myModal").modal('show');
        });
    }
    /**
     * 获取页面信息
     */
    this.pageInfo = function () {
        var url = "/getFirstPageInfo";
        $.ajax({
            url: url,
            type: "get",
            dataType: "json",
            success: function (data) {
                if (data.skillinfo.status) {
                    $("#skillinfo").text(data.skillinfo.result.content);
                }
                if (data.result.status) {
                    $("#result").text(data.result.result.content);
                }
                if(data.myskill.status) {
                    $("#myskill").text(data.result.result.content);
                }
                if (data.personalPJ.status){
                    $("#personal-pj").text(data.result.result.content);
                }
            },error: function (error) {
                $("#system-alert-content").html("查询菜单信息失败");
                $("#system-alert").modal("show");
        }
        });
    }
}