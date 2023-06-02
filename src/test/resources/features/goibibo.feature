@Test1
Feature: Automation functionality search city of 'Goibibo'
    As a user I want to be able to select a flight with all the details to make the reservation.

    @TestGoibibo
    Scenario: Make the selectcity now
        Given The user is positioned on the web
        When The user search city From
        And The user search city To


    @TestAcadia
    Scenario: Make the reservation now in 'Acadia Page'.
        Given The user is in the web
        When The user select destination

    @Tesst2Acadia
    Scenario: Select checkin
        Given The user choose checkin and checkout
        When The user select rooms