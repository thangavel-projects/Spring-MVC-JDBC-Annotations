<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

	function hideAddEmp(){
		window.document.getElementById("addEmp").style.display="none";
	}
	
	function showAddEmp(){
		window.document.getElementById("addEmp").style.display="inline";
		var name = window.document.getElementById("name").value;
		var add = document.getElementById("address").value;
		var age = document.getElementById("age").value;

		if (name.length > 0 && add.length > 0 && age.length > 0) {
			window.location.href = "AddEmployeeDetails?name="+name+"&add="+add+"&age="+age;	
		}
	}
	
</script>

</head>
<body onload="hideAddEmp();">

<table border="1">
	<thead> 
		<tr>
			<td>Name</td>
			<td>Address</td>
			<td>Age</td>
		</tr>
	</thead>
	<tbody>
		<c:if test="${not empty employeeList}">
			<c:forEach var="data" items="${employeeList}">
				<tr>
					<td>${data.name}</td>
					<td>${data.address}</td>
					<td>${data.age}</td>
				</tr>
			</c:forEach>
		</c:if>
	</tbody>
</table>
<table id="addEmp">
	<tr><td>Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="name" id="name" value=""/></td></tr>
	<tr><td>Address:&nbsp;<input type="text" name="address"  id="address" value=""/></td></tr>
	<tr><td>Age:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="age" id="age" value=""/></td></tr>
</table>
<table>
<tr><td><input type="button" onclick="showAddEmp();" name="addEmployee" value="ADD EMPLOYEE"/> </td></tr>
</table>
</body>
</html>