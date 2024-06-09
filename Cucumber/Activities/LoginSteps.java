package StepDefinations;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginSteps extends BaseClass {
    @BeforeAll
    public static void setup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterAll
    public static void cleanup()
    {
        driver.quit();
    }

    @Given("the user is on login page")
    public void LoginPage() {
        driver.get("https://v1.training-support.net/selenium/login-form");
        Assertions.assertEquals("Login Form", driver.getTitle());

    }

    @When("user enter user name and password")
    public void enterCredential() {
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");

    }

    @And("clicks submit button")
    public void clickSubmit() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }

    @Then("get the confirmations text and verify")
    public void confirmations() {
        String message = driver.findElement(By.id("action-confirmation")).getText();
        Assertions.assertEquals("Welcome Back, admin", message);


    }
    @When("the user enter {string}and {string }")

}
