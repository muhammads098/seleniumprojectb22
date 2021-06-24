package com.cybertek.tests.day13_actions_pom_design;

import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageObjectModelPractices {
    @Test
    public void negative_login_to_library_test(){
        //1. Go to Library
        Driver.getDriver().get("https://library2.cybertekschool.com/login.html");

        //Create object of the class
        //when we create the object "LibraryLoginPage", constructor will automatically
        //initialize driver and object of LibraryLoginPage.
        //meaning we will be able to use selenium method through th class.
        LibraryLoginPage loginPage = new LibraryLoginPage();


        //2. Enter incorrect username
        loginPage.inputEmail.sendKeys("wrong@gmail.com");


        //3. Enter incorrect password
        loginPage.inputPassword.sendKeys("alsoWrong");

        //4.click to sign in button
        loginPage.signInButton.click();


        //5. Verify error message is displayed
        Assert.assertTrue(loginPage.incorrectEmailOrPasswordError.isDisplayed());





    }
}
