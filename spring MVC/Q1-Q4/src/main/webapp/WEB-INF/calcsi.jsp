 <%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>simpleintrestcalc</title>
</head>
<body>
<p>${m}</p>
<form action="returnsi.html" method="POST">
<p> Enter p</p>
<input type="number" step="0.01" name="p"/>
<p> Enter t</p>
<input type="number" step="0.01" name="t"/>
<p> Enter r</p>
<input type="number" step="0.01" name="r"/>
<input type="submit" value="submit form"/> 
</form>


</body>
</html>