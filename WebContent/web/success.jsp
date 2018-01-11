<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="t" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
</head>
<body>
	<h1>Student Details</h1>

	<table border="1" bordercolor="gray">
		<tr bgcolor="light-gray" style="color:white;">
			<td>Student Name</td>
			<td>Student Email</td>
			<td>Student Program</td>
			<td>Student Grade</td>
		</tr>
		<t:iterator value="studentsList" status="studentListStatus">
			<tr>
				<td><t:property value="%{studentName}" /></td>
				<td><t:property value="%{studentEmail}" /></td>
				<td><t:property value="%{studentProgram}" /></td>
				<td><t:property value="%{studentGrade}" /></td>
			</tr>
		</t:iterator>
	</table>

</body>
</html>