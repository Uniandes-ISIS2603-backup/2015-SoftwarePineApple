(function () {
	var crud = angular.module('CrudModule');

	crud.factory('CRUDUtils', ['Restangular', function (RestAngular) {
			function CRUD($scope) {
				this.api = RestAngular.all(this.url);
				$scope.currentRecord = {};
				$scope.records = [];
                                
                                /*
                                $scope.providersRecords=[];
                                $scope.currentProviderRecord={};
                                $scope.sellsRecords=[];
                                $scope.currentSellRecord={};
                                $scope.offersRecords=[];
                                $scope.currentOfferRecord={};*/
                                
				this.editMode = false;
                                this.homeMode = false;
				this.fetchRecords = function () {
					/*var self = this;*/
					this.api.getList().then(function (data) {
						$scope.records = data;
						$scope.currentRecord = {};
						/*self.editMode = false;
                                                self.registerMode = false;*/
					});
				};
				this.createRecord = function () {
					this.editMode = true;
                                        this.responseMode = false;
					$scope.currentRecord = {};
				};
				this.saveRecord = function () {
					var self = this;
					if ($scope.currentRecord.id) {
						$scope.currentRecord.put().then(function () {
							self.fetchRecords();
						});
					} else {
						this.api.post($scope.currentRecord).then(function () {
							self.fetchRecords();
						});
					}
				};
				this.deleteRecord = function (record) {
					var self = this;
					record.remove().then(function () {
						self.fetchRecords();
					});
				};
                                
                                
                                
				this.editRecord = function (record) {
					$scope.currentRecord = RestAngular.copy(record);
					this.editMode = true;
                                        this.homeMode = false;
				};
                                this.fetchSellsRecords = function (){
					var self = this;
					this.api.getList().then(function (data) {
						/*$scope.sellsRecords = data;
						$scope.currentSellRecord = {};*/
                                                $scope.records = data;
                                                $scope.currentRecord = {};
						self.sellsMode = true;
                                                self.homeMode = false;
					});
				};
                                this.viewSell = function(sellRecord){
                                        var self = this;
                                        $scope.currentRecord = RestAngular.copy(sellRecord);
                                        self.sellsMode = false;
                                        self.detailedSellMode = true;
                                };
                                
                                this.fetchOffersRecords = function(){
                                    var self = this;
					this.api.getList().then(function (data) {
						/*$scope.offersRecords = data;
						$scope.currentOfferRecord = {};*/
                                                $scope.records = data;
                                                $scope.currentRecord = {};
						self.sellsMode = true;
                                                self.homeMode = false;
					});
                                };
                                this.viewOffer = function(offerRecord){
                                        var self = this;
                                        $scope.currentRecord = RestAngular.copy(sellRecord);
                                        self.catalogMode = false;
                                        self.detailedOfferMode = true;
                                }
                                this.createOfferRecord = function(){
                                    
                                };
                                this.deleteOffer = function(record){
                                    
                                };
			}
			;
			return {
				extendCtrl: function (obj, scope) {
					CRUD.call(obj, scope);
				}
			};
		}]);
})();