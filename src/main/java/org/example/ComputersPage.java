package org.example;

import org.openqa.selenium.By;

public class ComputersPage extends Utils{
    LoadProp loadProp = new LoadProp();
By _computers=By.xpath("//div[@class='header-menu']/ul[@class='top-menu notmobile']/li/a[@href='/computers']");

// Click on Computers
    public void computer(){
        clickOnElement(_computers);
    }
}
