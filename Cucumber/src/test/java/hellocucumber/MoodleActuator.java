package hellocucumber;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoodleActuator {
    private WebDriver driver;
    private WebDriverWait wait;

    public MoodleActuator() {
    }

    public void initSession(String webDriver, String path) {
        System.setProperty(webDriver, path);
        this.driver = new ChromeDriver();
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(40L));
        this.driver.get("http://localhost/");
        this.driver.manage().window().maximize();
        System.out.println("Driver setup finished for - " + this.driver.getTitle());
    }

    public void goToLogin() {
        this.driver.findElement(By.linkText("Log in")).click();
    }

    public void enterLoginInfo(String username, String password) {
        ((WebElement)this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='username']")))).sendKeys(new CharSequence[]{username});
        this.driver.findElement(By.xpath("//*[@name='password' and @type='password']")).sendKeys(new CharSequence[]{password});
        this.driver.findElement(By.id("loginbtn")).click();
    }

    public void editModeOn() {
        ((WebElement)this.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@type='checkbox' and @name='setmode']")))).click();
    }

    public void myCoursesTab() {
        WebElement myCoursesTab = this.driver.findElement(By.xpath("//*[contains(text(),'My courses') and @role='menuitem']"));
        myCoursesTab.click();
    }

    public void goToCourse(String courseName) {
        ((WebElement)this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='multiline' and contains(text(),'" + courseName + "')]")))).click();
    }

    public void enterQuiz() {
        this.driver.findElement(By.xpath("//*[@id=\"module-2\"]/div/div[1]/div/div[1]/div/div[2]/div[2]/a")).click();
    }

    public void hidden() {
        ((WebElement)this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[5]/div/div[3]/div/section/div/div/div/ul/li[1]/div[2]/ul/li[2]/div/div[1]/div[2]/div/div/div/div/a/i")))).click();
    }
    public void hide() {
        this.driver.findElement(By.xpath("//*[@id=\"action-menu-3-menu\"]/a[3]/i")).click();
    }

    public void assertQuiz() {
        String text=((WebElement)this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[4]/div/div[2]/div/section/div[2]/div[1]/p")))).getText();
        assert (text == "Grading method: Highest grade");
    }

    public void assertHidden() {
        String text=((WebElement)this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[5]/div/div[3]/div/section/div/div/div/ul/li[1]/div[2]/ul/li[2]/div/div[2]/span")))).getText();
        assert (text == "Hidden from students");
    }
}
