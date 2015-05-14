/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

(function () {
    var clientModule = angular.module('ClientModule');

    clientModule.run(['$httpBackend', 'client.context', 'MockModule.mockRecords', function ($httpBackend, context, mockRecords) {
        var inCart=[];
        var boughts=[];
        
        $httpBackend.whenGET('webresources/' + context + '/' + $scope.currentRecord.id+'cart').respond(function () {
            return inCart;
        });
        $httpBackend.whenGET('webresources/' + context + '/' + $scope.currentRecord.id+'bought').respond(function () {
            return boughts;
        });
       
    }]);
})();
