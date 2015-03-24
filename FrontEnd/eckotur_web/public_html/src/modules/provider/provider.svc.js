(function(){
    var providerModule = angular.module('providerModule');
    
    providerModule.service('providerService', ['CRUDBase','provider.context', function(CRUDBase, context){
        this.url = context;
        CRUDBase.extendService(this);
        
        this.getOffers = function(){
            return this.api.customGET('{{currentRecord.id}}/offers');
        };
        
        this.getSales = function(){
            return this.api.customGET('{{currentRecord.id}}/sales');
        };
        
        this.getNews = function(){
            return this.api.customGET('{{currentRecord.id}}/news');
        };
        
        this.getMessages = function(){
            return this.api.customGET('{{currentRecord.id}}/messages');
        };
    }]);
})();


