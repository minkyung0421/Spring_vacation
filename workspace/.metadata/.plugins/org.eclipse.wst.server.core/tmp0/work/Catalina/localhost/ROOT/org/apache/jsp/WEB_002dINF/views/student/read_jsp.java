/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.5
 * Generated at: 2018-08-03 01:45:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class read_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/수업/Vacation_Spring/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/StudentProject5/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1532481133239L));
    _jspx_dependants.put("jar:file:/C:/수업/Vacation_Spring/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/StudentProject5/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div align=\"center\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header.jsp", out, false);
      out.write("\r\n");
      out.write("<link rel = \"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/style.css\">\r\n");
      out.write("<h1>학생 정보</h1>\r\n");
      out.write("아이디 : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" <br>\r\n");
      out.write("\r\n");
      out.write("번호 : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.no }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" <br>\r\n");
      out.write("\r\n");
      out.write("이름 :");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" <br>\r\n");
      out.write("\r\n");
      out.write("비밀번호 :");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.password }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" <br>\r\n");
      out.write("\r\n");
      out.write("이메일 :");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br>\r\n");
      out.write("등록일 :");
      if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<br>\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<a href=\"modify?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">수 정</a>&nbsp;&nbsp; <a href=\"remove?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">삭 제</a>&nbsp;&nbsp; <a href=\"list\">학생 리스트</a>&nbsp;&nbsp;\r\n");
      out.write("<a href=\"imageList\">학생사진리스트</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
      out.write("#replyDiv {\r\n");
      out.write("\twidth: 500px;\r\n");
      out.write("\theight: 100px;\r\n");
      out.write("\tbackground-color: gray;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\t<div id='modDiv' style='display: none;'>\r\n");
      out.write("\t\t<div class='modal-title'></div>\t\t\r\n");
      out.write("\t\t<div id='modal-replyer'></div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<input type='text' id='replytext'>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<button type=\"button\" id=\"replyModBtn\">댓글수정</button>\r\n");
      out.write("\t\t\t<button type=\"button\" id=\"replyDelBtn\">댓글삭제</button>\r\n");
      out.write("\t\t\t<button type=\"button\" id='closeBtn'>닫기</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\tvar sid = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\t\tgetAllList();\r\n");
      out.write("\t\tvar selected = 0;\r\n");
      out.write("\t\tvar loginId = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${login.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\t\t//alert(sid)\r\n");
      out.write("\t\tfunction getAllList() {\r\n");
      out.write("\t\t\t$.getJSON(\"replies/all/\" + sid,\r\n");
      out.write("\t\t\t\t\tfunction(data) {\r\n");
      out.write("\t\t\t\t\t//console.log(data.length);\r\n");
      out.write("\t\t\t\t\t\tvar str = \"\";\r\n");
      out.write("\t\t\t\t\t\t$(data).each(function() {\r\n");
      out.write("\t\t\t\t\t\t\tstr += \"<div align='center' ><div id='replyDiv'><li data-no='\"+this.no+\"' class='replyLi'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ this.no + \"(작성자 : <span id='no-replyer\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ this.no +\t\"'>\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ this.replyer\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ \"</span>)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ \"<div id='no\" + this.no + \"'>\"\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ this.replyText\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ \"</div><button>댓글수정</button></li></div></div>\";\r\n");
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
      out.write("\t\t\t//var sid = $(\"#studentID\").val();\t\t\t\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : 'post',\r\n");
      out.write("\t\t\t\turl : 'replies',\r\n");
      out.write("\t\t\t\theaders : {\t\t\t\r\n");
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
      out.write("\t\t\tvar replyer = \"#no-replyer\" + no;\r\n");
      out.write("\t\t\tvar replytext = $(a).text();// #\"+reply.text();\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tselected = $(replyer).text();\r\n");
      out.write("\t\t\t$(\".modal-title\").html(no);\r\n");
      out.write("\t\t\t$(\"#modal-replyer\").html($(replyer).text());\r\n");
      out.write("\t\t\t$(\"#replytext\").val(replytext);\r\n");
      out.write("\t\t\t$(\"#modDiv\").show(\"slow\");\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#replyModBtn\").on(\"click\",function(){\t\t\t  \r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  if(loginId == selected){\r\n");
      out.write("\t\t\t\t  var no = $(\".modal-title\").html();\r\n");
      out.write("\t\t\t\t  var replytext = $(\"#replytext\").val();\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  $.ajax({\r\n");
      out.write("\t\t\t\t\t\ttype:'put',\r\n");
      out.write("\t\t\t\t\t\turl:'replies/'+no,\r\n");
      out.write("\t\t\t\t\t\theaders: { \r\n");
      out.write("\t\t\t\t\t\t      \"Content-Type\": \"application/json\",\r\n");
      out.write("\t\t\t\t\t\t      \"X-HTTP-Method-Override\": \"PUT\" },\r\n");
      out.write("\t\t\t\t\t\tdata:JSON.stringify({replyText:replytext}), \r\n");
      out.write("\t\t\t\t\t\tdataType:'text', \r\n");
      out.write("\t\t\t\t\t\tsuccess:function(result){\r\n");
      out.write("\t\t\t\t\t\t\t//console.log(\"result: \" + result);\r\n");
      out.write("\t\t\t\t\t\t\tif(result == 'SUCCESS'){\r\n");
      out.write("\t\t\t\t\t\t\t\talert(\"수정 되었습니다.\");\r\n");
      out.write("\t\t\t\t\t\t\t\t $(\"#modDiv\").hide(\"slow\");\r\n");
      out.write("\t\t\t\t\t\t\t\tgetAllList();\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t  });\r\n");
      out.write("\t\t\t  }else{\r\n");
      out.write("\t\t\t\t  alert(\"수정할 수 없습니다.\");\r\n");
      out.write("\t\t\t\t  $(\"#modDiv\").hide(\"slow\");\r\n");
      out.write("\t\t\t\t\tgetAllList();\r\n");
      out.write("\t\t\t  }\r\n");
      out.write("\t\t});\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#replyDelBtn\").on(\"click\", function() {\r\n");
      out.write("\t\t\tif(loginId == selected){\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar no = $(\".modal-title\").html();\r\n");
      out.write("\t\t\t\tvar replytext = $(\"#replytext\").val();\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\ttype : 'delete',\r\n");
      out.write("\t\t\t\t\turl : 'replies/' + no,\r\n");
      out.write("\t\t\t\t\theaders : {\r\n");
      out.write("\t\t\t\t\t\t\"Content-Type\" : \"application/json\",\r\n");
      out.write("\t\t\t\t\t\t\"X-HTTP-Method-Override\" : \"DELETE\"\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tdataType : 'text',\r\n");
      out.write("\t\t\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\t\t\t//console.log(\"result: \" + result);\r\n");
      out.write("\t\t\t\t\t\tif (result == 'SUCCESS') {\r\n");
      out.write("\t\t\t\t\t\t\talert(\"삭제 되었습니다.\");\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#modDiv\").hide(\"slow\");\r\n");
      out.write("\t\t\t\t\t\t\tgetAllList();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\talert(\"삭제할 수 없습니다.\");\r\n");
      out.write("\t\t\t\t  $(\"#modDiv\").hide(\"slow\");\r\n");
      out.write("\t\t\t\t\tgetAllList();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#closeBtn\").on(\"click\", function(){\r\n");
      out.write("\t\t\t$(\"#modDiv\").hide(\"slow\");\r\n");
      out.write("\t\t\tgetAllList();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t</script>");
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

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    boolean _jspx_th_fmt_005fformatDate_005f0_reused = false;
    try {
      _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatDate_005f0.setParent(null);
      // /WEB-INF/views/student/read.jsp(18,5) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setPattern("yyyy-MM-dd HH:mm");
      // /WEB-INF/views/student/read.jsp(18,5) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.regdate }", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
      if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      _jspx_th_fmt_005fformatDate_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatDate_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatDate_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/student/read.jsp(20,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.savedName != null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("사 진 : <img width = 300 src=\"display?fileName=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.savedName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\"><br>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${originalName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("<br>\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/views/student/read.jsp(62,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${login != null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          out.write('	');
          out.write("\r\n");
          out.write("\t<div align=\"center\">\r\n");
          out.write("\t<h2>[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${student.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("] 칭찬하기</h2>\t\r\n");
          out.write("\t<div>댓글 작성자: <input type='text' name='replyer' value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${login.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" readonly id='newReplyWriter'></div>\t\r\n");
          out.write("\t<div>댓글 내용: <input type='text' name='replyText' id='newReplyText'></div>\r\n");
          out.write("\t<div><button id=\"replyAddBtn\">댓글 등록</button></div>\r\n");
          out.write("\t<div align=\"left\"><ul id=\"replies\"></ul></div>\t\r\n");
          out.write("\t</div>\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }
}
