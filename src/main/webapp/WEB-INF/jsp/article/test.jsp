<html ng-app="store">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1" />
<title>Explore Foursquare</title>
<!-- bootstrap + jquery + respond script -->
<link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/anyoneProject.css">
<script src="/js/jquery-2.1.3.js"></script>
<script src="/bootstrap/js/bootstrap.min.js"></script>
<script src="/js/anyoneProject.js"></script>

<!-- 3rd party libraries -->
<script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.6/angular.min.js"></script>
<script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.6/angular-route.min.js"></script>
<script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.6/angular-resource.min.js"></script>
<script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.6/angular-animate.min.js"></script>
<script type="text/javascript" src="//cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.9.0/ui-bootstrap.min.js"></script>
<script type="text/javascript" src="//cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.9.0/ui-bootstrap-tpls.min.js"></script>
<script type="text/javascript" src="/js/toaster.js"></script>
<script type="text/javascript" src="/js/loading-bar.min.js"></script>

<script src="/js/app/app.js"></script>
<style>
.ng-invalid.ng-dirty {
    border-color: RED;
}

.ng-valid.ng-dirty {
    border-color: GREEN;
}
</style>
</head>
<body>
    <div id="page">
        <header class="container">
            <div class="navbar navbar-default" id="menu">
                <div class="navbar-header">
                    <button class="btn btn-success navbar-toggle"></button>
                    <div id="logo">
                        <h4>Explore Foursquare</h4>
                    </div>
                </div>
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#/explore">Explore</a></li>
                        <li><a href="#/places">My Places</a></li>
                        <li><a href="#/about">About</a></li>
                    </ul>
                </div>
            </div>
        </header>

        <!-- test angular js -->
        I am {{1111 +1111 }}
        <section class="container" id="body">
            <div ng-controller="StoreController as store">

                <div ng-repeat="product in store.products | orderBy:'-price'">
                    <div ng-hide="product.soldOut">
                        <h2>{{$index+1}}</h2>
                        <h3>{{product.name}}</h3>
                        <h4>{{product.price | currency}}</h4>
                        <p>{{'121314314123' | date:'MM/dd/yyyy'}}</p>
                        <br /> <img ng-src="{{product.img}}" />
                        <button ng-show="product.canPurchase">buy it!</button>

                        <!-- item section -->
                        <section ng-controller="PanelController as panel">
                            <ul class="nav nav-pills">
                                <li ng-class="{active : panel.isSelected(1)}"><a href ng-click="panel.selectTab(1)">descriptions</a></li>
                                <li ng-class="{active : panel.isSelected(2)}"><a href ng-click="panel.selectTab(2)">Species</a></li>
                                <li ng-class="{active : panel.isSelected(3)}"><a href ng-click="panel.selectTab(3)">Review</a></li>
                            </ul>

                            <div class="panel" ng-show="panel.isSelected(1)">
                                <h4>descriptions</h4>
                                <p>{{product.description}}</p>
                            </div>
                            <div class="panel" ng-show="panel.isSelected(2)">
                                <h4>Species</h4>
                                <p>{{product.price | currency}}</p>
                            </div>
                            <div class="panel" ng-show="panel.isSelected(3)">
                                <h4>Review</h4>
                                <blockquote ng-repeat="review in product.reviews">
                                    <ul>
                                        <li>STAR : {{review.stars}}</li>
                                        <li>CONT : {{review.body}}</li>
                                        <li>AUTHOR : {{review.author}}</li>
                                    </ul>
                                </blockquote>

                                <!-- input review -->
                                <form name="reviewForm" ng-controller="ReviewController as reviewCtrl" ng-submit="reviewForm.$valid && reviewCtrl.addReview(product)" novalidate>
                                    <blockquote>
                                        <b>Stars: {{reviewCtrl.review.stars}}</b> {{reviewCtrl.review.body}} <cite>by : {{reviewCtrl.review.author}}</cite>
                                    </blockquote>
                                    <select ng-model="reviewCtrl.review.stars" required>
                                        <option value="1">1star</option>
                                        <option value="2">2star</option>
                                        <option value="3">3star</option>
                                        <option value="4">4star</option>
                                        <option value="5">5star</option>
                                    </select>
                                    <textarea ng-model="reviewCtrl.review.body" required></textarea>
                                    <label>by:</label> <input ng-model="reviewCtrl.review.author" type="email" required /> <input type="submit" value="submit" />
                                    <div>the review form is {{reviewForm.$valid}}</div>
                                </form>
                            </div>
                        </section>
                    </div>
                </div>

            </div>
        </section>


        <hr />

        <footer class="container">
            Created by Taiseer Joudeh. Twitter: <a href="http://twitter.com/tjoudeh" target="_blank">@tjoudeh</a> Taiseer Joudeh Blog: <a href="http://www.bitoftech.net" target="_blank">bitoftech.net</a>
        </footer>
    </div>
</body>
</html>
