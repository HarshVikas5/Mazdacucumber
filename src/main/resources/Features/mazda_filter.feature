Feature: Mazda Website Filteration
  As a user
  I want to filter the information on the Mazda website
  So that I can find relevant results

@UITEST
  Scenario: Filteration of Sports Cars
    Given I am on the Mazda website homepage
    When I accept the cookies
    And I click the VEHICLES
    And I click the Sports Cars
    Then I should see results related to Sports Cars
  
