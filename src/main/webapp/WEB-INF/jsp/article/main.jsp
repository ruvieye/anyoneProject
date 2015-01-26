<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="ko" ng-app="article">
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

<script src="/js/angular.js"></script>
<script src="/js/articleApp/articleApp.js"></script>
</head>

<body>
    <div id="wrap">
        <header class="container">
            <div class="navbar navbar-default" id="menu">
                <div class="navbar-header">
                    <button class="btn btn-success navbar-toggle"></button>
                    <div id="logo">
                        <h4>Anyone Articles</h4>
                    </div>
                </div>
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#/list">List</a></li>
                        <li><a href="#/wirte">Write</a></li>
                        <li><a href="#/about">About</a></li>
                    </ul>
                </div>
            </div>
        </header>

        <div class="container">
            <h4>
                Site Count is <span id="counter"></span>
            </h4>
        </div>


        <div id="container" class="container">
            <div ng-controller="ArticleController as articleCtrl">

                <div class="table-responsive">
                    <table class="table">
                        <thead>
                            <tr>
                                <th ng-repeat="columns in articleCtrl.columns">{{columns.columnName}}</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr ng-repeat="articles in articleCtrl.articles">
                                <td ng-repeat="columns in articleCtrl.columns"><a href ng-click="articleCtrl.articleView(articles.seq)">{{articles[columns.columnName]}}</a></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                {{seq}}aa
                <hello></hello>
            </div>



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


