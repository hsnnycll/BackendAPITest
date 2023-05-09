Go Rest  : QA Engineer Test
============================


Author
--------
Hasan YUCEL


Aim
--------

This project was created to run tests on an API. Test cases are written using RestAssured and Cucumber. The purpose of the project can be used to make sure the API is working correctly and to find any bugs found in the API.  

Test Executions
-------- 

Prerequisites: Maven and Java installation

In order to start the tests by using Maven in your local computer, you need to follow these steps:

	1) Download the project and unzip the zip file
	2) Open the command prompt and cd until the project root directory
	3) Run the following command in the command prompt: mvn test




Overview
--------

The project is testing the following scenarios:

Verify that the user was created correctly  
Verify that the user has been updated correctly  
Verify that the user was deleted correctly  
Verify that the user is correctly listed  

Tools
-------

Java - My framework is written using Java language, 8 version.

Maven - My framework is developed as a Maven project, which is a Java-based build automation tool. Within this project, I have utilized Maven for dependency management and executing tests as "mvn goals" via the command line.

Rest Assured - It has been used to write and run API tests.

JUnit  - Is a unit testing framework for the Java programming language. JUnit has been important in the development of test-driven development

Cucumber - I utilized Cucumber to implement behavior-driven development (BDD) methodology. By utilizing Gherkin, it permits defining expected software behaviors in a logical language that customers can comprehend. Cucumber executes automated acceptance tests written in a BDD style.

Extent - My automation framework creates thorough Cucumber-html reports that are easily comprehensible even to non-technical team members. The reports contain comprehensive information on test steps, including screenshots in case of failures. With a slight modification, the framework can also provide metrics such as the percentage of tests passed, failed, skipped, and so on, if requested.

IDE - I used IntelliJ Idea in my current framework.







#   G o R e s t A P I
 # BackendAPITest
