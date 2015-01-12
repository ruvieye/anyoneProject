<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
    <h2>Hello</h2>
    <table border="1">
        <c:forEach var="list" items="${list}">
            <tr>
                <td>${list.idx}</td>
                <td>${list.usr_id}</td>
                <td>${list.usr_nm}</td>
                <td>${list.dept_cd}</td>
                <td>${list.del_yn}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
