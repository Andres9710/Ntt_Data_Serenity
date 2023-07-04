# Automate an online purchase

This project involves the creation and execution of a set of automated tests that simulate the purchase flow on the mentioned web page, using a specific user, adding products to the cart, filling out the purchase form and verifying the successful completion of the process until it is confirmed. show thank you message. This allows you to verify that the purchase flow works correctly and without errors.

## 1. Prerequisitos

Make sure you have the following technologies and versions installed on your local machine:

- Local machine with Windows 10 operating system
- IntelliJ IDE version 2023.1
- Maven version 3.8.6 (must be in environment variable)
- JDK version 1.8 (must be in environment variable)

## 2. Installation commands

Follow these steps to install the project dependencies in command terminal:

1. Run the following command to download all the dependencies:

mvn install -DskipTests

## 3. test run in terminal
1. Run the following command to run the test:

mvn test

2. To generate the reports, run the following command:

mvn serenity:aggregate

The reports will be available in the target/site/serenity folder

## 4. Run in IntelliJ IDE
Run the PurchaseRunner.java class 

## 5. Additional Information

-Selenium version: 3.141.59
-Serenity version: 2.1.4
-Cucumber version: 4.2.0
-JUnit version: 4.13



