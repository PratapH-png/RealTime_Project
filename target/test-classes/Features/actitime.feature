#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@functionality
Feature: actiTime Webpage Functionalities
## 1. Login Module
  @smoke
  Scenario: Successful login with valid credentials
    Given I am on the actiTime login page
    When I enter valid username and password
    And I click on the Login button
    Then I should be redirected to the actiTime dashboard
    And I should see the Logout option

  @negative
  Scenario: Unsuccessful login with invalid credentials
    Given I am on the actiTime login page
    When I enter an invalid username and password
    And I click on the Login button
    Then I should see an error message saying Invalid username or password.

  ## 2. Task Management Module
  @tasks
  Scenario: Create a new task in a project
    Given I am logged into the actiTime dashboard
    When I navigate to the Tasks module
    And I select a project
    And I click on the Create Task button
    And I enter task details such as Task Name, Deadline, and Assignee
    And I click Save
    Then the new task should appear in the task list under the selected project

  @tasks
  Scenario: Edit an existing task
    Given I am in the Tasks module
    And I have selected an existing task
    When I click on the Edit button
    And I update the task details
    And I click Save
    Then the changes should be reflected in the task details

  @tasks
  Scenario: Delete a task
    Given I am in the Tasks module
    When I select an existing task
    And I click on the Delete button
    And I confirm the deletion
    Then the task should no longer appear in the task list

  ## 3. Time Tracking Module
  @time_tracking
  Scenario: Track time for a task
    Given I am on the actiTime dashboard
    When I navigate to the Time-Track module
    And I select a task to track time
    And I start the timer
    Then the system should start tracking time for that task
    When I stop the timer after some time
    Then the tracked time should be saved and displayed against the task

  @time_tracking
  Scenario: Manually log time for a task
    Given I am in the Time-Track module
    When I select a task
    And I enter the time spent manually in the Time Spent field
    And I save the entry
    Then the time should be reflected against the selected task

  ## 4. Reports Module
  @reports
  Scenario: Generate a report on project time tracking
    Given I am in the Reports module
    When I select a project for which I want to generate a time tracking report
    And I choose the time period
    And I click Generate Report
    Then the system should display a detailed report of time tracked for the selected project within the specified time period

  @reports
  Scenario: Export a report as a PDF
    Given I have generated a report in the Reports module
    When I click the Export as PDF button
    Then the system should download the report as a PDF file

  ## 5. Users and Settings Management Module
  @users_management
  Scenario: Add a new user to the system
    Given I am in the Users module
    When I click on Add New User
    And I enter the users details such as Name, Email, and Role
    And I click Save
    Then the new user should appear in the list of users

  @users_management
  Scenario: Update an existing users role
    Given I am in the Users module
    And I have selected an existing user
    When I click on Edit
    And I update the users role to Manager
    And I click Save
    Then the changes should be reflected in the users details

  ## 6. Logout
  @smoke
  Scenario: Successful logout from actiTime
    Given I am logged into the actiTime dashboard
    When I click on the Logout button
    Then I should be logged out of the system
    And I should be redirected to the login page