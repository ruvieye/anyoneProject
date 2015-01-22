<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!-- form -->
<form:form method="POST" commandName="article" action="/article/post" role="form">
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
    <button id="submit" type="button" class="btn btn-primary">Submit</button>
    <button id="cancel" type="button" class="btn btn-default">Cancel</button>
</form:form>
<script>
    $(document).ready(function() {
	$('#cancel').click(function() {
	    var pageNo = $('#pageNo').val();
	    var url = "/article/list?pageNo=" + pageNo;
	    anyone.goPage(url, "wrap");
	});

	$('#submit').click(function() {
	    $.ajax({
		type : "POST",
		url : "/article/post",
		data : $("#article").serialize(),
		dataType : "json",
		success : function(json) {
		    location.href = "/article/" + json.seq;
		},
		error : function() {
		    alert('err');
		}
	    });
	});
    });
</script>
