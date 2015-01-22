<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
        <!-- form -->
        <form:form commandName="article" role="form">
            <div class="form-group">
                <form:label path="articleTitle">title</form:label>
                <form:input type="text" class="form-control" path="articleTitle" placeholder="write title" />
            </div>
            <div class="form-group">
                <form:label path="articleContent">content</form:label>
                <form:textarea class="form-control" rows="20" path="articleContent" placeholder="write content" />
            </div>
            <div class="form-group">
                <form:label path="writer">writer</form:label>
                <form:input type="text" class="form-control" path="writer" placeholder="sign your name" />
            </div>
            <button id="cancel" type="button" class="btn btn-default">Cancel</button>
            <button id="delete" type="button" class="btn btn-primary">Delete</button>
            <button id="update" type="button" class="btn btn-primary">Update</button>
        </form:form>
    </div>

    <script>
		    $(document).ready(function() {
			$('#cancel').click(function() {
			    var pageNo = $('#pageNo').val();
			    location.href = "/article/list?pageNo="+pageNo;
			    
			    
			});
			$('#delete').click(function() {
			    $.ajax({
				type : "DELETE",
				url : "/article/${article.seq}",
				success : function(data) {
				    location.href = "/article/list";
				},
				error : function() {
				    alert('err');
				}
			    });
			});

			$('#update').click(function() {
			    $.ajax({
				type : "PUT",
				url : "/article/${article.seq}",
				data : $("#article").serialize(),
				success : function(data) {
				    location.href = "/article/list";
				},
				error : function(data) {
				    alert(data);
				}
			    });
			});
		    });
		</script>
</body>
</html>
