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

public final class Simple7_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      Connection conn = null;
      Statement statement = null;
      String serverURL = "195.251.166.123";
      String serverPort = "1521";
      String serverSID = "orcl";
      String username = "c##13055";
      String password = "654321";
      String count7 = new String();
      Integer num = 0 ;

      out.write('\n');
 
            //συνδεση στη ΒΔ.
           if(request.getParameter("number7")!= null){
               count7=request.getParameter("number7");
                num =Integer.parseInt(count7);
           }
            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            String connectionURL = "jdbc:oracle:thin:@" + serverURL + ":" + serverPort + ":" + serverSID;
            conn = DriverManager.getConnection(connectionURL, username, password);
            // τέλος συνδεση στη ΒΔ.
            //κλήση σε CURSOR
            ResultSet rs;
            CallableStatement cs3=conn.prepareCall("begin SIMPLE7N(?,?); end;");
            cs3.setInt(1, num);
            cs3.registerOutParameter(2, OracleTypes.CURSOR);
            cs3.execute();
            rs = ((OracleCallableStatement)cs3).getCursor(2);
            //τέλος κλήση σε CURSOR
            
            
        
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n");
      out.write("  \n");
      out.write("     \n");
      out.write("    <script type=\"text/javascript\" src=\"https://www.google.com/jsapi\"></script>\n");
      out.write("    \n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("      google.load(\"visualization\", \"1.1\", {packages:[\"table\"]});\n");
      out.write("      google.setOnLoadCallback(drawTable);\n");
      out.write("\n");
      out.write("      function drawTable() {\n");
      out.write("        var data = new google.visualization.DataTable();\n");
      out.write("        data.addColumn('string', 'Name');  \n");
      out.write("        data.addColumn('string', 'Population');  \n");
      out.write("        data.addRows([\n");
      out.write("        ");
  
          
          while (rs.next())
            {
                out.println("['"+ rs.getString(1) +"','"+rs.getString(2) +"'],");
            }
          
      out.write("\n");
      out.write("        ]);\n");
      out.write("\n");
      out.write("        var table = new google.visualization.Table(document.getElementById('table_div'));\n");
      out.write("\n");
      out.write("        table.draw(data, {showRowNumber: true, width: '100%', height: '100%'});\n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("   <script type=\"text/javascript\">\n");
      out.write("      google.charts.load(\"current\", {packages:[\"corechart\"]});\n");
      out.write("      google.charts.setOnLoadCallback(drawChart);\n");
      out.write("      function drawChart() {\n");
      out.write("        var data = google.visualization.arrayToDataTable([\n");
      out.write("            ['Name','Population'],\n");
      out.write("          ");

              cs3.execute();
              rs = ((OracleCallableStatement)cs3).getCursor(2);
              while (rs.next())
                {
                    out.println("['"+rs.getString(1)+"',"+rs.getString(2)+"],");
                }
          
      out.write("\n");
      out.write("        ]);\n");
      out.write("\n");
      out.write("         var options = {\n");
      out.write("          title: 'AVG GDP from Europe and Africa.',\n");
      out.write("          legend: { position: 'none' }\n");
      out.write("        };\n");
      out.write("\n");
      out.write("        var chart = new google.visualization.Histogram(document.getElementById('chart_div'));\n");
      out.write("        chart.draw(data, options);\n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("   <body style=\"background-color: #333;\"> \n");
      out.write("   <div id='table_div' style=' width: 500px; float: left; height: 500px; background: magenta; margin: 20px'>test1</div>\n");
      out.write("    <div id=\"chart_div\" style=\"width: 900px; float: left; height: 500px; background: orange; margin: 20px\">test2</div>\n");
      out.write("  </body>\n");
      out.write("</html>");
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
