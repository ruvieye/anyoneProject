//http://java.dzone.com/articles/angularjs-single-page-app
//http://www.javacodegeeks.com/2014/09/angularjs-tutorial-getting-started-with-angularjs.html

(function() {
    var app = angular.module('article', [ 'ngRoute', 'ngResource' ]);

    app.config(function($routeProvider) {
	$routeProvider.when('/article/list', {
	    controller : 'ArticleController',
	    templateUrl : 'article/list.jsp'
	}).when('/users/:userId', {
	    controller : 'UsersByIdCtrl',
	    templateUrl : 'views/userbyid.html'
	}).when('/users', {
	    controller : 'UsersCtrl',
	    templateUrl : 'views/users.html'
	}).otherwise({
	    controller : 'SpaCtrl',
	    templateUrl : 'views/spahome.html'
	});
    });

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
