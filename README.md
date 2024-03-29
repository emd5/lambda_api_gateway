# Lambda with API Gateway

## Author 

Liz Mahoney

## Deployed Link

https://kq3emr6iib.execute-api.us-west-2.amazonaws.com/repeatedWord?inputWord=summer%20it%20is%20summer
    - The above link should return `summer`.

## Getting Started

***Create A jar file***

Run : `./gradlew jar`

***In build.gradle***

** Make sure this application is Java 8 before uploading to AWS lambda!
- Add this to bottom of file:

    ```
    apply plugin: 'java'
    sourceCompatibility = 1.8
    targetCompatibility = 1.8
    ```
    
Find it in `build` > `libs` > `lambda_api_gateway.jar`

Go to AWS Lambda console
- create a new function
- select Java 8
- upload `lambda_api_gateway.jar` file

## Feature Tasks
- [x] A user should be able to find the first repeated word in a sentence by visiting a URL.
    - [x] That URL should use API Gateway to call a Lambda function that finds the first repeated word in a sentence.
    - [x] You should use a query string parameter to pass in the sentence data.
    
## Test (API Gateway)

![Test for Repeated word on API Gateway](./src/main/resources/testRepeated.png)

