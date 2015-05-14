(function (angular) {
    var saleModule = angular.module('saleModule');

    saleModule.service('saleService', ['CRUDBase', 'sale.context', function (CRUDBase, context) {
            this.url = context;
            CRUDBase.extendService(this);
            
        }]);
})(window.angular);
