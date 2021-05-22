package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PO_FindElements_Practice {
    public static void main(String[] args) {
        //Open Chrome Browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //if a web element is not found, this will wait up to given seconds
        // if a web element is located before 15 seconds, it will move on
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

       // We need a Locator that will return all the links on the page
        //body/a -----> this locator will return all of the links on the page
        // we are storing all of the links that are returned by findElements method
      List<WebElement> listOfLinks=  driver.findElements(By.xpath("//body//a"));

      //Print out the texts of all links
        for (WebElement each : listOfLinks) {
            System.out.println(each.getText());
            System.out.println(each.getAttribute("href"));

        }
        int numberOfLinks=listOfLinks.size();
        System.out.println("numberOfLinks = " + numberOfLinks);
    }
}
