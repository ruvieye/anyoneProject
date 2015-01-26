<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>




<%--

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


<script>
    $(document).ready(function() {
	$('#cancel').click(function() {
	    var pageNo = $('#pageNo').val();
	    var url = "/article/list?pageNo=" + pageNo;
	    anyone.goPage(url, "wrap");

	});
	$('#delete').click(function() {
	    $.ajax({
		type : "DELETE",
		url : "/article/${article.seq}",
		success : function(data) {
		    var pageNo = $('#pageNo').val();
		    var url = "/article/list?pageNo=" + pageNo;
		    anyone.goPage(url, "wrap");
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
		    callback(data);
		},
		error : function(data) {
		    alert(data);
		}
	    });
	});

	function callback(data) {
	    alert('수정되었습니다');
	    var url = "/article/" + data.seq;
	    anyone.goPage(url);
	}
    });
</script>
 --%>
