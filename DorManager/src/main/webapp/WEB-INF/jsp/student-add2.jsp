<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.1.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/layer/layer.js"></script>
    <script src="${pageContext.request.contextPath}/js/validate.js"></script>
</head>
<body>
<form id="form1">
    <table class="table" style="width: 100%;text-align: center;">
        <tbody>
        <tr>
            <td>
                <label for="name">姓名</label>
            </td>
            <td>
                <input type="text" class="form-control" id="name" name="name" maxlength="10" required>
            </td>
            <td>
                <label for="sex">性别</label>
            </td>
            <td>
                <select class="form-control" name="sex" id="sex">
                    <option value="男" selected>男</option>
                    <option value="女">女</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>
                <label for="sno">学号</label>
            </td>
            <td>
                <input type="text" name="sno" class="form-control" id="sno" aria-describedby="textHelp" maxlength="20"
                       required>
            </td>
            <td>
                <label for="stu_class">班级</label>
            </td>
            <td>
                <input type="text" name="stu_class" class="form-control" id="stu_class" maxlength="30" required>
            </td>
        </tr>
        <tr>
            <td><label for="phone">联系方式</label></td>
            <td>
                <input type="text" name="phone" id="phone" class="form-control" minlength="11" maxlength="11"
                       pattern="^[0-9]{11}$" required>
            </td>
            <td><label for="place">家庭住址</label></td>
            <td>
                <input type="text" placeholder="请输入家庭详细地址" name="place" class="form-control" id="place"
                       maxlength="30" required>
            </td>
        </tr>
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
                <input type="text" name="dorm3" placeholder="请直接输入宿舍号" minlength="4" maxlength="4"
                       class="form-control" id="dorm3" required>
            </td>
        </tr>
        <tr>
            <%--<td><label for="teacher">育人导师</label></td>
            <td>
                <select class="form-control" name="teacher" id="teacher">
                    <option value="小李" selected>小李</option>
                    <option value="小王">小王</option>
                    <option value="小赵">小赵</option>
                    <option value="小飞">小飞</option>
                    <option value="小张">小张</option>
                </select>
            </td>--%>
            <td><label for="phone">育人导师</label></td>
            <td>
                <input type="text" name="teacher" class="form-control" id="teacher" required>
            </td>

            <td><label for="status">状态</label></td>
            <td>
                <select class="form-control" name="status" id="status">
                    <option value="0" selected>禁用</option>
                    <option value="1">激活</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="4">
                <%--                <button type="button" id="add-student" class="btn btn-primary" onclick="toValidate()">确认添加</button>--%>
                <button class="btn btn-primary" class="btn btn-primary" onclick="toSubmit()">确认添加</button>
                <a href="javascript:window.history.back(-1)" target="_self" class="btn btn-default" id="back">返回列表</a>
            </td>
        </tr>
        </tbody>
    </table>
