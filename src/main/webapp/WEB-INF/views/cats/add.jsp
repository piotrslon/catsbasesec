<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
		<link rel="stylesheet" href="/css/style.css" />
        <title>Add Cat</title>
    </head>
    <style>
	    table {
		font-family: arial, sans-serif;
		border-collapse: collapse;
		width: 300px;
		border="1";
		}
				
		td, th {
		    border: 1px solid #dddddd;
		    text-align: left;
			width: 150px;
		}
		
		tr:nth-child(even) {
		    background-color: #dddddd;
		}
	</style>
    <body>
        <p>AddCats</p>
        <p>Request Method -${pageContext.request.method}-</p>
	    <br>
	    <form:form method="POST" modelAttribute="formDto">
			<table>
				<tr>
					<th>Qewstions</th>
					<th>Answer</th>
				</tr>
				<tr>
					<td>Name:</td>
					<td><form:input type="text" path="name"></form:input>
						<form:errors path="name" cssClass="error" /></td>
					<%-- <td><form:input type="text" path="name" />
						<c:if test="${pageContext.request.method=='POST'}">
						<form:errors path="name" cssClass="error" /></c:if></td> --%>
				</tr>
				<tr>
					<td>Born date:</td>
					<td><form:input type="text" path="birthDate"></form:input>
						<form:errors path="birthDate" cssClass="error" /></td>
				<tr>
					<td>Weight:</td>
					<td><form:input type="text" path="weight"></form:input>
						<form:errors path="weight" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Guardian name:</td>
					<td><form:input type="text" path="guardianName"></form:input>
						<form:errors path="guardianName" cssClass="error" /></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: center;padding: 5px"><input type="submit" value="Send form" /></td>
				</tr>
			</table>
		</form:form>
		
		
		<a href="/catsbasesec/" class="cancel"><input type="button" value="Back!"></a>
	</body>
</html>
