(function (angular) {
    var saleModule = angular.module('saleModule', ['CrudModule', 'MockModule']);

    saleModule.constant('sale.context', 'sales');
    
    saleModule.constant('sale.skipMock', true);

    saleModule.config(['sale.context', 'MockModule.urlsProvider','sale.skipMock', function (context, urlsProvider, skipMock) {
            urlsProvider.registerUrl(context, skipMock);
        }]);
})(window.angular);