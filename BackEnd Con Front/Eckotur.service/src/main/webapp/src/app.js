(function () {

	var mainApp = angular.module('mainApp', ['ngRoute',  'catalogModule', 'clientModule',  'providerModule','loginModule', 'salesModule']);
        


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
                                templateUrl: '../login.html'
                               
                        }).otherwise('/');
                        $routeProvider.when('/sales', {
                                templateUrl: '../pages/tables.html'
                               
                        }).otherwise('/');
                       
                       
		}]);
      
})();


