(function() {
    'use strict';

    angular
        .module('myApp.view1')
        .directive('reviewPage', reviewPage);

    /* @ngInject */
    function reviewPage() {
        var directive = {
            restrict: 'E',
            templateUrl: '/components/reviews/reviews.html',
            scope: {
              review:'='
            }
        }
        return directive;

    }



})();
