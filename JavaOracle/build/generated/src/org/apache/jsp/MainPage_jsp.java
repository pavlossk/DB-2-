package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class MainPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

      Connection conn = null;
      Statement statement = null;
      String serverURL = "195.251.166.123";
      String serverPort = "1521";
      String serverSID = "orcl";
      String username = "c##13055";
      String password = "654321";

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <div id=\"templatemo_header\">\n");
      out.write("    \t<div id=\"templatemo_logo\" style =\"font-size:20px;\" >\n");
      out.write("        \t<img style=\"\" src=\"images/top_logo[1].gif\" alt=\"Logo\" />\n");
      out.write("            <div id=\"templatemo_sitetitle\">Database II Project</div>\n");
      out.write("      </div>\n");
      out.write("      <body style=\"background-color: #707070;\">\n");
      out.write("          \n");
      out.write("      <div align=\"center\">\n");
      out.write("          \n");
      out.write("    <form name=\"Simple1\" action=\"Simple1.jsp\">\n");
      out.write("        <h1 style=\"color:white;\"> ΑΠΛΑ ΕΡΩΤΗΜΑΤΑ</h1>\n");
      out.write("        <br>\n");
      out.write("    </form> \n");
      out.write("          \n");
      out.write("         <form style =\"font-size:20px;\" name=\"Simple1\" action=\"Simple1.jsp\">\n");
      out.write("          <h1 style=\"color:white; font-style: italic;\"> Ερώτημα 1ο:</h1>\n");
      out.write("          <td width:10px> Area 5% like Greece:  <td>\n");
      out.write("          <br>\n");
      out.write("        \n");
      out.write("          <input type=\"submit\" value=\"Continue\" name=\"Continue\" />\n");
      out.write("        </form>  \n");
      out.write("          \n");
      out.write("         <form style =\"font-size:20px;\" name=\"Simple3\" action=\"Simple3.jsp\">\n");
      out.write("          <h1 style=\"color:white; font-style: italic;\"> Ερώτημα 3ο:</h1>\n");
      out.write("          <td width:8px> Type a Country Name:  <td>\n");
      out.write("          <br>\n");
      out.write("          <input type=\"text\" name=\"country3\" value=\"\" size=\"20\" />\n");
      out.write("          <br>\n");
      out.write("          <input type=\"reset\" value=\"Clear\" name=\"Clear\" />\n");
      out.write("          <input type=\"submit\" value=\"Continue\" name=\"Continue\" />\n");
      out.write("        </form>  \n");
      out.write("          \n");
      out.write("         <form style =\"font-size:20px;\" name=\"Simple5\" action=\"Simple5.jsp\">\n");
      out.write("          <h1 style=\"color:white; font-style: italic;\">  Ερώτημα 5ο:</h1>\n");
      out.write("          <td width:8px> Ionic Islands in Map:  <td>\n");
      out.write("          <br>\n");
      out.write("          <input type=\"submit\" value=\"Continue\" name=\"Continue\" />\n");
      out.write("        </form>  \n");
      out.write("          \n");
      out.write("        <form style =\"font-size:20px;\" name=\"Simple7\" action=\"Simple7.jsp\">\n");
      out.write("          <h1 style=\"color:white; font-style: italic;\"> Ερώτημα 7ο:</h1>\n");
      out.write("          <td width:8px> Type an Integer:  <td>\n");
      out.write("          <br>\n");
      out.write("          <input type=\"text\" name=\"number7\" value=\"\" size=\"20\" />\n");
      out.write("          <br>\n");
      out.write("          <input type=\"reset\" value=\"Clear\" name=\"Clear\" />\n");
      out.write("          <input type=\"submit\" value=\"Continue\" name=\"Continue\" />\n");
      out.write("        </form>  \n");
      out.write("          \n");
      out.write("        <form style =\"font-size:20px;\" name=\"Simple9\" action=\"Simple9.jsp\">\n");
      out.write("          <h1 style=\"color:white; font-style: italic;\"> Ερώτημα 9ο:</h1>\n");
      out.write("          <td width:8px> Capitals-Countries same name:  <td>\n");
      out.write("          <br>\n");
      out.write("          <input type=\"submit\" value=\"Continue\" name=\"Continue\" />\n");
      out.write("        </form>  \n");
      out.write("          \n");
      out.write("         <form style =\"font-size:20px;\" name=\"Simple11\" action=\"Simple11.jsp\" color=\"white\">\n");
      out.write("          <h1 style=\"color:white; font-style: italic;\"> Ερώτημα 11ο:</h1>\n");
      out.write("          <td width:8px> Type an Integer (Millions):  <td>\n");
      out.write("          <br>\n");
      out.write("          <input type=\"text\" name=\"number11\" value=\"\" size=\"30\" />\n");
      out.write("          <br>\n");
      out.write("          <input type=\"reset\" value=\"Clear\" name=\"Clear\" />\n");
      out.write("          <input type=\"submit\" value=\"Continue\" name=\"Continue\" />\n");
      out.write("        </form> \n");
      out.write("          <br>\n");
      out.write("          <br>\n");
      out.write("          <br>\n");
      out.write("    <form style =\"font-size:20px;\" name=\"Simple1\" action=\"Simple1.jsp\">\n");
      out.write("       <h1 style=\"color:white;\"> ΣΥΝΘΕΤΑ ΕΡΩΤΗΜΑΤΑ</h1>\n");
      out.write("       <br>\n");
      out.write("    </form> \n");
      out.write("          \n");
      out.write("          <form style =\"font-size:20px;\" name=\"Advanced1\" action=\"Advanced1.jsp\">\n");
      out.write("          <h1 style=\"color:white; font-style: italic;\"> Ερώτημα 1ο:</h1>\n");
      out.write("          <td width:8px> Countries in NATO:  <td>\n");
      out.write("          <br>\n");
      out.write("          <input type=\"submit\" value=\"Continue\" name=\"Continue\" />\n");
      out.write("        </form>\n");
      out.write("          \n");
      out.write("        <form style =\"font-size:20px;\" name=\"Advanced3\" action=\"Advanced3.jsp\">\n");
      out.write("          <h1 style=\"color:white; font-style: italic;\"> Ερώτημα 3ο:</h1>\n");
      out.write("          <td width:8px> GDP from Africa and Europe:  <td>\n");
      out.write("          <br>\n");
      out.write("          <input type=\"submit\" value=\"Continue\" name=\"Continue\" />\n");
      out.write("        </form>\n");
      out.write("          \n");
      out.write("        <form style =\"font-size:20px;\" name=\"Advanced5\" action=\"Advanced5.jsp\">\n");
      out.write("          <h1 style=\"color:white; font-style: italic;\"> Ερώτημα 5ο:</h1>\n");
      out.write("          <td width:8px> Type a Continet:  <td>\n");
      out.write("          <br>\n");
      out.write("          <input type=\"text\" name=\"conti5\" value=\"\" size=\"20\" />\n");
      out.write("          <br>\n");
      out.write("           <td width:8px> Type a Float Number:  <td>\n");
      out.write("           <br>\n");
      out.write("           <input type=\"text\" name=\"growth5\" value=\"\" size=\"20\" />\n");
      out.write("          <br>\n");
      out.write("           <input type=\"reset\" value=\"Clear\" name=\"Clear\" />\n");
      out.write("          <input type=\"submit\" value=\"Continue\" name=\"Continue\" />\n");
      out.write("        </form>\n");
      out.write("          \n");
      out.write("        <form style =\"font-size:20px;\" name=\"Advanced7\" action=\"Advanced7.jsp\">\n");
      out.write("          <h1 style=\"color:white; font-style: italic;\"> Ερώτημα 7ο:</h1>\n");
      out.write("          <td width:8px> Type a Country code:  <td>\n");
      out.write("          <br>\n");
      out.write("          <input type=\"text\" name=\"country7\" value=\"\" size=\"20\" />\n");
      out.write("          <br>\n");
      out.write("           <input type=\"reset\" value=\"Clear\" name=\"Clear\" />\n");
      out.write("          <input type=\"submit\" value=\"Continue\" name=\"Continue\" />\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <form style =\"font-size:20px;\" name=\"Advanced9\" action=\"Advanced9.jsp\" text-aling=\"center\">\n");
      out.write("          <h1 style=\"color:white; font-style: italic;\"> Ερώτημα 9ο: </h1>\n");
      out.write("          <td> Type a Continent:  <td>\n");
      out.write("          <br>\n");
      out.write("          <input type=\"text\" name=\"continent\" value=\"\" size=\"20\" />\n");
      out.write("          <br>\n");
      out.write("          <td> Type a Sea:<td>\n");
      out.write("          <br>\n");
      out.write("          <input type=\"text\" name=\"sea\" value=\"\" size=\"20\" />\n");
      out.write("          <br>\n");
      out.write("          <input type=\"reset\" value=\"Clear\" name=\"Clear\" />\n");
      out.write("          <input type=\"submit\" value=\"Continue\" name=\"Continue\" />\n");
      out.write("        </form>\n");
      out.write("      \n");
      out.write("        <form style =\"font-size:20px;\" name=\"Advanced11\" action=\"Advanced11.jsp\" text-aling=\"center\">\n");
      out.write("          <h1 style=\"color:white; font-style: italic;\"> Ερώτημα 11ο:</h1>\n");
      out.write("          <td width:8px> EU and C:  </td>\n");
      out.write("          <br>\n");
      out.write("          <input type=\"submit\" value=\"Continue\" name=\"Continue\" />\n");
      out.write("        </form>\n");
      out.write("          \n");
      out.write("        <form style =\"font-size:20px;\" name=\"Advanced13\" action=\"Advanced13.jsp\" text-aling=\"center\">\n");
      out.write("          <h1 style=\"color:white;  font-style: italic; \"> Ερώτημα 13ο:</h1>\n");
      out.write("          <td width:8px> Lake who has more than 2 city in province:  </td>\n");
      out.write("          <br>\n");
      out.write("          <input type=\"submit\" value=\"Continue\" name=\"Continue\" />\n");
      out.write("        </form>\n");
      out.write("      \n");
      out.write("        <form style =\"font-size:20px;\" name=\"Advanced15\" action=\"Advanced15.jsp\" text-aling=\"center\">\n");
      out.write("          <h1 style=\"color:white; font-style: italic;\"> Ερώτημα 15ο:</h1>\n");
      out.write("          <td width:8px> Countries in EU and C:  </td>\n");
      out.write("          <br>\n");
      out.write("          <input type=\"submit\" value=\"Continue\" name=\"Continue\" />\n");
      out.write("        </form>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("  \n");
      out.write("    </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
