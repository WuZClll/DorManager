/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-06-18 08:05:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class student_002dadd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-3.1.1.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/layer/layer.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/validate.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form id=\"form1\">\r\n");
      out.write("    <table class=\"table\" style=\"width: 100%;text-align: center;\">\r\n");
      out.write("        <tbody>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("                <label for=\"name\">姓名</label>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"name\" name=\"name\" maxlength=\"10\" required>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("                <label for=\"sex\">性别</label>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("                <select class=\"form-control\" name=\"sex\" id=\"sex\">\r\n");
      out.write("                    <option value=\"男\" selected>男</option>\r\n");
      out.write("                    <option value=\"女\">女</option>\r\n");
      out.write("                </select>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>\r\n");
      out.write("                <label for=\"sno\">学号</label>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("                <input type=\"text\" name=\"sno\" class=\"form-control\" id=\"sno\" aria-describedby=\"textHelp\" maxlength=\"20\"\r\n");
      out.write("                       required>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("                <label for=\"stu_class\">班级</label>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("                <input type=\"text\" name=\"stu_class\" class=\"form-control\" id=\"stu_class\" maxlength=\"30\" required>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td><label for=\"phone\">联系方式</label></td>\r\n");
      out.write("            <td>\r\n");
      out.write("                <input type=\"text\" name=\"phone\" id=\"phone\" class=\"form-control\" minlength=\"11\" maxlength=\"11\"\r\n");
      out.write("                       pattern=\"^[0-9]{11}$\" required>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td><label for=\"place\">家庭住址</label></td>\r\n");
      out.write("            <td>\r\n");
      out.write("                <input type=\"text\" placeholder=\"请输入家庭详细地址\" name=\"place\" class=\"form-control\" id=\"place\"\r\n");
      out.write("                       maxlength=\"30\" required>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td><label for=\"dorm1\">宿舍号</label></td>\r\n");
      out.write("            <td>\r\n");
      out.write("                <select class=\"form-control\" name=\"dorm1\" id=\"dorm1\">\r\n");
      out.write("                    <option value=\"西一\" selected>西一</option>\r\n");
      out.write("                    <option value=\"西二\">西二</option>\r\n");
      out.write("                    <option value=\"西三\">西三</option>\r\n");
      out.write("                    <option value=\"东一\">东一</option>\r\n");
      out.write("                    <option value=\"东二\">东二</option>\r\n");
      out.write("                    <option value=\"东三\">东三</option>\r\n");
      out.write("                </select>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td><select class=\"form-control\" name=\"dorm2\" id=\"dorm2\">\r\n");
      out.write("                <option value=\"一单元\" selected>一单元</option>\r\n");
      out.write("                <option value=\"二单元\">二单元</option>\r\n");
      out.write("                <option value=\"三单元\">三单元</option>\r\n");
      out.write("                <option value=\"四单元\">四单元</option>\r\n");
      out.write("                <option value=\"五单元\">五单元</option>\r\n");
      out.write("            </select></td>\r\n");
      out.write("            <td>\r\n");
      out.write("                <input type=\"text\" name=\"dorm3\" placeholder=\"请直接输入宿舍号\" minlength=\"4\" maxlength=\"4\"\r\n");
      out.write("                       class=\"form-control\" id=\"dorm3\" required>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <td><label for=\"phone\">育人导师</label></td>\r\n");
      out.write("            <td>\r\n");
      out.write("                <input type=\"text\" name=\"teacher\" class=\"form-control\" id=\"teacher\" required>\r\n");
      out.write("            </td>\r\n");
      out.write("\r\n");
      out.write("            <td><label for=\"status\">状态</label></td>\r\n");
      out.write("            <td>\r\n");
      out.write("                <select class=\"form-control\" name=\"status\" id=\"status\">\r\n");
      out.write("                    <option value=\"0\" selected>禁用</option>\r\n");
      out.write("                    <option value=\"1\">激活</option>\r\n");
      out.write("                </select>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td colspan=\"4\">\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <button class=\"btn btn-primary\" class=\"btn btn-primary\" onclick=\"toSubmit()\">确认添加</button>\r\n");
      out.write("                <a href=\"javascript:window.history.back(-1)\" target=\"_self\" class=\"btn btn-default\" id=\"back\">返回列表</a>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        </tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("</form>\r\n");
      out.write("<script>\r\n");
      out.write("    $(function () {\r\n");
      out.write("        //ajax校验学号已被注册\r\n");
      out.write("        $(\"#sno\").change(function () {\r\n");
      out.write("            //取sno的值\r\n");
      out.write("            var sno = $(this).val();\r\n");
      out.write("            //ajax异步请求\r\n");
      out.write("            $.get(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/student/isExist\", {\"sno\": sno}, function (date) {\r\n");
      out.write("                //$(\".error\").html(msg);\r\n");
      out.write("                if (date) {\r\n");
      out.write("                    layer.msg('学号已被注册，请重新输入！');\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    //TODO\r\n");
      out.write("    /*    function toValidate() {\r\n");
      out.write("            var val = new validate({\r\n");
      out.write("                /!*rules里面是检验规则，\r\n");
      out.write("                *key为需要检验的input的id,\r\n");
      out.write("                *value为此input对应的检验规则\r\n");
      out.write("                *!/\r\n");
      out.write("                rules: {\r\n");
      out.write("                    name: \"notEmpty\",\r\n");
      out.write("                    sex: \"notEmpty\",\r\n");
      out.write("                    sno: \"notEmpty\",\r\n");
      out.write("                    stu_class: \"notEmpty\",\r\n");
      out.write("                    phone: \"mobile\",\r\n");
      out.write("                    place: \"notEmpty\",\r\n");
      out.write("                    dorm_id: \"notEmpty\",\r\n");
      out.write("                    teacher: \"notEmpty\",\r\n");
      out.write("                },\r\n");
      out.write("                /!*submitFun里面为检验成功后要执行的方法*!/\r\n");
      out.write("                submitFun: function () {\r\n");
      out.write("                    toSubmit();\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("        }*/\r\n");
      out.write("    /*    function validate(config) {\r\n");
      out.write("            this.rules = config.rules;\r\n");
      out.write("            this.submitFun = config.submitFun;\r\n");
      out.write("            this.flag = 0;\r\n");
      out.write("\r\n");
      out.write("            this.init = function () {\r\n");
      out.write("                var self = this;\r\n");
      out.write("                var form = document.querySelector('form');\r\n");
      out.write("                form.addEventListener('submit', function (e) {\r\n");
      out.write("                    e.preventDefault();\r\n");
      out.write("                    self.toAction();\r\n");
      out.write("                    if (self.flag === 0) {\r\n");
      out.write("                        self.submitFun();\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            this.toAction = function () {\r\n");
      out.write("                var self = this;\r\n");
      out.write("                var inputs = document.querySelectorAll('input');\r\n");
      out.write("                inputs.forEach(function (input) {\r\n");
      out.write("                    var id = input.id;\r\n");
      out.write("                    var value = input.value;\r\n");
      out.write("                    var rule = self.rules[id];\r\n");
      out.write("                    if (self.toVal(rule, value)) {\r\n");
      out.write("                        self.toRemoveError(input);\r\n");
      out.write("                    } else {\r\n");
      out.write("                        self.toShowError(input);\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            this.toVal = function (rule, value) {\r\n");
      out.write("                var regex = validateConstant[rule];\r\n");
      out.write("                return regex.test(value);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            this.toRemoveError = function (input) {\r\n");
      out.write("                var errorLabel = input.nextElementSibling;\r\n");
      out.write("                if (errorLabel && errorLabel.classList.contains('error-message')) {\r\n");
      out.write("                    input.classList.remove('error');\r\n");
      out.write("                    errorLabel.remove();\r\n");
      out.write("                }\r\n");
      out.write("                input.addEventListener('input', function () {\r\n");
      out.write("                    if (input.classList.contains('error')) {\r\n");
      out.write("                        self.toAction();\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            };\r\n");
      out.write("\r\n");
      out.write("            this.toShowError = function (input) {\r\n");
      out.write("                var errorLabel = input.nextElementSibling;\r\n");
      out.write("                if (!errorLabel || !errorLabel.classList.contains('error-message')) {\r\n");
      out.write("                    errorLabel = document.createElement('span');\r\n");
      out.write("                    errorLabel.classList.add('error-message');\r\n");
      out.write("                    input.classList.add('error');\r\n");
      out.write("                    input.parentNode.insertBefore(errorLabel, input.nextSibling);\r\n");
      out.write("                }\r\n");
      out.write("                var rule = this.rules[input.id];\r\n");
      out.write("                var errorMessage = errorMsg[rule];\r\n");
      out.write("                errorLabel.textContent = errorMessage;\r\n");
      out.write("                input.addEventListener('input', function () {\r\n");
      out.write("                    if (input.classList.contains('error')) {\r\n");
      out.write("                        self.toAction();\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("                this.flag++;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            this.init();\r\n");
      out.write("\r\n");
      out.write("            var validateConstant = {\r\n");
      out.write("                notEmpty: /.+/,\r\n");
      out.write("                mobile: /^1\\d{10}$/\r\n");
      out.write("            };\r\n");
      out.write("\r\n");
      out.write("            var errorMsg = {\r\n");
      out.write("                notEmpty: '此字段不能为空',\r\n");
      out.write("                mobile: '请输入有效的手机号码'\r\n");
      out.write("            };\r\n");
      out.write("        }\r\n");
      out.write("        {*/\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    // $(\"#add-student\").click(function () {\r\n");
      out.write("    function toSubmit() {\r\n");
      out.write("        console.log()\r\n");
      out.write("        var name = $(\"#name\").val().trim();\r\n");
      out.write("        var sex = $(\"#sex\").val().trim();\r\n");
      out.write("        var sno = $(\"#sno\").val().trim();\r\n");
      out.write("        var stu_class = $(\"#stu_class\").val().trim();\r\n");
      out.write("        var phone = $(\"#phone\").val().trim();\r\n");
      out.write("        var place = $(\"#place\").val().trim();\r\n");
      out.write("        var dorm3 = $(\"#dorm3\").val().trim();\r\n");
      out.write("        var teacher = $(\"#teacher\").val().trim();\r\n");
      out.write("        var status = $(\"#status\").val().trim();\r\n");
      out.write("\r\n");
      out.write("        if (name == 0 || sex == 0 || sno == 0 || stu_class == 0 || phone == 0 || place == 0 || dorm3 == 0 || teacher == 0) {\r\n");
      out.write("            layer.msg('字段不能为空');\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        if (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.adminInfo.power < 1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(") {\r\n");
      out.write("            layer.msg('对不起，您权限不足');\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        var d1 = $(\"#dorm1\").val();\r\n");
      out.write("        var d2 = $(\"#dorm2\").val();\r\n");
      out.write("        var dorm_id = d1 + \"\" + d2 + \"\" + dorm3;\r\n");
      out.write("        //alert(dorm_id);\r\n");
      out.write("        var form = document.getElementById(\"form1\");\r\n");
      out.write("        if (form.checkValidity()) {\r\n");
      out.write("            console.log(\"n\")\r\n");
      out.write("            console.log(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.adminInfo.power}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(")\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/student/add\",//要请求的服务器url\r\n");
      out.write("                //这是一个对象，表示请求的参数，两个参数：method=ajax&val=xxx，服务器可以通过request.getParameter()来获取\r\n");
      out.write("                //data:{method:\"ajaxTest\",val:value},\r\n");
      out.write("                data: {\r\n");
      out.write("                    name: name,\r\n");
      out.write("                    sex: sex,\r\n");
      out.write("                    sno: sno,\r\n");
      out.write("                    stu_class: stu_class,\r\n");
      out.write("                    phone: phone,\r\n");
      out.write("                    place: place,\r\n");
      out.write("                    dorm_id: dorm_id,\r\n");
      out.write("                    teacher: teacher,\r\n");
      out.write("                    status: status\r\n");
      out.write("                },\r\n");
      out.write("                type: \"POST\", //请求方式为POST\r\n");
      out.write("                dataType: \"json\",\r\n");
      out.write("                success: function (result) {  //这个方法会在服务器执行成功时被调用 ，参数data就是服务器返回的值(现在是json类型)\r\n");
      out.write("                    console.log(\"success\");\r\n");
      out.write("                    if (result) {\r\n");
      out.write("                        console.log(\"a\")\r\n");
      out.write("                        layer.msg('添加成功！');\r\n");
      out.write("                        if (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.adminInfo.power == 1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(") {\r\n");
      out.write("                            console.log(1)\r\n");
      out.write("                            setTimeout(function () {\r\n");
      out.write("                                ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("                            }, 2000);\r\n");
      out.write("                            return false;\r\n");
      out.write("                        }\r\n");
      out.write("                        if (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.adminInfo.power == 2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(") {\r\n");
      out.write("                            console.log(2)\r\n");
      out.write("                            setTimeout(function () {\r\n");
      out.write("                                window.location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/dorm/findStudent?name=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.adminInfo.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("                                $(\"#back\").click();\r\n");
      out.write("                            }, 2000);\r\n");
      out.write("                            console.log(\"haha\")\r\n");
      out.write("                            return flase;\r\n");
      out.write("                        }\r\n");
      out.write("                        setTimeout(function () {\r\n");
      out.write("                            window.location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/student/findAll';\r\n");
      out.write("                        }, 2000);\r\n");
      out.write("                    } else {\r\n");
      out.write("                        console.log(22)\r\n");
      out.write("                        console.log(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.adminInfo.power}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(")\r\n");
      out.write("                        layer.msg('添加失败，请联系管理员');\r\n");
      out.write("                        if (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.adminInfo.power == 1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(") {\r\n");
      out.write("                            console.log(1)\r\n");
      out.write("                            setTimeout(function () {\r\n");
      out.write("                                window.location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/dorm/byDorm_leader?uid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.adminInfo.uid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("                            }, 2000);\r\n");
      out.write("                            return false;\r\n");
      out.write("                        }\r\n");
      out.write("                        if (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.adminInfo.power == 2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(") {\r\n");
      out.write("                            console.log(2)\r\n");
      out.write("                            setTimeout(function () {\r\n");
      out.write("                                window.location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/dorm/findStudent?name=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.adminInfo.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("                            }, 2000);\r\n");
      out.write("                            return flase;\r\n");
      out.write("                        }\r\n");
      out.write("                        console.log(\"zz\")\r\n");
      out.write("                        setTimeout(function () {\r\n");
      out.write("                            window.location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/student/findAll';\r\n");
      out.write("                        }, 2000);\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                error: function(xhr, status, error) {\r\n");
      out.write("                    console.log(xhr); // 输出请求的详细信息\r\n");
      out.write("                    console.log(status); // 输出请求的状态\r\n");
      out.write("                    console.log(error); // 输出错误信息\r\n");
      out.write("                    alert(\"请求失败\");\r\n");
      out.write("                    window.location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/student/findAll';\r\n");
      out.write("\r\n");
      out.write("                },\r\n");
      out.write("                end : function (){\r\n");
      out.write("                    window.location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/student/findAll';\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("        // )\r\n");
      out.write("        ;\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
