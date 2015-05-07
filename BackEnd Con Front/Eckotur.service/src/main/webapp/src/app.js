(function () {

	var mainApp = angular.module('mainApp', ['ngRoute',  'catalogModule', 'clientModule',  'providerModule','loginModule', 'salesModule', 'offerModule']);
        mainApp.config(['$routeProvider', function ($routeProvider) {
			
	}]);
            
            
        var mainApp2 = angular.module('mainApp2', ['ngRoute', 'offerModule']);

        mainApp2.config(['$routeProvider', function ($routeProvider) {
            $routeProvider.when('/offer', {
                templateUrl: '../src/modules/offer/offer.tpl.html'
            }).otherwise('/');
        }]);
      
})();


