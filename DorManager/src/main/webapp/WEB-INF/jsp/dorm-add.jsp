<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.1.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/layer/layer.js"></script>
</head>
<body>
<br />
<form>
    <table class="table" style="width: 100%;text-align: center;">
        <tbody>
        <tr>
            <td><label for="dorm1">宿舍号</label></td>
            <td>
                <select class="form-control" name="dorm1" id="dorm1">
                    <option value="西一" selected>西一</option>
                    <option value="西二">西二</option>
                    <option value="西三">西三</option>
                    <option value="东一">东一</option>
                    <option value="东二">东二</option>
                    <option value="东三">东三</option>
                </select>
            </td>
            <td><select class="form-control" name="dorm2" id="dorm2">
                <option value="一单元" selected>一单元</option>
                <option value="二单元">二单元</option>
                <option value="三单元">三单元</option>
                <option value="四单元">四单元</option>
                <option value="五单元">五单元</option>
            </select></td>
            <td>
                <input type="text" name="dorm3" placeholder="请直接输入宿舍号" minlength="4" maxlength="4" class="form-control" id="dorm3" list="aaa"  required>
                <datalist id="aaa">
                    <option value="1111" />
                    <option value="1112" />
                    <option value="1113" />
                    <option value="1121" />
                    <option value="1122" />
                    <option value="1123" /><option value="1111" />
                    <option value="1112" />
                    <option value="1113" />
                    <option value="1121" />
                    <option value="1122" />
                    <option value="1123" />
                </datalist>
            </td>
        </tr>
        <tr>
            </td>
            <!-- <input type="text" name="dorm3" placeholder="请直接输入宿舍号" class="form-control" id="dorm3" required> -->
            </td>
        </tr>
        <tr>
            <td><label for="dorm_intro">宿舍简介</label></td>
            <td colspan="3">
                <textarea class="form-control" id="dorm_intro" name="dorm_intro" cols="2" maxlength="80" placeholder="请输入宿舍简介" required="required"></textarea>
            </td>
        </tr>
        <tr>
            <td>
                <label for="dorm_rps">宿舍奖惩</label>
            </td>
            <td colspan="3">
                <input type="text" name="dorm_rps" class="form-control" id="dorm_rps" value="无" placeholder="" list="rpsList" required>
                <datalist id="rpsList">
                    <option value="年度最佳宿舍" />
                    <option value="年度活跃宿舍" />
                    <option value="年度文明宿舍" />
                    <option value="最佳学习宿舍" />
                    <option value="卫生最佳宿舍" />
                    <option value="最佳骨干宿舍" />
                </datalist>
            </td>
        </tr>
        <tr>
            <td>
                <label for="dorm_leader">宿舍长</label>
            </td>
            <td colspan="3">
                <input type="text" name="dorm_leader" class="form-control" id="dorm_leader" required>
            </td>
        </tr>
        <tr>
            <td><label for="teacher">育人导师</label></td>
            <td colspan="3">
                <select class="form-control" name="teacher" id="teacher">
                    <option value="小李" selected>小李</option>
                    <option value="小王">小王</option>
                    <option value="小赵">小赵</option>
                    <option value="小飞">小飞</option>
                    <option value="小张">小张</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="4">
                <button type="button" id="add-dorm" class="btn btn-primary">确认添加</button>
                <a href="javascript:window.history.back(-1)" target="_self" class="btn btn-default">返回列表</a>
            </td>
        </tr>
        </tbody>
    </table>
</form>
<script>
    $("#dorm3").change(function () {
        var d1 = $("#dorm1").val();
        var d2 = $("#dorm2").val();
        var dorm3 = $("#dorm3").val().trim();
        var dorm_id = d1+""+d2+""+dorm3;
        $.ajax({
            url: "${pageContext.request.contextPath}/dorm/isExist",//要请求的服务器url
            //这是一个对象，表示请求的参数，两个参数：method=ajax&val=xxx，服务器可以通过request.getParameter()来获取
            //data:{method:"ajaxTest",val:value},
            data: {
                dorm_id:dorm_id
            },
            type: "POST", //请求方式为POST
            dataType: "json",
            success:function(result){  //这个方法会在服务器执行成功时被调用 ，参数data就是服务器返回的值(现在是json类型)
                //alert(result);
                if(result){
                    layer.msg('该宿舍已存在，请重新注册！');
                }
            }
        });
    });
    $("#add-dorm").click(function () {
        var dorm3 = $("#dorm3").val().trim();
        var dorm_intro = $("#dorm_intro").val().trim();
        var dorm_rps = $("#dorm_rps").val().trim();
        var dorm_leader = $("#dorm_leader").val().trim();
        var teacher = $("#teacher").val().trim();

        if (dorm3.length == 0 || dorm_intro.length == 0 || dorm_rps.length == 0 || dorm_leader == 0 || teacher.length == 0) {
            layer.msg('字段不能为空');
            return false;
        }
        if (${sessionScope.adminInfo.power < 2}) {
            layer.msg('权限不足');
            return false;
        }
        var d1 = $("#dorm1").val();
        var d2 = $("#dorm2").val();
        var dorm_id = d1+""+d2+""+dorm3;
        //alert(dorm_id);
        $.ajax({
            url: "${pageContext.request.contextPath}/dorm/add",//要请求的服务器url
            //这是一个对象，表示请求的参数，两个参数：method=ajax&val=xxx，服务器可以通过request.getParameter()来获取
            //data:{method:"ajaxTest",val:value},
            data: {
                dorm_id:dorm_id,
                dorm_intro:dorm_intro,
                dorm_rps: dorm_rps,
                dorm_leader:dorm_leader,
                teacher: teacher,
            },
            type: "POST", //请求方式为POST
            dataType: "json",
            success:function(result){  //这个方法会在服务器执行成功时被调用 ，参数data就是服务器返回的值(现在是json类型)
                //alert(result);
                if(result){
                    layer.msg('添加成功');
                    if (${sessionScope.adminInfo.power == 2}) {
                        setTimeout(function () {window.location.href='${pageContext.request.contextPath}/dorm/byTeacher?uid=${sessionScope.adminInfo.uid}';},2000);
                        return flase;
                    }
                    setTimeout(function () {window.location.href='${pageContext.request.contextPath}/dorm/findAll';},2000);
                }else {
                    layer.msg('添加失败，请重新添加');
                    if (${sessionScope.adminInfo.power == 2}) {
                        setTimeout(function () {window.location.href='${pageContext.request.contextPath}/dorm/byTeacher?uid=${sessionScope.adminInfo.uid}';},2000);
                        return flase;
                    }
                    setTimeout(function () {window.location.href='${pageContext.request.contextPath}/dorm/findAll';},2000);
                }
            }
        });
    });
</script>
</body>
</html>
