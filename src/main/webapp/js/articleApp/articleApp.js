//http://java.dzone.com/articles/angularjs-single-page-app
//http://www.javacodegeeks.com/2014/09/angularjs-tutorial-getting-started-with-angularjs.html

(function() {
    var app = angular.module('article', []);

    app.controller('ArticleController', function($scope, $http) {
	var article = this;
	$http.get('/article/columns').success(function(data) {
	    article.columns = data;
	});
	$http.get('/article/articles').success(function(data) {
	    article.articles = data;
	});

	this.articleView = function(seq) {
	    $scope.seq = seq;
	};

    });

    app.directive('hello', function() {
	return {
	    restrict : "E",
	    replace : true,
	    template : "<div> <h2>Hero! Sohn</h2><div>"
	}
    });

})();
