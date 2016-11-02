<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
    	<link rel="stylesheet" href="static/css/style.css" />
        <title>Show Cats</title>
    </head>
    <style>
	    table {
		font-family: arial, sans-serif;
		border-collapse: collapse;
		width: 300px;
		border="1";
		}
		
		p {
			color: darkblue
		}
		
		.details {
			background-color: #bbbbbb;
			width: 300px;
		}
		.details p {
			margin: 0;
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
        <h4>Show Cats</h4>
	    <p>If u wont see details cat, click his name</p>
		<table>
			<tbody>
				<tr>
					<th>#</th>
					<th>Cats name</th>
				</tr>
				<c:forEach items="${cats}" var="cat" varStatus="loop">
					<tr>
						<td>${loop.index}</td>
						<td><a href="/catsbasesec/cats/show/${loop.index}"><c:out value="${cat.name}" /></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<a href="/catsbasesec/" class="cancel"><input type="button" value="Back!"></a>
		<c:if test="${catName != ''}">
			<div class="details">
				<h4>Details:</h4>
				<p>Name: -${catName}-</p>
				<p>Weight: -${catWeight}-</p>
				<p>Born date: -${catBDate}-</p> <!-- *format -->
				<p>Guardian name: -${catGName}-</p>
			</div>
		</c:if>
	</body>
</html>
