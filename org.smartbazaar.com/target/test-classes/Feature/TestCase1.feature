Feature: checking the search functionality
  Scenario Outline: User wants to check the Functionality of search box
    Given User open the browser
    Then User enter the URL "https://smartbazaar.co.uk/"
    And User enters the '<search>' data
    Then user click on the search icon
    Then user verifies the '<search>' results
    When user selects the '<desired>' product
    And user verifies the '<desired>' product results
    Then User close the Browser
    Examples:
      | search | desired |
      | rice |  Shree Krishna Maapillai Samba Rice (1kg) |
      | flower |  Marigold Flowers – Yellow (100g) |