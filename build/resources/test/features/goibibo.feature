
Feature: Page automation flight website main 'Goibibo'
    As a user I want to be able to select a flight with all the details to make the reservation.

    @TestGoibibo
    Scenario: The user searches for a flight
        Given The user is positioned on the web
        When The user search city From
        And The user search city To
        And The user select first day
        And The user click in return day

























    @TestAcadia
    Scenario: Make the reservation now in 'Acadia Page'.
        Given The user is in the web
        When The user select destination

    @Tesst2Acadia
    Scenario: Select checkin
        Given The user choose checkin and checkout
        When The user select rooms