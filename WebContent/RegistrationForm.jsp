
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Kore Infotech - Registration Form</title>
</head>
<body>
<h1>Kore Infotech - Registration Form</h1>
<form name="Dataform" action="add" method="post">

	
<table border="1">
	
	
	<tr>
		<td><spring:message code="label.firstname"/></td>
		
		<td><input type="text" name="firstname" size="20"></td>
	
	</tr>
	<tr>
		<td><spring:message code="label.lastname"/></td>
	
		<td><input type="text" name="lastname" size="20"></td>
	</tr>
	<tr>
		<td><spring:message code="label.name_on_certificate"/></td>
	
		<td><input type="text" name="name_on_certificate" size="20"></td>
		
	</tr>
	<tr>
		<td><spring:message code="label.ic_no_student"/></td>
		
		<td><input type="text" name="ic_no_student" size="20"></td>
	</tr>
	<tr>
		<td><spring:message code="label.ic_no_parent"/></td>
	
		<td><input type="text" name="ic_no_parent" size="20"></td>
	</tr>
	<tr>
		<td><spring:message code="label.dob"/></td>
	
		<td><input type="text" name="dob" size="20"></td>
	</tr>
<!-- 	<tr>
		<td>Date Of Birth</td>
		<td>
			<select name="date">
				<option>Date</option>
				<%
				for(int i=1; i<=31; i++){
					%>
					<option value="<%= i%>"><%=i %></option>
					<%
				}
				%>
			</select>
			
			<select name="month">
				<option>Month</option>
				<%
				for(int i=1; i<=12; i++){
					%>
					<option value="<%= i%>"><%=i %></option>
					<%
				}
				%>
			</select>
			
			<select name="year">
				<option>Year</option>
				<%
				for(int i=1950; i<=2000; i++){
					%>
					<option value="<%= i%>"><%=i %></option>
					<%
				}
				%>
			</select>
		</td>
	</tr> -->
	<tr>
		<td><spring:message code="label.gender"/></td>
		<td>
			<input type="radio" name="gender" value="Male"><spring:message code="label.gender.male"/> <br>
			<input type="radio" name="gender" value="Female"> <spring:message code="label.gender.female"/>
		</td>
	</tr>
	<tr>
		<td><spring:message code="label.mobile_no_student"/></td>
		
		<td><input type="text" name="mobile_no_student" size="20"></td>
	</tr>
	<tr>
		<td><spring:message code="label.ic_no_parent"/></td>
		
		<td><input type="text" name="ic_no_parent" size="20"></td>
	</tr>
	<tr>
		<td><spring:message code="label.alt_tel_no"/></td>
	
		<td><input type="text" name="alt_tel_no" size="20"></td>
	</tr>
	<tr>
		<td><spring:message code="label.email"/></td>

		<td><input type="text" name="email" size="20"></td>
	</tr>
	<tr>
		<td><spring:message code="label.address"/></td>
	
		<td><input type="text" name="address" size="20"></td>
	</tr>
	<tr>
		<td><spring:message code="label.postal_code"/></td>
		
		<td><input type="text" name="postal_code" size="20"></td>
	</tr>
	<tr>
		<td><spring:message code="label.coursetitle"/></td>
		<td>
			<select name="course">
				<option>Select Course</option>
				<option value="C Programming"><spring:message code="label.coursetitle.C Programming"/></option>
				<option value="CPP Programming"><spring:message code="label.coursetitle.CPP Programming"/></option>
				<option value="Java Programming"><spring:message code="label.coursetitle.Java Programming"/></option>
				<option value="Linux Essentials"><spring:message code="label.coursetitle.Linux Essentials"/></option>
			</select>
		</td>
	</tr>
	<tr>
		<td><spring:message code="label.How Did You Find Out About Us?"/></td>
		<td>
			<input type="radio" name="find out" value="Google"> <spring:message code="label.How Did You Find Out About Us?.Google"/> <br>
			<input type="radio" name="find out" value="Yahoo"> <spring:message code="label.How Did You Find Out About Us?.Yahoo"/> <br>
			<input type="radio" name="find out" value="Friend or Colleague"><spring:message code="label.How Did You Find Out About Us?.Friend or Colleague"/> <br>
			<input type="radio" name="find out" value="Advertisement"><spring:message code="label.How Did You Find Out About Us?.Advertisement"/> <br>
			<input type="radio" name="find out" value="Bing"><spring:message code="label.How Did You Find Out About Us?.Bing"/> <br>
			<input type="radio" name="find out" value="Others(Please Specify)"><spring:message code="label.How Did You Find Out About Us?.Others"/> <br>
		</td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<input type="submit" name="btnRegister" value="<spring:message code='label.addContact'/>"/>
			<input type="submit" name="btnRegister" value="<spring:message code='label.cancel'/>"/>
		</td>
	</tr>
</table>
</form>
</body>
</html>