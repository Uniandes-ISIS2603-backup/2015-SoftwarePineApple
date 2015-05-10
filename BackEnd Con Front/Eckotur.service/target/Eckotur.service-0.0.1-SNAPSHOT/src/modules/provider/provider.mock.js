(function () {
    var providerModule = angular.module('providerModule', ['offerModule', 'salesModule']);

    providerModule.run(['$httpBackend', 'provider.context', 'MockModule.mockRecords', function ($httpBackend, context, mockRecords) {
        var sales=[];
        var offers=[];
        var messages=[];
        var news=[];
        $httpBackend.whenGET('webresources/' + context + '/' + $scope.currentRecord.id+'sales').respond(function () {
            return sales;
        });
        $httpBackend.whenGET('webresources/' + context + '/' + $scope.currentRecord.id+'offers').respond(function () {
            return offers;
        });
        $httpBackend.whenGET('webresources/' + context + '/' + $scope.currentRecord.id+'messages').respond(function () {
            return messages;
        });
        $httpBackend.whenGET('webresources/' + context + '/' + $scope.currentRecord.id+'news').respond(function () {
            return news;
        });
    }]);
})();


