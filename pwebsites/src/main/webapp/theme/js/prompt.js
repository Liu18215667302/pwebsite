$(function () {

});

function PromptObj() {

    /**
     * 获取我的技能信息
     */
    this.getMySkillInfo = function () {
        var url = "/getMySkillInfo"
        $.ajax({
            url: url,
            type: "get",
            dataType: "json",
            success: function (data) {
                if (data.status) {
                    $("#my-skill-prompt").html(data.result.content);
                } else {
                    $("#system-alert-content").html("查询信息失败");
                    $("#system-alert").modal("show");
                }
            },error: function (error) {
                $("#system-alert-content").html("查询信息失败");
                $("#system-alert").modal("show");
            }
        });
    }

    /**
     * 获取我的成果信息
     */
    this.getMyAchievement = function () {
        var url= "/myMyAchievement";
        $.ajax({
            url: url,
            type: "get",
            dataType: "json",
            success: function (data) {
                if (data.status) {
                    $("#my-achievement-prompt").html(data.result.content);
                } else {
                    $("#system-alert-content").html("查询信息失败");
                    $("#system-alert").modal("show");
                }
            },error: function (error) {
                $("#system-alert-content").html("查询信息失败");
                $("#system-alert").modal("show");
            }
        });
    }

    /**
     * 获取我的评价信息
     */
    this.personalInfo = function () {
        var url = "/myPersonalPJ";
        $.ajax({
            url: url,
            type: "get",
            dataType: "json",
            success: function (data) {
                if (data.status) {
                    $("#my-personal-prompt").html(data.result.content);
                } else {
                    $("#system-alert-content").html("查询信息失败");
                    $("#system-alert").modal("show");
                }
            },error: function (error) {
                $("#system-alert-content").html("查询信息失败");
                $("#system-alert").modal("show");
            }
        });
    }
}