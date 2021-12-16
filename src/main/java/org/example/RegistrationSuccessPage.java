package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationSuccessPage extends RegistrationPage {
    By _continue = By.xpath("//a[@class='button-1 register-continue-button']");

    public void registrationResult() {
        By _continue = By.xpath("//a[@class='button-1 register-continue-button']");

        String actualRegisterSuccessMessage = getTextFromElement(By.xpath("//div[@class='result']"));
        String expectedRegisterSuccessMessage = "Your registration completed";
        Assert.assertTrue (actualRegisterSuccessMessage.equals(expectedRegisterSuccessMessage),"Registration successfully");
        ;
    }

    public void clickOnContinueOnRegistrationSuccessful(){
        clickOnElement(_continue);
    }

}
