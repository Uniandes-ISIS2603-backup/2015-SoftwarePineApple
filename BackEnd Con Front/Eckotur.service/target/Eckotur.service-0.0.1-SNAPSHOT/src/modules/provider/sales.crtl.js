(function () {
    var salesModule = angular.module('salesModule');

    salesModule.controller('salesModule', ['$scope', 'salesService', function ($scope, salesService) {
        salesService.extendCtrl(this, $scope);
    }]);
})();

