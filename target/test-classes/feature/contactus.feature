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
@tag
Feature: Contact us page

  Background: User must be on contact us page
    Given user must be on contact us page with url "https://www.roicians.com/contact-us/"

  @tag1
  Scenario: Testing First name, lastname and email
    When User must enter valid first name
    And User must enter valid last name
    And User must enter valid emailid

  Scenario: Testing First name, lastname and email
    When click on contact number
    Then contact number is displayed
