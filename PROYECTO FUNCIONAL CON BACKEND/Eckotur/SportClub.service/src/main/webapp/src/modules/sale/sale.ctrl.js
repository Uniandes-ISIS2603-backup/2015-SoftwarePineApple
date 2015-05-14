(function (angular) {
    var saleModule = angular.module('saleModule');

    saleModule.controller('saleCtrl', ['$scope', 'saleService', function ($scope, saleService) {
            saleService.extendCtrl(this, $scope);
            this.fetchRecords();
            

            
        }]);
})(window.angular);