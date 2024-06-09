package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity1 {

    AndroidDriver driver;

    @BeforeClass
    public void Setup() throws MalformedURLException {

        UiAutomator2Options caps = new UiAutomator2Options().setPlatformName("Android").
                setAutomationName("UiAutomator2").setAppPackage("com.sec.android.app.popupcalculator").
                setAppActivity(".Calculator").noReset();

        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL, caps);
    }

    @Test
    public void MultiplyTest() {

        driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_07")).click();

        driver.findElement(AppiumBy.accessibilityId("Multiplication")).click();
        driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_06")).click();
        driver.findElement(AppiumBy.accessibilityId("Equal")).click();

        String Value = driver.findElement(AppiumBy.id("com.sec.android.app.popupcalculator:id/calc_tv_result")).getText();
        System.out.println(Value);
        Assert.assertEquals(Value, "42");

    }

    @AfterClass
    public void CleanUp() {
        driver.quit();
    }
}



