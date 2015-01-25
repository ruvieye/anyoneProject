<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>Articles</title>
<!-- mobile first -->
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=yes">

<!-- bootstrap + jquery + respond script -->
<link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/bootstrap/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="/css/anyoneProject.css">
<script src="/js/jquery-2.1.3.js"></script>
<script src="/bootstrap/js/bootstrap.min.js"></script>
<script src="/js/anyoneProject.js"></script>
<script src="/js/jquery.pjax.js"></script>
</head>

<body>
    <div id="wrap">
        Decorator on! Decorator on! Decorator on! Decorator on! Decorator on!

        <div id="container" class="container">
            <sitemesh:write property='body' />
        </div>


        <input type="text" name="pageNo" value="${page.pageNo}" />
    </div>
</body>
</html>

