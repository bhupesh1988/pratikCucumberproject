package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends HomePage {

    By _firstName = By.name("FirstName");
    By _lastName = By.name("LastName");
    By _email = By.id("Email");
    By _password = By.id("Password");
    By _confirmPassword = By.id("ConfirmPassword");
    By _registrationButton = By.xpath("//button[@name='register-button']");


    public void enterRegistrationDetails() {

        LoadProp loadProp = new LoadProp();



        typeText(_firstName, loadProp.getProperty("firstName"));

        // Type Last name
        typeText(_lastName, loadProp.getProperty("lastName"));

        // Type date of birth
        //Select day from dropdown
        Select selectDay = new Select(driver.findElement(By.name("DateOfBirthDay")));
        selectDay.selectByVisibleText("18");

        // Select month from dropdown
        Select selectMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        selectMonth.selectByValue("9");

        // Select year
        Select selectYear = new Select(driver.findElement(By.name("DateOfBirthYear")));
        selectYear.selectByVisibleText("1993");

        // Type Email
        typeText(_email, "pratikpatel12+" +currentTimeStamp() + "@gmail.com");

        // Type password
        typeText(_password, loadProp.getProperty("password"));

        // Type confirm password
        typeText(_confirmPassword, loadProp.getProperty("confirmPassword"));

        // Click on Register button
        clickOnElement(_registrationButton);


    }
}