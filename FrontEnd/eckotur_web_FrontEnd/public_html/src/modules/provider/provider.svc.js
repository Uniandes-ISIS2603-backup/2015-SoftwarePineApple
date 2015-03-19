(function(){
    var providerModule = angular.module('providerModule');
    
    providerModule.service('providerService', ['CRUDBase','provider.context', function(CRUDBase, context){
            this.url = context;
            CRUDBase.extendService(this);
    }]);
})();


