(function () {
    var providerModule = angular.module('offerModule', ['CrudModule', 'MockModule']);

    providerModule.constant('offer.context', 'offers');

    providerModule.config(['offer.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
        urlsProvider.registerUrl(context);
    }]);
})();
