Feature: Search and Place the order of product

@PlaceOrder
Scenario Outline: Search the Product in home and deals page

Given User is on the Greenkart landing page
When User searced with shortname <Name> and Extracted actual name of product
And added three items of selected product to cart
Then User proceeeds to checkout and validate the <Name> items in product page.
And verify user has ability to enter promo code and place the order.
 


Examples:
|Name|
|Tom |