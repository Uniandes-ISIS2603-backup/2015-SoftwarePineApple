(function () {
    var loginModule = angular.module('loginModule', ['CrudModule', 'MockModule']);

    loginModule.constant('country.skipMock', true);
     loginModule.config(['country.context', 'MockModule.urlsProvider','country.skipMock', function (context, urlsProvider, skipMock) {
             urlsProvider.registerUrl(context, skipMock);
         }]);
     });

