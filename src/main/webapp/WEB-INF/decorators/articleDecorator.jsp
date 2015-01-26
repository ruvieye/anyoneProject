<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>Articles</title>
<!-- mobile first -->
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=yes">

<!-- bootstrap + jquery + respond script -->
<link rel="stylesheet" href="/bootstrap/theme/superhero/bootstrap.min.css">
<link rel="stylesheet" href="/css/anyoneProject.css">
<script src="/js/jquery-2.1.3.js"></script>
<script src="/bootstrap/js/bootstrap.min.js"></script>
<script src="/js/anyoneProject.js"></script>
<script src="/js/jquery.pjax.js"></script>
</head>

<body>
    <div id="wrap">
        Decorator on! Decorator on! Decorator on! Decorator on! Decorator on!
        <h3>
            Site Count is <span id="counter"></span>
        </h3>

        <div id="container" class="container">
            <sitemesh:write property='body' />
        </div>


        <input type="text" name="pageNo" value="${page.pageNo}" />
    </div>
</body>
<script>
    var count = 0;
    $(document).ready(function() {
	setInterval(function() {
	    count++;
	    $('#counter').html(count);
	}, 1000);
    });
</script>
</html>

