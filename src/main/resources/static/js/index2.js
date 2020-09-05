var app = angular.module('myApp', []);
    
app.controller('Ctrl', function($scope){
	$scope.btnChange = false;
    $scope.variable = "Press me";
    
    $scope.btnClick = function() {
    	if ($scope.btnChange) {
    		$scope.variable = "True";
    		$scope.btnChange = false;
    	} else {
    		$scope.variable = "false";
    		$scope.btnChange = true;
    	}
    }
});