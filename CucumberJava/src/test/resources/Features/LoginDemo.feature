Feature: Test Login Functionality

  Scenario Outline: Check login is Successful with valid credentials
    Given browser is open
    And user is on login page
    When user enter <username> and <password>
    And user clicks on login
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | Testone  |    12345 |
      | testtwo  |    12345 |
