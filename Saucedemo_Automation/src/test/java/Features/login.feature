@SauceDemo
Feature: Login to SauceDemo Application
  
  @login
  Scenario: User successfully logged in to SauceDemo site
    Given User launches Browser
    And User enters "URL";
    When User enters credentials and click on login
    Then User is on homepage
    

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
