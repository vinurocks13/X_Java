Feature: Test login of Actitime

  Scenario Outline: Test login with valid credentials
    Given Open chrome browser and enter the site
    When i enter the valid "<username>" and valid "<password>"
    Then i should be able to login to the app successfully

    Examples: 
      | username | password |
      | admin    | manager  |
      | admin1   | admin5   |
      | manager2 | manager1 |
