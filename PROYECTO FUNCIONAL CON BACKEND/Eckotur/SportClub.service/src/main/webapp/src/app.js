(function () {

    var mainApp = angular.module('mainApp', ['ngRoute', 'sportModule', 'countryModule', 'saleModule']);

    mainApp.config(['$routeProvider', function ($routeProvider) {
            $routeProvider.when('/sport', {
                templateUrl: 'src/modules/sport/sport.tpl.html'
            }).when('/country', {
                templateUrl: 'src/modules/country/country.tpl.html'
            }).when('/sale', {
                templateUrl: 'src/modules/sport/sportSale.tpl.html'
            }).when('/offerMain', {
                templateUrl: 'src/modules/sport/sportOfferMain.tpl.html'
            }).when('/offerDetails', {
                templateUrl: 'src/modules/sport/sportOfferDetails.tpl.html'
            }).when('/userLogin', {
                templateUrl: 'src/modules/sport/sportLogin.tpl.html'
            }).when('/account', {
                templateUrl: 'src/modules/sport/sportAccount.tpl.html'
            }).when('/cart', {
                templateUrl: 'src/modules/sport/sportCart.tpl.html'
            }).otherwise('/');
        }]);
})();