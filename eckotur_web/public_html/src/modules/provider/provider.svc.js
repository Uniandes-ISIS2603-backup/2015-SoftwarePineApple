(function(){
    var providerModule = angular.module('providerModule');
    
    providerModule.service('providerService', ['CRUDBase','provider.context', function(CRUDBase, context){
        this.url = context;
        CRUDBase.extendService(this);
        
        this.getOffers = function(){
            return this.api.customGET('offers');
        };
        
        this.getSales = function(){
            return this.api.customGET('sales');
        };
        
        this.getNews = function(){
            return this.api.customGET('news');
        };
        
        this.getMessages = function(){
            return this.api.customGET('messages');
        };
        
        this.getReports = function(){
            return this.api.customGET('reports');
        };
    }]);
})();


