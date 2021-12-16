package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NavigateDesktopPage extends Utils{

    public void navigateDesktop(){
        String actualResult=getTextFromElement(By.xpath("//div[@class=\"center-2\"]/div/div/h1"));
        String expectedResult="Desktops";
        Assert.assertTrue(actualResult.equals(expectedResult),"Desktops");
    }
}
