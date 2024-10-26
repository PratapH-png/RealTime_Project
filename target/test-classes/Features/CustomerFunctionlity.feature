Feature: Customer Functionality
  I want to use this template for my feature file

  @tag1
  Scenario: Create New Customer
    Given User is on Actitime Login Page
    And user login to the application with valid credentials
    When user click on tasks followed by create customer button
    Then user validates the Customer creation page
    And Fill all the customer details and click on create customer button
    Then Customer will be created successfully
    And user validate the succss message

  @tag2
  Scenario Outline: Create Mulitple Customers
    Given User is on Actitime Login Page
    And user login to the application with valid credentials
    When user click on tasks followed by create customer button
    Then user validates the Customer creation page
    And Fill <customer_name> and <customer_desc> and click on create customer
    Then Customer will be created successfully
    And user validate the succss message

    Examples: 
      | customer_name | customer_desc |
      | name1         |             5 |
      | name2         |             7 |
