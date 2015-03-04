(function () {
	var app = angular.module('providerModule');
	app.controller('providerCtrl', ['$scope', 'CRUDUtils', 'provider.context', function ($scope, CRUDUtils, context) {
			this.url = context;
			CRUDUtils.extendCtrl(this, $scope);
			this.homeMode=true;
                        /*
                        this.showOffers = function(){
                            this.url='offer.context';
                            CRUDUtils.extendCtrl(this, $scope);
                            alert($scope.records.length);
                            this.fetchRecords();
                            this.offersMode=true;
                            this.salesMode=false;
                        }*/
                        this.showSales = function(){
                            var earnings=0;
                            this.registerSales();
                            for(var i=0;i<$scope.currentRecord.sales.length;i++){
                                earnings+=$scope.currentRecord.sales[i].price;
                            }
                            document.getElementById("totalOfEarnings").innerHTML="<label>Total of earnings: "+earnings+"</label>"
                            this.salesMode=true;
                            this.offersMode=false;
                        }
                        this.registerSales = function(){
                            $scope.currentRecord.sales=[{id:'1',offer:"Viaje al centro de la tierra",buyer:"Julio Pepe",quantity:"1",price:"$100",date:'01/03/2015'},
                            {id:'1',offer:"Viaje al centro de la tierra",buyer:"Julian Verne",quantity:"2",price:"$200",date:'04/03/2015'},
                            {id:'2',offer:"Caída libre en El Salto del Ángel",buyer:"Pepe Pérez",quantity:"2",price:"$1000",date:'02/03/2015'},
                            {id:'3',offer:"Ida al Amazonas",buyer:"Andrés Angelino",quantity:"3",price:"$200",date:'01/03/2015'}];
                        }
		}]);
})();


