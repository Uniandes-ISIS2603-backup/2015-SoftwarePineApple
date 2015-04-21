(function () {
    var loginModule = angular.module('loginModule', ['CrudModule', 'MockModule']);

    loginModule.constant('login.context', 'login');

    loginModule.config(['login.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();

