(function () {
    var salesModule = angular.module('salesModule', ['CrudModule', 'MockModule']);

    salesModule.constant('sales.context', 'sales');

    salesModule.config(['sales.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
        urlsProvider.registerUrl(context);
    }]);
})();


