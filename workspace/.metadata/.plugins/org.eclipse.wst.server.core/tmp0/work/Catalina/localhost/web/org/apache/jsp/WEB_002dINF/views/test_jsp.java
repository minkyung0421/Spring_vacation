/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.5
 * Generated at: 2018-08-02 06:25:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<!-- jQuery 2.1.4 -->\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-2.2.4.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("#modDiv {\r\n");
      out.write("\twidth: 300px;\r\n");
      out.write("\theight: 100px;\r\n");
      out.write("\tbackground-color: gray;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 50%;\r\n");
      out.write("\tleft: 50%;\r\n");
      out.write("\tmargin-top: -50px;\r\n");
      out.write("\tmargin-left: -150px;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("\tz-index: 1000;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id='modDiv' style=\"display: none;\">\r\n");
      out.write("\t\t<div class='modal-title'></div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<input type='text' id='replytext'>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<button type=\"button\" id=\"replyModBtn\">댓글수정</button>\r\n");
      out.write("\t\t\t<button type=\"button\" id=\"replyDelBtn\">댓글삭제</button>\r\n");
      out.write("\t\t\t<button type=\"button\" id='closeBtn'>닫기</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t<h2>Ajax Test Page</h2>\r\n");
      out.write("\t<div>학생번호: <input type=\"text\" name=\"sid\" id=\"studentID\"></div>\t\r\n");
      out.write("\t<div>댓글 작성자: <input type='text' name='replyer' id='newReplyWriter'></div>\t\r\n");
      out.write("\t<div>댓글 내용: <input type='text' name='replyText' id='newReplyText'></div>\r\n");
      out.write("\t<div><button id=\"replyAddBtn\">댓글 등록</button></div>\r\n");
      out.write("\t<div align=\"left\"><ul id=\"replies\"></ul></div>\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t//\tvar sid = $(\"#sid\").val();\r\n");
      out.write("\t\t//alert(sid)\r\n");
      out.write("\t\tfunction getAllList() {\r\n");
      out.write("\t\t\t$.getJSON(\"replies/all/\" + $(\"#studentID\").val(),\r\n");
      out.write("\t\t\t\t\tfunction(data) {\r\n");
      out.write("\t\t\t\t\t//console.log(data.length);\r\n");
      out.write("\t\t\t\t\t\tvar str = \"\";\r\n");
      out.write("\t\t\t\t\t\t$(data).each(function() {\r\n");
      out.write("\t\t\t\t\t\t\tstr += \"<li data-no='\"+this.no+\"' class='replyLi'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ this.no\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ \":\"+\"<div id='no\" + this.no + \"'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ this.replyText\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ \"</div><button>댓글수정</button></li>\";\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t$(\"#replies\").html(str);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#replyAddBtn\").on(\"click\", function() {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar replyer = $(\"#newReplyWriter\").val();\r\n");
      out.write("\t\t\tvar replyText = $(\"#newReplyText\").val();\r\n");
      out.write("\t\t\tvar sid = $(\"#studentID\").val();\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : 'post',\r\n");
      out.write("\t\t\t\turl : 'replies',\r\n");
      out.write("\t\t\t\theaders : {\r\n");
      out.write("\t\t\t\t\t\"Content-Type\" : \"application/json\",\r\n");
      out.write("\t\t\t\t\t\"X-HTTP-Method-Override\" : \"POST\"\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tdataType : 'text',\r\n");
      out.write("\t\t\t\tdata : JSON.stringify({\r\n");
      out.write("\t\t\t\t\tsid : sid,\r\n");
      out.write("\t\t\t\t\treplyer : replyer,\r\n");
      out.write("\t\t\t\t\treplyText : replyText\r\n");
      out.write("\t\t\t\t}),\r\n");
      out.write("\t\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\t\tif (result == 'SUCCESS') {\r\n");
      out.write("\t\t\t\t\t\talert(\"등록 되었습니다.\");\r\n");
      out.write("\t\t\t\t\t\tgetAllList();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#replies\").on(\"click\", \".replyLi button\", function() {\r\n");
      out.write("\t\t\tvar reply = $(this).parent();\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar no = reply.attr(\"data-no\");\r\n");
      out.write("\t\t\tvar a = \".replyLi #no\" + no;\r\n");
      out.write("\t\t\tvar replytext = $(a).text();// #\"+reply.text();\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(\".modal-title\").html(no);\r\n");
      out.write("\t\t\t$(\"#replytext\").val(replytext);\r\n");
      out.write("\t\t\t$(\"#modDiv\").show(\"slow\");\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#replyModBtn\").on(\"click\",function(){\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  var no = $(\".modal-title\").html();\r\n");
      out.write("\t\t\t  var replytext = $(\"#replytext\").val();\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  $.ajax({\r\n");
      out.write("\t\t\t\t\ttype:'put',\r\n");
      out.write("\t\t\t\t\turl:'replies/'+no,\r\n");
      out.write("\t\t\t\t\theaders: { \r\n");
      out.write("\t\t\t\t\t      \"Content-Type\": \"application/json\",\r\n");
      out.write("\t\t\t\t\t      \"X-HTTP-Method-Override\": \"PUT\" },\r\n");
      out.write("\t\t\t\t\tdata:JSON.stringify({replyText:replytext}), \r\n");
      out.write("\t\t\t\t\tdataType:'text', \r\n");
      out.write("\t\t\t\t\tsuccess:function(result){\r\n");
      out.write("\t\t\t\t\t\t//console.log(\"result: \" + result);\r\n");
      out.write("\t\t\t\t\t\tif(result == 'SUCCESS'){\r\n");
      out.write("\t\t\t\t\t\t\talert(\"수정 되었습니다.\");\r\n");
      out.write("\t\t\t\t\t\t\t $(\"#modDiv\").hide(\"slow\");\r\n");
      out.write("\t\t\t\t\t\t\tgetAllList();\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t  });\r\n");
      out.write("\t\t});\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#replyDelBtn\").on(\"click\", function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar no = $(\".modal-title\").html();\r\n");
      out.write("\t\t\tvar replytext = $(\"#replytext\").val();\r\n");
      out.write("\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : 'delete',\r\n");
      out.write("\t\t\t\turl : 'replies/' + no,\r\n");
      out.write("\t\t\t\theaders : {\r\n");
      out.write("\t\t\t\t\t\"Content-Type\" : \"application/json\",\r\n");
      out.write("\t\t\t\t\t\"X-HTTP-Method-Override\" : \"DELETE\"\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tdataType : 'text',\r\n");
      out.write("\t\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\t\t//console.log(\"result: \" + result);\r\n");
      out.write("\t\t\t\t\tif (result == 'SUCCESS') {\r\n");
      out.write("\t\t\t\t\t\talert(\"삭제 되었습니다.\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#modDiv\").hide(\"slow\");\r\n");
      out.write("\t\t\t\t\t\tgetAllList();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#closeBtn\").on(\"click\", function(){\r\n");
      out.write("\t\t\t$(\"#modDiv\").hide(\"slow\");\r\n");
      out.write("\t\t\tgetAllList();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
