/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


(function () {
    var clientModule = angular.module('clientModule', ['CrudModule', 'MockModule','loginModule']);

   clientModule.constant('client.skipMock', true);

     clientModule.config(['client.context', 'MockModule.urlsProvider','client.skipMock', function (context, urlsProvider, skipMock) {
             urlsProvider.registerUrl(context, skipMock);
         }]);
     });