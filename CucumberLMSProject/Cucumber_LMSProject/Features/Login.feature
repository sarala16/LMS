
Feature: Login Page

  Scenario: Successful Login With Valid Credentials
    Given User Launch Edge Browser
    When User Opens LMS URL "https://lms-frontend-phase2.herokuapp.com/login"
    And User enters UserName as "LMS" and Password as "LMS"
    And Click on Login
    Then Page Title should be "LMS"
    And close browser

  Scenario Outline: invalid Login Credentials
    Given User Launch Edge Browser
    When User Opens LMS URL "https://lms-frontend-phase2.herokuapp.com/login"
    And User enters UserName as "<user>" and Password as "<password>"
    And Click on Login
    Then User should receive the message "Invalid username and password Please try again"
    And close browser
  
  
  Examples:
  
  |user| password|
  |LMSLMS|  |
  |    | LMSLMS|
  