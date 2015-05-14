(function () {
    var sportModule = angular.module('offerModule', ['CrudModule', 'MockModule']);

    sportModule.constant('offer.context', 'offers');

    sportModule.config(['offer.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();