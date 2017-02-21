(function() {
    'use strict';

    angular
        .module('myApp.view2')
        .directive('forSale', forSale);

    /* @ngInject */
    function forSale() {
        var directive = {
            restrict: 'E',
            templateUrl: '/components/forSale/forSale.html',
            scope: {
              auction:'='
            }
        }

        return directive;


    }


})();
