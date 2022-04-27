# springboot-rabbitmq-Assignment:

>-  ```coustmer```  is the microservice to produce messages to the queue when the customer is created.
>- ```coustmer service``` is the microservice to consume messages from the queue when the customer is created.
>- coustmer-service has an embeded h2 database to store the customer data.
### EndPoints:
>-  To get the sample coustmer details ```localhost:9292/order/get```
>- The customer can be Created at url : ```localhost:9292/order/``` in post request. the content type is application/json.
>- The body of the request is the customer object.
>- The response is the Success message.
---

### The customer Object is as follows:
```
 {
 "customerID": String,
 "name": String,
 "age" : Integer,
 "MobileNumber": String}```