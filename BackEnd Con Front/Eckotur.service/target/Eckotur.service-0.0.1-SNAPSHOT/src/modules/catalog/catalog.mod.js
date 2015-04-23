(function () {
    var catalogModule = angular.module('catalogModule', ['CrudModule', 'MockModule']);

   catalogModule.constant('catalog.context', 'catalogs');

    catalogModule.config(['catalog.context', 'MockModule.urlsCatalog', function (context, urlsCatalog) {
            urlsCatalog.registerUrl(context);
        }]);
})();

