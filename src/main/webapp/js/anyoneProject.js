var anyone = {};
anyone.goPage = function(url, targetId) {
    if(targetId != undefined){
	targetId = "#"+targetId;
    }else{
	targetId = "#container";
    }
    $.ajax({
	type : "GET",
	url : url,
	dataType : "html",
	success : function(data) {
	    $(targetId).html(data);
	},
	error : function() {
	    alert('err');
	}
    });
}
 

