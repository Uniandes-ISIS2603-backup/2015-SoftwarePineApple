/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


(function () {
    var clientModule = angular.module('clientModule', ['CrudModule', 'MockModule','loginModule']);

    clientModule.constant('client.context', 'client');

    clientModule.config(['client.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();