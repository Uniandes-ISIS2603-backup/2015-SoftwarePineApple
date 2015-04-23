(function () {

	var mainApp = angular.module('mainApp', ['ngRoute', 'accomodationModule', 'adminModule', 'catalogModule', 'clientModule', 'ecoTourModule', 'foodPlanModule', 'providerModule','loginModule']);
        var mainApp2 = angular.module('mainApp2', ['ngRoute', 'accomodationModule', 'adminModule', 'catalogModule', 'clientModule', 'ecoTourModule', 'foodPlanModule', 'providerModule','loginModule']);



	mainApp.config(['$routeProvider', function ($routeProvider) {
			$routeProvider.when('/accomodation', {
				templateUrl: 'src/modules/accomodation/accomodation.tpl.html'
			}).otherwise('/');
                        $routeProvider.when('/admin', {
                                templateUrl: 'src/modules/admin/admin.tpl.html'
                        }).otherwise('/');
                        $routeProvider.when('/catalog', {
                                templateUrl: 'src/modules/catalog/catalog.tpl.html'
                        }).otherwise('/');
                        $routeProvider.when('/client', {
                                templateUrl: 'src/modules/client/client.tpl.html'
                        }).otherwise('/');
                        $routeProvider.when('/ecoTour', {
                                templateUrl: 'src/modules/ecoTour/ecoTour.tpl.html'
                        }).otherwise('/');
                        $routeProvider.when('/foodPlan', {
                                templateUrl: 'src/modules/foodPlan/foodPlan.tpl.html'
                        }).otherwise('/');
                        $routeProvider.when('/provider', {
                                templateUrl: 'src/modules/provider/provider.tpl.html'
                        }).otherwise('/');
                        $routeProvider.when('/login', {
                                templateUrl: 'src/login.html'
                               
                        }).otherwise('/');
                       
		}]);
mainApp2.config(['$routeProvider', function ($routeProvider) {
			$routeProvider.when('/accomodation', {
				templateUrl: 'src/modules/accomodation/accomodation.tpl.html'
			}).otherwise('/');
                        $routeProvider.when('/admin', {
                                templateUrl: 'src/modules/admin/admin.tpl.html'
                        }).otherwise('/');
                        $routeProvider.when('/catalog', {
                                templateUrl: 'src/modules/catalog/catalog.tpl.html'
                        }).otherwise('/');
                        $routeProvider.when('/client', {
                                templateUrl: 'src/modules/client/client.tpl.html'
                        }).otherwise('/');
                        $routeProvider.when('/ecoTour', {
                                templateUrl: 'src/modules/ecoTour/ecoTour.tpl.html'
                        }).otherwise('/');
                        $routeProvider.when('/foodPlan', {
                                templateUrl: 'src/modules/foodPlan/foodPlan.tpl.html'
                        }).otherwise('/');
                        $routeProvider.when('/provider', {
                                templateUrl: 'src/modules/provider/provider.tpl.html'
                        }).otherwise('/');
                        $routeProvider.when('/login', {
                                templateUrl: 'src/login.html'
                        }).otherwise('/');
                       
		}]);
	
            
      
})();


