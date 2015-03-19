(function () {
    var providerModule = angular.module('providerModule', ['CrudModule', 'MockModule']);

    providerModule.constant('provider.context', 'providers');

    providerModule.config(['provider.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();

