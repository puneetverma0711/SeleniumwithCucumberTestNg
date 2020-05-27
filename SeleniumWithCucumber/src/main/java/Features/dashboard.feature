Feature: ShopClues Dashboard Feature

Scenario Outline: ShopClues Dashboard SearchField

Given user is on dashbaord page
Then user type "<searchtext>" into the search field
Then user hit enter into the search field
Then user is on product detail page
Then user closes the browser

Examples:

          | searchtext |
          | mobile |