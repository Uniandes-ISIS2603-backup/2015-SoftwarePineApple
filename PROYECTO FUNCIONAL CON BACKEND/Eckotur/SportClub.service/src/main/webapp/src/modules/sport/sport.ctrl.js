(function (angular) {
    var sportModule = angular.module('sportModule');

    sportModule.controller('sportCtrl', ['$scope', 'sportService','countryService','$location', function ($scope, sportService, countryService, $location) {
            sportService.extendCtrl(this, $scope);
            this.fetchRecords();
            this.getAvgAge = function (sport) {
                return (sport.minAge + sport.maxAge) / 2;
                
            };
            countryService.fetchRecords().then(function(data){
                $scope.countryRecords = data;
            });
            
            
            $scope.getRandomSpan = function(){
                return Math.floor((Math.random()*6)+1);
            };
            
            this.getCountryName = function(id){
                for (var i in $scope.countryRecords) {
                    if ($scope.countryRecords[i].id === id) {
                        return $scope.countryRecords[i].name;
                    }
                }
                return;
            };
            
            this.isOffer = function(sport) {
              
              if (typeof sport.description !== "undefined" && typeof sport.idSale === "undefined" ) {
                  return true;
              } else {
                  return false;
              }
                
            };
            
            
            
            this.isSale = function(sport) {
              if (typeof sport.idSale !== "undefined") {
                  return true;
              } else {
                  return false;
              }
                
            };
            
            this.sameID = function(id) {
                var full = $location.absUrl();
                full = full.split("#")[2];
                full = full.split("=")[1];
                
              if (full == id) {
                  return true;
              } else {
                  return false;
              }
                
            };
            
            this.verifyLogin = function(userLogin, userPass) {
                
                if (typeof userLogin !== "undefined" && typeof userPass !== "undefined") {
                
                sportService.fetchRecords().then(function(data){
                    
                   
                    var found = 0;
                    for (i in data) {
                        if (data[i].userName === userLogin && data[i].password === userPass) {
                            alert("You are a valid user, you are now logged in");
                            window.location = 'index.html';
                        } 
                    }
                    
                    if (found !== 1) {
                        alert("Wrong Credentials");
                    }
                    
                    
                });
                } else {
                        alert("Empty Fields");
                }
            };
            
            
            this.isUser = function(record) {
                if (typeof record.password !== "undefined") {
                  return true;
              } else {
                  return false;
              }
            };
            
            this.isCart = function(sport) {
              if (typeof sport.quantity !== "undefined"  && typeof sport.name === "undefined") {
                  return true;
              } else {
                  return false;
              }
                
            };
            
        }]);
})(window.angular);