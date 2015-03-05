(function () {
	var app = angular.module('clientModule');
	app.controller('clientCtrl', ['$scope', 'CRUDUtils', 'client.context', function ($scope, CRUDUtils, context) {
			this.url = context;
			CRUDUtils.extendCtrl(this, $scope);
                        this.purchasesMode=false;
                        $scope.currentRecord.boughts=[];
                        
                        
                        this.showCart = function(){
                            this.purchasesMode=true;
                            var bought=0;
                            this.registerBoughts();
                            for(var i=0;i<$scope.currentRecord.boughts.length;i++){
                                bought+=$scope.currentRecord.boughts[i].price;
                            }
                            document.getElementById("totalOfEarnings").innerHTML="<label>Total of bought: "+bought+"</label>";
                        };
                        this.showPurchases = function(){
                            alert("hola");
                            this.purchasesMode=true;
                            var bought=0;
                            this.registerBoughts();
                            for(var i=0;i<$scope.currentRecord.boughts.length;i++){
                                bought+=$scope.currentRecord.boughts[i].price;
                            }
                            document.getElementById("totalOfEarnings").innerHTML="<label>Total of bought: "+bought+"</label>";
                        };
                        this.registerBoughts = function(){
                            $scope.currentRecord.boughts=[{id:'1',offer:"20.000 Leguas de Viaje Submarino",provider:"Verne Enterprices",quantity:"1",price:"$100",date:'05/03/2015'},
                            {id:'1',offer:"20.000 Leguas de Viaje Submarino",provider:"Verne Enterprices",quantity:"2",price:"$100 US",date:'05/03/2015'},
                            {id:'2',offer:"Extremo Villa de Leyva",provider:"Alcaldia de Villa de Leyva",quantity:"2",price:"$1000",date:'02/03/2015'},
                            {id:'3',offer:"Ida al Amazonas",Provider:"Templo del indio amazonico",quantity:"3",price:"$200",date:'01/03/2015'}];
                        };
                        
		}]);
})();
