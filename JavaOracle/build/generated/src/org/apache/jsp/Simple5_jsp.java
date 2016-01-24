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

public final class Simple5_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

      Connection conn = null;
      Statement statement = null;
      String serverURL = "195.251.166.123";
      String serverPort = "1521";
      String serverSID = "orcl";
      String username = "c##13055";
      String password = "654321";
      String name = new String();

      out.write('\r');
      out.write('\n');
 
            //συνδεση στη ΒΔ.
            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            String connectionURL = "jdbc:oracle:thin:@" + serverURL + ":" + serverPort + ":" + serverSID;
            conn = DriverManager.getConnection(connectionURL, username, password);
            // τέλος συνδεση στη ΒΔ.
            //κλήση σε CURSOR
            ResultSet MyCursor;
            CallableStatement cs2=conn.prepareCall("begin SIMPLE5(?); end;");
            cs2.registerOutParameter(1, OracleTypes.CURSOR);
            cs2.execute();
            MyCursor = ((OracleCallableStatement)cs2).getCursor(1);
            //τέλος κλήση σε CURSOR
            
            
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("<html>         \r\n");
      out.write("  <head>   \r\n");
      out.write("  <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"https://www.google.com/jsapi\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("      google.load(\"visualization\", \"1.1\", {packages:[\"table\"]});\r\n");
      out.write("      google.setOnLoadCallback(drawTable);\r\n");
      out.write("\r\n");
      out.write("      function drawTable() {\r\n");
      out.write("        var data = new google.visualization.DataTable();\r\n");
      out.write("        data.addColumn('string', 'City Name');\r\n");
      out.write("        data.addColumn('number', 'Area'); \r\n");
      out.write("        data.addColumn('string','Latitude');\r\n");
      out.write("        data.addColumn('string','Longitude');\r\n");
      out.write("        data.addRows([\r\n");
      out.write("        ");
  
          
          while (MyCursor.next())
            {
                out.println("['"+MyCursor.getString(1)+"',"+MyCursor.getString(2)+",'"+MyCursor.getString(3)+"','"+ MyCursor.getString(4)+ "'],");
            }
          
      out.write("\r\n");
      out.write("        ]);\r\n");
      out.write("\r\n");
      out.write("        var table = new google.visualization.Table(document.getElementById('table_div'));\r\n");
      out.write("\r\n");
      out.write("        table.draw(data, {showRowNumber: true, width: '100%', height: '100%'});\r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("      google.charts.load(\"current\", {packages:[\"map\"]});\r\n");
      out.write("      google.charts.setOnLoadCallback(drawChart);\r\n");
      out.write("      function drawChart() {\r\n");
      out.write("        var data = google.visualization.arrayToDataTable([\r\n");
      out.write("            \r\n");
      out.write("          ['Lat', 'Long', 'Name'],\r\n");
      out.write("          ");

              cs2.execute();
              MyCursor = ((OracleCallableStatement)cs2).getCursor(1);
              while (MyCursor.next())
                {
                    out.println("["+MyCursor.getString(3)+","+MyCursor.getString(4)+",'"+MyCursor.getString(1)+"'],");
                }
          
      out.write("\r\n");
      out.write("        ]);\r\n");
      out.write("\r\n");
      out.write("        var options = {\r\n");
      out.write("          icons: {\r\n");
      out.write("            default: {\r\n");
      out.write("              normal: 'http://icons.iconarchive.com/icons/icons-land/vista-map-markers/48/Map-Marker-Ball-Azure-icon.png',\r\n");
      out.write("              selected: 'http://icons.iconarchive.com/icons/icons-land/vista-map-markers/48/Map-Marker-Ball-Right-Azure-icon.png'\r\n");
      out.write("            }\r\n");
      out.write("          }\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        var map = new google.visualization.Map(document.getElementById('map_markers_div'));\r\n");
      out.write("        map.draw(data, options);\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body style=\"background-color: #333;\"> \r\n");
      out.write("   <div id='table_div' style=' width: 500px; float: left; height: 500px; background: magenta; margin: 20px'>test1</div>\r\n");
      out.write("   <div id=\"map_markers_div\" style='width: 900px; height: 500px; float: left; background: orange; margin: 20px'></div>\r\n");
      out.write("     \r\n");
      out.write("      <form name=\"MainPage\" action=\"MainPage.jsp\" text-aling=\"center\">\r\n");
      out.write("        <input type=\"submit\" value=\"Back to MainPage\" name=\"Back to Main Page\" />\r\n");
      out.write("      </form>\r\n");
      out.write("  \r\n");
      out.write("  </body>\r\n");
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
