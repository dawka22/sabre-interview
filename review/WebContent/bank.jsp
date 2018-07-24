<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<title>Bank</title>

<%@ page import="java.io.*,java.util.*" %>
<%

	String dollarsValue="";	

	if (!session.isNew()){
		//check if dollarsValue is Numeric
		
		dollarsValue = request.getParameter("dollars");
		if(dollarsValue!=null){
			dollarsValue = String.valueOf(Integer.parseInt(dollarsValue) * 2);
		}
	}
	
%>

<html>
<body>

<form action="bank.jsp" method="GET">
	Dollars:<input type="number" name="dollars" value="<% out.print(dollarsValue); %>">
	<input type="submit" value="Submit and double it!" />
</form>

</body>
</html>