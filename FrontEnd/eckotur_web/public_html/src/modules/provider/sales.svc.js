(function(){
    var salesModule = angular.module('salesModule');
    
    salesModule.service('salesService', ['CRUDBase','sales.context', function(CRUDBase, context){
        this.url = context;
        CRUDBase.extendService(this);
        this.saveRecord({transactionId:1,clientId:'Julio Pepe',providerId:'Provetour',offerId:'Paseo al Amazonas',date:new Date("October 13, 2014 11:13:00"),value:200,quantity:1});
        this.saveRecord({transactionId:1,clientId:'Julio Pepe',providerId:'Provetour',offerId:'Viaje al centro de la Tierra',date:new Date("October 13, 2014 11:13:00"),value:500,quantity:2});
        this.saveRecord({transactionId:2,clientId:'Pepe',providerId:'Provetour',offerId:'Visita a los monos',date:new Date("October 13, 2014 11:13:00"),value:100,quantity:1});
        this.saveRecord({transactionId:3,clientId:'Pepe',providerId:'Provetour',offerId:'Noche en el hotel',date:new Date("October 13, 2014 11:13:00"),value:500,quantity:1});
        this.saveRecord({transactionId:4,clientId:'Yahazalim',providerId:'Provetour',offerId:'Paseo al Amazonas',date:new Date("October 13, 2014 11:13:00"),value:1000,quantity:5});
    }]);
})();

