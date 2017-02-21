(function() {
'use strict';

angular.module('myApp.view3', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/view3', {
    templateUrl: 'view3/view3.html',
    controller: 'View3Ctrl',
    controllerAs: 'vm'
  });
}])
.controller('View3Ctrl', view3Controller)


    /* @ngInject */
    function view3Controller() {
        var vm = this;
        vm.submit=null;
        activate();

function submit(){
  console.log("I got hit");
}

        function activate() {
          vm.submit=submit;

        }
    }
})();
