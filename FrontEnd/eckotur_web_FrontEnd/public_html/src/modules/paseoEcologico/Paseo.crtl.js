(function () {
    var app = angular.module('PaseoEcologicoModule');
    app.controller('PaseoCtrl', ['$scope', 'CRUDUtils', 'Paseo.context', function ($scope, CRUDUtils, context) {
            this.url = context;
            CRUDUtils.extendCtrl(this, $scope);
            this.homeMode=true;
            $scope.currentRecord.sales=[];
            $scope.currentRecord.offers=[];
            $scope.currentRecord.report;
            this.saveOffer = function(pOffer){
                pOffer.nSales=0;
                var offer = angular.copy(pOffer);
                $scope.currentRecord.offers.push(offer);
                this.showOffers();
                document.getElementById("createOfferForm").reset();
            };
            this.showPaseos = function(){
                this.offersMode=true;
                this.createOfferMode=false;
                this.salesMode=false;
                this.reportMode=false;
            };
            this.showPaseos = function(){
                this.registerPaseos();
                this.salesMode=true;
                this.offersMode=false;
                this.reportMode=false;
                this.createOfferMode=false;
            };
            this.createPaseo = function(){
                this.createOfferMode=true;
                this.salesMode=false;
                this.offersMode=false;
                this.reportMode=false;
            };
            
            this.registerPaseos = function(){
                $scope.currentRecord.Paseos=[{id:'1',Paseo:"Viaje al centro de la tierra",Descripcion: "paseo guiado al centro de la tierra", available: 1,price: 100,date: new Date("October 13, 2014 11:13:00")},
                {id:'1',paseo:"Viaje al centro de la tierra",Descripcion: "paseo guiado al centro de la tierra" ,available: 1,price:200,date:new Date("December 23, 2014 12:13:00")},
                {id:'2',paseo:"Caída libre en El Salto del Ángel",Descripcion: "paseo guiado al centro de la tierra" ,available: 1,price:1000,date:new Date("November 14, 2014 11:13:00")},
                {id:'3',paseo:"Ida al Amazonas",Descripcion: "paseo guiado al centro de la tierra" ,available: 1,price:200,date:new Date("July 18, 2014 10:13:00")},
                {id:'4',paseo:"Visita con los monos",Descripcion: "paseo guiado al centro de la tierra" ,available: 1,price:100,date:new Date()},
                {id:'5',paseo:"Visita con los monos",Descripcion: "paseo guiado al centro de la tierra" ,available: 1,price:300,date:new Date()}];
            };
        }]);
})();


