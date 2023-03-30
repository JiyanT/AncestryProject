 (IDE): IntelliJ IDEA<br>
Building Dependency Tool: Maven <br>
 Managing project dependencies: pom.xml file<br>
Testing Tool: TestNG<br>
Serialization and deserialization: Jackson Library <br>

The project is mainly divided in two parts for development and test

Part 1 :<br>
The main class for this project is called DataScienceInterviewTest. To create the JSON payload, the project uses the PayloadBuilder class. There is one package POJO that contains the pojo classes for serialize the Json payload.The JSON payload is organized using several classes, including Meta, Payload, PayloadData, Responses, and Status. These classes help to structure and organize the payload data efficiently and maintainable.

Payload builder was generated the json payload and in the class DataScienceInterviewTest was excluded the serialization process.<br>

EXECUTION: The part one executed from the testJsonSerialization method in the class DataScienceInterviewTest. 

Part 2 :<br>
actual_response.json and expected_values.json were read .manipulation of the payload on both files was needed to get probability of both for the comparison
The soft assertion was used for compare the values of probability and have graceful fail.<br>

EXECUTION: The method testProbability in the MyTest class helped to execute.