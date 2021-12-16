Feature: Refer a friend

  As a registered user, I can refer a friend on DemoNopeCommerce website
  So that, they can see all product features
@test
  Scenario: Registered user should able to refer a friend

    Given user is already registered successfully page
    When user click on continue button on the Register successfully page
    And select a AppleMacBook product
    And click on Email a friend
    Then user should able to refer a friend successfully
