 Feature: Test OrangeHRM Login Scenario

  Scenario Outline::  Test with valid Credentials
    Given Open chrome browser
    Then Get Valid URL
    When Login with valid "<username>" and "<password>"
    Then User Login successfully
    And Close the chrome browser
Examples:
|username|password|
|Admin|admin123|
|vijay|vijay123|
|vamsi|vamsi123|   
