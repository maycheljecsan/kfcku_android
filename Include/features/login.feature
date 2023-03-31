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
Feature: Login KFCKU Apps

Background:
Given I open com.kfc.mobile.hkStaging

  @test1
  Scenario Outline: Empty phone and password
    When I fill in empty <phone> and empty <password>
    When I click Log In
    Then I see an error message 'Mohon masukkan nomor handphone Anda'

    Examples: 
      | phone  	| password 	|
      |  		081211287377		|   pass111   			|