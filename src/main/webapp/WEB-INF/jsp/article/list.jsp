<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>Bootstrap 101 Template</title>
<!-- mobile first -->
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=yes">

<!-- bootstrap + jquery + respond script -->
<link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/bootstrap/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="/css/anyoneProject.css">
<script src="/js/jquery-2.1.3.js"></script>
<script src="/bootstrap/js/bootstrap.min.js"></script>
</head>

<body>
    <div class="container">

        <h1>Hello, world!</h1>
        <div class="table-responsive">
            <table class="table">
                <thead>
                    <c:forEach var="columns" items="${articleColumnList}">
                        <th>${columns.column_name}</th>
                    </c:forEach>
                </thead>
                <tbody class="table-hover">
                    <c:forEach var="list" items="${articleList}">
                        <tr>
                            <c:forEach var="columns" items="${articleColumnList}">
                                <td>${list[columns.column_name]}</td>
                            </c:forEach>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>

        <p>
            <button id="btn_post" type="button" class="btn btn-primary">POST</button>
        </p>

    </div>
    <script>
		    $(document).ready(function() {
			$('#btn_post').click(function() {
			    location.href = "/article/post/"
			});
		    });
		</script>
</body>
</html>
