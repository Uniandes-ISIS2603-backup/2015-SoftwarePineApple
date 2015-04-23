(function () {
    var providerModule = angular.module('providerModule', ['CrudModule', 'MockModule', 'salesModule']);

   providerModule.constant('provider.skipMock', true);

     providerModule.config(['provider.context', 'MockModule.urlsProvider','provider.skipMock', function (context, urlsProvider, skipMock) {
           urlsProvider.registerUrl(context, skipMock);         }]);

});