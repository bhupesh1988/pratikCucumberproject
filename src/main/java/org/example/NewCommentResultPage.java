package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewCommentResultPage extends Utils {

    public void newComment1(){

        String actualResult = getTextFromElement(By.xpath("//div[@class='result']"));
        String expectedResult = "News comment is successfully added.";
        Assert.assertTrue(actualResult.equals(expectedResult),"News comment is successfully added.");
    }

}
