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
Feature: Login button Testing

  Scenario: Clicking on Login buttton on homapage
    Given User must be on homepage by clicking on url "https://demoblaze.com/"
    When User clicks on Login page
    And Enter login username
    And Enter login Password
    And Click on Login button
    Then User must be on welcome page
    And Click on laptop option
    And Select laptop
    And Click on addtocart
    And Click on cart and verify cart is filled with laptop
