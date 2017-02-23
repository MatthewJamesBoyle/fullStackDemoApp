# Full Stack Demo App
This app demonstrates how to create a full stack app using Netflix Style micro services in Java Spring Boot that are linked, and a front end application built using AngularJS using the seed App as a base refactored for John Papa's style guide.

##Project structure
The project is split into both front end and back end components. 
The project is written in terms of a car dealsership where users can put cars up for sale.

##Getting Started
Either fork or clone the project to get started.
For ease of getting started, I reccomend using the Spring boot suite which is available here:
[https://spring.io/tools/sts]

###Backend
click  file -> import -> existing maven project. You should see a bunch of different sub projects(microservices).
Run the Gateway service first,then the discovery,then each of the other microservices).
You can now go to:
```[http://localhost:8080/cars] 
[http://localhost:8080/auction]
[http://localhost:8080/seller]
```
Appending an id to the end of this will get the details of that car/auction/seller
```
[http://localhost:8080/cars/1]
```


###frontEnd
cd into the root folder of the front end and run npm start. This will trigger and npm install and spin up the front end on port 8000.
The front end is now running.
_Note:_ You will need to enable CORS in chrome for the front end to pull data from the backend. I reccomend this chrome plugin:
```
[https://chrome.google.com/webstore/detail/allow-control-allow-origi/nlfbmbojpeacfghkpbjhddihlkkiljbi?hl=en]
````





