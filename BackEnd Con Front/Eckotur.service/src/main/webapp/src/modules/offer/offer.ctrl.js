(function () {
    var sportModule = angular.module('offerModule');

    sportModule.controller('offerCtrl', ['$scope', 'offerService', function ($scope, sportService) {
            sportService.extendCtrl(this, $scope);
            this.fetchRecords();
        }]);
})();


