Feature: Search and Place the order of product
@SearchOrder
Scenario Outline: Search the Product in home and deals page

Given User is on the Greenkart landing page
When User searced with shortname <Name> and Extracted actual name of product
Then User searched for <Name> shortname in deals page
Then Validate product name in Landing page and Offer page

Examples:
|Name|
|Tom |
|beet|