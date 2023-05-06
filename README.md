# Assignment 3: Software Quality Engineering
This is a repository for assignment 3 of the Software Quality Engineering course at the [Ben-Gurion University](https://in.bgu.ac.il/), Israel.

## Assignment Description
In this assignment, we tested an open-source software called moodle (https://moodle.com).

Moodle is a free and open-source learning management system written in PHP and distributed under the GNU General Public License. Moodle is used for blended learning, distance education, flipped classroom and other online learning projects in schools, universities, workplaces and other sectors.

Moodle is used to create custom websites with online courses and allows for community-sourced plugins

## Installation
instructions on how to install the software and prepare the testing environment:
1. download the open source zip to your computer and install it.
2. download web driver suitable to your web version and install it.
3. run the web driver.
4. while the web driver is running, open the moodle exe file.
5. download selenium jar file and connect it to the dependencies of your intellij project.
6. that's it, now you can start writing your scenarios which you want to test.

## What we tested

We tested the hidden section module that allows a teacher to hide content from students. We chose to test the following user stories: 

*User story:* A student enters a quiz

*Preconditions:* There is a course with the specific student.

*Expected outcome:* The student is in the quiz.

*User story:* A teacher hides the quiz from students.

*Preconditions:* There is a course with the specific teacher and a quiz which is visible to students. the teacher is permitted edit the course.

*Expected outcome:* The quiz is hidden for students.

## How we tested
We used two different testing methods:
1. [Cucumber](https://cucumber.io/), a BDD testing framework.
2. [Provengo](https://provengo.tech/), a story-based testing framework.

Each of the testing methods is elaborated in its own directory. 

## Results
The tests succeeded, which means there were no bugs in the hidden section.
