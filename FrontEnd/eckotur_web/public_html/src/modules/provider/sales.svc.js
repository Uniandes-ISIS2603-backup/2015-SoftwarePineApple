(function(){
    var salesModule = angular.module('salesModule');
    
    salesModule.service('salesService', ['CRUDBase','sales.context', function(CRUDBase, context){
        this.url = context;
        CRUDBase.extendService(this);
        this.getSalesByProvider = function(){
            return this.api.customGET('byProvider');
        };
        this.getSalesByClient = function(){
            return this.api.customGET('byClient');
        };
        this.getSalesByTransaction = function(){
            return this.api.customGET('byTransaction');
        };
    }]);
})();

