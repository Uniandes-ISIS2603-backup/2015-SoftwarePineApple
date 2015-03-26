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
                $scope.currentRecord.sales=[{id:'1',offer:"Viaje al centro de la tierra",buyer:"Julio Pepe",quantity:1,price:100,date:new Date("October 13, 2014 11:13:00")},
                {id:'1',offer:"Viaje al centro de la tierra",buyer:"Julian Verne",quantity:2,price:200,date:new Date("December 23, 2014 12:13:00")},
                {id:'2',offer:"Caída libre en El Salto del Ángel",buyer:"Pepe Pérez",quantity:2,price:1000,date:new Date("November 14, 2014 11:13:00")},
                {id:'3',offer:"Ida al Amazonas",buyer:"Andrés Angelino",quantity:3,price:200,date:new Date("July 18, 2014 10:13:00")},
                {id:'4',offer:"Visita con los monos",buyer:"Yodeb Yahazalim",quantity:1,price:100,date:new Date()},
                {id:'5',offer:"Visita con los monos",buyer:"Yodeb Yahazalim",quantity:2,price:300,date:new Date()}];
            };
            
            this.registerBuy = function(){
                
            }
        }]);
})();
