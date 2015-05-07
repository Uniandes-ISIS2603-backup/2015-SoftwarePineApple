(function(){
    var sportModule = angular.module('offerModule');
    
    sportModule.service('offerService', ['CRUDBase','offer.context', function(CRUDBase, context){
            this.url = context;
            CRUDBase.extendService(this);
    }]);
})();
