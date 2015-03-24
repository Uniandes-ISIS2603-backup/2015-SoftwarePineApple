(function () {
    var providerModule = angular.module('providerModule');
    providerModule.controller('providerCtrl', ['$scope', 'providerService', function ($scope, providerService) {
        providerService.extendCtrl(this, $scope);
        $scope.currentRecord.sales=[];
        $scope.currentRecord.offers=[];
        $scope.currentRecord.reports=[];
        $scope.currentRecord.nReports=0;
        this.saveOffer = function(pOffer){
            pOffer.nSales=0;
            var offer = angular.copy(pOffer);
            $scope.currentRecord.offers.push(offer);
            this.showOffers();
            document.getElementById("createOfferForm").reset();
        };
        this.showOffers = function(){
            this.offersMode=true;
            this.createOfferMode=false;
            this.salesMode=false;
            this.reportMode=false;
        };
        this.showSales = function(){
            this.registerSales();
            this.salesMode=true;
            this.offersMode=false;
            this.reportMode=false;
            this.createOfferMode=false;
        };
        this.createOffer = function(){
            this.createOfferMode=true;
            this.salesMode=false;
            this.offersMode=false;
            this.reportMode=false;
        };
        this.thisMonthReport = function(){
            this.registerSales();
            var c=0;
            var t=0;
            var bestSelledOffer;
            var bestSelledOfferN=0;
            var bestClient;
            var bestClientN=0;
            var d=new Date();
            for(var i=0;i<$scope.currentRecord.sales.length;i++){
                if($scope.currentRecord.sales[i].date.getMonth()===d.getMonth()){
                    var thisOfferN=0;
                    var thisClientN=0;
                    c++;
                    t+=$scope.currentRecord.sales[i].price;
                    for(var j=0;j<$scope.currentRecord.sales.length;j++){
                        if($scope.currentRecord.sales[i].offer===$scope.currentRecord.sales[j].offer&&$scope.currentRecord.sales[j].date.getMonth()===d.getMonth()){
                            thisOfferN++;
                        }
                    }
                    for(var j=0;j<$scope.currentRecord.sales.length;j++){
                        if($scope.currentRecord.sales[i].buyer===$scope.currentRecord.sales[j].buyer&&$scope.currentRecord.sales[j].date.getMonth()===d.getMonth()){
                            thisClientN++;
                        }
                    }
                    if(bestSelledOfferN<=thisOfferN){
                        bestSelledOfferN=thisOfferN;
                        bestSelledOffer=$scope.currentRecord.sales[i].offer;
                    }
                    if(bestClientN<=thisClientN){
                        bestClientN=thisClientN;
                        bestClient=$scope.currentRecord.sales[i].buyer;
                    }
                }
            }
            if($scope.currentRecord.nReports===0||(!$scope.currentRecord.reports[$scope.currentRecord.nReports-1].month===d.getMonth()||$scope.currentRecord.reports[$scope.currentRecord.nReports-1].year!==d.getYear())){
                $scope.currentRecord.reports.push({month:d.getMonth(),year:d.getYear(),totalSales:c,earnings:t,bestSelledOffer:bestSelledOffer,bestSelledOfferN:bestSelledOfferN,bestClient:bestClient,bestClientN:bestClientN});
                $scope.currentRecord.nReports++;
            }
            alert($scope.currentRecord.nReports)
            this.reportMode=true;
            this.offersMode=false;
            this.createOfferMode=false;
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
    }]);
})();


