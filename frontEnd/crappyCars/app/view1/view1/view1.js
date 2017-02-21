(function() {
'use strict';

angular.module('myApp.view1', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/view1', {
    templateUrl: 'view1/view1.html',
    controller: 'View1Ctrl',
    controllerAs: 'vm'
  });
}])
.controller('View1Ctrl', viewController)


    /* @ngInject */
    function viewController() {
        var vm = this;
        vm.reviews=null;
        activate();

        function activate() {
          vm.reviews= [
            {name:"Matt Boyle",url:"https://pbs.twimg.com/profile_images/640760380034293760/3NlnmX7U.jpg",description:"A crappier car I did never own"},
            {name:" Alex Cromer",url:"http://previews.123rf.com/images/oocoskun/oocoskun1309/oocoskun130900174/22438562-Happy-guy-with-sombrero-hat-laughing-out-loud-with-his-eyes-closed-Stock-Photo.jpg",description:"My car broke after 4 minutes"},
            {name:"Sam Cusson",url:"http://www.etdconsultingllc.com/images/bigstockphoto/bigstock_Portrait_Of_A_Happy_Guy_Relaxi_6639408.jpg",description:"I didn't even make it home!"}
          ];


        }
    }
})();
