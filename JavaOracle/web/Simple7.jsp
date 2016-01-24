
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
      String count7 = new String();
      Integer num = 0 ;
%>
<% 
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
            
            
        %>
<!DOCTYPE html>
<html>
  <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
  
     
    <script type="text/javascript" src="https://www.google.com/jsapi"></script>
    
    <script type="text/javascript">
      google.load("visualization", "1.1", {packages:["table"]});
      google.setOnLoadCallback(drawTable);

      function drawTable() {
        var data = new google.visualization.DataTable();
        data.addColumn('string', 'Name');  
        data.addColumn('string', 'Population');  
        data.addRows([
        <%  
          
          while (rs.next())
            {
                out.println("['"+ rs.getString(1) +"','"+rs.getString(2) +"'],");
            }
          %>
        ]);

        var table = new google.visualization.Table(document.getElementById('table_div'));

        table.draw(data, {showRowNumber: true, width: '100%', height: '100%'});
      }
    </script>
    
   <script type="text/javascript">
      google.charts.load("current", {packages:["corechart"]});
      google.charts.setOnLoadCallback(drawChart);
      function drawChart() {
        var data = google.visualization.arrayToDataTable([
            ['Name','Population'],
          <%
              cs3.execute();
              rs = ((OracleCallableStatement)cs3).getCursor(2);
              while (rs.next())
                {
                    out.println("['"+rs.getString(1)+"',"+rs.getString(2)+"],");
                }
          %>
        ]);

         var options = {
          title: 'AVG GDP from Europe and Africa.',
          legend: { position: 'none' }
        };

        var chart = new google.visualization.Histogram(document.getElementById('chart_div'));
        chart.draw(data, options);
      }
    </script>

  </head>
   <body style="background-color: #333;"> 
   <div id='table_div' style=' width: 500px; float: left; height: 500px; background: magenta; margin: 20px'>test1</div>
    <div id="chart_div" style="width: 900px; float: left; height: 500px; background: orange; margin: 20px">test2</div>
  <form name="MainPage" action="MainPage.jsp" text-aling="center">
        <input type="submit" value="Back to MainPage" name="Back to Main Page" />
      </form>
   </body>
</html>