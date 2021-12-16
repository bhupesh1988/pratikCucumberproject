package org.example;

import org.openqa.selenium.By;

public class AppleMacBookProPage extends HomePage{

    LoadProp loadProp = new LoadProp();

By _emailAFriend = By.xpath("//button[@class='button-2 email-a-friend-button']");

    public void emailAFriend(){
        // Click on Email friend
        clickOnElement(_emailAFriend);
    }
}
