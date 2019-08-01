(function () {
    angular.module('blogIcedTea',[
            'blogIcedTea.common']).config(config);

    config.$inject = ['$stateProvider', '$urlRouterProvider'];

    function config($stateProvider,$urlRouterProvider) {
        $stateProvider.state('base',{
            url : '',
            templateUrl : '/component/views/viewBase.html',
            abstract : true
        })
            .state('home',{
                url : '/home',
                parent : 'base',
                templateUrl : '/component/home/home.html',
                controller : 'HomeController'
            });
        $urlRouterProvider.otherwise("/home");
    }
})();
