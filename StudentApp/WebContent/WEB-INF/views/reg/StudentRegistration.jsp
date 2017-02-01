<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Students</title>
</head>
<body>
    <div align="center">
        <h2>Register a Student</h2>
        <s:form action="register" method="post">
            <s:textfield label="Name" name="student.name" />
            <s:textfield label="Age" name="student.age" />
            <s:select label="Gender" headerKey="-1" headerValue="Select" list="#{'Male':'Male', 'Female':'Female'}" name="student.gender" />
            <s:submit value="Save" />
        </s:form>            
    </div>   
</body>
</html>