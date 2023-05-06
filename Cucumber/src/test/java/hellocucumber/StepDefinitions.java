package hellocucumber;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class StepDefinitions {
    private String TEACHER_USERNAME = "achiya";
    private String TEACHER_PASSWORD = "Aa123456@";
    private static List<MoodleActuator> allMoodles;
    private static MoodleActuator moodle;
    private static MoodleActuator moodleS;
    private String webDriver = "webdriver.chrome.driver";
    private String path = "C:\\Users\\USER\\Desktop\\project\\sqe-hw3-main\\sqe-hw3-main\\Selenium\\chromedriver.exe";

    /**
     *  The moodleInit function defines the selenium actions for opening moodle session.
     */
    public void moodleInit() {
        System.out.println("--------------- INITIALIZING MOODLE TEST - OPENING WEBPAGE ---------------");
        if(allMoodles == null){
            allMoodles = new ArrayList<>();
        }
        moodle = new MoodleActuator();
        allMoodles.add(moodle);
        moodle.initSession(webDriver, path);
    }

    /**
     *  The moodleInitS function defines the selenium actions for opening another moodle session.
     */
    private void moodleInitS() {
        System.out.println("--------------- INITIALIZING MOODLE TEST - OPENING WEBPAGE ---------------");
        if(allMoodles == null){
            allMoodles = new ArrayList<>();
        }
        moodleS = new MoodleActuator();
        allMoodles.add(moodleS);
        moodleS.initSession(webDriver, path);
    }

    /**
     *  The init function defines the action of calling to the function of opening moodle session.
     */
    @Given("^Teacher is in Home Page$")
    public void init(){
        moodleInit();
    }

    /**
     *  The studentIsInHomePage function defines the action of calling to the function of opening another moodle session.
     */
    @And("^Student is in Home Page$")
    public void studentIsInHomePage(){ moodleInitS(); }

    /**
     *  The navigateToLogin function defines the action of calling to the function of go to login page of moodle.
     */
    @When("^Teacher Navigate to LogIn Page$")
    public void navigateToLogin(){
        moodle.goToLogin();
    }

    /**
     *  The enterLoginInfo function defines the action of entering the username and password info in the login page in moodle.
     */
    @When("^Teacher enters UserName \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void enterLoginInfo(String username, String password) {
        moodle.enterLoginInfo(username, password);
    }

    /**
     *  The userNavigateToMyCoursesPage function defines the action of entering the my courses tab in moodle.
     */
    @And("Teacher navigate to My courses page")
    public void userNavigateToMyCoursesPage() {
        moodle.myCoursesTab();
    }

    /**
     *  The userNavigateToSoftwareQualityCourse function defines the action of entering the software quality course in moodle.
     */
    @And("Teacher navigate to Software Quality course")
    public void userNavigateToSoftwareQualityCourse() {
        String arg="Software Quality";
        moodle.goToCourse(arg);
    }

    /**
     *  The userNavigateToQuiz function defines the action of entering the quiz in moodle.
     */
    @And("User navigate to Quiz")
    public void userNavigateToQuiz() {
        moodle.enterQuiz();
    }

    /**
     *  The messageDisplayedStudentInQuizPage function prints "Student in quiz page".
     */
    @Then("Message displayed Student in quiz page")
    public void messageDisplayedStudentInQuizPage() {
        System.out.println("Student in quiz page");
    }

    /**
     *  The userClickOnHidden function defines the action of clicking the setting option of the quiz in moodle.
     */
    @And("Teacher Click on setting")
    public void userClickOnHidden() {
        moodle.hidden();
    }

    /**
     *  The userClickOnHide function defines the action of clicking the hide option on setting of quiz in moodle.
     */
    @And("Teacher Click on Hide")
    public void userClickOnHide() {
        moodle.hide();
    }

    /**
     *  The messageDisplayedTheQuizIsHiddenForStudents function prints "The quiz is Hidden for students".
     */
    @Then("Message displayed The quiz is Hidden for students")
    public void messageDisplayedTheQuizIsHiddenForStudents() {
        moodle.assertHidden();
        System.out.println("The quiz is Hidden for students");
    }

    /**
     *  The userClickOnEditMode function defines the action of clicking the edit mode bottom in moodle.
     */
    @And("Teacher click on edit mode")
    public void userClickOnEditMode() {
        moodle.editModeOn();
    }

    /**
     *  The studentNavigateToLogInPage function defines the action of going to login page in moodle.
     */
    @And("^Student Navigate to LogIn Page$")
    public void studentNavigateToLogInPage() {
        moodleS.goToLogin();
    }

    /**
     *  The studentEntersUserNameUserNameAndPasswordPassword function defines the action of entering user and password info in login page in moodle.
     */
    @And("^Student enters UserName \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void studentEntersUserNameUserNameAndPasswordPassword(String username, String password) {
        moodleS.enterLoginInfo(username, password);
    }

    /**
     *  The studentNavigateToMyCoursesPage function defines the action of pressing the my courses tab in moodle.
     */
    @And("^Student navigate to My courses page$")
    public void studentNavigateToMyCoursesPage() {
        moodleS.myCoursesTab();
    }

    /**
     *  The studentNavigateToSoftwareQualityCourse function defines the action of entering the software quality course in moodle.
     */
    @And("^Student navigate to Software Quality course$")
    public void studentNavigateToSoftwareQualityCourse() {
        String arg="Software Quality";
        moodleS.goToCourse(arg);
    }

    /**
     *  The studentNavigateToQuiz function defines the action of entering the quiz in moodle.
     */
    @And("^Student navigate to Quiz$")
    public void studentNavigateToQuiz() {
        moodleS.enterQuiz();
        moodleS.assertQuiz();
    }
}
