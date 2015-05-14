(function (angular) {
    var countryModule = angular.module('countryModule');

    countryModule.run(['$httpBackend', 'country.context', 'MockModule.mockRecords', 'country.skipMock', 'MockModule.baseUrl', function ($httpBackend, context, mockRecords, skipMock, baseUrl) {
            if (skipMock) {
                $httpBackend.whenGET(baseUrl + '/' + context + '/mostPopulated').passThrough();
                $httpBackend.whenGET(baseUrl + '/' + context + '/leastPopulated').passThrough();
            } else {
                $httpBackend.whenGET(baseUrl + '/' + context + '/mostPopulated').respond(function () {
                    var top;
                    var collection = mockRecords[context];
                    for (var i in collection) {
                        if (!top && collection[i].population) {
                            top = collection[i];
                        } else {
                            if (collection[i].population && top.population < collection[i].population) {
                                top = collection[i];
                            }
                        }
                    }
                    if (!!top) {
                        return [200, top, {}];
                    } else {
                        return [404, {}, {}];
                    }
                });

                $httpBackend.whenGET(baseUrl + '/' + context + '/leastPopulated').respond(function () {
                    var top;
                    var collection = mockRecords[context];
                    for (var i in collection) {
                        if (!top && collection[i].population) {
                            top = collection[i];
                        } else {
                            if (collection[i].population && top.population > collection[i].population) {
                                top = collection[i];
                            }
                        }
                    }
                    if (!!top) {
                        return [200, top, {}];
                    } else {
                        return [404, {}, {}];
                    }
                });
            }
        }]);
})(window.angular);