package com.cybertek.tests.day4_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_WebOrdersLogin {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String expectedTitle="Web Orders Login";
        String actualTitle=driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Login page title verification passed");
        }else{
            System.out.println("login page title verification failed");
        }

      WebElement inputUsername =driver.findElement(By.id("ctl00_MainContent_username"));
        inputUsername.sendKeys("Tester");

       WebElement inputPassword= driver.findElement(By.id("ctl00_MainContent_password"));
       inputPassword.sendKeys("test");

      WebElement loginButton= driver.findElement(By.id("ctl00_MainContent_login_button"));
      loginButton.click();

      String expectedHomePageTitle="Web Orders";
      String actualHomePageTitle=driver.getTitle();

      if (actualTitle.equals(expectedTitle)){
          System.out.println("Home Page Verification Passed!");
      }else{
          System.out.println("Home Page Verification Failed!!");
      }
    }
}
