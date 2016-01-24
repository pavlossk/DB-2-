
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
%>
<% 
            //συνδεση στη ΒΔ.
            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            String connectionURL = "jdbc:oracle:thin:@" + serverURL + ":" + serverPort + ":" + serverSID;
            conn = DriverManager.getConnection(connectionURL, username, password);
            // τέλος συνδεση στη ΒΔ.
            //κλήση σε CURSOR
            ResultSet MyCursor;
            CallableStatement cs2=conn.prepareCall("begin ADVANCED15(?); end;");
            cs2.registerOutParameter(1, OracleTypes.CURSOR);
            cs2.execute();
            MyCursor = ((OracleCallableStatement)cs2).getCursor(1);
            //τέλος κλήση σε CURSOR
            
            
        %>
<!DOCTYPE html>
<html>
  <head>
    <script type="text/javascript" src="https://www.google.com/jsapi"></script>
    
    <script type="text/javascript">
      google.load("visualization", "1.1", {packages:["table"]});
      google.setOnLoadCallback(drawTable);

      function drawTable() {
        var data = new google.visualization.DataTable();
        data.addColumn('string', 'Country');
        data.addColumn('string', 'Capital');
        data.addRows([
        <%  
          
          while ( MyCursor.next())
            {
                out.println("['"+MyCursor.getString(1)+"','"+MyCursor.getString(2)+"'],");
            }
          %>
        ]);

        var table = new google.visualization.Table(document.getElementById('table_div'));

        table.draw(data, {showRowNumber: true, width: '100%', height: '100%'});
      }
    </script>
    
      <script type="text/javascript">
    google.load("visualization", "1.1", {packages:["bar"]});
      google.setOnLoadCallback(drawChart);
      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['Country', 'Capital'],
          <%
              cs2.execute();
              MyCursor = ((OracleCallableStatement)cs2).getCursor(1);
              while (MyCursor.next())
                {
                    out.println("['"+MyCursor.getString(1)+"','"+MyCursor.getString(2)+"'],");
                }
          %>
        ]);

        
      var options = {
          chart: {
            title: 'Countries Growth',
            subtitle: ''
          },
          bars: 'vertical' // Required for Material Bar Charts.
        };

        var chart = new google.charts.Bar(document.getElementById('bardiv'));

        chart.draw(data, options);
      }
    </script>
    
    
    
  </head>
       <body style="background-color: #333;"> 
   <div id='table_div' style=' width: 500px; float: left; height: 500px; background: magenta; margin: 20px'>test1</div>
   <div id="bardiv" style='width: 900px; height: 500px; float: left; background: orange; margin: 20px'></div>
      <form name="MainPage" action="MainPage.jsp" text-aling="center">
        <input type="submit" value="Back to MainPage" name="Back to Main Page" />
      </form>
       </body>
</html>