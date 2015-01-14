<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<!-- bootstrap CDN -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0-wip/css/bootstrap.min.css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0-wip/js/bootstrap.min.js"></script>

</head>
<body>
    <h2>Hello</h2>
    <table border="1">
        <c:forEach var="list" items="${list}">
            <tr>
                <c:forEach var="columns" items="${columns}">
                    <td>${list[columns.column_name]}</td>
                </c:forEach>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
