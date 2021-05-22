package com.cybertek.tests.day3_reviews_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F4_AttributeValueVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.facebook.com");

        WebElement createPageLink = driver.findElement(By.linkText("Create a Page"));

        String expectedInHref="registration_form";
        String actualInHref=createPageLink.getAttribute("href");

        System.out.println("actualInHref = " + actualInHref);

        if (actualInHref.contains(expectedInHref)){
            System.out.println("HREF value verification passed");
        }else{
            System.out.println("failed");
        }

    }
}
