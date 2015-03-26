(function () {
    var app = angular.module('catalogModule');
    app.controller('catalogCtrl', ['$scope', 'CRUDUtils', 'catalog.context', function ($scope, catalogService) {
            catalogService.extendCtrl(this, $scope);
            this.homeMode=true;
            
            $scope.currentRecord.offers=[];
            
            
          
            this.showOffers = function(){
                
                this.offersMode=true;                
                this.salesMode=false;
                
            };
            
           
           
               
            this.registerSales = function(){
               
               providerCtrl.registerSales();
            };
            
            this.registerBuy = function(){
                
                clientCtrl.registerBoughts();
            }
        }]);
})();
