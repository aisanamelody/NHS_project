Feature: NHS Log in function


  @TC_01
  Scenario: Log in with valid user credentials
    Given User navigates to NHS url
    And User enters userName and password
    And  User clicks sign in button
    Then User validates the title is 'NHS patients'