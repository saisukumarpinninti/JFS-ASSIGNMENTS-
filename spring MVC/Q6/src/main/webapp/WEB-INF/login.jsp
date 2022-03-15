<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
     <head>
      <style>
            .error {
                color: red
            }
        </style>
      </head>
<body>
 
     <input type="button" value="h" onclick="alert1()">
     <form:errors path="*"/>
     	<form:form action="validation.html" modelAttribute="customer">
     	<table>
     	<tr>
     		<td>Username: </td> <td><input type="text" name="username"/>
     		                        <form:errors path="username" cssClass="error"/></td>
     	</tr>
     	<tr>
     		<td>Password: </td> <td><input type="password" name="password"/>
     								<form:errors path="password" cssClass="error"/></td>
     	</tr>
     	<tr>
     		<td>Email: </td> <td><input type="text" name="email"/>
     		                      <form:errors path="email" cssClass="error"/></td>
     	</tr>
     	<tr>
     		<td>Contact: </td> <td><input type="number" name="contact"/>
     		                       <form:errors path="contact" cssClass="error"/> </td>
     	</tr>
     	<tr>
     		<td>City: </td> <td><select name="city" >
										  	<option value="Pune">Pune</option>
										    <option value="Banglore">Banglore</option>
										    <option value="Chennai">Chennai</option>
										    <option value="Mumbai">Mumbai</option>
										</select></td>
     	</tr>
     	<tr>
     		<td>Zip Code: </td> <td><input type="text" name="zipcode"/>
     		                         <form:errors path="zipcode" cssClass="error"/></td>
     	</tr>
     	<tr>
     		 <td><input type="submit" value="submit"/></td>
     	</tr>
     	</table>
     	</form:form>
<script>
function alert1(){
	window.alert("hi");
}</script>

</body>
</html>