/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-11-28 17:09:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.newView;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.List;
import java.util.ArrayList;

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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>310 Project</title>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"lib/jquery.js\"></script>\r\n");
      out.write("\t<link href=\"newView/cartPo.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<!-- Optional theme -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\r\n");
      out.write(" \r\n");
      out.write(" <!-- font awesome -->\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"newView/font-awesome.min.css\">\r\n");
      out.write(" <!-- owl Css -->\r\n");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"newView/owl.carousel.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- animate css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"newView/animate.css\">\r\n");
      out.write(" <!-- Style Css -->\r\n");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"newView/style.css\">\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("\t<nav class=\"navbar navbar-default navbar-fixed-top navbar-inverse\">\r\n");
      out.write("\t  <div class=\"container\">\r\n");
      out.write("\t      <form class=\"form-container\" method=\"get\" action=\"LoginServlet\">\r\n");
      out.write("\t      <!-- <button class=\"btn btn-lg btn-warning\" name=\"crate\"><a href=\"\\cart.jsp\"><span class=\"glyphicon glyphicon-shopping-cart\"></span></a></button> -->\r\n");
      out.write("\t      <button name=\"cart\" type=\"submit\" value=\"cart\" class=\"btn btn-success btn-lg\"><span class=\"glyphicon glyphicon-shopping-cart\"></span>  Go to cart</button>   \r\n");
      out.write("\t      </form>>\r\n");
      out.write("\t  </div><!-- /.container-fluid -->\r\n");
      out.write("\t</nav>\r\n");
      out.write("</div> <!-- navbar ends -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"container \">\r\n");
      out.write("\t<div id=\"carousel-example-generic\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("\t  <!-- Indicators -->\r\n");
      out.write("\t  <ol class=\"carousel-indicators\">\r\n");
      out.write("\t    <li data-target=\"#carousel-example-generic\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("\t    <li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"></li>\r\n");
      out.write("\t    <li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\r\n");
      out.write("\t  </ol>\r\n");
      out.write("\r\n");
      out.write("\t  <!-- Wrapper for slides -->\r\n");
      out.write("\t  <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("\t    <div class=\"item active\">\r\n");
      out.write("\t       <a><img src=\"newView/feluda.jpg\" alt=\"\" width=\"1200px\" height=\"500px\" ></a>\r\n");
      out.write("\t       <div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t<h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title0}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h3>\r\n");
      out.write("    \t\t\t<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${price0}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("  \t\t\t</div> <!-- carousel ends -->\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    <div class=\"item\">\r\n");
      out.write("\t      <a><img src=\"newView/inferno.jpg\" alt=\"placeholder_img2\"></a>\r\n");
      out.write("\t       <div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t<h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h3>\r\n");
      out.write("    \t\t\t<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${price1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("  \t\t\t</div> <!-- carousel ends -->\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    <div class=\"item\">\r\n");
      out.write("\t      <a><img src=\"newView/gitanjali.jpg\" alt=\"placeholder_img3\"></a>\r\n");
      out.write("\t      \t<div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t<h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h3>\r\n");
      out.write("    \t\t\t<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${price2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("  \t\t\t</div> <!-- carousel ends -->\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\r\n");
      out.write("\t  <!-- Controls -->\r\n");
      out.write("\t  <a class=\"left carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("\t    <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t    <span class=\"sr-only\">Previous</span>\r\n");
      out.write("\t  </a>\r\n");
      out.write("\t  <a class=\"right carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("\t    <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t    <span class=\"sr-only\">Next</span>\r\n");
      out.write("\t  </a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</div> <!-- carousel ends -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"table-responsive\">\r\n");
      out.write("  <table id=\"table\" class=\"table\" >\r\n");
      out.write("\t<!-- On cells (`td` or `th`) -->\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t  <th width=\"300\" class=\"active\">Title</th>\r\n");
      out.write("\t  <th width=\"300\" class=\"success\">Author</th>\r\n");
      out.write("\t  <th width=\"100\" class=\"warning\">Price</th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t<tr id=\"demo\">\r\n");
      out.write("\t  <td class=\"active\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title0}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${author0}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"warning\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${price0}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td width=\"100\" class=\"warning\">\r\n");
      out.write("\t  <button id=\"addBtn\" onClick=\"myFunction()\" name=\"buy\" value=\"submit\" type=\"button\" class=\"btn btn-primary btn-block\">Buy</button>\r\n");
      out.write("\t  </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t  <td class=\"active\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${author1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"warning\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${price1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td width=\"100\" class=\"warning\">\r\n");
      out.write("\t  \t<div>\r\n");
      out.write("\t  \t<button id=\"addBtn\" onClick=\"myFunction()\" name=\"buy\" value=\"submit\" type=\"button\" class=\"btn btn-primary btn-block\">Buy</button>\r\n");
      out.write("\t  \t</div>\r\n");
      out.write("\t  </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t  <td class=\"active\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title2 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${author2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"warning\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${price2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td width=\"100\" class=\"warning\">\r\n");
      out.write("\t  \t<div>\r\n");
      out.write("\t  \t<button id=\"addBtn\" onClick=\"myFunction()\" name=\"buy\" value=\"submit\" type=\"button\" class=\"btn btn-primary btn-block\">Buy</button>\r\n");
      out.write("\t  \t</div>\r\n");
      out.write("\t  </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t  <td class=\"active\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title3}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${author3}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"warning\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${price3}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td width=\"100\" class=\"warning\">\r\n");
      out.write("\t  \t<div>\r\n");
      out.write("\t  \t<button id=\"addBtn\" onClick=\"myFunction()\" name=\"buy\" value=\"submit\" type=\"button\" class=\"btn btn-primary btn-block\">Buy</button>\r\n");
      out.write("\t  \t</div>\r\n");
      out.write("\t  </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t  <td class=\"active\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title4}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${author4}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"warning\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${price4}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td width=\"100\" class=\"warning\">\r\n");
      out.write("\t  \t<div>\r\n");
      out.write("\t  \t<button id=\"addBtn\" onClick=\"myFunction()\" value=\"submit\" type=\"button\" class=\"btn btn-primary btn-block\" >Buy</button>\r\n");
      out.write("\t  \t</div>\r\n");
      out.write("\t  </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t  <td class=\"active\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title5}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${author5}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"warning\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${price5}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td width=\"100\" class=\"warning\">\r\n");
      out.write("\t  \t<div>\r\n");
      out.write("\t  \t<button id=\"addBtn\" onClick=\"myFunction()\" name=\"buy\" value=\"submit\" type=\"button\" class=\"btn btn-primary btn-block\">Buy</button>\r\n");
      out.write("\t  \t</div>\r\n");
      out.write("\t  </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t  <td class=\"active\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title6}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${author6}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"warning\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${price6}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td width=\"100\" class=\"warning\">\r\n");
      out.write("\t  \t<div>\r\n");
      out.write("\t  \t<button id=\"addBtn\" onClick=\"myFunction()\" name=\"buy\" value=\"submit\" type=\"button\" class=\"btn btn-primary btn-block\">Buy</button>\r\n");
      out.write("\t  \t</div>\r\n");
      out.write("\t  </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t  <td class=\"active\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title7}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${author7}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"warning\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${price7}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td width=\"100\" class=\"warning\">\r\n");
      out.write("\t  \t<div>\r\n");
      out.write("\t  \t<button id=\"addBtn\" onClick=\"myFunction()\" name=\"buy\" value=\"submit\" type=\"button\" class=\"btn btn-primary btn-block\">Buy</button>\r\n");
      out.write("\t  \t</div>\r\n");
      out.write("\t  </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t  <td class=\"active\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title8}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${author8}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"warning\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${price8}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td width=\"100\" class=\"warning\">\r\n");
      out.write("\t  \t<div>\r\n");
      out.write("\t  \t<button id=\"addBtn\" onClick=\"myFunction()\" name=\"buy\" value=\"submit\" type=\"button\" class=\"btn btn-primary btn-block\">Buy</button>\r\n");
      out.write("\t  \t</div>\r\n");
      out.write("\t  </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t  <td class=\"active\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title9}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${author9}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"warning\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${price9}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td width=\"100\" class=\"warning\">\r\n");
      out.write("\t  \t<div>\r\n");
      out.write("\t  \t<button id=\"addBtn\" onClick=\"myFunction()\" name=\"buy\" value=\"submit\" type=\"button\" class=\"btn btn-primary btn-block\">Buy</button>\r\n");
      out.write("\t  \t</div>\r\n");
      out.write("\t  </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t  <td class=\"active\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title10}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${author10}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"warning\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${price10}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td width=\"100\" class=\"warning\">\r\n");
      out.write("\t  \t<div>\r\n");
      out.write("\t  \t<button id=\"addBtn\" onClick=\"myFunction()\" name=\"buy\" value=\"submit\" type=\"button\" class=\"btn btn-primary btn-block\">Buy</button>\r\n");
      out.write("\t  \t</div>\r\n");
      out.write("\t  </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t  <td class=\"active\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title11}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${author11}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"warning\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${price11}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td width=\"100\" class=\"warning\">\r\n");
      out.write("\t  \t<div>\r\n");
      out.write("\t  \t<button id=\"addBtn\" onClick=\"myFunction()\" name=\"buy\" value=\"submit\" type=\"button\" class=\"btn btn-primary btn-block\">Buy</button>\r\n");
      out.write("\t  \t</div>\r\n");
      out.write("\t  </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t  <td class=\"active\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title12}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${author12}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"warning\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${price12}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td width=\"100\" class=\"warning\">\r\n");
      out.write("\t  \t<div>\r\n");
      out.write("\t  \t<button id=\"addBtn\" onClick=\"myFunction()\" name=\"buy\" value=\"submit\" type=\"button\" class=\"btn btn-primary btn-block\">Buy</button>\r\n");
      out.write("\t  \t</div>\r\n");
      out.write("\t  </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t  <td class=\"active\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title13}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${author13}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"warning\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${price13}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td width=\"100\" class=\"warning\">\r\n");
      out.write("\t  \t<div>\r\n");
      out.write("\t  \t<button id=\"addBtn\" onClick=\"myFunction()\" name=\"buy\" value=\"submit\" type=\"button\" class=\"btn btn-primary btn-block\">Buy</button>\r\n");
      out.write("\t  \t</div>\r\n");
      out.write("\t  </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t  <td class=\"active\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title14}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${author14}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"warning\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${price14}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td width=\"100\" class=\"warning\">\r\n");
      out.write("\t  \t<div>\r\n");
      out.write("\t  \t<button id=\"addBtn\" onClick=\"myFunction()\" name=\"buy\" value=\"submit\" type=\"button\" class=\"btn btn-primary btn-block\">Buy</button>\r\n");
      out.write("\t  \t</div>\r\n");
      out.write("\t  </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t  <td class=\"active\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title15}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${author15}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td class=\"warning\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${price15}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("\t  <td width=\"100\" class=\"warning\">\r\n");
      out.write("\t  \t<div>\r\n");
      out.write("\t  \t<form>\r\n");
      out.write("\t  \t<button id=\"addBtn\" onClick=\"myFunction()\" name=\"buy\" value=\"submit\" type=\"button\" class=\"btn btn-primary btn-block\">Buy</button>\r\n");
      out.write("\t  \t</form>\r\n");
      out.write("\t  \t</div>\r\n");
      out.write("\t  </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("  </table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("function myFunction(){\r\n");
      out.write("\tdocument.getElementById(\"addBtn\").innerHTML=\"added\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("var table = document.getElementById('table');\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("for(var i = 1; i < table.rows.length; i++)\r\n");
      out.write("{\r\n");
      out.write("    table.rows[i].onclick = function()\r\n");
      out.write("    {    \r\n");
      out.write("     \tvar var1= this.cells[0].innerHTML;\r\n");
      out.write("     \tvar var2 = this.cells[1].innerHTML;\r\n");
      out.write("     \tvar var3 = this.cells[2].innerHTML;\r\n");
      out.write("     \tvar var4 = this.cells[3].innerHTML;\r\n");
      out.write("     \t$.ajax({\r\n");
      out.write("     \t        type:\"GET\",//or POST\r\n");
      out.write("     \t        url:\"/LoginServlet\",\r\n");
      out.write("     \t        data:{data1:var1,data2:var2,data3:var3,data4:var4},\r\n");
      out.write("     \t        //can send multipledata like {data1:var1,data2:var2,data3:var3\r\n");
      out.write("     \t        //can use dataType:'text/html' or 'json' if response type expected \r\n");
      out.write("     \t        success:function(responsedata){\r\n");
      out.write("     \t               // process on data\r\n");
      out.write("     \t               alert(\"book has been added\");\r\n");
      out.write("\r\n");
      out.write("     \t        }\r\n");
      out.write("     \t     })\r\n");
      out.write("    };\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- owl js -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- js -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/mobile.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
