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
<script src="/js/facebook-api.js"></script>
</head>

<body>
    <div class="container">
        <h2>Hello, FaceBook</h2>

        <%--
            [facebook login button]
            - autologoutlink : 자동 로그인/로그아웃기능 적용
            - data-scope (or scope) : 로그인동안 필요한 퍼미션 목록 
              * public_profile (Default) : Provides access to a subset of items that are part of a person's public profile
              * email - Access to a person's primary email address.
            - onlogin : 로그인 프로세스 완료후에 호출할 자바스크립트 함수명
         --%>
        <fb:login-button data-scope="public_profile,email" autologoutlink="true" onlogin="checkLoginState();"></fb:login-button>

        <div id="status"></div>
    </div>


    <div id="content">
        <ul id="server_list">
            <li>astweb-www701.svr.hangame.com:8080/index.nhn</li>
            <li>astweb-www702.svr.hangame.com</li>
        </ul>
        <button id="btn392"></button>
        <div id="div391"></div>
    </div>

    <div id="target">target</div>
    <script>
		    $(document).ready(function() {
			$('#server_list li').each(function() {
			    var eachUrl = $(this).text();
			    $.ajax({
				    type: 'GET',
				    url: eachUrl,
				    dataType: "html",
				    success: function(data){
				        alert('horray! 200 status code!' + data);
				        
				    },
				    error: function( jqXHR, textStatus, errorThrown) {
						if(jqXHR.status == 0){
						    alert('success ' +jqXHR );
						    
						    
						}else {
						    alert(jqXHR.status + "/ " + eachUrl);
						}
					    //alert(jqXHR.status +" / "+ textStatus +" / "+ errorThrown) ;
					}
				});
			});
			
		    });
		</script>

    <script type="text/javascript">
$(document).ready(function (){
  
    $("#btn392").click(function(){                
        var url = "http://astweb-www701.svr.hangame.com:8080/index.nhn";
        
        var success = function(data){
            var html = [];
            /* parse JSON */
            data = $.parseJSON(data);
            /* loop through array */
            $.each(data, function(index, d){            
                html.push("Manufacturer : ", d.Manufacturer, ", ",
                          "Sold : ", d.Sold, ", ", 
                          "Month : ", d.Month, "<br>");
            });

            $("#div391").html(html.join('')).css("background-color", "orange");
        };
        
        $.ajax({
          type: 'GET',    
          url: url,
          data:{todo:"jsonp"},
          dataType: "jsonp",
          crossDomain: true,          
          cache:false, 
          success: success,
          error:function(jqXHR, textStatus, errorThrown){
            alert(errorThrown);
          }
        });
    });
});
</script>

</body>
</html>