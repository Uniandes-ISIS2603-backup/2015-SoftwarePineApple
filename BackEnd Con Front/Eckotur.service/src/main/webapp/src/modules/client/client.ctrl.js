(function () {
	var app = angular.module('clientModule');
	app.controller('clientCtrl', ['$scope', 'CRUDUtils', 'client.context', function ($scope, CRUDUtils, context) {
			this.url = context;
			CRUDUtils.extendCtrl(this, $scope);
                        this.purchasesMode=false;
                        this.offersMode = false;
                        this.cartMode = false;
                        $scope.currentRecord.boughts=[];
                        $scope.currentRecord.lclOffers = [];
                        $scope.currentRecord.inCart = [];
                        //this.registerBoughts();
                       // this.registerOfferts();
                        var startAll = false;
                        
                        this.start = function(){
                            if(startAll === false){
                                this.registerBoughts();
                                this.registerOfferts();
                                startAll = true;
                            }
                        };
                        
                        this.showCart = function(){
                            this.purchasesMode=false;
                            this.offersMode=false;
                            this.cartMode = true;
                            this.start();
                          };
                        this.showPurchases = function(){
                            if(this.purchasesMode===true){this.purchasesMode=false;}
                            else{this.purchasesMode=true;}
                            this.offersMode = false;
                            this.cartMode = false;
                            this.start();
                             };
                        
                        this.showOffers = function(){
                           this.start();
                           if(this.offersMode===true){this.offersMode=false;}
                            else{this.offersMode=true;}
                            this.purchasesMode = false;
                            this.cartMode=false;
                            
                        };
                        this.addToCart= function(offer){
                            this.start();
                            var newBou ={id:offer.id,offer:offer.name, provider:offer.provider ,quantity:"1",price: offer.price ,date:'05/03/2015'};
                            $scope.currentRecord.inCart.push(newBou);
                           // this.offersMode = false;
                         //   this.purchasesMode = true;
                            
                        };
                                               
                        this.registerOfferts = function(){
                            $scope.currentRecord.lclOffers=[{id:'11', name:'Sierra nevada', price:"$150 US", type:"EcoTour",  provider:"Alcaldia SantaMarta",details:"tres dias recorriendo la sierra nevada .. "},
                                {id:'12', name:'San Agustin  ', price:"$350 US", type:"EcoTour", provider:"Viajes al pasado  ", details:"Cinco dias recorriendo San Agustin.. "},
                                {id:'13', name:'Tour sabana de Bogota  ', price:"$50 US", type:"EcoTour", provider:"Tourcito Ltda.", details:"minas de sal y pueblos aledaños"},
                                {id:'14', name:'Excursion a la Guajira', price:"$500 US", type:"EcoTour", provider:"Wayuu Inc", details:"Recorrido motorizado por la guajira, interaccion con los Wayuu "}
                            ];
                            
                        };
                        this.registerBoughts = function(){
                            $scope.currentRecord.boughts=[{id:'1',offer:"10.000 Leguas de Viaje Submarino",provider:"Verne Enterprices",quantity:"1",price:"$50 US",date:'05/03/2015'},
                            {id:'1',offer:"20.000 Leguas de Viaje Submarino",provider:"Verne Enterprices",quantity:"2",price:"$100 US",date:'05/03/2015'},
                            {id:'2',offer:"Extremo Villa de Leyva",provider:"Alcaldia de Villa de Leyva",quantity:"2",price:"$1000 US",date:'02/03/2015'},
                            {id:'3',offer:"Ida al Amazonas",provider:"Templo del indio amazonico",quantity:"3",price:"$200 US",date:'01/03/2015'}];
                        };
                        
		}]);
})();
