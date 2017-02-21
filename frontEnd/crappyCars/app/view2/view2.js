(function() {
'use strict';

angular.module('myApp.view2', ['ngRoute','ngResource'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/view2', {
    templateUrl: 'view2/view2.html',
    controller: 'View2Ctrl',
    controllerAs:'vm'
  });
}])

.controller('View2Ctrl',view2Controller)

view2Controller.$inject=[
  '$resource'
];

    function view2Controller($resource) {
        var vm = this;
         vm.cars= null;

        activate();

        function getAllCarsForSale(){
          var remote = $resource('http://localhost:8080/auction');
          return remote.query().$promise.then(function(result){
            vm.cars=result;
          });
        }

        function activate() {
          getAllCarsForSale();

        }
    }
})();
