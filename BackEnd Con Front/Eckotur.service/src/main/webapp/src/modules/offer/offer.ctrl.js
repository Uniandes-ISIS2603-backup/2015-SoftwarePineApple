(function () {
    var providerModule = angular.module('offerModule');
    providerModule.controller('offerCtrl', ['$scope', 'offerService', function ($scope, offerService) {
        offerService.extendCtrl(this, $scope);
        
        
        $scope.currentRecord.offers=[];

        
        this.addOffer = function(pOffer){
            $scope.currentRecord.offers.push(pOffer);
        };
        
        
        this.registerSales = function(){
            $scope.currentRecord.offers=[{id:'1',offer:"Viaje al centro de la tierra",buyer:"Julio Pepe",quantity:1,price:100,date:new Date("October 13, 2014 11:13:00")},
            {id:'1',offer:"Viaje al centro de la tierra",buyer:"Julian Verne",quantity:2,price:200,date:new Date("December 23, 2014 12:13:00")},
            {id:'2',offer:"Caída libre en El Salto del Ángel",buyer:"Pepe Pérez",quantity:2,price:1000,date:new Date("November 14, 2014 11:13:00")},
            {id:'3',offer:"Ida al Amazonas",buyer:"Andrés Angelino",quantity:3,price:200,date:new Date("July 18, 2014 10:13:00")},
            {id:'4',offer:"Visita con los monos",buyer:"Yodeb Yahazalim",quantity:1,price:100,date:new Date()},
            {id:'5',offer:"Visita con los monos",buyer:"Yodeb Yahazalim",quantity:2,price:300,date:new Date()}];
        };
        
        
    }]);
})();


