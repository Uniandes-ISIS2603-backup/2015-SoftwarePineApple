(function(){
    var catalogModule = angular.module('catalogModule');
    
    catalogModule.service('catalogrService', ['CRUDBase','catalog.context', function(CRUDBase, context){
        this.url = context;
        CRUDBase.extendService(this);
        
        this.getOffers = function(){
            return this.api.customGET('offers');
        };
        
      
    }]);
})();


