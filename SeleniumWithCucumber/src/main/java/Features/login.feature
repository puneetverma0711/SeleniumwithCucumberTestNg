Feature: ShopClues Login Feature

Scenario Outline: ShopClues Login Test Scenario

Given user is on shopclues web page
Then user click on signin link
Then user enter "<username>" and "<password>"
Then user is on shopclues dashboardpage
Then user close the browser


Examples:

| username | password |
| puneetverma0711@gmail.com | confidom@123 |