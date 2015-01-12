<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
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
