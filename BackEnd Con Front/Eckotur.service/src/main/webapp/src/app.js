(function () {

	var mainApp = angular.module('mainApp', ['ngRoute', 'accomodationModule', 'adminModule', 'catalogModule', 'clientModule', 'ecoTourModule', 'foodPlanModule', 'providerModule','loginModule']);
        var mainApp2 = angular.module('mainApp2', ['ngRoute', 'accomodationModule', 'adminModule', 'catalogModule', 'clientModule', 'ecoTourModule', 'foodPlanModule', 'providerModule','loginModule']);

	var accomodationModule = angular.module('accomodationModule', ['CrudModule', 'MockModule']);
	accomodationModule.constant('accomodation.context', 'accomodation');
	accomodationModule.config(['accomodation.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
			urlsProvider.registerUrl(context);
		}]);
        
        var adminModule = angular.module('adminModule', ['CrudModule', 'MockModule']);
	adminModule.constant('admin.context', 'admin');
	adminModule.config(['admin.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
			urlsProvider.registerUrl(context);
		}]);    
        var catalogModule = angular.module('catalogModule', ['CrudModule', 'MockModule']);
	catalogModule.constant('catalog.context', 'catalog');
	catalogModule.config(['catalog.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
			urlsProvider.registerUrl(context);
		}]);
        var clientModule = angular.module('clientModule', ['CrudModule', 'MockModule']);
	clientModule.constant('client.context', 'client');
	clientModule.config(['client.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
			urlsProvider.registerUrl(context);
		}]);
        var ecoTourModule = angular.module('ecoTourModule', ['CrudModule', 'MockModule']);
	ecoTourModule.constant('ecoTour.context', 'ecoTour');
	ecoTourModule.config(['ecoTour.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
			urlsProvider.registerUrl(context);
		}]);
        var foodPlanModule = angular.module('foodPlanModule', ['CrudModule', 'MockModule']);
	foodPlanModule.constant('foodPlan.context', 'foodPlan');
	foodPlanModule.config(['foodPlan.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
			urlsProvider.registerUrl(context);
		}]);
        var providerModule = angular.module('providerModule', ['CrudModule', 'MockModule']);
	providerModule.constant('provider.context', 'provider');
	providerModule.config(['provider.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
			urlsProvider.registerUrl(context);
		}]);
            var loginModule = angular.module('loginModule', ['CrudModule', 'MockModule']);
	loginModule.constant('login.context', 'login');
	loginModule.config(['login.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
			urlsProvider.registerUrl(context);
		}]);

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


