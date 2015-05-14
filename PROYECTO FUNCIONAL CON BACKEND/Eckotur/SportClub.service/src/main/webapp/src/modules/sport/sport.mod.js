(function (angular) {
    var sportModule = angular.module('sportModule', ['CrudModule', 'MockModule', 'countryModule']);

    sportModule.constant('sport.context', 'sports');

    sportModule.constant('sport.skipMock', true);

    sportModule.config(['sport.context', 'MockModule.urlsProvider', 'sport.skipMock', function (context, urlsProvider, skipMock) {
            urlsProvider.registerUrl(context, skipMock);
        }]);
})(window.angular);