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

<!DOCTYPE html>
<html>
    <head>
        <div id="templatemo_header">
    	<div id="templatemo_logo" style ="font-size:20px;" >
        	<img style="" src="images/top_logo[1].gif" alt="Logo" />
            <div id="templatemo_sitetitle">Database II Project</div>
      </div>
      <body style="background-color: #707070;">
          
      <div align="center">
          
    <form name="Simple1" action="Simple1.jsp">
        <h1 style="color:white;"> ΑΠΛΑ ΕΡΩΤΗΜΑΤΑ</h1>
        <br>
    </form> 
          
         <form style ="font-size:20px;" name="Simple1" action="Simple1.jsp">
          <h1 style="color:white; font-style: italic;"> Ερώτημα 1ο:</h1>
          <td width:10px> Area 5% like Greece:  <td>
          <br>
        
          <input type="submit" value="Continue" name="Continue" />
        </form>  
          
         <form style ="font-size:20px;" name="Simple3" action="Simple3.jsp">
          <h1 style="color:white; font-style: italic;"> Ερώτημα 3ο:</h1>
          <td width:8px> Type a Country Name:  <td>
          <br>
          <input type="text" name="country3" value="" size="20" />
          <br>
          <input type="reset" value="Clear" name="Clear" />
          <input type="submit" value="Continue" name="Continue" />
        </form>  
          
         <form style ="font-size:20px;" name="Simple5" action="Simple5.jsp">
          <h1 style="color:white; font-style: italic;">  Ερώτημα 5ο:</h1>
          <td width:8px> Ionic Islands in Map:  <td>
          <br>
          <input type="submit" value="Continue" name="Continue" />
        </form>  
          
        <form style ="font-size:20px;" name="Simple7" action="Simple7.jsp">
          <h1 style="color:white; font-style: italic;"> Ερώτημα 7ο:</h1>
          <td width:8px> Type an Integer:  <td>
          <br>
          <input type="text" name="number7" value="" size="20" />
          <br>
          <input type="reset" value="Clear" name="Clear" />
          <input type="submit" value="Continue" name="Continue" />
        </form>  
          
        <form style ="font-size:20px;" name="Simple9" action="Simple9.jsp">
          <h1 style="color:white; font-style: italic;"> Ερώτημα 9ο:</h1>
          <td width:8px> Capitals-Countries same name:  <td>
          <br>
          <input type="submit" value="Continue" name="Continue" />
        </form>  
          
         <form style ="font-size:20px;" name="Simple11" action="Simple11.jsp" color="white">
          <h1 style="color:white; font-style: italic;"> Ερώτημα 11ο:</h1>
          <td width:8px> Type an Integer (Millions):  <td>
          <br>
          <input type="text" name="number11" value="" size="30" />
          <br>
          <input type="reset" value="Clear" name="Clear" />
          <input type="submit" value="Continue" name="Continue" />
        </form> 
          <br>
          <br>
          <br>
    <form style ="font-size:20px;" name="Simple1" action="Simple1.jsp">
       <h1 style="color:white;"> ΣΥΝΘΕΤΑ ΕΡΩΤΗΜΑΤΑ</h1>
       <br>
    </form> 
          
          <form style ="font-size:20px;" name="Advanced1" action="Advanced1.jsp">
          <h1 style="color:white; font-style: italic;"> Ερώτημα 1ο:</h1>
          <td width:8px> Countries in NATO:  <td>
          <br>
          <input type="submit" value="Continue" name="Continue" />
        </form>
          
        <form style ="font-size:20px;" name="Advanced3" action="Advanced3.jsp">
          <h1 style="color:white; font-style: italic;"> Ερώτημα 3ο:</h1>
          <td width:8px> GDP from Africa and Europe:  <td>
          <br>
          <input type="submit" value="Continue" name="Continue" />
        </form>
          
        <form style ="font-size:20px;" name="Advanced5" action="Advanced5.jsp">
          <h1 style="color:white; font-style: italic;"> Ερώτημα 5ο:</h1>
          <td width:8px> Type a Continet:  <td>
          <br>
          <input type="text" name="conti5" value="" size="20" />
          <br>
           <td width:8px> Type a Float Number:  <td>
           <br>
           <input type="text" name="growth5" value="" size="20" />
          <br>
           <input type="reset" value="Clear" name="Clear" />
          <input type="submit" value="Continue" name="Continue" />
        </form>
          
        <form style ="font-size:20px;" name="Advanced7" action="Advanced7.jsp">
          <h1 style="color:white; font-style: italic;"> Ερώτημα 7ο:</h1>
          <td width:8px> Type a Country code:  <td>
          <br>
          <input type="text" name="country7" value="" size="20" />
          <br>
           <input type="reset" value="Clear" name="Clear" />
          <input type="submit" value="Continue" name="Continue" />
        </form>

        <form style ="font-size:20px;" name="Advanced9" action="Advanced9.jsp" text-aling="center">
          <h1 style="color:white; font-style: italic;"> Ερώτημα 9ο: </h1>
          <td> Type a Continent:  <td>
          <br>
          <input type="text" name="continent" value="" size="20" />
          <br>
          <td> Type a Sea:<td>
          <br>
          <input type="text" name="sea" value="" size="20" />
          <br>
          <input type="reset" value="Clear" name="Clear" />
          <input type="submit" value="Continue" name="Continue" />
        </form>
      
        <form style ="font-size:20px;" name="Advanced11" action="Advanced11.jsp" text-aling="center">
          <h1 style="color:white; font-style: italic;"> Ερώτημα 11ο:</h1>
          <td width:8px> EU and C:  </td>
          <br>
          <input type="submit" value="Continue" name="Continue" />
        </form>
          
        <form style ="font-size:20px;" name="Advanced13" action="Advanced13.jsp" text-aling="center">
          <h1 style="color:white;  font-style: italic; "> Ερώτημα 13ο:</h1>
          <td width:8px> Lake who has more than 2 city in province:  </td>
          <br>
          <input type="submit" value="Continue" name="Continue" />
        </form>
      
        <form style ="font-size:20px;" name="Advanced15" action="Advanced15.jsp" text-aling="center">
          <h1 style="color:white; font-style: italic;"> Ερώτημα 15ο:</h1>
          <td width:8px> Countries in EU and C:  </td>
          <br>
          <input type="submit" value="Continue" name="Continue" />
        </form>
            <br>
            <br>
            <br>
            <br>
            <br>
            
  
    </div>
    </body>
</html>


