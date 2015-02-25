(function () {
	var crud = angular.module('CrudModule');

	crud.factory('CRUDUtils', ['Restangular', function (RestAngular) {
			function CRUD($scope) {
				this.api = RestAngular.all(this.url);
				$scope.currentRecord = {};
				$scope.records = [];
				this.editMode = false;
                                this.responseMode = false;
				this.fetchRecords = function () {
					var self = this;
					this.api.getList().then(function (data) {
						$scope.records = data;
						$scope.currentRecord = {};
						self.editMode = false;
					});
				};
                                this.mostPopulatedCountry = function() {
                                    var pop=-1;
                                    var country;
                                    if($scope.records.length==0)
                                    {
                                        alert("No data in the system");
                                    }
                                    else
                                    {
                                        for(var i = 0; i < $scope.records.length; i++){
                                            if($scope.records[i].population>pop){
                                                pop=$scope.records[i].population;
                                                country=$scope.records[i];
                                            }
                                        }
                                        document.getElementById("mostPopulated").innerHTML="<label>The most populated country is: "+country.name+"</label>";
                                    }
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
                                        this.responseMode = false;
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