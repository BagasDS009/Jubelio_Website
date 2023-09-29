@InventoryStock
Feature: Inventory Stock at app.jubelio

  Scenario Outline: Inventory Stock
    Given Login "<email>", "<pass>", click button login
    And an inventory adjustment button click
    And validate the inventory adjustment page
    And click "<lokasi>"
    When you select an item
    Then validate the name "<name>" successfully

    Examples:
      | name   | email                        | pass        | lokasi            |
      | Naruto | qa.rakamin.jubelio@gmail.com | Jubelio123! | Pusat             |
      | Naruto | qa.rakamin.jubelio@gmail.com | Jubelio123! | Simatupang Garden |
      | Naruto | qa.rakamin.jubelio@gmail.com | Jubelio123! | Gudang Pedia      |
