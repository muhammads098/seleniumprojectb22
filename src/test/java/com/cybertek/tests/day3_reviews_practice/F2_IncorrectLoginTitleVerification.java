package com.cybertek.tests.day3_reviews_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectLoginTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");

        WebElement inputUsername=driver.findElement(By.id("email"));

        inputUsername.sendKeys("something123@gmail.com");

        WebElement inputPassword=driver.findElement(By.id("pass"));

        inputPassword.sendKeys("Sheesh123"+ Keys.ENTER);

        Thread.sleep(3000);

        String expectedTitle="Log into Facebook";
        String actualTitle=driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Failed!!!!");
        }


    }
}
