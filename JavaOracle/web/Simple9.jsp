<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="oracle.jdbc.OracleCallableStatement"%>
<%@page import="oracle.jdbc.OracleTypes"%>
<%@page import="java.sql.CallableStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
      Connection conn = null;
      Statement statement = null;
      String serverURL = "195.251.166.123";
      String serverPort = "1521";
      String serverSID = "orcl";
      String username = "c##13055";
      String password = "654321";
      String name = new String();
%>
<% 
            //συνδεση στη ΒΔ.
            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            String connectionURL = "jdbc:oracle:thin:@" + serverURL + ":" + serverPort + ":" + serverSID;
            conn = DriverManager.getConnection(connectionURL, username, password);
            // τέλος συνδεση στη ΒΔ.
            //κλήση σε CURSOR
            ResultSet MyCursor;
            CallableStatement cs2=conn.prepareCall("begin open ? for SELECT CITY.LATITUDE,CITY.LONGITUDE,CITY.NAME,COUNTRY.CAPITAL FROM CITY,COUNTRY WHERE CITY.NAME =COUNTRY.NAME;  end;");
            cs2.registerOutParameter(1, OracleTypes.CURSOR);
            cs2.execute();
            MyCursor = ((OracleCallableStatement)cs2).getCursor(1);
            //τέλος κλήση σε CURSOR
            
            
        %>
        
        <html>
            
  <head>
       
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
  <script type="text/javascript" src="https://www.google.com/jsapi"></script>
    
    <script type="text/javascript">
      google.load("visualization", "1.1", {packages:["table"]});
      google.setOnLoadCallback(drawTable);

      function drawTable() {
        var data = new google.visualization.DataTable();
        data.addColumn('string', 'City Name');
        data.addColumn('string', 'Capital');
        data.addRows([
        <%  
          
          while (MyCursor.next())
            {
                out.println("['"+MyCursor.getString(3)+"','"+MyCursor.getString(4)+"'],");
            }
          %>
        ]);

        var table = new google.visualization.Table(document.getElementById('table_div'));

        table.draw(data, {showRowNumber: true, width: '100%', height: '100%'});
      }
    </script>
    
    <script type="text/javascript">
      google.charts.load("current", {packages:["map"]});
      google.charts.setOnLoadCallback(drawChart);
      function drawChart() {
        var data = google.visualization.arrayToDataTable([
            
          ['Lat', 'Long', 'Name'],
          <%
              cs2.execute();
              MyCursor = ((OracleCallableStatement)cs2).getCursor(1);
              while (MyCursor.next())
                {
                    out.println("["+MyCursor.getString(1)+","+MyCursor.getString(2)+",'"+MyCursor.getString(3)+"'],");
                }
          %>
        ]);

        var options = {
          icons: {
            default: {
              normal: 'http://icons.iconarchive.com/icons/icons-land/vista-map-markers/48/Map-Marker-Ball-Azure-icon.png',
              selected: 'http://icons.iconarchive.com/icons/icons-land/vista-map-markers/48/Map-Marker-Ball-Right-Azure-icon.png'
            }
          }
        };

        var map = new google.visualization.Map(document.getElementById('map_markers_div'));
        map.draw(data, options);
      }

    </script>
  </head>

  <body style="background-color: #333;"> 
   <div id='table_div' style=' width: 500px; float: left; height: 500px; background: magenta; margin: 20px'>test1</div>
    <div id="map_markers_div" style='width: 900px; height: 500px; float: left; background: orange; margin: 20px'></div>
      <form name="MainPage" action="MainPage.jsp" text-aling="center">
        <input type="submit" value="Back to MainPage" name="Back to Main Page" />
      </form>
  </body>
</html>