</form>
<script>
    $(function () {
        //ajax校验学号已被注册
        $("#sno").change(function () {
            //取sno的值
            var sno = $(this).val();
            //ajax异步请求
            $.get("${pageContext.request.contextPath}/student/isExist", {"sno": sno}, function (date) {
                //$(".error").html(msg);
                if (date) {
                    layer.msg('学号已被注册，请重新输入！');
                    return false;
                }
            });
        });
    });

    //TODO
    /*    function toValidate() {
            var val = new validate({
                /!*rules里面是检验规则，
                *key为需要检验的input的id,
                *value为此input对应的检验规则
                *!/
                rules: {
                    name: "notEmpty",
                    sex: "notEmpty",
                    sno: "notEmpty",
                    stu_class: "notEmpty",
                    phone: "mobile",
                    place: "notEmpty",
                    dorm_id: "notEmpty",
                    teacher: "notEmpty",
                },
                /!*submitFun里面为检验成功后要执行的方法*!/
                submitFun: function () {
                    toSubmit();
                }
            })
        }*/
    /*    function validate(config) {
            this.rules = config.rules;
            this.submitFun = config.submitFun;
            this.flag = 0;

            this.init = function () {
                var self = this;
                var form = document.querySelector('form');
                form.addEventListener('submit', function (e) {
                    e.preventDefault();
                    self.toAction();
                    if (self.flag === 0) {
                        self.submitFun();
                    }
                });
            }

            this.toAction = function () {
                var self = this;
                var inputs = document.querySelectorAll('input');
                inputs.forEach(function (input) {
                    var id = input.id;
                    var value = input.value;
                    var rule = self.rules[id];
                    if (self.toVal(rule, value)) {
                        self.toRemoveError(input);
                    } else {
                        self.toShowError(input);
                    }
                });
            }

            this.toVal = function (rule, value) {
                var regex = validateConstant[rule];
                return regex.test(value);
            }

            this.toRemoveError = function (input) {
                var errorLabel = input.nextElementSibling;
                if (errorLabel && errorLabel.classList.contains('error-message')) {
                    input.classList.remove('error');
                    errorLabel.remove();
                }
                input.addEventListener('input', function () {
                    if (input.classList.contains('error')) {
                        self.toAction();
                    }
                });
            };

            this.toShowError = function (input) {
                var errorLabel = input.nextElementSibling;
                if (!errorLabel || !errorLabel.classList.contains('error-message')) {
                    errorLabel = document.createElement('span');
                    errorLabel.classList.add('error-message');
                    input.classList.add('error');
                    input.parentNode.insertBefore(errorLabel, input.nextSibling);
                }
                var rule = this.rules[input.id];
                var errorMessage = errorMsg[rule];
                errorLabel.textContent = errorMessage;
                input.addEventListener('input', function () {
                    if (input.classList.contains('error')) {
                        self.toAction();
                    }
                });
                this.flag++;
            }

            this.init();

            var validateConstant = {
                notEmpty: /.+/,
                mobile: /^1\d{10}$/
            };

            var errorMsg = {
                notEmpty: '此字段不能为空',
                mobile: '请输入有效的手机号码'
            };
        }
        {*/


    // $("#add-student").click(function () {
    function toSubmit() {
        console.log()
        var name = $("#name").val().trim();
        var sex = $("#sex").val().trim();
        var sno = $("#sno").val().trim();
        var stu_class = $("#stu_class").val().trim();
        var phone = $("#phone").val().trim();
        var place = $("#place").val().trim();
        var dorm3 = $("#dorm3").val().trim();
        var teacher = $("#teacher").val().trim();
        var status = $("#status").val().trim();

        if (name == 0 || sex == 0 || sno == 0 || stu_class == 0 || phone == 0 || place == 0 || dorm3 == 0 || teacher == 0) {
            layer.msg('字段不能为空');
            return false;
        }


        if (${sessionScope.adminInfo.power < 1}) {
            layer.msg('对不起，您权限不足');
            return false;
        }

        var d1 = $("#dorm1").val();
        var d2 = $("#dorm2").val();
        var dorm_id = d1 + "" + d2 + "" + dorm3;
        //alert(dorm_id);
        var form = document.getElementById("form1");
        if (form.checkValidity()) {
            console.log("n")
            console.log(${sessionScope.adminInfo.power})
            $.ajax({
                url: "${pageContext.request.contextPath}/student/add",//要请求的服务器url
                //这是一个对象，表示请求的参数，两个参数：method=ajax&val=xxx，服务器可以通过request.getParameter()来获取
                //data:{method:"ajaxTest",val:value},
                data: {
                    name: name,
                    sex: sex,
                    sno: sno,
                    stu_class: stu_class,
                    phone: phone,
                    place: place,
                    dorm_id: dorm_id,
                    teacher: teacher,
                    status: status
                },
                type: "POST", //请求方式为POST
                dataType: "json",
                success: function (result) {  //这个方法会在服务器执行成功时被调用 ，参数data就是服务器返回的值(现在是json类型)
                    console.log("success");
                    if (result) {
                        console.log("a")
                        layer.msg('添加成功！');
                        if (${sessionScope.adminInfo.power == 1}) {
                            console.log(1)
                            setTimeout(function () {
                                <%--window.location.href = '${pageContext.request.contextPath}/dorm/byDorm_leader?uid=${sessionScope.adminInfo.uid}';--%>
<%--                                ${"#back"}.onclick();--%>
                            }, 2000);
                            return false;
                        }
                        if (${sessionScope.adminInfo.power == 2}) {
                            console.log(2)
                            setTimeout(function () {
                                window.location.href = '${pageContext.request.contextPath}/dorm/findStudent?name=${sessionScope.adminInfo.name}';
                                $("#back").click();
                            }, 2000);
                            console.log("haha")
                            return flase;
                        }
                        setTimeout(function () {
                            window.location.href = '${pageContext.request.contextPath}/student/findAll';
                        }, 2000);
                    } else {
                        console.log(22)
                        console.log(${sessionScope.adminInfo.power})
                        layer.msg('添加失败，请联系管理员');
                        if (${sessionScope.adminInfo.power == 1}) {
                            console.log(1)
                            setTimeout(function () {
                                window.location.href = '${pageContext.request.contextPath}/dorm/byDorm_leader?uid=${sessionScope.adminInfo.uid}';
                            }, 2000);
                            return false;
                        }
                        if (${sessionScope.adminInfo.power == 2}) {
                            console.log(2)
                            setTimeout(function () {
                                window.location.href = '${pageContext.request.contextPath}/dorm/findStudent?name=${sessionScope.adminInfo.name}';
                            }, 2000);
                            return flase;
                        }
                        console.log("zz")
                        setTimeout(function () {
                            window.location.href = '${pageContext.request.contextPath}/student/findAll';
                        }, 2000);
                    }
                },
                error: function(xhr, status, error) {
                    console.log(xhr); // 输出请求的详细信息
                    console.log(status); // 输出请求的状态
                    console.log(error); // 输出错误信息
                    alert("请求失败");
                    window.location.href = '${pageContext.request.contextPath}/student/findAll';

                },
                end : function (){
                    window.location.href = '${pageContext.request.contextPath}/student/findAll';
                }

            });
        }
    }
        // )
        ;
</script>
</body>
</html>
