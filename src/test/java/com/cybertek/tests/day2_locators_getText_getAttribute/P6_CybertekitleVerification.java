package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_CybertekitleVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/inputs");
        driver.findElement(By.className("nav-link")).click();

        Thread.sleep(3000);

       String expectedTitle="Practice";
       String actualTitle= driver.getTitle();

       if (actualTitle.equals(expectedTitle)){
           System.out.println("PASSED!");
       }else{
           System.out.println("FAILED!");
        }

    }
}
