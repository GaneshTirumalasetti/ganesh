Feature: validate the Demos

  Scenario: Check the Demos
    Given open browser
    Then user enter the url "https://www.telerik.com"
    And user click on Demos
    Then user navigate to Banner
    When user click on Services
    Then user navigate to Services Banner
    When user click on BLOGS
    Then user navigate to BLOGS Banner
    When user click on DOCS & SUPPORT
    Then user navigate  on DOCS & SUPPORT Banner
    When user click on PRICING
    Then user navigate PRICING Banner
    And user click on INDIVIDUAL Banner
    Then user navigate to Banner
    And  user click on progress Telerik
    When user is click on Web Components
    Then user close the Web Component
    When user click on the Desktop Components
    Then user close the Desktop Component
    