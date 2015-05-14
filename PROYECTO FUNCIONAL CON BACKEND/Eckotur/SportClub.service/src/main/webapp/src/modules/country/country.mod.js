(function (angular) {
    var countryModule = angular.module('countryModule', ['CrudModule', 'MockModule']);

    countryModule.constant('country.context', 'countries');
    
    countryModule.constant('country.skipMock', true);

    countryModule.config(['country.context', 'MockModule.urlsProvider','country.skipMock', function (context, urlsProvider, skipMock) {
            urlsProvider.registerUrl(context, skipMock);
        }]);
})(window.angular);