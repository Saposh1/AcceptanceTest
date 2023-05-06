Feature: Hidden Section

#the documentation defines 2 scenarios of student and teacher, each scenario runs separately.

#  Scenario Outline: Student attempts quiz
#    Given Student is in Home Page
#    When Student Navigate to LogIn Page
#    And Student enters UserName <UserName> and Password <Password>
#    And Student navigate to My courses page
#    And Student navigate to Software Quality course
#    And Student navigate to Quiz
#    Then Message displayed Student in quiz page
#    Examples:
#      | UserName  | Password   |
#      | "eden"      | "Aa123456@" |
#
#  Scenario Outline: Teacher makes quiz Hidden to students
#    Given Teacher is in Home Page
#    When Teacher Navigate to LogIn Page
#    And Teacher enters UserName <UserName> and Password <Password>
#    And Teacher navigate to My courses page
#    And Teacher navigate to Software Quality course
#    And Teacher click on edit mode
#    And Teacher Click on Hidden
#    And Teacher Click on Hide
#    Then Message displayed The quiz is Hidden for students
#    Examples:
#      | UserName | Password   |
#      | "achiya"   | "Aa123456@"    |

#the nested scenario defines the story of a student entering a moodle quiz in the Software Quality course, while the teacher of the course tries to hide the quiz from students.

  Scenario Outline: Student enters quiz and Teacher hides it
    Given Teacher is in Home Page
    When Teacher Navigate to LogIn Page
    And Teacher enters UserName <UserName> and Password <Password>
    And Student is in Home Page
    And Student Navigate to LogIn Page
    And Student enters UserName <Usr> and Password <pswrd>
    And Teacher navigate to My courses page
    And Teacher navigate to Software Quality course
    And Student navigate to My courses page
    And Student navigate to Software Quality course
    And Teacher click on edit mode
    And Teacher Click on setting
    And Student navigate to Quiz
    And Teacher Click on Hide
    Then Message displayed The quiz is Hidden for students
    Examples:
      | UserName    | Password      | Usr    | pswrd       |
      | "achiya"    | "Aa123456@"   | "eden" | "Aa123456@" |