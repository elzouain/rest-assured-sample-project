Feature: Articles Endpoints

  Scenario: Verify articles count
    When user sends a "GET" request to the articles endpoint
    And user gets a status code of 200
    Then user confirms the results count is higher than zero
    
  Scenario: Verify articles result array is not empty
    When user sends a "GET" request to the articles endpoint
    And user gets a status code of 200
    Then user confirms the results array is not empty
