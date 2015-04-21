(function(){
    var clientModule = angular.module('clientModule');
    
    clientModule.service('clientService', ['CRUDBase','client.context', function(CRUDBase, context){
            this.url = context;
            CRUDBase.extendService(this);
    }]);
})();
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


