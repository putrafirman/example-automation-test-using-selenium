Meta:

Narrative:
In order to be able to buy in blibli
As a customer
I want to be able to login

Scenario: Go to blibli site and login
Given open home page
When I login to Blibli
Then I can see muy name in the site

Scenario: Search
Given search items
When I found my items
Then I add to cart

Scenario: Add to payment
Given next to checkout
When I choose and fill payment option
Then I submit my orders