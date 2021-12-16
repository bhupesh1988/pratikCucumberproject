Feature: Add news details comments

  As a user, I want to add new comments on DemoNopeCommerce website
  @test
  Scenario: User should able to add comments

    Given user is on homepage
    When user click on details button
    And user fills comments box
    And click on new comment
    Then user should able to add news comments successfully
