var anyone = {};
anyone.goPage = function(url, targetId, method) {
    var targetId = (targetId == undefined) ? "#container" : "#" + targetId;
    var method = (method == undefined) ? "GET" : method;

    $.ajax({
	type : method,
	url : url,
	dataType : "html",
	success : function(data) {
	    $(targetId).html(data);
	},
	error : function(data) {
	    alert('page go error : ' + data);
	}
    });
}
