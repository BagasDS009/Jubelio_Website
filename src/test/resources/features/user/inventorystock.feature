@InventoryStock
Feature: Inventory Stock at app.jubelio

  Scenario Outline: Inventory Stock
    Given Login "<email>", "<pass>", click button login
    And an inventory adjustment button click
    And validate the inventory adjustment page
    When you select an item
    And fill in quality "<qty>" data, fill in cost price "<price>"
    Then validate the name "<name>" successfully


    Examples:
      | qty | price | name   | email                        | pass        |
      | 12  | 3000  | Naruto | qa.rakamin.jubelio@gmail.com | Jubelio123! |