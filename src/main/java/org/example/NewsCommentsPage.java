package org.example;

import org.openqa.selenium.By;

public class NewsCommentsPage extends HomePage {

    LoadProp loadProp = new LoadProp();

    By _addNewComment = By.id("AddNewComment_CommentTitle");
    By _addNewCommentText = By.id("AddNewComment_CommentText");
    By _clickOnNewCommentButton = By.xpath("//button[@name='add-comment']");

    public void newComment() {

        typeText(_addNewComment,loadProp.getProperty("addNewComment"));

        // Type comment
        typeText(_addNewCommentText,loadProp.getProperty("addNewCommentText"));

        // Click on button of New comment
        clickOnElement(_clickOnNewCommentButton);
    }
}