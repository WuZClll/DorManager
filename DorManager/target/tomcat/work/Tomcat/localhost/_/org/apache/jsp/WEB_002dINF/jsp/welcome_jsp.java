/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-06-12 06:05:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>欢迎页面</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/lib/layui/css/layui.css\" />\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-3.1.1.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<fieldset class=\"layui-elem-field layui-field-title\" style=\"margin-top: 30px;\">\r\n");
      out.write("    <legend>系统时间</legend>\r\n");
      out.write("</fieldset>\r\n");
      out.write("\r\n");
      out.write("<blockquote class=\"layui-elem-quote\" id=\"mytime\"></blockquote>\r\n");
      out.write("<fieldset class=\"layui-elem-field layui-field-title\" style=\"margin-top: 20px;\">\r\n");
      out.write("    <legend>控制面板</legend>\r\n");
      out.write("</fieldset>\r\n");
      out.write("\r\n");
      out.write("<div style=\"padding: 20px; background-color: #F2F2F2;\">\r\n");
      out.write("    <div class=\"layui-row layui-col-space15\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"layui-col-md6\">\r\n");
      out.write("            <div class=\"layui-card\">\r\n");
      out.write("                <div class=\"layui-card-header\">CPU利用率</div>\r\n");
      out.write("                <div class=\"layui-card-body\">\r\n");
      out.write("                    CPU<br/>利用率\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"layui-col-md6\">\r\n");
      out.write("            <div class=\"layui-card\">\r\n");
      out.write("                <div class=\"layui-card-header\">系统出入流量</div>\r\n");
      out.write("                <div class=\"layui-card-body\">\r\n");
      out.write("                    系统出入<br>流量\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"layui-col-md6\">\r\n");
      out.write("            <div class=\"layui-card\">\r\n");
      out.write("                <div class=\"layui-card-header\">模块</div>\r\n");
      out.write("                <div class=\"layui-card-body\">\r\n");
      out.write("                    模块<br>待更新\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"layui-col-md6\">\r\n");
      out.write("            <div class=\"layui-card\">\r\n");
      out.write("                <div class=\"layui-card-header\">模块</div>\r\n");
      out.write("                <div class=\"layui-card-body\">\r\n");
      out.write("                    模块<br>待更新\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("    function showTime(){\r\n");
      out.write("        var nowtime =new Date();\r\n");
      out.write("        var year=nowtime.getFullYear();\r\n");
      out.write("        var month=nowtime.getMonth()+1;\r\n");
      out.write("        var date=nowtime.getDate();\r\n");
      out.write("        var h = nowtime.getHours();\r\n");
      out.write("        var m = nowtime.getMinutes();\r\n");
      out.write("        var s = nowtime.getSeconds();\r\n");
      out.write("        document.getElementById(\"mytime\").innerText=year+\"年\"+month+\"月\"+date+\"日\"+\" \"+h+\"时\"+m+\"分\"+s+\"秒\";\r\n");
      out.write("    }\r\n");
      out.write("    setInterval(\"showTime()\",1000);\r\n");
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
