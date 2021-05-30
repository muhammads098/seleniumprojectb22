package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WindowPractice {
    WebDriver driver;
    //String str1;

    /*
    1. Open Chrome browser
    2. Go to http://practice.cybertekschool.com/dropdown
     */
    @BeforeClass
    public void setupClass() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");
    }
    @Test
    public void window_test(){
        String mainHandle= driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);
        
        
        String actualTitleBeforeClick= driver.getTitle();
        String expectedTitleBeforeClick="Practice";

        System.out.println("actualTitleBeforeClick = " + actualTitleBeforeClick);

        WebElement clickHereLink= driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            System.out.println("Current title while switching: "+driver.getTitle());
        }
        
        String actualTitleAfterClick= driver.getTitle();
        System.out.println("actualTitleAfterClick = " + actualTitleAfterClick);

    }
}


