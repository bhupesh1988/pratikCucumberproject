package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
By _registerButton=By.xpath("//a[@href='/register?returnUrl=%2F']");

By _detailsButton=By.xpath("//div[@class='news-items']/div[2]/div[3]/a");

By _computers=By.xpath("//div[@class='header-menu']/ul[@class='top-menu notmobile']/li/a[@href='/computers']");

By _appleMacBookPro=By.xpath("//h2/a[@href='/apple-macbook-pro-13-inch']");

public void clickOnRegisterButton(){
        //Click on Registration button
    clickOnElement(_registerButton);
    }

    public void clickOnDetailsButton(){
    // Click on Details button
        clickOnElement(_detailsButton);
    }

    public void clickOnComputers(){
    // Click on Computers
        clickOnElement(_computers);
    }

    public void clickOnAppleMacBookPro(){
    // Click on Apple Mac book pro
        clickOnElement(_appleMacBookPro);
    }

}
