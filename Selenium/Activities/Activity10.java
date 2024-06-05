package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity10 {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver =new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        String PageTitle= driver.getTitle();
        System.out.println(PageTitle);
        driver.findElement(By.id("dynamicCheckbox")).click();

    }
}
