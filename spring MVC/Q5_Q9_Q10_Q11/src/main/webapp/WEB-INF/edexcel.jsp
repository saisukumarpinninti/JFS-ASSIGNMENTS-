<%@ page import="java.sql.*" %>
<% Class.forName("com.mysql.cj.jdbc.Driver"); %>

<html>
<body>

 	 <% 
            Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
            Statement statement = connection.createStatement() ;
            ResultSet resultset = statement.executeQuery("select * from employee") ; 
        %>
      
        <TABLE BORDER="1">
            <TR>
                <TH>ID</TH>
                <TH>Name</TH>
                <TH>Department</TH>
                <TH>Designation</TH>
                <TH>Salary</TH>
      
            </TR>
            <% while(resultset.next()){ 
            	response.setContentType("application/vnd.ms-excel");
                response.setHeader("Content-Disposition", "inline; filename="+ "employeereport.xls");
            	%>
            <TR>
                <TD contenteditable='true'> <%= resultset.getInt(1) %></td>
                <TD> <%= resultset.getString(2) %></TD>
                <TD> <%= resultset.getString(3) %></TD>
                <TD> <%= resultset.getString(4) %></TD>
                <TD> <%= resultset.getInt(5) %></TD>
              
            </TR>
            <% } %>
        </TABLE>
        
</body>
</html>