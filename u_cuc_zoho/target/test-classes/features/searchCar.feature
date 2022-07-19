@search_cars
Feature: Accepatance testing to validate search car page is working finr
  In order to validate that the search cars page is working fine we'll do the acceptance testing

  @search_cars_positive
  Scenario: Validate search car page
    Given I am on the Homepage of "https://www.carsguide.com.au/"
    When I move to the menu
      | Menu       |
      | buy + sell |
      | reviews    |
      | news       |
      | advice     |
    And select on "Search Cars" link
    And select car brand as "BMW" from anymake dropdown
    And select car model as "1 Series" from any mode dropdown
    And select location as "VIC - Melbourne" from anylocation dropdown
    And selected max price is "$45,000" from price max dropdown
    Then click on find my next car
    Then I should see list of searched cars
    And page title should be "Bmw 1 Series Under 45000 for Sale Melbourne VIC | carsguide"
