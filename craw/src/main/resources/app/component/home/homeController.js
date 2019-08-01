(function (app) {
    app.controller('HomeController',['$scope','homeService',function ($scope,homeService) {
        $scope.callFunction = function () {
            console.log("TEST");
            homeService.callFunction().then(function () {
                console.log("SUCCESS");
            })
        }
    }]);
})(angular.module('blogIcedTea'));
