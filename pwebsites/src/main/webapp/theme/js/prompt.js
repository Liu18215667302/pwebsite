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

    /**
     * 获取项目信息
     */
    this.getProjectInfo = function () {
        var url = "/getProjectInfo";
        $.ajax({
            url: url,
            type: "get",
            dataType:"json",
            success: function (data) {
                if (data.status) {
                    var id = "#userProjectInfoName";
                    setTitleListOtherInfo(id,data);
                    setProjectInfoDetail(data);
                } else {
                    $("#system-alert-content").html("查询信息失败");
                    $("#system-alert").modal("show");
                }
            },error: function (data) {
                $("#system-alert-content").html("查询信息失败");
                $("#system-alert").modal("show");
            }
        });

    }
    /**
     * 设置项目信息
     * @param data
     */
    var setProjectInfoDetail = function(data) {
        var myTabContent = $("#myTabContent");
        var divStr = myTabContent.find(".userProjectInfoDetail:first");
        myTabContent.find(".userProjectInfoDetail:gt(0)").remove();
        for (var i = 0; i < data.result.length; i++) {
            var divClone = divStr.clone().show();
            divClone.attr("id", data.result[i].id);
            divClone.find(".title").html(data.result[i].name);
            divClone.find(".time").html(data.result[i].date);
            divClone.find(".type").html(data.result[i].type);
            divClone.find(".duty").html(data.result[i].myDuty);
            divClone.find(".content").html(data.result[i].myWork);
            divClone.find(".projectInfo").html(data.result[i].projectInfo);
            myTabContent.append(divClone);
        }
    }
    /**
     * 获取我的工作信息
     */
    this.getWorkInfo = function () {
        var url = "/getWorkInfo";
        $.ajax({
            url: url,
            type: "get",
            dataType:"json",
            success: function (data) {
                if (data.status) {
                    var id = "#userWorkInfoName";
                    setTitleListOtherInfo(id,data);
                    setWorkInfoDetail(data);
                } else {
                    $("#system-alert-content").html("查询信息失败");
                    $("#system-alert").modal("show");
                }
            },error: function (data) {
                $("#system-alert-content").html("查询信息失败");
                $("#system-alert").modal("show");
            }
        });
    }
    /**
     * 设置我的工作信息
     * @param data
     */
    var setWorkInfoDetail = function(data) {
        var myTabContent = $("#myTabContent");
        var divStr = myTabContent.find(".userWorkInfoDetail:first");
        myTabContent.find(".userWorkInfoDetail:gt(0)").remove();
        for (var i = 0; i < data.result.length; i++) {
            var divClone = divStr.clone().show();
            divClone.attr("id", data.result[i].id);
            divClone.find(".title").html(data.result[i].name);
            divClone.find(".time").html(data.result[i].date);
            divClone.find(".duty").html(data.result[i].myDuty);
            divClone.find(".content").html(data.result[i].content);
            myTabContent.append(divClone);
        }
    }
    /**
     * 获取我的教育信息
     */
    this.getEductionInfo = function () {
        var url = "/getEductionInfo";
        $.ajax({
            url: url,
            type: "get",
            dataType:"json",
            success: function (data) {
                if (data.status) {
                   var id = "#userEducationInfoName";
                    setTitleListEducationInfo(id,data);
                    setEducationInfoDetail(data);
                } else {
                    $("#system-alert-content").html("查询信息失败");
                    $("#system-alert").modal("show");
                }
            },error: function (data) {
                $("#system-alert-content").html("查询信息失败");
                $("#system-alert").modal("show");
            }
        });
    }
    /**
     * 设置我的教育信息
     * @param data
     */
    var setEducationInfoDetail = function(data) {
        var myTabContent = $("#myTabContent");
        var divStr = myTabContent.find(".userEducationInfoDetail:first");
        myTabContent.find(".userEducationInfoDetail:gt(0)").remove();
        for (var i = 0; i < data.result.length; i++) {
            var divClone = divStr.clone().show();
            divClone.attr("id", data.result[i].id);
            divClone.find(".title").html(data.result[i].graducatedSchool);
            divClone.find(".time").html(data.result[i].date);
            divClone.find(".duty").html(data.result[i].duty);
            divClone.find(".education1").html(data.result[i].education);
            divClone.find(".other").html(data.result[i].remark);
            myTabContent.append(divClone);
        }
    }
    /**
     * 设置教育列表信息
     * @param id
     */
    var setTitleListEducationInfo = function (id,data) {
        var ulstr = $(id);
        var listr = ulstr.find("li:first");
        ulstr.find("li:gt(0)").remove();
        for (var i = 0; i < data.result.length; i++) {
            var liClone = listr.clone().show();
            liClone.find("a").attr("href","#" + data.result[i].id);
            liClone.find("a").html(data.result[i].graducatedSchool);
            ulstr.append(liClone);
        }
    }
    /**
     * 设置其他列表信息
     * @param id
     */
    var setTitleListOtherInfo = function (id,data) {
        var ulstr = $(id);
        var listr = ulstr.find("li:first");
        ulstr.find("li:gt(0)").remove();
        for (var i = 0; i < data.result.length; i++) {
            var liClone = listr.clone().show();
            liClone.find("a").attr("href","#" + data.result[i].id);
            liClone.find("a").html(data.result[i].name);
            ulstr.append(liClone);
        }
    }
}