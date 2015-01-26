
/*######################*********************#############################
  
 Created by: Taiseer Joudeh
  http://twitter.com/tjoudeh
  http://bitoftech.net

 ######################*********************##############################*/

var app = angular.module('FoursquareApp', ['ngRoute', 'ngResource', 'ui.bootstrap', 'toaster', 'chieffancypants.loadingBar']);

app.config(function ($routeProvider) {

    $routeProvider.when("/explore", {
        controller: "placesExplorerController",
        templateUrl: "/js/app/views/placesresults.html"
    });

    $routeProvider.when("/places", {
        controller: "myPlacesController",
        templateUrl: "/js/app/views/myplaces.html"
    });

    $routeProvider.when("/about", {
        controller: "aboutController",
        templateUrl: "/js/app/views/about.html"
    });

    $routeProvider.otherwise({ redirectTo: "/explore" });

});