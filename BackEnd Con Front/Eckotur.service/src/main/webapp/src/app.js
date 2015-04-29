(function () {

	var mainApp = angular.module('mainApp', ['ngRoute',  'catalogModule', 'clientModule',  'providerModule','loginModule']);
        var mainApp2 = angular.module('mainApp2', ['ngRoute', 'catalogModule', 'clientModule', 'providerModule','loginModule']);



	mainApp.config(['$routeProvider', function ($routeProvider) {
			$routeProvider.when('/catalog', {
                                templateUrl: 'src/modules/catalog/catalog.tpl.html'
                        }).otherwise('/');
                        $routeProvider.when('/client', {
                                templateUrl: 'src/modules/client/client.tpl.html'
                        }).otherwise('/');
                        $routeProvider.when('/provider', {
                                templateUrl: 'src/modules/provider/provider.tpl.html'
                        }).otherwise('/');
                        $routeProvider.when('/login', {
                                templateUrl: 'src/login.html'
                               
                        }).otherwise('/');
                       
		}]);
mainApp2.config(['$routeProvider', function ($routeProvider) {
			$routeProvider.when('/catalog', {
                                templateUrl: 'src/modules/catalog/catalog.tpl.html'
                        }).otherwise('/');
                        $routeProvider.when('/client', {
                                templateUrl: 'src/modules/client/client.tpl.html'
                        }).otherwise('/');
                        $routeProvider.when('/provider', {
                                templateUrl: 'src/modules/provider/provider.tpl.html'
                        }).otherwise('/');
                        $routeProvider.when('/login', {
                                templateUrl: 'src/login.html'
                        }).otherwise('/');
                       
		}]);
	
            
      
})();


