# Testing moodle using Cucumber
This directory contains the cucumber files for testing the hidden section module of the moodle application.

## Running the tests
Run ```mvn test``` to run all the tests.

## Feature file
The behaviors that we tested are in the feature files that inside the [resources/hellocucumber](resources/hellocucumber) directory. See the files for a detailed description of the tests.

## Step file
The step files in the [src/test/java/hellocucumber](src/test/java/hellocucumber) directory contain the code that defines how each sentence in the feature file is translated to Selenium actions. See the file for a detailed description of the implementation.
