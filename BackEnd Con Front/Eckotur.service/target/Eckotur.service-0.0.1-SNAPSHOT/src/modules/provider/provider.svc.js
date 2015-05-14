(function(){
    var providerModule = angular.module('providerModule', ['salesModule', 'offerModule']);
    
    providerModule.service('providerService', ['CRUDBase','provider.context', function(CRUDBase, context){
        this.url = context;
        CRUDBase.extendService(this);
    }]);
})();


