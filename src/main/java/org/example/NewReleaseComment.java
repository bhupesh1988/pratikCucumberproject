package org.example;

import org.openqa.selenium.By;

public class NewReleaseComment extends Utils {

    LoadProp loadProp = new LoadProp();

    By _addNewCommentTitle = By.id("AddNewComment_CommentTitle");
    By _addNewCommentText = By.id("AddNewComment_CommentText");
    By _newComment = By.xpath("//button[@name='add-comment']");

    public void newsCommentAdd() {

        // Type title
        typeText(_addNewCommentTitle, loadProp.getProperty("addNewCommentTitle"));

        // Type comment
        typeText(_addNewCommentText, loadProp.getProperty("addNewCommentText"));

        // Click on button of New comment
        clickOnElement(_newComment);
    }
}