<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/layer.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.1.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/layer/layer.js"></script>
</head>
<body background="${pageContext.request.contextPath}/images/01.jpg">
<br><br>
<div class="row form-horizontal">
    <div class="form-group">
        <label class="col-sm-2 control-label form-label">姓名:</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name="name" id="name" placeholder="输入姓名" maxlength="10">
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label form-label">学号:</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name="sno" id="sno" min="5" max="20" placeholder="输入学号">
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label form-label">手机:</label>
        <div class="col-sm-8">
            <input type="text" class="form-control" name="phone" id="phone" placeholder="输入联系方式">
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label form-label">楼宇:</label>
        <div class="col-sm-8">
            <select class="form-control" id="place" name="place">
                <option value="西一" selected="selected">西一</option>
                <option value="西二">西二</option>
                <option value="西三">西三</option>
                <option value="东一">东一</option>
                <option value="东二">东二</option>
                <option value="东三">东三</option>

            </select>
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label form-label">备注:</label>
        <div class="col-sm-8">
            <input class="form-control" value="公事" id="visit_result" name="visit_result" placeholder="访问原因"/>
        </div>
    </div>
</div>
<div class="row">
    <div class="form-group btn-group col-md-offset-5">
        <button class="btn btn-primary" onclick="toValidate()">提交登记</button>
    </div>
</div>

</body>
<script src="${pageContext.request.contextPath}/js/jquery-3.1.1.js"></script>
<script src="${pageContext.request.contextPath}/js/validate.js"></script>
<script>
    $(function () {
        //ajax校验用户名是否存在
        $("#username").change(function () {
            //取username的值
            var u_name = $(this).val();
            //ajax异步请求
            $.get("${pageContext.request.contextPath}/checkUserName", {"u_name": u_name}, function (msg) {
                //$(".error").html(msg);
                if (msg == "账号可用") {
                    layer.msg('用户名已存在');
                } else {
                    layer.msg('用户名可用');
                }
            });
        });
    });

    function toValidate() {
        var val = new validate({
            /*rules里面是检验规则，
            *key为需要检验的input的id,
            *value为此input对应的检验规则
            */
            rules: {
                name: "notEmpty",
                sid: "notEmpty",
                place: "notEmpty",
                phone: "mobile",
                visit_result: "notEmpty"
            },
            /*submitFun里面为检验成功后要执行的方法*/
            submitFun: function () {
                toSubmit();
            }
        })
    }

    function toSubmit() {
        //增加管理员，异步提交管理员表单

        var name = $("#name").val().trim();
        var sno = $("#sno").val().trim();
        var phone = $("#phone").val().trim();
        var place = $("#place").val().trim();
        var visit_result = $("#visit_result").val().trim();
        if (name == null || sno == null || phone == null || place == null || visit_result == null
            || name.length == 0 || sno.length == 0 || phone.length == 0 || place.length == 0 || visit_result.length == 0) {
            layer.msg('不能为空，请输入信息...');
            return false;
        }
        $.ajax({
            url: "${pageContext.request.contextPath}/visitor/addLogin",//要请求的服务器url
            //这是一个对象，表示请求的参数，两个参数：method=ajax&val=xxx，服务器可以通过request.getParameter()来获取
            //data:{method:"ajaxTest",val:value},
            data: {
                name: name,
                sno: sno,
                phone: phone,
                place: place,
                visit_result: visit_result
            },
            type: "POST", //请求方式为POST
            dataType: "json",   //服务器返回的数据是什么类型
            success: function (result) {  //这个方法会在服务器执行成功时被调用 ，参数result就是服务器返回的值(现在是json类型)
                layer.msg('添加成功');
                console.log(JSON.stringify(result));
                var id = result.id;
                location.href = "${pageContext.request.contextPath}/visitor/addSuccess?id=" + id;
            }
        });

    }
</script>
</body>
</html>
