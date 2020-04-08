var app = angular.module('EsportEvent', []);
app.controller('EsportController', function($scope, $location, $http) {
			$scope.name = "";
			$scope.surname = "";
			$scope.email = "";
			$scope.password = "";
			$scope.id = "";
			$scope.description = "";
			$scope.participantInfo = "";
			
			$scope.hidelogin = false;
			$scope.hideAcc = true;
			
			
			$scope.login = function() {
				var body = {
					email : $scope.email,
					password : $scope.password,
				};
				
				$http.post('http://localhost:8080/login', body, {headers : {'Content-Type' : 'application/json'},'Accept' : 'application/json'}
				).then(function onSuccess(data) {
					console.log("Loging Request");
					console.log(data.data);
					$scope.id = data.data.id;
					$scope.name = data.data.name;
					$scope.surname = data.data.surname;
					$scope.email = data.data.email;
					$scope.password = data.data.password;
					$scope.description = data.data.description;
					$scope.participantInfo = data.data.participantInfo;
					$scope.hidelogin = true;
					$scope.hideAcc = false;
				}, function onError(err) {
					// do something on error
				});
			};
			
			$scope.register = function() {
				var body = {
					name : $scope.name,
					surname: $scope.surname,
					email : $scope.email,
					password : $scope.password,
					id : $scope.id,
					description : $scope.description,
					participantInfo : $scope.participantInfo
				};
				
				$http.post('http://localhost:8080/register', body, {headers : {'Content-Type' : 'application/json'},'Accept' : 'application/json'}
				).then(function onSuccess(data) {
					//console.log(data);
					//console.log(data.data);
					$scope.id = data.data;
					$http({
					    url: 'http://localhost:8080/accounts', 
					    method: "GET",
					    params: {id: $scope.id}
					 }).then(function(response) {
						console.log("Register Info:");
						console.log(data.config.data);
						$scope.name = data.config.data.name;
						$scope.surname = data.config.data.surname;
						$scope.email = data.config.data.email;
						$scope.password = data.config.data.password;
						$scope.description = data.config.data.description;
						$scope.hidelogin = true;
						$scope.hideAcc = false;
					 });
				}, function onError(err) {
					// do something on error
				});
			};
			
			
		});
