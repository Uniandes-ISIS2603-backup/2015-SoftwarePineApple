(function(){
    var offerModule = angular.module('offerModule');
    
    offerModule.service('offerService', ['CRUDBase','offer.context', function(CRUDBase, context){
        this.url = context;
        CRUDBase.extendService(this);
        
        this.getOffers = function(){
            return this.api.customGET('{{currentRecord.id}}/offers');
        };
        
        this.getSales = function(){
            return this.api.customGET('{{currentRecord.id}}/sales');
        };
 
 
    }]);
})();
