package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSuccessPage registrationSuccessPage = new RegistrationSuccessPage();
    AppleMacBookProPage appleMacBookProPage = new AppleMacBookProPage();
    EmailAFriend emailAFriend = new EmailAFriend();
    EmailAFriendResult emailAFriendResult = new EmailAFriendResult();
    ComputersPage computersPage = new ComputersPage();
    DesktopPage desktopPage = new DesktopPage();
    NavigateDesktopPage navigateDesktopPage = new NavigateDesktopPage();
    NewsCommentsPage newsCommentsPage = new NewsCommentsPage();
    NewReleaseComment newReleaseComment = new NewReleaseComment();
    NewCommentResultPage newCommentResultPage = new NewCommentResultPage();


    @Given("user is on registration page")
    public void user_is_on_registration_page() {
        homePage.clickOnRegisterButton();

    }

    @When("user enters required registration details")
    public void user_enters_required_registration_details() {
        registrationPage.enterRegistrationDetails();
    }

    @When("click on register submit button")
    public void click_on_register_submit_button() {

    }

    @Then("user should able to register successfully")
    public void user_should_able_to_register_successfully() {
        registrationSuccessPage.registrationResult();
    }
    @Given("user is on computer page")
    public void userIsOnComputerPage() {
        homePage.clickOnComputers();
    }


    @When("user click on computers from main menu bar")
    public void userClickOnComputersFromMainMenuBar() {
        computersPage.computer();
    }
    @And("select desktop from computer menu bar")
    public void selectDesktopFromComputerMenuBar() {
        desktopPage.desktop();
    }



    @Then("user should able to navigate Desktop page")
    public void userShouldAbleToNavigateDesktopPage() {
        navigateDesktopPage.navigateDesktop();
    }
    @Given("user is on homepage")
    public void user_is_on_homepage() {
        homePage.clickOnDetailsButton();

    }
    @When("user click on details button")
    public void user_click_on_details_button() {
        newsCommentsPage.newComment();

    }
    @When("user fills comments box")
    public void user_fills_comments_box() {

    }
    @When("click on new comment")
    public void click_on_new_comment() {

    }
    @Then("user should able to add news comments successfully")
    public void user_should_able_to_add_news_comments_successfully() {
        newCommentResultPage.newComment1();

    }
    @Given("user is already registered successfully page")
    public void user_is_already_registered_successfully_page() {
        homePage.clickOnRegisterButton();
        registrationPage.enterRegistrationDetails();
        registrationSuccessPage.registrationResult();



    }
    @When("user click on continue button on the Register successfully page")
    public void user_click_on_continue_button_on_the_register_successfully_page() {
        registrationSuccessPage.clickOnContinueOnRegistrationSuccessful();



    }
    @When("select a AppleMacBook product")
    public void select_a_apple_mac_book_product() {
        homePage.clickOnAppleMacBookPro();
        appleMacBookProPage.emailAFriend();

    }
    @When("click on Email a friend")
    public void click_on_email_a_friend() {
        emailAFriend.emailAFriend1();

    }
    @Then("user should able to refer a friend successfully")
    public void user_should_able_to_refer_a_friend_successfully() {
        emailAFriendResult.messageSent();

    }



}

