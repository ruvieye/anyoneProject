<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page session="false" %>
<html>
<head>
	<title>account</title>
</head>
<body>
<h1>
	계정정보
</h1>


<a href="<%= request.getContextPath() %>/logout" >logout</a>
</body>
</html>
