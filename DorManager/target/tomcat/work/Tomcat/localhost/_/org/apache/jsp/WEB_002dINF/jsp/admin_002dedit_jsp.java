/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-06-12 09:43:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_002dedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/layer.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-3.1.1.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/layer/layer.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/01.jpg\">\r\n");
      out.write("<br><br>\r\n");
      out.write("<input type=\"hidden\" id=\"id\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ad.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("<div class=\"row form-horizontal\">\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label class=\"col-sm-2 control-label form-label\">用户名:</label>\r\n");
      out.write("        <div class=\"col-sm-8\">\r\n");
      out.write("            <input type=\"text\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ad.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"form-control\" name=\"username\" id=\"username\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label class=\"col-sm-2 control-label form-label\">姓名:</label>\r\n");
      out.write("        <div class=\"col-sm-8\">\r\n");
      out.write("            <input type=\"text\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ad.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"form-control\" name=\"name\" id=\"name\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label class=\"col-sm-2 control-label form-label\">学/工号:</label>\r\n");
      out.write("        <div class=\"col-sm-8\">\r\n");
      out.write("            <input type=\"text\" class=\"form-control\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ad.uid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"uid\" id=\"uid\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label class=\"col-sm-2 control-label form-label\">手机号:</label>\r\n");
      out.write("        <div class=\"col-sm-8\">\r\n");
      out.write("            <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ad.phone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"form-control\" name=\"phone\" id=\"phone\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label class=\"col-sm-2 control-label form-label\">描述:</label>\r\n");
      out.write("        <div class=\"col-sm-8\">\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ad.description}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"description\" id=\"description\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("    <div class=\"form-group btn-group col-md-offset-5\">\r\n");
      out.write("        <button class=\"btn btn-warning\" onclick=\"toValidate()\">确认修改</button>\r\n");
      out.write("        <a type=\"button\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/findAllAdmin\" class=\"btn btn-primary\">返回列表</a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-3.1.1.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/validate.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    function toValidate(){\r\n");
      out.write("        var val = new validate({\r\n");
      out.write("            /*rules里面是检验规则，\r\n");
      out.write("            *key为需要检验的input的id,\r\n");
      out.write("            *value为此input对应的检验规则\r\n");
      out.write("            */\r\n");
      out.write("            rules:{\r\n");
      out.write("                name:\"notEmpty\",\r\n");
      out.write("                uid:\"notEmpty\",\r\n");
      out.write("                description:\"notEmpty\",\r\n");
      out.write("                phone:\"mobile\",\r\n");
      out.write("            },\r\n");
      out.write("            /*submitFun里面为检验成功后要执行的方法*/\r\n");
      out.write("            submitFun:function(){\r\n");
      out.write("                toSubmit();\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("    function toSubmit(){\r\n");
      out.write("        //增加管理员，异步提交管理员表单\r\n");
      out.write("        var id = $(\"#id\").val().trim();\r\n");
      out.write("        var username = $(\"#username\").val().trim();\r\n");
      out.write("        var name = $(\"#name\").val().trim();\r\n");
      out.write("        var uid = $(\"#uid\").val().trim();\r\n");
      out.write("        var phone = $(\"#phone\").val().trim();\r\n");
      out.write("        var description = $(\"#description\").val().trim();\r\n");
      out.write("        layer.confirm('确定要修改吗',function (index) {\r\n");
      out.write("            if (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.adminInfo.power < 3}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(") {//非超级管理员不能修改管理员信息\r\n");
      out.write("                layer.msg('对不起，您权限不足');\r\n");
      out.write("                layer.close(index);\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/editAdmin\",//要请求的服务器url\r\n");
      out.write("            //这是一个对象，表示请求的参数，两个参数：method=ajax&val=xxx，服务器可以通过request.getParameter()来获取\r\n");
      out.write("            //data:{method:\"ajaxTest\",val:value},\r\n");
      out.write("            data: {\r\n");
      out.write("                id:id,\r\n");
      out.write("                username:username,\r\n");
      out.write("                name:name,\r\n");
      out.write("                uid:uid,\r\n");
      out.write("                phone: phone,\r\n");
      out.write("                description: description\r\n");
      out.write("            },\r\n");
      out.write("            type: \"POST\", //请求方式为POST\r\n");
      out.write("            dataType: \"json\",   //服务器返回的数据是什么类型\r\n");
      out.write("            success: function(result){  //这个方法会在服务器执行成功时被调用 ，参数result就是服务器返回的值(现在是json类型)\r\n");
      out.write("                if(result){\r\n");
      out.write("                    layer.msg('修改成功');\r\n");
      out.write("                    setTimeout(function () {window.location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/findAllAdmin';},2000);\r\n");
      out.write("                }else {\r\n");
      out.write("                    layer.msg('修改失败，请联系管理员');\r\n");
      out.write("                    setTimeout(function () {window.location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/findAllAdmin';},2000);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
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