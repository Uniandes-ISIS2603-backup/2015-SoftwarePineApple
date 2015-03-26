(function(){
    var providerModule = angular.module('providerModule');
    
    providerModule.service('providerService', ['CRUDBase','provider.context', function(CRUDBase, context){
        this.url = context;
        CRUDBase.extendService(this);
        this.getOffers = function(id){
            return this.api.customGET(id+'/offers');
        };
        this.getSales = function(id){
            return this.api.customGET(id+'/sales');
        };
        this.getNews = function(id){
            return this.api.customGET(id+'/news');
        };    
        this.getMessages = function(id){
            return this.api.customGET(id+'/messages');
        };
    }]);
})();


