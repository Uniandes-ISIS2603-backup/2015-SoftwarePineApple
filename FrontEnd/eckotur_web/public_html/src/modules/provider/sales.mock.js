(function () {
    var salesModule = angular.module('salesModule');

    salesModule.run(['$httpBackend', 'sales.context', 'MockModule.mockRecords', function ($httpBackend, context, mockRecords) {
        $httpBackend.whenGET('webresources/' + context + '/byProvider').respond(function (id) {
            var collection = mockRecords[context];
            var response = []; 
            for (var i in collection) {
                if (collection[i].providerId===id) {
                    response.push(collection[i]);
                } 
            }
            return response;
        });
        $httpBackend.whenGET('webresources/' + context + '/byClient').respond(function (id) {
            var collection = mockRecords[context];
            var response = []; 
            for (var i in collection) {
                if (collection[i].clientId===id) {
                    response.push(collection[i]);
                } 
            }
            return response;
        });
        $httpBackend.whenGET('webresources/' + context + '/byTransaction').respond(function (id) {
            var collection = mockRecords[context];
            var response = []; 
            for (var i in collection) {
                if (collection[i].transactionId===id) {
                    response.push(collection[i]);
                } 
            }
            return response;
        });
    }]);
})();