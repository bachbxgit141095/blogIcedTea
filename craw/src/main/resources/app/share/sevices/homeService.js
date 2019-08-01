(function (app) {
    'use strict'
    app.service('homeService',['$http','$q',function($http,$q){
        this.callFunction = function () {
            console.log("CALL");
            var deferred = $q.defer();
            var req = {
                method: 'POST',
                url: '/api/saveCategory'
            }
            $http(req).then(function (res) { console.log(res.data + res.status) });
            deferred.resolve(null);
            return deferred.promise;
        }
    }]);
})(angular.module('blogIcedTea.common'));
