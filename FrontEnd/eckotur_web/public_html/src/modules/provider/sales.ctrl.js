(function () {
    var salesModule = angular.module('salesModule');

    salesModule.controller('salesModule', ['$scope', 'salesModule', function ($scope, salesService) {
        salesService.extendCtrl(this, $scope);
        this.fetchRecords();
    }]);
})();