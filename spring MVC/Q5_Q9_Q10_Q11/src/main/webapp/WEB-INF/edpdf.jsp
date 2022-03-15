<%@ page import="java.sql.*" %>
<% Class.forName("com.mysql.cj.jdbc.Driver"); %>

<html>
<style type="text/css">
        body
        {
            font-family: Arial;
            font-size: 10pt;
        }
        table
        {
            border: 1px solid #ccc;
            border-collapse: collapse;
        }
        table th
        {
            background-color: #F7F7F7;
            color: #333;
            font-weight: bold;
        }
        table th, table td
        {
            padding: 5px;
            border: 1px solid #ccc;
        }
    </style>


    <script src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.4.1/jspdf.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jspdf-autotable/3.5.6/jspdf.plugin.autotable.min.js"></script>
<body>
<input type="button" onclick="demoFromHTML()" value="Get PDf ">
 
 	 <% 
            Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
            Statement statement = connection.createStatement() ;
            ResultSet resultset = statement.executeQuery("select * from employee") ; 
        %>
      
        <TABLE BORDER="1" id="edata"  >
            <TR>
                <TH>ID</TH>
                <TH>Name</TH>
                <TH>Department</TH>
                <TH>Designation</TH>
                <TH>Salary</TH>
      
            </TR>
            <% while(resultset.next()){ 
            	
          
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
        
<script >
        function demoFromHTML() {
        	  var doc = new jsPDF('p', 'pt');
        	  doc.autoTable({html:'#edata'});
        	  doc.save("table.pdf");
        	  alert("pdf Generated");
        	}
        
    </script>

     
</body>
    
</html>